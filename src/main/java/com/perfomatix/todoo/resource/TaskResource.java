package com.perfomatix.todoo.resource;

import com.perfomatix.todoo.dto.TaskDTO;
import com.perfomatix.todoo.entity.Task;
import com.perfomatix.todoo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/v1/tasks")
@RestController
public class TaskResource {
    private final TaskService taskService;

    @GetMapping(value = "/list/view")
    public ResponseEntity<List<Object>> fetchAllTasks() {
        List<Object> listTask=taskService.fetchAllTasks();
        return ResponseEntity.ok().body(listTask);
    }
    @PostMapping(value = "/list/create")
    public  ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDTO){
        Task task=taskService.createTask(taskService.convertDtoIntoData(taskDTO));
        return new ResponseEntity<TaskDTO>(taskService.convertDataIntoDTO(task), HttpStatus.CREATED);

    }


    }
