package cafe;

public class Employee {

    String name;
    protected int salary;   //상속받은 애들은 접근해야 하기 때문에 private가 아닌 protected로 지정 요망

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < this.salary){
            System.out.println("연봉 깎지 마시소, 금방 파라미터로 지정한 연봉은 반영되지 않아요");
            return;
        }
        this.salary = salary;
    }
    public void showSalary(){
        System.out.println("우리 카페 직원 "+ name + "의 연봉은 "+ salary + "입니다.");
    }
}
