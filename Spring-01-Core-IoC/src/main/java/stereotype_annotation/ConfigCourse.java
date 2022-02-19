package stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
@ComponentScan(basePackages = "stereotype_annotation") //package where we want to have beans
public class ConfigCourse {
}
