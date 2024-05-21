def call() {
    sh '''
    chmod +x -R ${WORKSPACE}/jenkins/build/build.sh
    ./jenkins/build/build.sh
    '''
}