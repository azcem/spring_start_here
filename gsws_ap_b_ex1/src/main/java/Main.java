
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.ProjectConfig;
import main.Parrot;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        Parrot y = context.getBean(Parrot.class);
        x.setName("Assem");

        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot", Parrot.class, parrotSupplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        System.out.println(y.getName());
    }
}
