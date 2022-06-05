package GoF.Mediator;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:02
 * @Version 1.0
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
