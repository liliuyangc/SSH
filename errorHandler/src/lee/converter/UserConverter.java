package lee.converter;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;
import lee.domain.User;

import java.util.Map;

/**
 * Created by liuyang on 2016/3/20.
 */
public class UserConverter extends DefaultTypeConverter {
    //类型转换器必须重写convertValue方法，该方法需要完成双向转换
    public Object convertValue(Map context
            , Object value, Class toType)
    {
        //当需要将字符串向User类型转换时
        if (toType == User.class )
        {
            //系统的请求参数是一个字符串数组
            String[] params = (String[])value;
            //创建一个User实例
            User user = new User();
            //只处理请求参数数组第一个数组元素，
            //并将该字符串以英文逗号分割成两个字符串
            String[] userValues = params[0].split(",");
            //为User实例赋值
            user.setName(userValues[0]);
            user.setPass(userValues[1]);
            //返回转换来的User实例
            return user;
        }
        else if (toType == String.class )
        {
            //将需要转换的值强制类型转换为User实例
            User user = (User) value;
            return "<" + user.getName() + ","
                    + user.getPass() + ">";
        }
        return null ;
    }
}
