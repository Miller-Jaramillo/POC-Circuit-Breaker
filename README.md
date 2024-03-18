# POC Circuit Breaker con Resilience4j en Spring Boot 👽

## Introducción

Este repositorio contiene una prueba de concepto (POC) de Circuit Breaker implementado con Resilience4j en un proyecto de Spring Boot. El objetivo de esta POC es demostrar cómo se puede implementar un circuit breaker en un entorno de microservicios utilizando Resilience4j.

## Descripción

El proyecto consta de dos servicios: Service A y Service B. Service A utiliza Resilience4j para llamar a Service B de forma segura, evitando fallas en cascada en caso de que Service B falle.

## Objetivos

- Implementar un circuit breaker con Resilience4j en Spring Boot.
- Demostrar cómo evitar fallas en cascada al llamar a servicios externos.
- Probar la recuperación automática del circuit breaker después de un período de fallo.

## Pasos implementados para llevar a cabo la prueba

1. **Configuración de Resilience4j en Service A:** Se configuró Resilience4j en Service A para gestionar las llamadas a Service B.

2. **Implementación de un circuit breaker en Service A:** e implementó un circuit breaker en Service A utilizando Resilience4j para evitar fallas en cascada.

3. **Configuración de un endpoint en Service B:** Se configuró un endpoint en Service B para simular un servicio externo.

4. **Llamada segura desde Service A a Service B:** Se realizó una llamada segura desde Service A a Service B utilizando el circuit breaker.

## Tecnologías

- Java 17
- Spring Boot 3.1.9
- Resilience4j
- Maven
- IntelliJ IDEA

## Resultados

La POC ha sido exitosa en demostrar la eficacia de Resilience4j para implementar circuit breakers en aplicaciones de Spring Boot. Se ha evitado eficazmente las fallas en cascada al llamar a servicios externos y se ha comprobado la recuperación automática del circuit breaker después de un período de fallo.

## Conclusiones

Resilience4j es una biblioteca sólida y eficaz para implementar circuit breakers en aplicaciones de Spring Boot. Su configuración es sencilla y ofrece un gran control sobre el comportamiento del circuit breaker. Su uso puede mejorar significativamente la resiliencia de las aplicaciones ante fallos en servicios externos.
