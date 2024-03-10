package com.campus.course.student.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EditStudentRequest {
    private String firstName;
    private String lastName;
}
