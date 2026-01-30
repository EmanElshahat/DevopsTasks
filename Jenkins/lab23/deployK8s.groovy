def call(String namespace) {
    echo 'Deploying to Kubernetes cluster...'
    sh "kubectl apply -f deployment.yaml -n ${namespace}"
}

