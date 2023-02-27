package Practices.Parcial1.builderComputer;

public class Computer {

    private String monitor;
    private String keyboard;
    private String mouse;
    private String memory;
    private String video;
    private String processor;




    public String getMonitor() {
        return monitor;
    }

    public Computer setMonitor(String monitor) {
        this.monitor = monitor;
        return this;

    }

    public String getKeyboard() {
        return keyboard;
    }

    public Computer setKeyboard(String keyboard) {
        this.keyboard = keyboard;
        return this;

    }

    public String getMouse() {
        return mouse;
    }

    public Computer setMouse(String mouse) {
        this.mouse = mouse;
        return this;

    }

    public String getMemory() {
        return memory;
    }

    public Computer setMemory(String memory) {
        this.memory = memory;
        return this;

    }

    public String getVideo() {
        return video;
    }

    public Computer setVideo(String video) {
        this.video = video;
        return this;

    }

    public String getProcessor() {
        return processor;
    }

    public Computer setProcessor(String processor) {
        this.processor = processor;
        return this;

    }

    public void showInfo() {
        System.out.println("monitor: " + getMonitor());
        System.out.println("teclado: " + getKeyboard());
        System.out.println("mouse: " + getMouse());
        System.out.println("memoria: " + getMemory());
        System.out.println("procesador: " + getProcessor());
        System.out.println("video: " + getVideo() + "\n");


    }
}
