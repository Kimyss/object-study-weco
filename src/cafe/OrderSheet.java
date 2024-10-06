package cafe;

public class OrderSheet {
//    발주서(주문서)

    static int serialNum  = 100;
    int orderNum;
    int coffeeNum;
    boolean isCompleted;

    public OrderSheet(int coffeeNum) {
        this.coffeeNum = coffeeNum;
        serialNum++;
        orderNum = serialNum;
        isCompleted = false;
    }

    public void showInfo(){
        String status = isCompleted ?  "완성" : "미완성";
        System.out.println("주문서 번호는 " + orderNum + "이고 " +"커피의 수는 " + coffeeNum + "잔 이며, " + "완료 여부는 " + status + " 상태입니다." );
    }
}
