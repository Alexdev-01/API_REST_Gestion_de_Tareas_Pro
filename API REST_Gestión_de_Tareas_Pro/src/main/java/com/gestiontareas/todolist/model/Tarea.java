package com.gestiontareas.todolist.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	// Indica que esta clase es una entidad de JPA
@Table(name = "tareas") // Especifica el nombre de la tabla en la base de datos
@Getter	// Genera automáticamente los métodos getter para los campos
@Setter	// Genera automáticamente los métodos setter para los campos
@NoArgsConstructor	// Genera automáticamente un constructor sin argumentos
@AllArgsConstructor	// Genera automáticamente un constructor con todos los argumentos
public class Tarea {
	
	@Id // Indica que este campo es la clave primaria de la entidad
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que el valor del ID se genera automáticamente
	private Long id;
	
	@Column(nullable = false) // Especifica que esta columna no puede ser nula
	private String titulo;
	
	private String descripcion;
	
	@Enumerated(EnumType.STRING) // Especifica que el campo es un enumerado y se almacena como una cadena
	@Column(nullable = false) // Especifica que esta columna no puede ser nula
	private EstadoTarea estado;
	
	@Column(nullable = false) // Especifica que esta columna no puede ser nula
	private LocalDateTime fechaCreacion;
	
	@ManyToOne // Indica una relación de muchos a uno con la entidad Usuario
	@JoinColumn(name = "usuario_id", nullable = false) // Especifica la columna de unión y que no puede ser nula
	private Usuario usuario;
	
}
