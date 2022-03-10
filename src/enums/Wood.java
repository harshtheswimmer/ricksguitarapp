package enums;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILLIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER,SITKA;

    @Override
    public String toString() {
        switch(this){
            case ALDER: return "Adler";
            case CEDAR: return "Cedar";
            case MAPLE: return "Maple";
            case SITKA: return "Sitka";
            case COCOBOLO: return "Cocobolo";
            case MAHOGANY: return "mahogany";
            case ADIRONDACK: return "Adirondack";
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case BRAZILLIAN_ROSEWOOD: return "Brazillian Rosewood";
        }
        return null;
    }
}
