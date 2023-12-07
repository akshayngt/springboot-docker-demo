pipeline{
    agent any 
    tools{
        maven 'maven'
    }
    stages{
        stage('build'){
            steps{
                sh 'mvn clean package'
            }
            post{
                success{
                    echo "Archiving the Artifacts"
                    archiveArtifacts artifacts: '**/target/*.war'
                }

             }
        }
        stage ('Deploy to tomcat server'){
            steps{
                deploy adapters: [tomcat9(credentialsId: '48814d12-1504-4dc1-8490-379290a2b90a', path: '', url: 'http://localhost:8085/')], contextPath: 'GGRLocService', war: '**/*.war'
             }
        }
    }
}  
