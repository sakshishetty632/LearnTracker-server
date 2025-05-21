package com.learntrack.learn_track_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.learntrack.learn_track_server.model.StudentProgress;
import com.learntrack.learn_track_server.service.StudentProgressService;

import java.util.List;

@RestController
@RequestMapping("/api/student-progress")
@CrossOrigin(origins = "https://learntracker.vercel.app")  // Update if needed
public class StudentProgressController {

    @Autowired
    private StudentProgressService studentProgressService;

    // POST: Add new student progress record
    @PostMapping
    public StudentProgress saveStudentProgress(@RequestBody StudentProgress studentProgress) {
        System.out.println("Received student_id: " + studentProgress.getStudentId()); // Debug log
        return studentProgressService.saveStudentProgress(studentProgress);
    }

    // GET: Fetch all student progress records
    @GetMapping
    public List<StudentProgress> getAllStudentProgressRecords() {
        return studentProgressService.getAllStudentProgressRecords();
    }

    // PUT: Update student progress by ID
    @PutMapping("/{id}")
    public StudentProgress updateStudentProgress(@PathVariable String id, @RequestBody StudentProgress updatedProgress) {
        return studentProgressService.updateStudentProgress(id, updatedProgress);
    }

    // DELETE: Delete student progress by ID
    @DeleteMapping("/{id}")
    public String deleteStudentProgress(@PathVariable String id) {
        return studentProgressService.deleteStudentProgress(id);
    }
}