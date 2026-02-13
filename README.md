# Foro Hub - API REST

## Descripción
Este proyecto es una API RESTful desarrollada para el challenge "Foro Hub" del programa Oracle ONE Next Education. Simula el backend de un foro de discusión, permitiendo a los usuarios registrarse, autenticarse y gestionar tópicos (temas de discusión) de manera segura y eficiente.

## Características Principales
* **Autenticación y Autorización:** Implementación de seguridad sin estado (stateless) utilizando JSON Web Tokens (JWT) y Spring Security.
* **CRUD de Tópicos:** Rutas protegidas para la creación, actualización y eliminación de tópicos, con acceso público para lectura.
* **Validaciones Seguras:** Uso de Spring Boot Validation para asegurar la integridad de los datos recibidos mediante el patrón Data Transfer Objects (DTOs).
* **Persistencia de Datos:** Integración con base de datos relacional mediante Spring Data JPA.
* **Migraciones:** Control de versiones estructural de la base de datos automatizado con Flyway.
* **Manejo de Excepciones:** Respuestas JSON estandarizadas e informativas para errores de validación y accesos denegados (401 Unauthorized, 403 Forbidden).

## Tecnologías Utilizadas
* Java
* Spring Boot (Web, Security, Data JPA, Validation)
* Base de Datos Relacional
* Flyway Migration
* Auth0 java-jwt
* Maven

## Configuración y Ejecución

### Requisitos Previos
* Java Development Kit (JDK) instalado (versión 17 o superior).
* Entorno de desarrollo (IDE) como IntelliJ IDEA.
* Servidor de base de datos MySQL en ejecución.
* Postman o herramienta similar para el testeo de los endpoints.

### Pasos para ejecutar localmente
1. Clonar este repositorio en tu máquina local.
2. Crear una base de datos vacía en tu gestor SQL (por ejemplo, `forohub_api`).
3. Abrir el proyecto en el IDE y dirigirse al archivo `src/main/resources/application.properties`.
4. Configurar las credenciales de conexión y variables de entorno. Nota: la aplicación está configurada para evitar conflictos de red utilizando el puerto 8081.
   
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/forohub_api
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contrasena
   server.port=8081
   api.security.secret=tu_palabra_secreta_jwt

El archivo application.properties real está ignorado por cuestiones de seguridad. Deberás crearlo en src/main/resources y configurarlo como se explica arriba.
