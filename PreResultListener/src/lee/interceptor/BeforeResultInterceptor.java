package lee.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by liuyang on 2016/3/27.
 */
public class BeforeResultInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        actionInvocation.addPreResultListener(new MyPreResultListener());
        System.out.println("execute 方法执行之前的拦截");
        String result=actionInvocation.invoke();
        System.out.println("execute 方法执行之后的拦截");
        return result;
    }
}
