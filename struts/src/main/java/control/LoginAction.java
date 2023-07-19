package control;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

//public class LoginAction implements Action {
    public class LoginAction extends ActionSupport {//继承ActionSupport类，即包含实现了action接口...开启验证validate...,
    private String userName;
    private String password;

    @Override
    public void validate() {
        //判断用户名是否为空
        if(StringUtils.isEmpty(userName)){
            //参数1:自定义
            //参数2:验证提示信息
            addFieldError("userName","用户名不能为空");
        }

        //密码
        if(StringUtils.isEmpty(password)){
            //参数1:自定义
            //参数2:验证提示信息
            addFieldError("password","密码不能为空");
        }
        super.validate();
    }

    public String execute() throws Exception {
        //比较用户名和密码
        if(userName.equals("admin") && password.equals("123456")){

            //<1>使用解耦的方式获取Session,将当前登录用户的信息保存到session
          //  Map<String, Object> session = ActionContext.getContext().getSession();
            //<2>将当前用户信息保存到session中
         //   session.put("loginUser",userName);
            //<1>,<2>等同于session.setAttribute("loginUser",userName);

            //3.若使用耦合方式获取Session，此时必须依赖Servlet
            HttpSession session =ServletActionContext.getRequest().getSession();
            //将当前用户信息保存到session中
            session.setAttribute("loginUser",userName);
            return  "success";
        }
        return "error";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
