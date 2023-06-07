package sampleRESTful.demo.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// @JsonIgnoreProperties(value = {"password"})
@JsonFilter("UserInfoV2")
public class UserV2 extends User{
	private String grade;

}
