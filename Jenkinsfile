pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -B test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    docker build -t hello-devsecops:test .
                    docker rm -f hello-devsecops-test || true
                    docker run --name hello-devsecops-test hello-devsecops:test
                '''
            }
        }
    }
}