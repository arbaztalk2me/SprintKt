package com.himanshu.service;

import com.himanshu.GlobalExeptionHandling.StudentNotFoundException;
import com.himanshu.GlobalExeptionHandling.StudentNotFoundWithMobException;
import com.himanshu.entity.Student;
import com.himanshu.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepo;


    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentByid(int id) {
//        Optional<Student> byId = this.studentRepo.findById(id);
//        if(byId.isPresent()){
//            return byId.get();
//        }else{
//            throw new StudentNotFoundException("Student Not Found with Id "+id);
//        }

       return this.studentRepo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Not Found with Id " + id));

    }

    @Override
    public List<Student> getAllStudent() {
        return this.studentRepo.findAll();
    }

    @Override
    public Student findStudentByMob(String mob) {
        Optional<Student> byId = this.studentRepo.findByMob(mob);
        if(byId.isPresent()){
            return byId.get();
        }else{
            throw new StudentNotFoundWithMobException("Student Not Found with Id "+mob);
        }
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Optional<Student> byId = this.studentRepo.findById(id);
        Student existingStudent = byId.get();
        existingStudent.setAddress(student.getAddress());
        existingStudent.setName(student.getName());
        existingStudent.setMob(student.getMob());
        existingStudent.setInstitute(student.getInstitute());

       return this.studentRepo.save(existingStudent);
    }

    @Override
    public void deletStudent(int id) {
        this.studentRepo.deleteById(id);
    }
}
