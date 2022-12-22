package Computer;

public class Monitor extends Computer {
    private String matrixType;
    private byte diagonalSize;

    public Monitor(String matrixType, byte diagonalSize) {
        this.matrixType = matrixType;
        this.diagonalSize = diagonalSize;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public byte getDiagonalSize() {
        return diagonalSize;
    }

    public void setDiagonalSize(byte diagonalSize) {
        this.diagonalSize = diagonalSize;
    }

    @Override
    public String toString() {
        return "Monitor[" +
                "matrixType: '" + matrixType + '\'' +
                ", diagonalSize: " + diagonalSize +
                ']';
    }
}
