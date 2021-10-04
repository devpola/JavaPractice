package oop9_singleton;

import java.util.concurrent.CompletableFuture;

//인스턴스가 단 한개만 생성되어야 하는 경우 사용하는 singleton pattern
//하나의 인스턴스를 메모리에 등록해서 여러 스레드가 동시에 해당 인스턴스를 공유하여 사용하게끔 할 수 있으므로,
//요청이 많은 곳에서 사용하면 효율을 높일 수 있음
//주의 해야할 점 : 동시성(Concurrency) 문제를 고려해서 싱글턴을 설계해야 함

public class Company {

    //Eager Initialization(이른 초기화)
    //static 키워드의 특징을 이용해서 클래스 로더가 초기화 하는 시점에서 static binding을 통해
    //해당 인스턴스를 메모리에 등록해서 사용하는 것.
    //이 방식은 클래스 로더에 의해 클래스가 최초로 로딩 될 때 객체가 생성되기 때문에 Tread-safe 함
    //멀티 스레딩 환경에서도 동작 가능하게끔 구현해야하기 때문에 Tread-safe가 보장되어야 함
    private static Company instance = new Company();

    //정의한 생성자가 없으면 default 생성자가 만들어지기 때문에, 현재 패턴에서는 private으로 선언
    private Company(){

    }

    //유일한 인스턴스에 접근하기 위한 메소드는 클래스명으로 사용할 수 있도록 static으로 선언하는 것이 특징
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
