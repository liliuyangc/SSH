package lee.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 * Created by liuyang on 2016/3/27.
 */
public class MyPreResultListener implements PreResultListener {
    @Override
    public void beforeResult(ActionInvocation actionInvocation, String s) {
        System.out.println("返回逻辑视图为："+s);
    }
}
