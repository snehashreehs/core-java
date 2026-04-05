class ChatSystem {

    String appName;
    int userCount;
    String messageType;
    String securityLevel;
    String serverRegion;

  
    ChatSystem() {
        this("WhatsApp", 2000);
        System.out.println("Default Constructor");
    }

  
    ChatSystem(String appName, int userCount) {
        this(appName, userCount, "Text");
        System.out.println("Two Argument Constructor");
    }

    
    ChatSystem(String appName, int userCount, String messageType) {
        this(appName, userCount, messageType, "End-to-End");
        System.out.println("Three Argument Constructor");
    }

   
    ChatSystem(String appName, int userCount, String messageType, String securityLevel) {
        this(appName, userCount, messageType, securityLevel, "Asia");
        System.out.println("Four Argument Constructor");
    }

    
    ChatSystem(String appName, int userCount, String messageType, String securityLevel, String serverRegion) {

        this.appName = appName;
        this.userCount = userCount;
        this.messageType = messageType;
        this.securityLevel = securityLevel;
        this.serverRegion = serverRegion;

        System.out.println("App Name       : " + appName);
        System.out.println("User Count     : " + userCount);
        System.out.println("Message Type   : " + messageType);
        System.out.println("Security Level : " + securityLevel);
        System.out.println("Server Region  : " + serverRegion);
    }
}