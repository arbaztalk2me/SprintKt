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






///Swagger Annotation 

	base-class=  @OpenAPIDefinition(info = @Info(title = "Student Rest Api",description 			= "Student Crud Application",version = "V 2.0",
			contact = @Contact(url = "http://gigantic-server.com", name = "Himanshu 			bro", email = "email2himasnhu.com")))


	
Controller Class===>
		@Tag(name = "Student-Controller-Class", description = "Student related APIs") on top class

		@Operation(summary = "get course By Id",description = "get course by id from db") on method also same annotation




//LOGGER ---- LEVEL

fatal<error<Warn<Info<DEbug<Trace<All


By default
info


MODEL CLASS=====>
		@Schema(description = "Student Model Information") on top of class
		@Schema(description = "Student Name Column",example = "himanshu") on method

