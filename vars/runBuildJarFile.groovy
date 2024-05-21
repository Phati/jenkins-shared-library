def call() {
    sh '''
    echo RELEASE_VERSION = ${RELEASE_VERSION}
    echo COMPILE_AGRS = ${COMPILE_ARGS}
    chmod +x -R ${WORKSPACE}/jenkins/build/mvn.sh
    ./jenkins/build/mvn.sh mvn ${COMPILE_ARGS}
    '''
}