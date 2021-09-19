package click.capodanno.lab;
public class SingletonInit {

    private String appName;

    private SingletonInit() {
        System.out.println("Start");
    }

    private static class Holder {
        private static final SingletonInit INSTANCE = new SingletonInit();
    }

    public static SingletonInit getInstance() {
    	if (Holder.INSTANCE.appName == null) Holder.INSTANCE.appName = "";
        return Holder.INSTANCE;
    }

    public String getAppName() {
        return Holder.INSTANCE.appName;
    }

    public void setAppName(String appName) {
        Holder.INSTANCE.appName = appName;
    }
}