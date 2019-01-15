#!/bin/env groovy
pipeline {

    agent none

    stages {
      stage('Maven: Build') {
        agent {
            docker {
                image 'maven:3.5.0'
            }
        }
        steps {
          sh "mvn clean install"
        }
      }
    }
}

