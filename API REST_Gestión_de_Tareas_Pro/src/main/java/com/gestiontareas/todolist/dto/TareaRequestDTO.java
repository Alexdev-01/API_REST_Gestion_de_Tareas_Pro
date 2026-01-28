package com.gestiontareas.todolist.dto;

import lombok.Data;

//Representa lo que entra por POST o PUT
@Data // Clase DTO para las solicitudes de creación o actualización de tareas
public class TareaRequestDTO {
	
	private String Titulo;
	private String descripcion;
	private Long usuarioId;

}
