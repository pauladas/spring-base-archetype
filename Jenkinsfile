pipeline {
	agent any
	tools {
        jdk 'Java17'
    }
  stages {
  	stage('Maven Install') {
    	agent {
      	docker {
        	image 'maven:3.5.0'
        }
      }
      steps {
      	sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
    	agent any
      steps {
      	sh 'docker build -t pauladas/spring-archetype:latest .'
      }
    }
  }
}