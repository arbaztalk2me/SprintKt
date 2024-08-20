Springboot v2.X------last time---->java 8
			javax.persistence.Id

springboot v3.X------ last time---> java 17
			jakarta.persistence.Id

@Data----@Getter,@Setter,@ToString,Builder


specialized annonatiotn @Component------->@Service
					@Restcintroller
					@Repostioer
sprint inbuit have db----> H2 database

@PatchMapping

springboot-convention over configuration it is rapid development framwork

@Value is used for read data from properties file
Eg= @Value("${arbaz}")
    private String var1;

@SpringBootApplication(
	@Configuration+@Autoconfiguration+@Componentscan

)

@RestController(
@Controller--->mvc pattern
@Responsebody---->convert json to java and vice versa
)
