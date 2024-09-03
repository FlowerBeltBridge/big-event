package org.example.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.example.pojo.Result;
import org.example.utils.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping("/list")
    public Result list() {
//        try {
//            Map<String, Object> claims = JwtUtil.parseToken(token);
//            return Result.success("文章列表");
//        } catch (Exception e) {
//            response.setStatus(401);
//            return Result.error("未登录");
//        }
        return Result.success("文章列表");
    }

}
