package tech.zlia.study.example.ignoreDependencyInteface;


import javax.annotation.PostConstruct;

public class IgnoreImpl implements IgnoreInterface {

    private Car car;

    @Override
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public Car getCar() {
        return car;
    }

    @PostConstruct
    public void init() {
        System.out.println("car:" + car);
    }
}
