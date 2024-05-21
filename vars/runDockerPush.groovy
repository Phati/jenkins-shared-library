def call() {
    sh '''
    chmod +x -R ${WORKSPACE}/jenkins/push/push.sh
    ./jenkins/push/push.sh
    '''
}