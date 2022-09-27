pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo 'building the application ... step 1'
                echo 'test the pipeline pulling the changes and run the pipeline automatically'
            }
        }

        stage("test") {

            steps {
                echo 'testing the application ... step 2'
                 echo 'Updated this file to check polling'
            }
        }

        stage("deploy") {

            steps {
                echo 'deploying the application ... step 3'
            }
        }
    }
}
