package sampleRESTful.demo.user;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// @JsonIgnoreProperties(value = {"password"})
// @JsonFilter("UserInfo")
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Size(min = 2)
	@ApiModelProperty(notes = "사용자의 이름을 입력해 주세요")
	private String name;
	@Past
	@ApiModelProperty(notes = "사용자의 등록일 입력해 주세요")
	private Date joinDate;

	@ApiModelProperty(notes = "사용자의 비밀번호 입력해 주세요")
	private String password;
	// @JsonIgnore (하나만 적용가능)
	@ApiModelProperty(notes = "사용자의 주민번호 입력해 주세요")
	private String ssn; //주민등록번호

	@OneToMany(mappedBy = "user")
	private List<Post> posts;

	public User(int i, String kenneth, Date date, String pass1, String s) {
	}
}
