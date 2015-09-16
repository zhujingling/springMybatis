package mybatis_spring_manager;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import com.alibaba.fastjson.JSON;
import com.mybatis.entity.User;
import com.mybatis.service.UserService;


public class test {
	@Resource
    private UserService userService = ApplicationContextUtil.getBean("userServiceImpl");
    
    private static Logger logger = Logger.getLogger(test.class);
//   @Before
//   public void init() throws Exception {
//       
//   }

   @Test
   public void testLogin() throws Exception {
         List<User> users = userService.getUser();
         System.out.println(users.size());
         for(User user:users)
         {
             logger.info(JSON.toJSONString(user));
         }
   }
}
