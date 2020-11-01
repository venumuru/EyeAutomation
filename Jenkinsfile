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

  }
}