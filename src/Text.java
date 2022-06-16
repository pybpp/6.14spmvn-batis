import com.zb.pojo.Dept;
import com.zb.pojo.Person;
import com.zb.service.Personservice;
import com.zb.service.impl.Deptserviceimpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Text {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_mybatis.xml");
      /*  Deptserviceimpl bean = context.getBean(Deptserviceimpl.class);

        List<Dept> allger = bean.getAllger();

        for (Dept dept : allger) {
            System.out.println(dept.toString());
        }
*/

        Personservice bean1 = context.getBean(Personservice.class);

        List<Person> mingcheng = bean1.mingcheng(1);

        for (Person person : mingcheng) {
            System.out.println(person.toString());

        }


    }
}
