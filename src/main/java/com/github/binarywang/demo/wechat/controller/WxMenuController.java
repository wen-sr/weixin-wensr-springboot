package com.github.binarywang.demo.wechat.controller;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpMenuService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.menu.WxMpGetSelfMenuInfoResult;
import me.chanjar.weixin.mp.bean.menu.WxMpMenu;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 *  注意：此contorller 实现WxMpMenuService接口，仅是为了演示如何调用所有菜单相关操作接口，
 *      实际项目中无需这样，根据自己需要添加对应接口即可
 * </pre>
 *
 * @author Binary Wang(https://github.com/binarywang)
 */
@RestController
@RequestMapping("/wechat/menu")
public class WxMenuController implements WxMpMenuService {

    @Autowired
    private WxMpService wxService;

    /**
     * <pre>
     * 自定义菜单创建接口
     * 详情请见：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141013&token=&lang=zh_CN
     * 如果要创建个性化菜单，请设置matchrule属性
     * 详情请见：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1455782296&token=&lang=zh_CN
     * </pre>
     *
     * @param menu
     * @return 如果是个性化菜单，则返回menuid，否则返回null
     */
    @Override
    @PostMapping("/create")
    public String menuCreate(@RequestBody WxMenu menu) throws WxErrorException {
        return this.wxService.getMenuService().menuCreate(menu);
    }

    @GetMapping("/create")
    public String menuCreateSample() throws WxErrorException {
        WxMenu menu = new WxMenu();

        WxMenuButton menuButton1 = new WxMenuButton();
        menuButton1.setName("业务查询");
        WxMenuButton xhsf = new WxMenuButton();
        xhsf.setName("新华物流收发货查询");
        xhsf.setType(WxConsts.BUTTON_VIEW);
        xhsf.setUrl("http://www.jx56.com/jxxhwl/wx/shoufa.action");

        WxMenuButton xhsf1 = new WxMenuButton();
        xhsf1.setName("新华物流收发货查询");
        xhsf1.setType(WxConsts.BUTTON_VIEW);
        xhsf1.setUrl("http://www.jx56.com/jxxhwl/wx/shoufa.action");

        WxMenuButton xhsf2 = new WxMenuButton();
        xhsf2.setName("新华物流收发货查询");
        xhsf2.setType(WxConsts.BUTTON_VIEW);
        xhsf2.setUrl("http://www.jx56.com/jxxhwl/wx/shoufa.action");

        WxMenuButton xhsf3 = new WxMenuButton();
        xhsf3.setName("新华物流收发货查询");
        xhsf3.setType(WxConsts.BUTTON_VIEW);
        xhsf3.setUrl("http://www.jx56.com/jxxhwl/wx/shoufa.action");

        WxMenuButton xhsf4 = new WxMenuButton();
        xhsf4.setName("新华物流收发货查询");
        xhsf4.setType(WxConsts.BUTTON_VIEW);
        xhsf4.setUrl("http://www.jx56.com/jxxhwl/wx/shoufa.action");

        menuButton1.getSubButtons().add(xhsf);
        menuButton1.getSubButtons().add(xhsf1);
        menuButton1.getSubButtons().add(xhsf2);
        menuButton1.getSubButtons().add(xhsf3);
        menuButton1.getSubButtons().add(xhsf4);

        WxMenuButton menuButton2 = new WxMenuButton();
        menuButton2.setName("业务办理");
        WxMenuButton yw = new WxMenuButton();
        yw.setName("业务办理");
        yw.setType(WxConsts.BUTTON_CLICK);
        yw.setKey("yw");

        //WxMenuButton yw4 = new WxMenuButton();
        //yw4.setName("位置");
        //yw4.setType(WxConsts.BUTTON_LOCATION_SELECT);
        //yw4.setKey("yw4");

        //WxMenuButton yw1 = new WxMenuButton();
        //yw1.setName("小程序");
        //yw1.setType(WxConsts.BUTTON_MINIPROGRAM);
        //yw1.setKey("yw1");

        //WxMenuButton yw2 = new WxMenuButton();
        //yw2.setName("图片");
        //yw2.setType(WxConsts.BUTTON_PIC_WEIXIN);
        //yw2.setKey("yw2");

        //WxMenuButton yw3 = new WxMenuButton();
        //yw3.setName("Media_id");
        //yw3.setType(WxConsts.BUTTON_MEDIA_ID);
        //yw3.setKey("yw3");
        menuButton2.getSubButtons().add(yw);
        //menuButton2.getSubButtons().add(yw1);
        //menuButton2.getSubButtons().add(yw2);
        //menuButton2.getSubButtons().add(yw3);
        //menuButton2.getSubButtons().add(yw4);

        WxMenuButton menuButton3 = new WxMenuButton();
        menuButton3.setName("联系我们");

        WxMenuButton lx = new WxMenuButton();
        lx.setName("关于新华物流");
        lx.setType(WxConsts.BUTTON_VIEW);
        lx.setUrl("http://www.jx56.com/jxxhwl/index.html");

        WxMenuButton lx2 = new WxMenuButton();
        lx2.setName("关于蓝海物流");
        lx2.setType(WxConsts.BUTTON_VIEW);
        lx2.setUrl("http://www.jx56.com/jxxhwl/index.html");

        WxMenuButton lx3 = new WxMenuButton();
        lx3.setName("联系客服");
        lx3.setType(WxConsts.BUTTON_CLICK);
        lx3.setKey("lx3");

        WxMenuButton lx1 = new WxMenuButton();
        lx1.setName("工号版定");
        lx1.setType(WxConsts.BUTTON_CLICK);
        lx1.setKey("lx1");

        WxMenuButton lx4 = new WxMenuButton();
        lx4.setName("意见反馈");
        lx4.setType(WxConsts.BUTTON_VIEW);
        lx4.setUrl("http://www.jx56.com/jxxhwl/wx/advice.action");

        menuButton3.getSubButtons().add(lx);
        menuButton3.getSubButtons().add(lx1);
        menuButton3.getSubButtons().add(lx2);
        menuButton3.getSubButtons().add(lx3);
        menuButton3.getSubButtons().add(lx4);

        //WxMenuButton button1 = new WxMenuButton();
        //button1.setType(WxConsts.BUTTON_CLICK);
        //button1.setName("今日歌曲");
        //button1.setKey("V1001_TODAY_MUSIC");

//        WxMenuButton button2 = new WxMenuButton();
//        button2.setType(WxConsts.BUTTON_MINIPROGRAM);
//        button2.setName("小程序");
//        button2.setAppId("wx286b93c14bbf93aa");
//        button2.setPagePath("pages/lunar/index.html");
//        button2.setUrl("http://mp.weixin.qq.com");

        menu.getButtons().add(menuButton1);
        menu.getButtons().add(menuButton2);
        menu.getButtons().add(menuButton3);

        return this.wxService.getMenuService().menuCreate(menu);
    }

    /**
     * <pre>
     * 自定义菜单创建接口
     * 详情请见： https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141013&token=&lang=zh_CN
     * 如果要创建个性化菜单，请设置matchrule属性
     * 详情请见：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1455782296&token=&lang=zh_CN
     * </pre>
     *
     * @param json
     * @return 如果是个性化菜单，则返回menuid，否则返回null
     */
    @Override
    @GetMapping("/create/{json}")
    public String menuCreate(@PathVariable String json) throws WxErrorException {
        return this.wxService.getMenuService().menuCreate(json);
    }

    /**
     * <pre>
     * 自定义菜单删除接口
     * 详情请见: https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141015&token=&lang=zh_CN
     * </pre>
     */
    @Override
    @GetMapping("/delete")
    public void menuDelete() throws WxErrorException {
        this.wxService.getMenuService().menuDelete();
    }

    /**
     * <pre>
     * 删除个性化菜单接口
     * 详情请见: https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1455782296&token=&lang=zh_CN
     * </pre>
     *
     * @param menuId 个性化菜单的menuid
     */
    @Override
    @GetMapping("/delete/{menuId}")
    public void menuDelete(@PathVariable String menuId) throws WxErrorException {
        this.wxService.getMenuService().menuDelete(menuId);
    }

    /**
     * <pre>
     * 自定义菜单查询接口
     * 详情请见： https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141014&token=&lang=zh_CN
     * </pre>
     */
    @Override
    @GetMapping("/get")
    public WxMpMenu menuGet() throws WxErrorException {
        return this.wxService.getMenuService().menuGet();
    }

    /**
     * <pre>
     * 测试个性化菜单匹配结果
     * 详情请见: http://mp.weixin.qq.com/wiki/0/c48ccd12b69ae023159b4bfaa7c39c20.html
     * </pre>
     *
     * @param userid 可以是粉丝的OpenID，也可以是粉丝的微信号。
     */
    @Override
    @GetMapping("/menuTryMatch/{userid}")
    public WxMenu menuTryMatch(@PathVariable String userid) throws WxErrorException {
        return this.wxService.getMenuService().menuTryMatch(userid);
    }

    /**
     * <pre>
     * 获取自定义菜单配置接口
     * 本接口将会提供公众号当前使用的自定义菜单的配置，如果公众号是通过API调用设置的菜单，则返回菜单的开发配置，而如果公众号是在公众平台官网通过网站功能发布菜单，则本接口返回运营者设置的菜单配置。
     * 请注意：
     * 1、第三方平台开发者可以通过本接口，在旗下公众号将业务授权给你后，立即通过本接口检测公众号的自定义菜单配置，并通过接口再次给公众号设置好自动回复规则，以提升公众号运营者的业务体验。
     * 2、本接口与自定义菜单查询接口的不同之处在于，本接口无论公众号的接口是如何设置的，都能查询到接口，而自定义菜单查询接口则仅能查询到使用API设置的菜单配置。
     * 3、认证/未认证的服务号/订阅号，以及接口测试号，均拥有该接口权限。
     * 4、从第三方平台的公众号登录授权机制上来说，该接口从属于消息与菜单权限集。
     * 5、本接口中返回的图片/语音/视频为临时素材（临时素材每次获取都不同，3天内有效，通过素材管理-获取临时素材接口来获取这些素材），本接口返回的图文消息为永久素材素材（通过素材管理-获取永久素材接口来获取这些素材）。
     *  接口调用请求说明:
     * http请求方式: GET（请使用https协议）
     * https://api.weixin.qq.com/cgi-bin/get_current_selfmenu_info?access_token=ACCESS_TOKEN
     * </pre>
     */
    @Override
    @GetMapping("/getSelfMenuInfo")
    public WxMpGetSelfMenuInfoResult getSelfMenuInfo() throws WxErrorException {
        return this.wxService.getMenuService().getSelfMenuInfo();
    }
}
