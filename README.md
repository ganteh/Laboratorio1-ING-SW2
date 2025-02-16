# Laboratorio1-ING-SW2
Laboratorio 1. Polimorfismo en Java, Control de Dependencias y Pruebas Unitarias

Integrantes:
Adrian Camilo Bergaño
Cristobal Villaquiran Rodriguez
Yeixon Julian Gembuel Ciclos

Este proyecto esta dividido por modulos:

p-common: El modulo principal ya que no tiene dependencias con los demas proyectos.
p-plug-in: Submodulo de p-common el cual contiene los tipos de pagos y sus repectivas pruebas con JUnit. Tiene dependencias con p-common y p-core.
p-core: Submodulo de p-common el cual tiene la simulación o ejemplos de cada tipo de pagos. Tiene dependencias con p-plug-in

Instrucciones para ejecución:
Se clona el proyecto, en el proyecto p-core esta el main con la simulación de los pagos y el p-plug-in contiene las pruebas de los tipos de pagos. 
