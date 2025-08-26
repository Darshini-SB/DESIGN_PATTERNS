package BRIDGE;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        System.out.println("Using Basic Remote with TV:");
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.turnOn();
        basicRemote.setVolume(20);
        basicRemote.turnOff();

        System.out.println("Using Basic Remote with Radio:");
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.turnOn();
        advancedRemote.setVolume(15);
        advancedRemote.increaseVolume();
        advancedRemote.decreaseVolume();
        advancedRemote.turnOff();
    }
}
