#!/usr/bin/env groovy
def call(){
    def envFilePath = "${WORKSPACE}/.env"
    if (fileExists(envFilePath)) {
        def envContent = readFile(envFilePath).trim()
        envContent.readLines().each { line ->
            def (key, value) = line.split('=')
            env."${key}" = value
        }
    } else {
        echo "No .env file found"
    }
}