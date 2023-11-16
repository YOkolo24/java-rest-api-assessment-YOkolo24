package com.cbfacademy.apiassessment.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "Tasks Class Test Suite should:")
public class TasksTests {

    private Tasks tasks;

    @BeforeEach
    public void setUp() {

        tasks = new Tasks(1, "Complete code implementation for assignment.", 4, false);
    }

    @Test
    @DisplayName("Show the 'id' getter and setter work as they should.")
    public void testIdGetterAndSetter() {
   
        tasks.setId(2);
    
        assertEquals(2, tasks.getId());
        assertEquals("Complete code implementation for assignment.", tasks.getTaskDetails());
        assertEquals(4, tasks.getPriorityScoreOutOfFive());
        assertEquals(false, tasks.isCompleted());
    }

    @Test
    @DisplayName("Show the 'taskDetails' getter and setter work as they should.")
    public void testTaskDetailsGetterAndSetter() {
   
        tasks.setTaskDetails("Check over all your work.");
    
        assertEquals(1, tasks.getId());
        assertEquals("Check over all your work.", tasks.getTaskDetails());
        assertEquals(4, tasks.getPriorityScoreOutOfFive());
        assertEquals(false, tasks.isCompleted());
    }

    @Test
    @DisplayName("Show the 'priorityScoreOutOfFive' getter and setter work as they should.")
    public void testPriorityScoreGetterAndSetter() {
   
        tasks.setPriorityScoreOutOfFive(5);
    
        assertEquals(1, tasks.getId());
        assertEquals("Complete code implementation for assignment.", tasks.getTaskDetails());
        assertEquals(5, tasks.getPriorityScoreOutOfFive());
        assertEquals(false, tasks.isCompleted());
    }

    @Test
    @DisplayName("Show the 'isCompleted' getter and setter work as they should.")
    public void testIsCompletedGetterAndSetter() {
   
        tasks.setCompleted(true);
    
        assertEquals(1, tasks.getId());
        assertEquals("Complete code implementation for assignment.", tasks.getTaskDetails());
        assertEquals(4, tasks.getPriorityScoreOutOfFive());
        assertEquals(true, tasks.isCompleted());
    }
    
}
