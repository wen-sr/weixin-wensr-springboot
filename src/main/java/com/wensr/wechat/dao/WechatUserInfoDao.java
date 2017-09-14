package com.wensr.wechat.dao;

import com.wensr.wechat.pojo.WeChatUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-14  23:14
 */
public interface WechatUserInfoDao extends JpaRepository<WeChatUserInfo, Integer>{
    WeChatUserInfo findByOpenId(String openId);
}
