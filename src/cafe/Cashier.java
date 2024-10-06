package cafe;

public class Cashier extends Employee implements Cleaning {


    int orderTotalNum;

    public Cashier(String name) {
        this.name = name;
    }

//    연봉 파라미터로 받을 수 있는 생성자 추가
    public Cashier(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

//    private선언한 salary를 보기 위한 게터, 세터함수 추가.
//    숨겨진 속성확인 위한거니까 public 이어야 한다
//    그러나 이제 Employee클래스를 만들고 상속 받았으므로 부모에게서 나온 게터세터로 사용가능. 여기에 이제 없어도 된다.
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        if(salary < this.salary){
//            System.out.println("연봉 깎지 마시소, 금방 파라미터로 지정한 연봉은 반영되지 않아요");
//            return;
//        }
//        this.salary = salary;
//    }

    public OrderSheet makeOrderSheet(int coffeeNum){
        OrderSheet order = new OrderSheet(coffeeNum);
        orderTotalNum++;
        return order;
    }

    public void showInfo(){
        System.out.println("### 캐셔 " + "[" + name + "]" + "이 처리한 총 주문서의 개수는 " + orderTotalNum + "입니다." );
    }

    @Override   //오버라이드: Employee의 showSalary()메서드 재정의(덮어쓰기)
    public void showSalary() {
        System.out.println("우리 카페 직원(캐셔)  "+ name + "의 연봉은 "+ salary + "입니다.");
    }

    @Override   //오버라이드 : 인터페이스 Cleaning로 각 역할 구현.
    public void sweep() {
        System.out.println("### 캐셔 " + name + "은 카운터 바닥을 청소해요.");
    }

    @Override
    public void wipe() {
        System.out.println("### 캐셔 " + name + "은 카운터 바닥을 닦아내요.");
    }

    @Override
    public void arrange() {
        System.out.println("### 캐셔 " + name + "은 카운터를 정리합니다.");
    }
}
