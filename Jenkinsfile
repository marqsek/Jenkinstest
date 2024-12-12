def gv

pipeline {    
	agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.10.0', '1.11.0', '1.12.0'], description: 'choose tested version')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'should I run tests?')
    }
    stages {	
        stage("init") {		
            steps {
                script {
                    gv = load "script.groovy"
                }
			}
        }                
        stage("build") {		
            steps {
                script {
                    gv.buildApp()
                }
			}
        }        
		
        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
				    gv.testApp()
                }
            }
        }
        
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
			}
		}
    }   
}
