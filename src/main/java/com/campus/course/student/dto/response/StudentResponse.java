package com.campus.course.student.dto.response;

import com.campus.course.student.entity.StudentEntity;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public static StudentResponse of(StudentEntity entity){
        return StudentResponse.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .build();
    }
}

