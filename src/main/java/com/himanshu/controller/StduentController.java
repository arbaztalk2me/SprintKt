package com.himanshu.controller;

import com.himanshu.entity.Student;
import com.himanshu.service.StudentService;
import com.himanshu.service.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/student")
@Tag(name = "Student-Controller-Class", description = "Student related APIs")
//added dummy
public class StduentController {

    @Autowired
    StudentService studentService;

    @Value("${arbaz}")
    private String var1;



    @PostMapping("/save")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "course added successfully",
                    content = {
                            @Content(mediaType = "application/json")
                    }),
            @ApiResponse(responseCode = "400",description = "validation error")
    })
    @Operation(summary = "Add Student to DB")
    public ResponseEntity<Student> saveStduent(@Valid @RequestBody Student student){
        Student student1 = this.studentService.saveStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    @Operation(summary = "get course By Id",description = "get course by id from db")
    public Student getStudentById(@PathVariable @Parameter(example = "1") int id){
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

    @GetMapping("/getValueFromPropetyFile")
    public String getvalueProperty(){
       return var1;
    }


}
