package lee.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by liuyang on 2016/3/27.
 */
public class AuthorityInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext ctx=actionInvocation.getInvocationContext();
        Map session =ctx.getSession();
        String user=(String)session.get("user");
        if (user!=null&&user.equals("li"))
        {
            return actionInvocation.invoke();
        }
        ctx.put("tip","你还没有登录，请登录");
        return Action.LOGIN;
    }
}
