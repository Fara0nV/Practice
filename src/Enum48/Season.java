package Enum48;

public enum Season {
    SUMMER("Leto"), WINTER("Zima"), AUTUMN("Osen"), SPRING("Vesna");

    private String translation;

    Season(String translation) {
        this.translation = translation;
    }
    public String getTranslation(){
        return translation;
    }
    public String toString(){
        return "Perevod Na Rus "+translation;
    }

}
