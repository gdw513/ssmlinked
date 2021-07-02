import com.gdw.pojo.Books;
import com.gdw.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceIml = (BookService) context.getBean("BookServiceIml");
        List<Books> list = bookServiceIml.queryAllBooks();
        for (Books books:list
             ) {

            System.out.println(books);

            System.out.println("22233333333333333");

            System.out.println("111");

        }
    }
}
