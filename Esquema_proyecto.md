```text
com.gestiontareas.todolist
│
├── controller
│   ├── TareaController.java
│   └── UsuarioController.java
│
├── service
│   ├── TareaService.java
│   ├── TareaServiceImpl.java
│   ├── UsuarioService.java
│   └── UsuarioServiceImpl.java
│
├── repository
│   ├── TareaRepository.java
│   └── UsuarioRepository.java
│
├── dto
│   ├── request
│   │   ├── TareaRequestDTO.java
│   │   └── UsuarioRequestDTO.java
│   └── response
│       ├── TareaResponseDTO.java
│       └── UsuarioResponseDTO.java
│
├── model
│   ├── Tarea.java
│   ├── Usuario.java
│   └── EstadoTarea.java
│
├── exception
│   ├── ApiError.java
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
│
├── config
│   └── SwaggerConfig.java (más adelante)
│
└── ApiRestGestionTareasApplication.java
