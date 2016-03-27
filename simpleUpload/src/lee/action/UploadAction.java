package lee.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by liuyang on 2016/3/21.
 */
public class UploadAction extends ActionSupport {
    private String title;
    private File upload;
    private String uploadContentType;
    private String uploadFilename;
    private String savepath;
    public void setSavepath(String value)
    {
        this.savepath=value;
    }
    private String getSavepath() throws Exception
    {
        return ServletActionContext.getServletContext().getRealPath("WEB-INF"+savepath);
    }

    public String getTitle() {
        return (this.title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getUpload() {
        return (this.upload);
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return (this.uploadContentType);
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFilename() {
        return (this.uploadFilename);
    }

    public void setUploadFilename(String uploadFilename) {
        this.uploadFilename = uploadFilename;
    }

    @Override
    public String execute() throws Exception {
        FileOutputStream fos=new FileOutputStream(getSavepath()+"\\"+getUploadFilename());
        FileInputStream fis=new FileInputStream(getUpload());
        byte[] buffer=new byte[1024];
        int len=0;
        while ((len=fis.read(buffer))>0)
        {
            fos.write(buffer,0,len);
        }
        return SUCCESS;
    }
}
