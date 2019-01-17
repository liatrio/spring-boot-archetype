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
            configFileProvider([configFile(fileId: 's3', variable: 'MAVEN_SETTINGS')]) {
                sh "mvn clean deploy -B -s $MAVEN_SETTINGS "
            }
        }
      }
    }
}
