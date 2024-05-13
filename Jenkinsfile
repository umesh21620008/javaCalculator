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
            dependencies {
                // Define the build stage as a dependency for the test stage
                build 'build'
            }
        }
    }
}
