package enums;

public enum Builder {
    FENDER,MARTIN,GIBSON,COLLINGS,OLSON,RYAN,PRS,ANY;

    @Override
    public String toString() {
        switch(this){
            case FENDER: return "Fender";
            case PRS: return "PRS";
            case RYAN: return "Ryan";
            case OLSON: return "Olsen";
            case GIBSON: return "Gibson";
            case MARTIN: return "Martin";
            case COLLINGS: return "Collings";

        }
        return null;
    }
}
