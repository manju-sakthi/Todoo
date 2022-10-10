package com.perfomatix.todoo.service;

import com.perfomatix.todoo.dto.TaskDTO;
import com.perfomatix.todoo.entity.Task;
import com.perfomatix.todoo.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TaskService {
@Autowired
    TaskRepository taskRepository;
    public List<Object> fetchAllTasks(){
        return ((List<Task>)taskRepository.findAll()).stream().map(this::convertDataIntoDTO).collect(Collectors.toList());
    }

    public TaskDTO convertDataIntoDTO(Task taskdata) {
        TaskDTO dto= new TaskDTO();
        dto.setName(taskdata.getTaskName());
        dto.setStatus(taskdata.getStatus());
        dto.setCreatedAt(taskdata.getCreatedDate());
        return dto;

    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task convertDtoIntoData(TaskDTO taskDTO ) {
        Task task=new Task();
        task.setTaskName(taskDTO.getName());
        task.setStatus(taskDTO.getStatus());
        task.setCreatedDate(taskDTO.getCreatedAt());
        return task;
    }
    public  void deleteTask(Long id){
        Optional<Task> task=taskRepository.findById(id);
    }
}
