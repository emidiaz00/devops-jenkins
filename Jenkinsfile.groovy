pipeline {
    agent any

    stages {
        stage('Clonar Repositorio') {
            steps {
                checkout scm
            }
        }

        stage('Compilar y Empaquetar') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Ejecutar Pruebas') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Desplegar') {
            steps {
                // Copia el artefacto compilado a una ubicación de despliegue

            }
        }
    }
}
