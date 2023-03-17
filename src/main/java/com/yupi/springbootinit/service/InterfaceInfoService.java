package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tintin.tinapicommon.model.entity.InterfaceInfo;

/**
* @author tintin
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-08 09:48:23
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b);

}
