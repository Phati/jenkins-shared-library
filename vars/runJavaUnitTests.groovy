def call(){
    sh '''
    echo SKIP_TESTS = ${SKIP_TESTS}
    if !($SKIP_TESTS); then
    chmod +x -R ${WORKSPACE}/jenkins/test/mvn.sh
    sh ./jenkins/test/mvn.sh mvn test
    fi
    '''
}