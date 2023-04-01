package com.Damera.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Employee {
	
	private Integer empId;
	private String empName;
	private Double salary;
	private Integer deptNo;

}
