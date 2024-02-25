pipeline {
    agent any
    tools {
        maven 'MAVEN3' // Use Maven installation named 'MAVEN3'. Adjust if your configuration is different.
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}

