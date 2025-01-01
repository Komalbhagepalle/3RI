pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                // Checkout the code from Git SCM
                checkout scm
            }
        }
	stage('Build with Maven') {
            steps {
                // Build the project using Maven
                sh 'mvn clean package'
            }
        }
        stage('Run Tests') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }
    }
}