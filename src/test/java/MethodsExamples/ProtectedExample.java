package MethodsExamples;

import Methods.Ravi;

public class ProtectedExample {
    public static void main(String[] args) {
            HomePage hpage=new HomePage();
            hpage.launchbrowser();
           MobilesPage mpage=hpage.clickOnMobilesLink();
           mpage.add();


    }
}
