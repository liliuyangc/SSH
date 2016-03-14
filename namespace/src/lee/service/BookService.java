package lee.service;

/**
 * Created by liliuyang on 2016/3/14.
 */
public class BookService {
    private String[] books =
            new String[]{
                    "疯狂Java讲义" ,
                    "轻量级Java EE企业应用实战",
                    "经典Java EE企业应用实战",
                    "疯狂Ajax讲义"
            };

    public String[] getLeeBooks()
    {
        return books;
    }
}
