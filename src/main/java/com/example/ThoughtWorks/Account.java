package com.example.ThoughtWorks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Integer id;

    @NotNull(message = "The name should not be null")
    @Size(min = 1, max = 128, message = "The size of title is should between 1~128")
    private String name;

    @Min(value = 16, message = "The age of user should be greater than 16")
    private Long age;

    @NotNull(message = "The avatar should not be null")
    @Size(min = 8, max = 512, message = "The size of title is should between 8~512")
    private String avatar;

    @Size(min = 0, max = 1024, message = "The size of title is should between 0~1024")
    private String description;
}