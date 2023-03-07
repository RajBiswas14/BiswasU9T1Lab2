public class Computer {
    private int screensize;
    private int memory;

    public Computer(int screensize, int memory ) {
       this.screensize = screensize;
       this.memory = memory;
    }

    public void installOperatingSystem(){
        System.out.println("Installing...");
    }
}
