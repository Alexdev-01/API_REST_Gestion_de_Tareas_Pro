# API REST – Gestión de Tareas

API REST desarrollada con Spring Boot para la gestión de tareas (To-Do List), siguiendo una arquitectura profesional y escalable.  
Permite crear, listar, actualizar, eliminar y cambiar el estado de tareas asociadas a usuarios mediante un contrato de API estable basado en DTOs.

El proyecto está diseñado para ser frontend-ready, mantenible y preparado para crecer, aplicando buenas prácticas reales de desarrollo backend.

---

## Diferencias respecto a una versión básica

- Uso de DTOs (Request / Response) para desacoplar la API de las entidades JPA  
- Separación clara de responsabilidades (Controller, Service, Repository)  
- Entidades encapsuladas y no expuestas directamente  
- Validaciones automáticas con Bean Validation (`@Valid`, `@NotNull`, `@NotBlank`)  
- Manejo centralizado de errores  
- Diseño escalable y mantenible, preparado para futuras extensiones  

---

## Tecnologías utilizadas

### Backend
- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- Lombok  
- Bean Validation  

### Base de datos
- MySQL  

### Gestión del proyecto
- Maven  

---

## Notas

Este proyecto forma parte de un portfolio backend y muestra la evolución desde una API REST básica hacia una arquitectura profesional siguiendo buenas prácticas de la industria.
