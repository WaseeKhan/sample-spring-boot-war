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
        stage("DeployOnTest"){
            steps{

                deploy adapters: [tomcat9(credentialsId: 'tomct9details', path: '', url: 'http://192.168.65.2:8081/')], contextPath: '/sampleapp', war: '**/*.war'

            }
            
        }
        stage("DeployOnProd"){
            steps{

                deploy adapters: [tomcat10(credentialsId: 'tomct9details', path: '', url: 'http://192.168.65.1:8082/')], contextPath: '/sampleapp', war: '**/*.war'

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