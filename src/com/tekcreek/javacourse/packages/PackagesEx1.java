package com.tekcreek.javacourse.packages;

import com.tekcreek.javacourse.packages.demo.service.AccountService;
import com.tekcreek.javacourse.packages.demo.service.CardService;
import static com.tekcreek.javacourse.packages.demo.util.DateUtil.formatDate;

import static java.lang.System.out;

import java.util.Date;

// import com.tekcreek.javacourse.packages.demo.service.*;


/**
 * Packages -
 * Normal naming convention
 *    reversedomain.project.module.classcategory...
 * Access modifier for class -
 *    default - accessible only with in the package
 *    public - accessible outside package.
 * Access modifier for members -
 *    private - private to the class
 *    default - package level access
 *    protected - package level + derived classes
 *    public - accessible
 */
public class PackagesEx1 {
    public static void main(String[] args) {
//        com.tekcreek.javacourse.packages.demo.service.AccountService accountService =
//                new com.tekcreek.javacourse.packages.demo.service.AccountService();
//
//        accountService.openAccount();
//
//        com.tekcreek.javacourse.packages.demo.service.CardService cardService =
//                new com.tekcreek.javacourse.packages.demo.service.CardService();
//
//        cardService.newCard();


        AccountService accountService = new AccountService();
        accountService.openAccount();

        CardService cardService = new CardService();
        cardService.newCard();


        // System.out.println(  DateUtil.formatDate(new Date())  );
        System.out.println( formatDate(new Date())  );

        out.println("This is because of static import");

    }
}
