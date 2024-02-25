pipeline {
    agent any
    tools {
        maven 'MAVEN3' // Use Maven installation named 'Maven'. Adjust if your configuration is different.
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
