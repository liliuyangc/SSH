package lee.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import lee.service.BookService;

/**
 * Created by liliuyang on 2016/3/14.
 */
public class GetBookAction implements Action{
    private String[] books;

    public void setBooks(String[] books)
    {
        this.books = books;
    }
    public String[] getBooks()
    {
        return books;
    }

    public String execute() throws Exception
    {
        String user = (String) ActionContext.getContext()
                .getSession().get("user");
        if (user != null && user.equals("li"))
        {
            BookService bs = new BookService();
            setBooks(bs.getLeeBooks());
            return SUCCESS;
        }
        else
        {
            return LOGIN;
        }
    }
}
