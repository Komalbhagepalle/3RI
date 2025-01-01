pipeline {
    agent any
    environment {
        DOCKER_IMAGE = "komalbhagepalle/welcome-to-2025:latest"
    }
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
	stage('Build Docker Image') {
            steps {
                // Build a Docker image
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }
        stage('Push Docker Image') {
            steps {
                // Login to DockerHub and push the image
                withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                    sh 'docker push $DOCKER_IMAGE'
                }
            }
        }
    }
}
