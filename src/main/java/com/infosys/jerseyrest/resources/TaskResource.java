package com.infosys.jerseyrest.resources;

import com.infosys.jerseyrest.model.Task;
import com.infosys.jerseyrest.request.TaskRequest;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

@Path("/Tasks")
@Singleton
public class TaskResource {

    private Map<UUID, Task> tasks = new LinkedHashMap<>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String createTask(TaskRequest request) {
        UUID taskId = UUID.randomUUID();
        tasks.put(taskId, new Task(taskId, request.getDescription()));
        return taskId.toString();
    }
}
