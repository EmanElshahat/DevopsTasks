def call() {
    echo 'Running Unit Tests with Maven...'
    sh 'mvn test'

    echo 'Building App with Maven...'
    sh 'mvn package'
}

