
/*@authour guoliangliang
 *
 *@date 2018/5/22 10:51
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo{

    @RequestMapping
    public void devi(){
        System.out.println("你好");
    }
}
