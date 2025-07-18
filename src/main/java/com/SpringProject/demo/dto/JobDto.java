package com.SpringProject.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class JobDto {

   private Integer id;
   private String JobTitle;
   private String company;
   private String location;
   private String type;
   private String jobDescription;
   private String status;

}
