package com.himanshu.controller;

import com.himanshu.entity.Student;
import com.himanshu.service.StudentService;
import com.himanshu.service.StudentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/student")
public class StduentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<Student> saveStduent(@Valid @RequestBody Student student){
        Student student1 = this.studentService.saveStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable  int id){
        Student student1 = this.studentService.getStudentByid(id);
        return student1;
    }

    @GetMapping("/getmob/{mob}")
    public Student getStudentByMob(@PathVariable  String mob){
        Student student1 = this.studentService.findStudentByMob(mob);
        return student1;
    }

    @GetMapping("/get")
    public Student getStudentByIdParam(@RequestParam  int id){
        Student student1 = this.studentService.getStudentByid(id);
        return student1;
    }


    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        List<Student> list=this.studentService.getAllStudent();
        return list;
    }

    @PutMapping("/update/{id}")
    public Student updateStduent(@PathVariable  int id,@RequestBody Student student){
        Student student1 = this.studentService.updateStudent(id,student);
        return student1;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStdeuntbyid(@PathVariable  int id){
       this.studentService.deletStudent(id);
        return "Stduent delete with id "+id;
    }



}
