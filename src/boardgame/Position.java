package boardgame;

public class Position {
    private Integer row;
    private Integer coloumn;

    public Position(Integer row, Integer coloumn) {
        this.row = row;
        this.coloumn = coloumn;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColoumn() {
        return coloumn;
    }

    public void setColoumn(Integer coloumn) {
        this.coloumn = coloumn;
    }

    @Override
    public String toString(){
        return row + ", " + coloumn;
    }
}
