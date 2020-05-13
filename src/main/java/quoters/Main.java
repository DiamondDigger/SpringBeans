package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // creating IoC container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Quoter.class).sayQuote();
    }
}
