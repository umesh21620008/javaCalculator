pipeline {
  agent any
    
  tools {nodejs "node"}
    
  stages {
        
    stage('Git') {
      steps {
        git 'https://github.com/umesh21620008/javaCalculator.git'
      }
    }
     
    stage('Build') {
      steps {
        sh 'apt install default-jdk'
      }
    }  
    stage('Run') {
      steps {
        sh 'javac App.java'
      }
    }
            
    stage('Test') {
      steps {
        sh 'javac AppTest.java'
      }
    }
  }
}
