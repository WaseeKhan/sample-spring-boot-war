pipeline{
    agent any

    tools {
        maven 'Maven' 
    }
    stages{
        stage("Test"){
            steps{
                sh 'mvn clean'
            }
            
        }
        stage("build"){
            steps{
                sh 'mvn package'
            }
            
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}