package com.gl.CollegeFestDebateSpring.boot.service;

import java.util.Arrays;
import java.util.List;

public class TodoServiceImpl implements TodoService{

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Spring mvc","dance");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
