package tw.com.res;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResful {
	@EJB
	private MyUserBeanLocal myUserBean;
	
	public class Msg{
		
		private String msg;

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}		
		
	}
	
	//GET 用來做查詢 不會修該資料
			//POST 用來新增資料
			//PATCH 可用來修改資料
			//DELETE 用來刪除資料
	@GET
	public String testHello() {
		return "{\"msg\":\"Hello\"}";
	}
		
	@DELETE	
	public String delete(@QueryParam("id") Long id) {
		
		return "{\"id\":"+id+"}";
	}
	@GET
	@Path("/id{myId:\\S+}")
	public String createData(@PathParam("myId") String id) {
		return "{\"id\":"+id+"}";
	}
	
	@POST
	public Response reisrter(@FormParam("account")String account,
							@FormParam("password")String password) {
		MyUser myUser = new MyUser();
		myUser.setAccount(account);
		myUser.setPassword(password);
		boolean pass = myUserBean.regisrter(myUser);
		if (pass) {
			return Response.ok().encoding("UTF-8").entity(myUser).build();
		}
		Msg msg = new Msg();
		msg.setMsg("失敗");
		return Response.status(400).entity(msg).build();
	}
}
