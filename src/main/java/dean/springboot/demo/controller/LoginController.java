package dean.springboot.demo.controller;

import dean.springboot.demo.dto.LoginDto;
import dean.springboot.demo.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Api(tags = "测试管理平台-用户登录 springboot demo")
@RestController
@RequestMapping("demo")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Value("${demo.key1}")
    private String demoKey1;

    //    @RequestMapping(value="login",method = RequestMethod.POST)
    @PostMapping("login")
    @ApiOperation("用户登录POST接口")
    public String Login(@RequestBody LoginDto loginDto) {
//        System.out.println("用户: " + loginDto.getUserName() + " 登录了！");
//        System.out.println("密码：" + loginDto.getPwd());
        return "登录成功!" + loginService.Login(loginDto) + ", key: " + demoKey1;
    }

    //    @RequestMapping(value="byId/{userId}",method = RequestMethod.GET)
    @GetMapping("byId/{userId}")
    @ApiOperation("ID用户登录GET接口")
    public String getById(@PathVariable("userId") Long userId) {
        System.out.println("用户id: " + userId);
        return userId + " 登录成功!";
    }

    //    @RequestMapping(value="byId",method = RequestMethod.GET)
    @GetMapping("userId")
    @ApiOperation("ID传参用户登录GET接口")
    public String getByIdParm(@RequestParam("userId") Long userId) {
        System.out.println("用户id: " + userId);
        return userId + " 登录成功!";
    }
}
