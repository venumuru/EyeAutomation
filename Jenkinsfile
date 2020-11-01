pipeline {
  agent any
  stages {
    stage('Pull QA Code') {
      steps {
        echo 'Pull QA code from GIT'
        git(url: 'https://github.com/venumuru/LeafTapsAutomation', branch: 'master', poll: true)
        bat(script: 'mvn install', label: 'Dev')
      }
    }

    stage('Smoke Test') {
      when {
        branch 'Dev'
      }
      steps {
        echo 'Smoke test is going to start'
        git(url: 'https://github.com/venumuru/LeafTapsAutomation', branch: 'master', poll: true)
        bat(script: 'mvn test', label: 'QA Smoke')
      }
    }

    stage('Ceritication') {
      steps {
        input(message: 'Are you sure to certify this?', ok: 'Yes')
        waitUntil(initialRecurrencePeriod: 10)
      }
    }

    stage('Sent report') {
      steps {
        emailext(subject: 'Automation run report', attachLog: true, body: 'Please find the automation run report', from: 'mech.venugopalm@gmail.com', replyTo: 'mech.venugopalm@gmail.com', to: 'mech.venugopalm@gmail.com')
      }
    }

  }
}