package sampleRESTful.demo.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// @JsonIgnoreProperties(value = {"password"})
@JsonFilter("UserInfo")
public class User {
	private Integer id;

	@Size(min = 2)
	private String name;
	@Past
	private Date joinDate;

	private String password;
	// @JsonIgnore (하나만 적용가능)
	private String ssn; //주민등록번호
}
