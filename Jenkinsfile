#!/bin/env groovy
pipeline {
    agent none
    stages {
      stage('Maven: Build and Deploy to S3') {
        agent {
            docker {
                image 'maven:3.5.0'
            }
        }
        steps {
            withCredentials([usernamePassword(credentialsId: 'Artifactory', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                sh "mvn clean deploy -B -DartifactoryUsername=$USERNAME -DartifactoryPassword=$PASSWORD"
            }
        }
      }
    }
}
