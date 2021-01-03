package com.sk

class BuildApplication {
    def build(){
        echo 'building application'
        sh 'mvn clean verify'
        echo 'completed'
    }
}
