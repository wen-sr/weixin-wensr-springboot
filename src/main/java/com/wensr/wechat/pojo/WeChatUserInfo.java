package com.wensr.wechat.pojo;

import com.wensr.wechat.common.Constant;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 微信用户信息
 *
 * @author Administrator
 */
@Data
@Entity
@Table(name = "WeChatUserInfo")
public class WeChatUserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String openId;
    private int subscribe;
    private Date subscribeTime;
    private String nickname;
    private int sexId;
    private String country;
    private String province;
    private String city;
    private String language;
    private String headImgUrl;
    private String remark;
    private String groupId;
    private String login_id;
    private int isSubscribe = Constant.WechatIsSubscribe.SUBSCRIBE;
}
