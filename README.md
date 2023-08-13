# API REST CRUD con Spring Boot, Hibernate y Lombok

Este repositorio contiene un pequeño proyecto que implementa una API REST CRUD (Create, Read, Update, Delete) utilizando las tecnologías de Spring Boot, Hibernate y Lombok en el lenguaje de programación Java, con MySQL como base de datos. El objetivo de este proyecto es proporcionar un ejemplo básico de cómo construir un servicio web que pueda realizar operaciones CRUD en una base de datos utilizando las herramientas mencionadas.

## Requisitos

Antes de ejecutar este proyecto, asegúrate de tener instalados los siguientes elementos:

1. **Java**: Asegúrate de tener una versión de Java 8 o superior instalada.
2. **Maven**: Se utiliza Maven como herramienta de construcción y gestión de dependencias.
3. **MySQL**: Asegúrate de tener un servidor MySQL instalado y configurado (asegúrate de tener el nombre de usuario, contraseña y la URL de conexión a la base de datos MySQL).
4. **Git**: Si deseas clonar el repositorio, asegúrate de tener Git instalado.

## Instrucciones de Uso

Sigue estos pasos para ejecutar el proyecto:

1. **Clona el repositorio**: Si no lo has hecho, clona este repositorio a tu máquina local utilizando el comando `git clone`.

2. **Configura la base de datos**: Abre el archivo `application.properties` en la carpeta `src/main/resources` y modifica la configuración de la base de datos según tus necesidades (nombre de usuario, contraseña y URL de conexión).

3. **Compila el proyecto**: Abre una terminal en la raíz del proyecto y ejecuta el siguiente comando para compilar el proyecto:

   ```bash
   mvn clean install
   ```
   
# Configuración de la Base de Datos

1. Abre el archivo `application.properties` en la carpeta `src/main/resources`.

2. Modifica la configuración de la base de datos según tus necesidades (nombre de usuario, contraseña y URL de conexión).

# Compilación del Proyecto

Para compilar el proyecto, abre una terminal en la raíz del proyecto y ejecuta el siguiente comando:

```bash
mvn clean install
```
## Estructura del Proyecto

El proyecto sigue la estructura estándar de una aplicación Spring Boot, siguiendo una arquitectura MVC (Modelo-Vista-Controlador) que se organiza en varias capas:

- **`src/main/java/`**: Contiene los archivos fuente Java, donde se organiza la lógica de la aplicación.

  - **`controller`**: Aquí se encuentran los controladores (controllers) de la aplicación, que manejan las solicitudes HTTP y gestionan las respuestas.
  - **`entity`**: Define las entidades de datos (entidades) que representan las estructuras de la base de datos y se utilizan en el mapeo con Hibernate.
  - **`repository`**: Contiene las interfaces que definen las operaciones de acceso a la base de datos (repository).
  - **`service`**: En esta carpeta se encuentran las clases que implementan la lógica de negocio (services), donde se maneja la interacción entre los controladores y los repositorios.
  - **`exceptions`**: Puede contener clases de excepciones personalizadas, si es necesario manejar casos excepcionales de manera específica.

- **`src/main/resources`**: Contiene los recursos, como archivos de configuración y plantillas.

Esta estructura modular y organizada facilita el desarrollo y mantenimiento del proyecto, siguiendo las mejores prácticas de diseño en una arquitectura MVC. Cada componente cumple su función específica, lo que mejora la legibilidad y extensibilidad del código.


