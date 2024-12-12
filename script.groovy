def buildApp() {
    echo 'building the application ....'
}

def testApp() {
    echo 'testing the application ....'
}

def deployApp() {
    echo 'deployinjg the app'
    echo "deploying app version ${params.VERSION}"
}

return this