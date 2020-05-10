package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        // доступ к бину по классу
        context.getBean(TerminatorQuoter.class).sayQuote();
    }
}
