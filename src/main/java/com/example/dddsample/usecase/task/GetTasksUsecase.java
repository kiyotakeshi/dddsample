package com.example.dddsample.usecase.task;

import com.example.dddsample.domain.task.TaskEntity;
import com.example.dddsample.domain.task.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kiyota
 */
@Service
public class GetTasksUsecase {

	private final TaskRepository taskRepository;

	public GetTasksUsecase(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public List<TaskEntity> getTasks() {
		return taskRepository.selectAll();
	}

}
