package bd.com.shahjabir.creatorstudio;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreatorStudioApplication {

    public static void main(String[] args) {
//        Configuration of dotenv-java
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach((entry) ->
                System.setProperty(
                        entry.getKey(), entry.getValue()
                ));
        SpringApplication.run(CreatorStudioApplication.class, args);
    }

}
