//package com.takeo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//
//@Configuration
//@EnableWebMvc
//
//
//public class SwaggerConfig implements WebMvcConfigurer {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("com.jwt.implementation"))
//                .paths(PathSelectors.regex("/.*"))
//                .build().apiInfo(apiInfoMetaData());
//    }
//
//private ApiInfo apiInfoMetaData() {
//
//return new ApiInfoBuilder().title("IMS-MICROSERVICE(USER_MGHT)")
//.description("API Endpoint Decoration UserMGHT")
//.contact(new Contact("Dev-GROUP-A", "https://www.nrb.com/", "dev-team@gmail.com"))
//.license("Apache 2.0")
//.licenseUrl("http://www.nrb.com/licenses/LICENSE-2.0.html")
//.version("1.0.0")
//.build();
//}
//
//}