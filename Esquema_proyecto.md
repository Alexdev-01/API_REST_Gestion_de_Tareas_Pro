```text
├── 📁 src/main/java/
│   └── 📁 com.gestiontareas.todolist/
│       │
│       ├── 📄 ApiRestGestionTareasApplication.java    ➜ Clase principal (main) de Spring Boot
│       │
│       ├── 📁 config/
│       │   └── 📄 SwaggerConfig.java                  ➜ Configuración de Swagger/OpenAPI
│       │
│       ├── 📁 controller/
│       │   └── 📄 TareaController.java                ➜ Controlador REST con endpoints HTTP
│       │                                                  (GET, POST, PUT, PATCH, DELETE)
│       │
│       ├── 📁 dto/
│       │   ├── 📁 request/
│       │   │   └── 📄 TareaRequestDTO.java            ➜ DTO para recibir datos del cliente
│       │   │
│       │   └── 📁 response/
│       │       └── 📄 TareaResponseDTO.java           ➜ DTO para enviar datos al cliente
│       │
│       ├── 📁 exception/
│       │   ├── 📄 GlobalExceptionHandler.java         ➜ Manejador global de excepciones
│       │   └── 📄 ResourceNotFoundException.java      ➜ Excepción personalizada (404)
│       │
│       ├── 📁 model/
│       │   ├── 📄 Tarea.java                          ➜ Entidad JPA - Tabla tareas
│       │   ├── 📄 Usuario.java                        ➜ Entidad JPA - Tabla usuarios
│       │   └── 📄 EstadoTarea.java                    ➜ Enum (PENDIENTE, EN_PROGRESO, COMPLETADA)
│       │
│       ├── 📁 repository/
│       │   ├── 📄 TareaRepository.java                ➜ Interfaz JPA Repository para Tareas
│       │   └── 📄 UsuarioRepository.java              ➜ Interfaz JPA Repository para Usuarios
│       │
│       └── 📁 service/
│           ├── 📄 TareaService.java                   ➜ Interfaz con métodos de lógica de negocio
│           └── 📄 TareaServiceImpl.java               ➜ Implementación del servicio
│
├── 📁 src/main/resources/
│   └── 📄 application.yml                             ➜ Configuración de Spring Boot
│                                                          (BD, JPA, servidor)
│
├── 📁 src/test/java/                                  ➜ Tests unitarios e integración
│   └── 📁 resources/
│
└── 📁 target/                                         ➜ Archivos compilados (.class)
    ├── 📁 classes/
    ├── 📁 generated-sources/
    ├── 📁 generated-test-sources/
    └── 📁 test-classes/
