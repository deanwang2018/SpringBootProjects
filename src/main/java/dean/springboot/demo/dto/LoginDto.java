package dean.springboot.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "用户登录类", description = "请求参数类")
@Data
public class LoginDto {
    @ApiModelProperty(value = "用户名", example = "dean", required = true)
    private String userName;

    @ApiModelProperty(value = "密码", example = "test123", required = true)
    private String pwd;

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }

}
