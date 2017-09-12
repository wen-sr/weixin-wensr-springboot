import com.github.binarywang.demo.wechat.WxMpDemoApplication;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-12  15:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WxMpDemoApplication.class)
public class TestKefuMessage {

    @Autowired
    WxMpService wxMpService;

    //发送客服消息
    @Test
    public  void testkefuMessage(){

        WxMpKefuMessage message = new WxMpKefuMessage();

        //文本消息
        message.setContent("这是客服消息!!!!!!!!!");
        message.setMsgType(WxConsts.XML_MSG_TEXT);
        message.setToUser("oQwDMwFq_l2XkR2SbqK-G6Lapd8U");


        try {
            wxMpService.getKefuService().sendKefuMessage(message);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }

}
