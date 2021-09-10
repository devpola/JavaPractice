package oop9_singleton;

public class CompanyTest {

    public static void main(String[] args) {

        Company firstCompany = Company.getInstance();
        Company secondCompany = Company.getInstance();

        System.out.println(firstCompany);
        System.out.println(secondCompany);
    }
}
