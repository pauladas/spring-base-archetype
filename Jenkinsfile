pipeline {
	agent any
	tools {
        jdk 'Java17'
    }
  stages {
  	stage('Check Java') {
      steps {
      	sh 'java --version'
      }
    }
  	stage('Maven Install') {
      steps {
      	sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
      steps {
      	sh 'docker build -t pauladas/spring-archetype:latest .'
      }
    }
  }
}