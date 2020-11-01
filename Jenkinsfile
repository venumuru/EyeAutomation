pipeline {
  agent any
  stages {
    stage('Dev Build') {
      steps {
        echo 'Dev Build to Start'
        git(url: 'https://github.com/LeafPages/EyeManage', branch: 'master', poll: true)
        bat(script: 'mvn install', label: 'Dev')
      }
    }

    stage('Smoke Test') {
      steps {
        echo 'Smoke test is going to start'
        git(url: 'https://github.com/LeafPages/EyeAutomation', branch: 'master', poll: true)
        bat(script: 'mvn test -DEnvironment=Dev', label: 'Dev Smoke')
      }
    }

    stage('Deploy in QA') {
      steps {
        echo 'SSH into AWS and Move the build'
      }
    }

    stage('Sanity Test in QA') {
      steps {
        echo 'About to run Sanity in QA'
        bat(script: 'mvn test -DEnvironment=QA', label: 'Maven QA')
      }
    }

    stage('Ceritication') {
      steps {
        input(message: 'Are you sure to certify this?', ok: 'Yes')
        waitUntil()
      }
    }

    stage('Deploy into UAT') {
      steps {
        echo 'Deployed in UAT (SSH into UAT AWS)'
      }
    }

  }
}