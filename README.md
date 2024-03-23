# spring-boot-kafka
# Proyecto  Apache kafka con Spring

https://www.geeksforgeeks.org/how-to-install-and-run-apache-kafka-on-windows/

Apache Kafka es una aplicación de código abierto que se utiliza para transmisiones en tiempo real de grandes cantidades de datos. Apache Kafka es un sistema de mensajería de publicación y suscripción. Un sistema de mensajería le permite enviar mensajes entre procesos, aplicaciones y servidores. En términos generales, Apache Kafka es un software donde se pueden definir y procesar temas.

![image](https://github.com/fhernandez204/spring-boot-kafka/blob/main/SpringBootProducerConsumer.jpg)


# INSTALAR Y EJECUTAR APACHE KAFKA EN WINDOWS
Descarga la instalación
Apache Kafka se puede descargar desde su sitio oficial kafka.apache.org

![image](https://github.com/fhernandez204/spring-boot-kafka/blob/main/Apache-kafka-Download.png)

Para la instalacion, realice los siguentes pasos:

  Paso 1: Ir a la carpeta Downloads y seleccione el archivo binario a bajar.

  Paso 2: Estaraer el archivo y mover a la carpeta al directorio donde desee colocar los registros.

  Paso 3: Copie el  path o ruta de la carpeta Kafka. Ahora vaya a la configuración dentro de la carpeta kafka y abra el archivo zookeeper.properties. Copie la ruta en el campo dataDir y agregue /zookeeper-data a la ruta.

![image](https://github.com/fhernandez204/spring-boot-kafka/blob/main/kafka2.jpg)

  Por ejemplo si la ruta es c:/kafka

  Paso 4: Ahora, en la misma carpeta de configuración, abra server.properties, desplácese hacia abajo hasta log.dirs y pegue la ruta. La ruta agregar /kafka-logs

  Paso 5: Esto completa la configuración de zookeeper y el servidor kafka. Ahora abra el símbolo del sistema y cambie el directorio a la carpeta kafka. Primero inicie zookeeper usando el   comando que se proporciona a continuación:

    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

![image](https://github.com/fhernandez204/spring-boot-kafka/blob/main/kafka3.jpg)

    Paso 6: Ahora abra otro símbolo del sistema y cambie el directorio a la carpeta kafka. Ejecute el servidor Kafka usando el comando:

    .\bin\windows\kafka-server-start.bat .\config\server.properties

![image](https://github.com/fhernandez204/spring-boot-kafka/blob/main/kafka4.jpg)

    Ahora kafka esta Corriendo y listo para transmitir datos.

Create a Configuration file named KafkaConfig. Below is the code for the KafkaConfig.java file.





