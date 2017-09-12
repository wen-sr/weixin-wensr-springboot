import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-12  15:49
 */
@RunWith(SpringRunner.class)
//@SpringBootTest
public class TestKefuMessage {

    @Autowired
    private WxMpService wxMpService;

    @Test
    public  void testkefuMessage(){
        //WxMpInMemoryConfigStorage wxMpInMemoryConfigStorage = new WxMpInMemoryConfigStorage();
        //wxMpInMemoryConfigStorage.setAppId("wxa77d1ad158f5eef7");
        //wxMpInMemoryConfigStorage.setSecret("3fadea5fae3f2aa98fe146ad9ed5d99e");
        //wxMpInMemoryConfigStorage.setToken("jxxhwl");

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
