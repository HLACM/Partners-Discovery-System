package com.cai.jujiao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cai.jujiao.model.entity.Team;
import com.cai.jujiao.model.entity.User;
import com.cai.jujiao.model.request.*;
import com.cai.jujiao.model.vo.TeamUserVo;
import com.cai.jujiao.model.vo.TeamVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

/**
 * @author HLACM
 * @description 针对表【team(队伍)】的数据库操作Service
 * @createDate 2024-03-08 23:14:16
 */
public interface TeamService extends IService<Team> {

    /**
     * 获取所有队伍
     *
     * @return
     */
    TeamUserVo getTeams();

    /**
     * 根据队伍id获取队伍
     *
     * @param teamId
     * @param request
     * @return
     */
    TeamVo getUsersByTeamId(Long teamId, HttpServletRequest request);

    /**
     * 根据用户加入的队伍id获取队伍信息
     *
     * @param teamId
     * @param request
     * @return
     */
    TeamUserVo getTeamListByTeamIds(Set<Long> teamId, HttpServletRequest request);

    /**
     * 加入队伍
     *
     * @param joinTeam
     * @param loginUser
     * @return
     */
    User joinTeam(TeamJoinRequest joinTeam, User loginUser);

    /**
     * 创建新的队伍
     *
     * @param teamCreateRequest
     * @param loginUser
     * @return
     */
    boolean createTeam(TeamCreateRequest teamCreateRequest, User loginUser);

    /**
     * 解散队伍
     *
     * @param teamId
     * @param request
     * @return
     */
    boolean dissolutionTeam(Long teamId, HttpServletRequest request);

    /**
     * 退出队伍
     *
     * @param teamId
     * @param request
     * @return
     */
    boolean quitTeam(Long teamId, HttpServletRequest request);

    /**
     * 查询队伍
     *
     * @param teamQueryRequest
     * @param request
     * @return
     */
    TeamUserVo teamQuery(TeamQueryRequest teamQueryRequest, HttpServletRequest request);

    /**
     * 处理返回信息Vo
     *
     * @param teamList
     * @return teamUserVo
     */
    TeamUserVo teamSet(List<Team> teamList);

    /**
     * 修改队伍信息
     *
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    Boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 踢出队员
     *
     * @param userId    队员id
     * @param loginUser
     * @return
     */
    Boolean kickOutTeamByUserId(KickOutUserRequest userId, User loginUser);

    /**
     * 转交队长
     *
     * @param transferTeamRequest
     * @param loginUser
     * @return
     */
    Boolean transferTeam(TransferTeamRequest transferTeamRequest, User loginUser);
}
