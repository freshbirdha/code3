package control;

import com.opensymphony.xwork2.Action;

/**
 * 控制器
 */
public class HelloAction implements Action {
    //定义变量，接收页面用户面userName
    //要求:属性名必须与input标签的name属性值一致，并且必须提供get,set方法
    private String userName;

    public String execute() throws Exception {
        System.out.println("userName:" + userName);
        //返回的逻辑字符串(自定义)
        return "success";
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }
}
