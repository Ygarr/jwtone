package com.company.TestProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthDTO
{
    private String userName;
    private String passWord;

    private String userLastname;
    private Integer userId;

}
