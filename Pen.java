class Pen {

    String penName;
    int penCost;
    String penShade;
    String penCategory;
    String penOrigin;

  
    Pen() {
        this("Trimax", 20);
        System.out.println("Default Constructor");
    }

   
    Pen(String penName, int penCost) {
        this(penName, penCost, "Blue");
        System.out.println("Two Argument Constructor");
    }

    
    Pen(String penName, int penCost, String penShade) {
        this(penName, penCost, penShade, "Gel");
        System.out.println("Three Argument Constructor");
    }

   
    Pen(String penName, int penCost, String penShade, String penCategory) {
        this(penName, penCost, penShade, penCategory, "India");
        System.out.println("Four Argument Constructor");
    }

    
    Pen(String penName, int penCost, String penShade, String penCategory, String penOrigin) {

        this.penName = penName;
        this.penCost = penCost;
        this.penShade = penShade;
        this.penCategory = penCategory;
        this.penOrigin = penOrigin;

        System.out.println("Pen Name   : " + penName);
        System.out.println("Pen Cost   : " + penCost);
        System.out.println("Pen Shade  : " + penShade);
        System.out.println("Pen Type   : " + penCategory);
        System.out.println("Pen Origin : " + penOrigin);
    }
}