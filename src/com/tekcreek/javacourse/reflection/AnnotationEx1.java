package com.tekcreek.javacourse.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotations -
 *
 * Provide a form of metadata about the class/field/method. They don't have direct
 * affect on the code. Mostly used by framework components.
 *
 * Several uses include
 *  - Provide information for the compiler
 *  - Tools can use it to get additional info such as code generators, json serialization etc.
 *  - Some annotations are available to be processed at runtime.
 *
 * Example 1 - JPA entities
 *
 *   @Entity
 *   @Table(name = "User")
 *   public class User {
 *
 *     @Id
 *     @GeneratedValue(strategy = GenerationType.IDENTITY)
 *     private Long id;
 *
 *     private String name;
 *     ...
 *     ...
 *   }
 *
 * Example 2 - Spring
 *
 * @Service
 * public class AccountService {
 *
 *    @Autowired
 *    NotificationService notificationService;
 *
 *    .....
 *
 * }
 */

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
    String version() default "";
    String description() default "";
}

@Author(name="sagar", version = "1.0", description = "Some account service")
class AccountService {

}


public class AnnotationEx1 {
    public static void main(String[] args) {
        Class clazz = AccountService.class;
        Author author = (Author) clazz.getDeclaredAnnotation(Author.class);
        System.out.println("Author name - " + author.name());
        System.out.println("Version - " + author.version());
        System.out.println("Description - " + author.description());
    }
}
