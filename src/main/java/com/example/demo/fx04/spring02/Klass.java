package com.example.demo.fx04.spring02;

import com.example.demo.fx04.spring01.Student;
import lombok.Data;

import java.util.List;

@Data
public class Klass { 
    
    List<Student> students;
    
    public void dong(){
        System.out.println(this.getStudents());
    }
    
}
