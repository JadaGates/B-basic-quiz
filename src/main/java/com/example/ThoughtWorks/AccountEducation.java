package com.example.ThoughtWorks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountEducation {
    private Long year;
    private String title;
    private String description;
    private Long userId;

}
