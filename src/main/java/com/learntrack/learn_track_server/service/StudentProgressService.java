package com.learntrack.learn_track_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learntrack.learn_track_server.model.StudentProgress;
import com.learntrack.learn_track_server.repository.StudentProgressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentProgressService {

    @Autowired
    private StudentProgressRepository studentProgressRepository;

    public StudentProgress saveStudentProgress(StudentProgress studentProgress) {
        return studentProgressRepository.save(studentProgress);
    }

    public List<StudentProgress> getAllStudentProgressRecords() {
        return studentProgressRepository.findAll();
    }

    public StudentProgress updateStudentProgress(String id, StudentProgress updatedProgress) {
        Optional<StudentProgress> existingRecord = studentProgressRepository.findById(id);
        if (existingRecord.isPresent()) {
            updatedProgress.setStudentId(id);  // Ensure the same ID is maintained
            return studentProgressRepository.save(updatedProgress);
        } else {
            throw new RuntimeException("Student Progress not found with ID: " + id);
        }
    }

    public String deleteStudentProgress(String id) {
        if (studentProgressRepository.existsById(id)) {
            studentProgressRepository.deleteById(id);
            return "Student Progress deleted successfully with ID: " + id;
        } else {
            throw new RuntimeException("Student Progress not found with ID: " + id);
        }
    }
}