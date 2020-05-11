package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // creating IoC container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //доступ к бину
        while (true) {
            // чтобы не мерцало
            Thread.sleep(500);
            // получаем бин по интерфейсу, который он наследует класс (с классом может случиться что угодно)
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
