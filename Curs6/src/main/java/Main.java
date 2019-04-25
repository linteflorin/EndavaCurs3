import dataBaseConfig.DatabaseConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.PersonReporitory;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class)){

            PersonReporitory personReporitory = context.getBean(PersonReporitory.class);
            personReporitory.getPeople().forEach(System.out::println);


        }catch(Exception ex){
            ex.printStackTrace();

        }

    }
}
