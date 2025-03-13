package com.yyy.picturecloudbackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yyy.picturecloudbackend.model.dto.spaceuser.SpaceUserAddRequest;
import com.yyy.picturecloudbackend.model.dto.spaceuser.SpaceUserQueryRequest;
import com.yyy.picturecloudbackend.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yyy.picturecloudbackend.model.vo.spaceuser.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author jeffery
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-03-12 15:25:42
*/
public interface SpaceUserService extends IService<SpaceUser> {

    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    void validSpaceUser(SpaceUser spaceUser, boolean add);

    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}
