package com.cai.jujiao.controller;

import com.cai.jujiao.exception.BusinessException;
import com.cai.jujiao.common.BaseResponse;
import com.cai.jujiao.common.ErrorCode;
import com.cai.jujiao.common.ResultUtil;
import com.cai.jujiao.model.entity.User;
import com.cai.jujiao.model.request.ChatRequest;
import com.cai.jujiao.model.vo.MessageVo;
import com.cai.jujiao.service.ChatService;
import com.cai.jujiao.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.cai.jujiao.contant.ChatConstant.*;

/**
 * @Author: HLACM
 * @Date: 2024年04月11日 11:37
 * @Version: 1.0
 * @Description:
 */
@RestController
@RequestMapping("/chat")
public class ChatController {
    @Resource
    private ChatService chatService;
    @Resource
    private UserService userService;

    @PostMapping("/privateChat")
    public BaseResponse<List<MessageVo>> getPrivateChat(@RequestBody ChatRequest chatRequest, HttpServletRequest request) {
        if (chatRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "请求有误");
        }
        User loginUser = userService.getLoginUser(request);
        List<MessageVo> privateChat = chatService.getPrivateChat(chatRequest, PRIVATE_CHAT, loginUser);
        return ResultUtil.success(privateChat);
    }

    @GetMapping("/hallChat")
    public BaseResponse<List<MessageVo>> getHallChat(HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        List<MessageVo> hallChat = chatService.getHallChat(HALL_CHAT, loginUser);
        return ResultUtil.success(hallChat);
    }

    @PostMapping("/teamChat")
    public BaseResponse<List<MessageVo>> getTeamChat(@RequestBody ChatRequest chatRequest, HttpServletRequest request) {
        if (chatRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "请求有误");
        }
        User loginUser = userService.getLoginUser(request);
        List<MessageVo> teamChat = chatService.getTeamChat(chatRequest, TEAM_CHAT, loginUser);
        return ResultUtil.success(teamChat);
    }
}
