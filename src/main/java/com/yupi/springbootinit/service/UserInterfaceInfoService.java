package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tintin.tinapicommon.model.entity.UserInterfaceInfo;

/**
* @author tintin
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-03-12 11:47:06
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
