package cloud.techstar.dictionary.models;

public class Words {

    private String id;
    private String character;
    private String meaning;
    private String meaningMon;
    private String kanji;
    private String partOfSpeech;
    private String level;
    private String isMemorize;
    private String isFavorite;
    private String created;

    public Words() {
    }

    public Words(String id, String character, String meaning, String meaningMon, String kanji, String partOfSpeech, String level, String isMemorize, String isFavorite, String created) {
        this.id = id;
        this.character = character;
        this.meaning = meaning;
        this.meaningMon = meaningMon;
        this.kanji = kanji;
        this.partOfSpeech = partOfSpeech;
        this.level = level;
        this.isMemorize = isMemorize;
        this.isFavorite = isFavorite;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaningMon() {
        return meaningMon;
    }

    public void setMeaningMon(String meaningMon) {
        this.meaningMon = meaningMon;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIsMemorize() {
        return isMemorize;
    }

    public void setIsMemorize(String isMemorize) {
        this.isMemorize = isMemorize;
    }

    public String getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
