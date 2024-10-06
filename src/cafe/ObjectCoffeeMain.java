package cafe;

public class ObjectCoffeeMain {

//    클래스, 객체를 다시 공부 해보기위한 공간!
    public static void main(String[] args) {

        Cashier cashier1 = new Cashier("김계산");
        Barista barista1 = new Barista("김원두");

        OrderSheet order1 = cashier1.makeOrderSheet(3);  //커피를 주문받아 주문서 만들어

        barista1.makeCoffee(order1);   //바리스타 커피 만들어

        order1.showInfo();
        cashier1.showInfo();
        barista1.showInfo();

//        salary(연봉) private 하기
        Cashier cashier2 = new Cashier("이계산", 5000);
//        cashier2.showSalary();

//        cashier2.salary = 20;
//        cashier2.showSalary();
//        위 처럼 숨겨놓은 속성을 확인하거나 바꿀 수 있는 것이 getter & setter

        int cashier2Salary = cashier2.getSalary();  //private로 값을 지정해도 게터함수로 가져 올 수 있다.
        System.out.println(cashier2Salary);

        cashier2.setSalary(7);
        cashier2Salary = cashier2.getSalary();
        System.out.println(cashier2Salary);

        Cashier cashier3 = new Cashier("이지금", 8000);
        cashier3.showSalary();

        Barista barista2 = new Barista("김몽순");
        barista2.setSalary(9000);
        barista2.showSalary();

        OrderSheet order2 = new OrderSheet(3);
        barista2.makeCoffee(order2);
        barista2.showInfo();

        System.out.println("**************");

        cashier2.sweep();
        cashier2.wipe();
        cashier2.arrange();
        System.out.println("**************");
        barista2.sweep();
        barista2.wipe();
        barista2.arrange();
    }
}