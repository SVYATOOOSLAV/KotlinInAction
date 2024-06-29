package annnotationExample;

public class Worker {
    public void toWork(){
        System.out.println("Hey!");
    }
}

class Developer extends Worker{
    @Override
    public void toWork() {
        System.out.println("Hello world!");
    }
}

