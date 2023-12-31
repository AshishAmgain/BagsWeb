package com.example.The_Bags.pojo;

import com.example.The_Bags.entity.User;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo {
    private Integer id;

    @NotEmpty(message = "Email can't be empty")
    private String email;

    @NotEmpty(message = "Full name can't be empty")
    private String fullname;

    @NotEmpty(message = "Mobile Number can't be empty")
    private String mobile_no;

    @NotEmpty(message = "Password can't be empty")
    private String password;

//    private MultipartFile picture;

    public UserPojo(User user){
        this.id=user.getId();
        this.email=user.getEmail();
        this.fullname=user.getFullName();
        this.mobile_no=user.getMobileNo();
        this.password=user.getPassword();
    }
}
