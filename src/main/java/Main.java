import factorywarehouse.UserFactory;
import factorywarehouse.UserWarehouse;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        System.out.println(UserWarehouse.getWarehouseSize());
        UserFactory.createUser();
        UserFactory.createUser();
        UserFactory.createUser();
        System.out.println(UserWarehouse.getWarehouseSize());
        UserWarehouse.printArrayList();
        //.out.println();;
    }
}




