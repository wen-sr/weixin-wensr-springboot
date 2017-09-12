import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-12  15:49
 */
public class TestKefuMessage {


    @Test
    public  void testkefuMessage(){
        WxMpInMemoryConfigStorage wxMpInMemoryConfigStorage = new WxMpInMemoryConfigStorage();
        wxMpInMemoryConfigStorage.setAppId("wxa77d1ad158f5eef7");
        wxMpInMemoryConfigStorage.setSecret("3fadea5fae3f2aa98fe146ad9ed5d99e");
        wxMpInMemoryConfigStorage.setToken("jxxhwl");

        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpInMemoryConfigStorage);
        WxMpKefuMessage message = new WxMpKefuMessage();
        message.setContent("这是客服消息!!!!!!!!!");
        message.setMsgType(WxConsts.XML_MSG_TEXT);
        message.setToUser("oQwDMwFq_l2XkR2SbqK-G6Lapd8U");
        //message.setMpNewsMediaId("52R6dL2FxDpM9N1rCY3sYBqHwq-L7K_lz1sPI71idMg");

        try {
            wxMpService.getKefuService().sendKefuMessage(message);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }

}
