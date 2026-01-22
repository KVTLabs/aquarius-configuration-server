# Changelog

Todos los cambios notables de este proyecto serán documentados en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/es-ES/1.0.0/)
y este proyecto sigue [Semantic Versioning](https://semver.org/lang/es/).

## [Unreleased]

### Added

- Inicialización del proyecto Spring Boot.
- Configuración básica de Spring Cloud Config Server.
- Pruebas locales con perfiles (`development`, `production`).
- Soporte para Spring Cloud Config Server con backend en SQL Server.
- Endpoint para obtención de propiedades por `application`, `profile` y `label`.
- Estructura base del proyecto con Spring Boot 4.x.
- Implementación de consultas vía JDBC.
- Dockerfile para despliegue en contenedores.
- Configuración de zona horaria (`America/Mexico_City`) en contenedor.
- README inicial con guía de uso.
- Configuración de puerto 8888 por defecto.
- Documentación base en README.

### Security

- Protección de credenciales vía variables de entorno.