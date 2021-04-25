package dean.springboot.demo.service.impl;

import dean.springboot.demo.dto.LoginDto;
import dean.springboot.demo.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String Login(LoginDto loginDto) {
        System.out.println("用户: " + loginDto.getUserName() + " 登录了！");
        System.out.println("密码：" + loginDto.getPwd());
        return loginDto.getUserName() + "-" + loginDto.getPwd();
    }
}
