package cafe;

public class Barista extends Employee implements Cleaning {

    int coffeeTotalNum;

    public Barista(String name) {
        this.name = name;
    }

    public void makeCoffee(OrderSheet order){
        if(order.isCompleted){
            return;
        }
        order.isCompleted = true;
        coffeeTotalNum += order.coffeeNum;
//        coffeeTotalNum = coffeeTotalNum + order.coffeeNum;
    }

    public void showInfo(){
        System.out.println("@@@ 바리스타 " + name + "이 만든 총 커피의 수는 " + coffeeTotalNum + "잔 입니다.");
    }

    @Override
    public void sweep() {
        System.out.println("@@@ 바리스타 " + name + "은 커피머신을 솔로 쓸어냅니다.");
    }

    @Override
    public void wipe() {
        System.out.println("@@@ 바리스타 " + name + "은 커피머신을 닦아요.");
    }

    @Override
    public void arrange() {
        System.out.println("@@@ 바리스타 " + name + "은 커피머신을 정리합니다.");
    }


}
