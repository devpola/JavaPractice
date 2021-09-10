package oop9_singleton;

import java.util.concurrent.CompletableFuture;

public class Company {

    private static Company instance = new Company();
    //인스턴스가 단 한개만 생성되어야 하는 경우 사용하는 singleton pattern
    //정의한 생성자가 없으면 default 생성자가 만들어지기 때문에, 현재 패턴에서는 private으로 선언
    private Company(){

    }

    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
