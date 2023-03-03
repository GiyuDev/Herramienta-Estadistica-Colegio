package app;

import frames.Main_Frame;

public class App {
    
    private static App instance = null;
    
    private App() {
        
    }
    
    public static final App getInstance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }
    
    private static Main_Frame mainFrame;
    
    public static Main_Frame getMainFrame() {
        return mainFrame;
    }
    
    public static void main(String[] args) {
        mainFrame = new Main_Frame();
        getMainFrame().setVisible(true);
    }
    
}
