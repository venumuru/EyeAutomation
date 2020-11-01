pipeline {
  agent any
  stages {
    stage('Pull QA Code') {
      steps {
        echo 'Pull QA code from GIT'
        git(url: 'https://github.com/venumuru/EyeAutomation', branch: 'master', poll: true)
        bat(script: 'mvn install', label: 'Dev')
      }
    }

    stage('Smoke Test') {
      steps {
        echo 'Smoke test is going to start'
        git(url: 'https://github.com/venumuru/EyeAutomation', branch: 'master', poll: true)
        bat(script: 'mvn test -DEnvironment=QA', label: 'QA Smoke')
      }
    }

    stage('Ceritication') {
      steps {
        input(message: 'Are you sure to certify this?', ok: 'Yes')
        waitUntil()
      }
    }

  }
}