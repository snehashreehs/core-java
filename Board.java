class Board {

    String boardTitle;
    int boardSize;
    String boardColor;
    String boardMaterial;
    String boardUsage;

   
    Board() {
        this("Whiteboard", 5);
        System.out.println("Default Constructor");
    }

    
    Board(String boardTitle, int boardSize) {
        this(boardTitle, boardSize, "White");
        System.out.println("Two Argument Constructor");
    }

    
    Board(String boardTitle, int boardSize, String boardColor) {
        this(boardTitle, boardSize, boardColor, "Plastic");
        System.out.println("Three Argument Constructor");
    }

 
    Board(String boardTitle, int boardSize, String boardColor, String boardMaterial) {
        this(boardTitle, boardSize, boardColor, boardMaterial, "Teaching");
        System.out.println("Four Argument Constructor");
    }

 
    Board(String boardTitle, int boardSize, String boardColor,
          String boardMaterial, String boardUsage) {

        this.boardTitle = boardTitle;
        this.boardSize = boardSize;
        this.boardColor = boardColor;
        this.boardMaterial = boardMaterial;
        this.boardUsage = boardUsage;

        System.out.println("Board Title   : " + boardTitle);
        System.out.println("Board Size    : " + boardSize);
        System.out.println("Board Color   : " + boardColor);
        System.out.println("Material      : " + boardMaterial);
        System.out.println("Usage         : " + boardUsage);
    }
}