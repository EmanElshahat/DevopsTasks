def call(String imageName, String buildNumber) {
    echo "Building Docker Image ${imageName}:${buildNumber}"

    script {
        docker.build("${imageName}:${buildNumber}")
    }

    echo "Logging in to Docker Hub & Pushing Image"
    withCredentials([usernamePassword(
        credentialsId: 'docker-hub',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {
        sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
        sh "docker push ${imageName}:${buildNumber}"
    }
}

