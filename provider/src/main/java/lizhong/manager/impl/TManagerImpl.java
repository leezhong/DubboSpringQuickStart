package lizhong.manager.impl;

import com.alibaba.dubbo.config.annotation.Service;
import lizhong.manager.TManager;

@Service(version = "1.0.0")
public class TManagerImpl implements TManager {
    public int sum(int num, int num2) {
        return num+num2;
    }
}
