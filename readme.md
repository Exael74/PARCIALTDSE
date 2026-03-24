## STIVEN ESNEIDER PARDO GUTIERREZ

Este repositorio presenta el parcial para el segundo corte de TDSE, habia tenido un problema con los usuarios de github y por eso los commits se estan realizando hasta este momento 

video del funcionamiento: <video controls src="20260324-1736-26.9243981.mp4" title="Title"></video> es el video "20260324-1736-26.9243981.mp4" adjunto en el repositorio, aclaro esto en caso de que el readme no lo muestre


## Estructura del proyecto 
<img width="796" height="612" alt="image" src="https://github.com/user-attachments/assets/2b1db28b-049b-4f82-9241-2c5d4af618f9" />
La carpeta target se genera al ejecutar el proyecto, por ello no esta en el repositorio


## Descripción del Proyecto
Este proyecto implementa un servicio REST basado en Spring Boot que calcula la secuencia de Collatz para un número entero positivo dado. Incluye un cliente web asíncrono para interactuar con el servicio y está diseñado para ser desplegado en contenedores Docker,
se realiza como solucion al parcial del segundo corte de TDSE

Verificamos la correcta compilacion del proyecto 
![alt text](docs/image.png)

Construccion de la imagen docker
![alt text](docs/image1.png)

Corremos la instancia del contenedor
![alt text](docs/image4.png)
![alt text](docs/image-1.png)
![alt text](docs/image-2.png)
![alt text](image.png)

![alt text](image-1.png)


Habilitamos docker en la instancia: 
![alt text](image-2.png)
![alt text](image-3.png)

Implementado con spring boot
![alt text](image-4.png)


Finalmente usamos este link luego de realizar el despliegue de AWS
http://ec2-44-202-109-82.compute-1.amazonaws.com:8081/collatzsequence?value=13

donde obtenemos el siguiente resultado 

![alt text](image-5.png)

