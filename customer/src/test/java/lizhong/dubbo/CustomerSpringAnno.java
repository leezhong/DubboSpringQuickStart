package lizhong.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import lizhong.manager.TManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-customer-anno.xml")
public class CustomerSpringAnno {
    @Reference(version = "1.0.0")
    private TManager tManager;

    @Test
    public void testCus(){

        int sum = tManager.sum(10, 656);
        Assert.assertEquals(sum,666);
    }

}
