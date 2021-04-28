package dean.springboot.demo.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
@ResponseBody

public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public String serviceExceptionHandler(ServiceException se){
        log.error(se.getMessage());
        return "业务异常，系统繁忙，请稍后再试";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e){
        log.error(e.getMessage());
        return "非业务异常，系统繁忙，请稍后再试";
    }

    @ExceptionHandler(Throwable.class)
    public String throwableHandler(Throwable th){
        log.error(th.getMessage());
        return "系统错误，系统繁忙，请稍后再试";
    }
}
