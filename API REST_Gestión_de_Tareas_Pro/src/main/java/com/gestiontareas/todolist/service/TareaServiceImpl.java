package com.gestiontareas.todolist.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gestiontareas.todolist.dto.TareaResponseDTO;
import com.gestiontareas.todolist.model.EstadoTarea;
import com.gestiontareas.todolist.model.Tarea;
import com.gestiontareas.todolist.model.Usuario;
import com.gestiontareas.todolist.repository.TareaRepository;
import com.gestiontareas.todolist.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service // Indica que esta clase es un servicio de Spring
@RequiredArgsConstructor // Genera un constructor con los campos finales
public class TareaServiceImpl implements TareaService {

	private final TareaRepository tareaRepository;
    private final UsuarioRepository usuarioRepository;


	// Método para crear una nueva tarea
	@Override
	public TareaResponseDTO crearTarea(TareaResponseDTO dto) {
		
		Usuario usuario = usuarioRepository.findById(dto.getUsuarioId());
		if (usuario == null) {
			throw new RuntimeException("Usuario no encontrado con id: " + dto.getUsuarioId());
		}

		Tarea tarea = new Tarea();
		tarea.setEstado(EstadoTarea.PENDIENTE); // Establece el estado inicial de la tarea como PENDIENTE
		tarea.setFechaCreacion(LocalDateTime.now()); // Establece la fecha de creación actual
		tarea.setUsuario(usuario);
		tarea.setEstado(EstadoTarea.PENDIENTE);
		tarea.setFechaCreacion(LocalDateTime.now());
		
		return mapToResponseDTO(tareaRepository.save(tarea));
	}
	
	// Método para listar todas las tareas de un usuario específico
	@Override
	public List<Tarea> listarTareasPorUsuario (Long usuarioId) {
		return tareaRepository.findByUsuarioId(usuarioId);
	}
	
	
	// Método para actualizar una tarea existente
	@Override
	public Tarea actualizarTarea(Long id, Tarea tareaActualizada) {
		Tarea tarea = tareaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Tarea no encontrada con id: " + id));
		tarea.setTitulo(tareaActualizada.getTitulo());
		tarea.setDescripcion(tareaActualizada.getDescripcion());
		tarea.setEstado(tareaActualizada.getEstado());
		
		return tareaRepository.save(tarea);
	}
	
	// Método para eliminar una tarea por su ID
	@Override
	public void elimarTarea(Long id) {
		Tarea tarea = tareaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Tarea no encontrada con id: " + id));
		tareaRepository.delete(tarea);		
	}
	
	
	// Método para cambiar el estado de una tarea
	@Override
	public Tarea cambiarEstado(Long id, EstadoTarea nuevoEstado) {
		Tarea tarea = tareaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Tarea no encontrada con id: " + id));
		tarea.setEstado(nuevoEstado);
		
		return tareaRepository.save(tarea);
	}


	
}
