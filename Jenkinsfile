pipeline {    
	agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.10.0', '1.11.0', '1.12.0'], description: 'choose tested version')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'should I run tests?')
    }
    stages {	
        stage("build") {		
            steps {
				echo 'building the app'
            }
        }        
		
        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
				echo 'testing the app'
            }
        }
        
        stage("deploy") {
            steps {
				echo 'deployinjg the app'
                echo "deploying app version ${params.Version}"
			}
		}
    }   
}
