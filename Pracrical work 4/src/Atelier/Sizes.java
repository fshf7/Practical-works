package Atelier;

public enum Sizes{
    XXS(32){
        public String getDescription() {
            return "The child size!";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "The biggest size!";
    }

    @Override
    public String toString() {
        return name() + "(" + euroSize + ") " + getDescription();
    }
}
