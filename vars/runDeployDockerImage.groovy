def call() {
    sh '''
    chmod +x -R ${WORKSPACE}/jenkins/deploy/deploy.sh
    ./jenkins/deploy/deploy.sh
    '''
}
