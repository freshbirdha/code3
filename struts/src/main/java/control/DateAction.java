package control;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class DateAction extends ActionSupport {
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String test(){
        System.out.println("出生日期:" + birthday);
        return SUCCESS;

    }
}
