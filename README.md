# 📋 API REST - Gestión de Tareas (Profesional)

API RESTful desarrollada con **Spring Boot** para la gestión de tareas (To-Do List), siguiendo una **arquitectura profesional en capas**.  
Permite crear, listar, actualizar, eliminar y cambiar el estado de tareas asociadas a usuarios mediante un **contrato de API estable basado en DTOs**.

La aplicación está diseñada para ser **mantenible, escalable y preparada para integrarse con un frontend**, aplicando buenas prácticas reales de desarrollo backend.

---

## 🚀 Tecnologías Utilizadas

### Backend
- **Java** - Lenguaje de programación principal  
- **Spring Boot** - Framework para desarrollo de aplicaciones Java  
- **Spring Web** - Creación de endpoints REST  
- **Spring Data JPA** - Capa de persistencia y acceso a datos  
- **Hibernate** - ORM (Object-Relational Mapping)  
- **Lombok** - Reducción de código boilerplate  
- **Bean Validation** - Validación de datos de entrada  

### Base de Datos
- **MySQL** - Sistema de gestión de base de datos relacional  

### Gestión de Proyecto
- **Maven** - Gestión de dependencias y construcción del proyecto  

---

## 📌 ¿Para Qué Sirve Esta API?

Esta API permite gestionar un sistema de tareas (To-Do List) de forma profesional, separando claramente la lógica de negocio, la persistencia y la capa web.

### Funcionalidades principales:

✅ **Crear tareas** asociadas a un usuario  
✅ **Listar todas las tareas** de un usuario específico  
✅ **Actualizar información** de una tarea existente  
✅ **Eliminar tareas** que ya no son necesarias  
✅ **Cambiar el estado** de las tareas (PENDIENTE, EN_PROGRESO, COMPLETADA)  

### Casos de uso:
- Aplicaciones de gestión de proyectos  
- Organizadores personales  
- Sistemas de seguimiento de actividades  
- Proyecto de portfolio backend profesional  

---

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una **arquitectura en capas (Layered Architecture)**, desacoplando la API de las entidades de dominio mediante el uso de DTOs.


