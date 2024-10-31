# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java que se conecta a una API para obtener las tasas de conversión en tiempo real. 
Utiliza la librería [Gson](https://github.com/google/gson) para procesar la respuesta JSON de la API y extraer los datos necesarios.

## Características

- Conexión a una API de tipo REST para obtener las tasas de conversión de monedas.
- Conversión en tiempo real entre diferentes monedas.
- Interfaz de consola que permite al usuario ingresar el monto y seleccionar las monedas de origen y destino.
- Manejo de excepciones para una experiencia de usuario robusta.

## Tecnologías

- **Java**: Lenguaje de programación utilizado para desarrollar el proyecto.
- **Gson**: Librería de Google para procesar datos JSON.
- **HTTP Client**: Biblioteca de Java para realizar solicitudes HTTP.

## Estructura del Proyecto

- **API_Request**: Clase que realiza la solicitud HTTP a la API de conversión de monedas y analiza la respuesta JSON utilizando Gson.
- **Conversor**: Clase que representa los datos de la conversión, incluyendo la tasa de conversión y el valor convertido.
- **Menu**: Clase que muestra las opciones de conversión disponibles y maneja la interacción con el usuario.
- **Principal**: Clase principal que inicializa el programa y muestra el mensaje de bienvenida.

## Instalación

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/tu-usuario/conversor-de-monedas.git
    ```
   
2. Navega al directorio del proyecto:
    ```bash
    cd conversor-de-monedas
    ```

3. Asegúrate de tener instalado [Java 11 o superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

4. Descarga la librería [Gson JAR](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.8/gson-2.8.8.jar) y colócala en el directorio `libs` (o en cualquier otra carpeta en tu proyecto).

## Uso

1. Ejecuta el programa desde la clase `Principal`.
2. Selecciona una de las opciones de conversión disponibles en el menú.
3. Ingresa el valor a convertir cuando el programa lo solicite.
4. El programa mostrará la tasa de conversión y el valor convertido en la consola.

### Ejemplo de Salida

![image](https://github.com/user-attachments/assets/7f744d84-d6bb-47b0-b804-c9cf16c0be49)

![image](https://github.com/user-attachments/assets/b34233fd-3fc2-4d84-97ae-ae79bc2f96ad)


## API Utilizada

Este proyecto utiliza la [ExchangeRate-API](https://www.exchangerate-api.com/) 
para obtener las tasas de cambio. Para utilizar esta API, se necesita una clave de API que se incluye en el URL de la solicitud.

**URL de Ejemplo**:
https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/USD/ARS/20

