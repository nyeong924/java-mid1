package nested.nested.ex1;

public class Network {

    public void ssendMessage(String text) {
        NetworkMessage newtworkMessage = new NetworkMessage(text);
        newtworkMessage.print();
    }
}
