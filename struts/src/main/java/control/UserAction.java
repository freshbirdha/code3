package control;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserAction extends ActionSupport {
    //定义成员变量,保存用户列表
    private List<User> userList; //值栈,类似request.getParameter()和xxx.setAttribute()的组合

    @Override
    public String execute() throws Exception {
        userList = new ArrayList<User>();
        userList.add(new User(1,"张三",1,"1234567890"));
        userList.add(new User(2,"李四",1,"1234567809"));
        userList.add(new User(3,"王五",1,"1234567810"));
        userList.add(new User(4,"赵六",2,"1234567811"));
        userList.add(new User(5,"小红",2,"1234567812"));

        
        //返回逻辑字符串
        return  SUCCESS;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
