package com.email.writer.app.dto;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent; // lowercase
    private String tone;
}
