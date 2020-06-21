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
public class AccountEducation {
    @NotNull(message = "The year should not be null")
    @Min(value = 1799, message = "The year is not right")
    private Long year;

    @NotNull(message = "The title should not be null")
    @Size(min = 1, max = 256, message = "The size of title is beyond our constrain")
    private String title;

    @NotNull(message = "The description should not be null")
    @Size(min = 1, max = 4096, message = "The size of description is beyond our constrain")
    private String description;
    private Long userId;
}
