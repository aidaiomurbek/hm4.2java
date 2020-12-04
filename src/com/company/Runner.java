package com.company;

public class Runner extends Thread{
    private Runner beforeRunner;
    private Runner afterRunner;

    Runner(String name) {
        super(name);
    }

    void setRunners(Runner beforeRunner, Runner afterRunner) {
        this.beforeRunner = beforeRunner;
        this.afterRunner = afterRunner;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " бегун начинает бегать ");
            if (getName().equals("Runner5")){
                System.out.println(getName()+ " бегает в обратную сторону  ");
            }
            else {
                System.out.println(getName()+  " передает палочку к  "+ afterRunner.getName());
                afterRunner.start();
                afterRunner.join();
            }

            if(!getName().equals("Runner1")){
                System.out.println(getName()+ " возвращает палочку  "+ beforeRunner.getName());
                System.out.println(beforeRunner.getName() + " бегает в обратную сторону ");
            }
        } catch (Exception ignore) {
        }
    }

}
