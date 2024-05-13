pipeline {
    agent any
    
    stages {
        stage('build') {
            steps {
                script {
                    // Update apt and install JDK
                    sh 'apt-get update -qy'
                    sh 'apt-get install -y default-jdk'
                    
                    // Build your Java application
                    sh 'javac App.java'
                }
                post {
                    success {
                        // Archive artifacts
                        archiveArtifacts artifacts: 'App.class', fingerprint: true
                    }
                }
            }
        }
        
        stage('test') {
            steps {
                script {
                    // Compile test files
                    sh 'javac AppTest.java'
                }
            }
        }
    }
    post {
        always {
            // Define the "test" stage to run regardless of the success or failure of previous stages
            junit 'AppTest.xml' // Example of JUnit test result reporting
        }
    }
}
