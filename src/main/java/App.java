import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld b = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(b.getMessage());

        Cat catB = (Cat)applicationContext.getBean("cat");
        System.out.println(catB.getMessage());

        Cat catB1 = (Cat)applicationContext.getBean("cat");
        System.out.println(catB1.getMessage());

        System.out.println(bean.equals(b));
        System.out.println(catB.equals(catB1));
    }
}