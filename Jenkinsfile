pipeline{
    agent any
    tools {
        maven 'Maven' 
    }
    stages{
        stage("Test"){
            steps{
                //mvn test
                sh "mvn test"
                
            }
        }
        stage("Build"){
            steps{
                //mvn package
                mvn package
                
            }
        }
        stage("DeployOnTest"){
            steps{
                //use container
                deploy adapters: [tomcat9(credentialsId: 'tomct9details', path: '', url: 'http://192.168.65.2:8081/')], contextPath: '/sampleapp', war: '**/*.war'
                echo "========executing deploy on test========"
            }
        }
        stage("DeployOnProd"){
            steps{
                //use container
                
                
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
