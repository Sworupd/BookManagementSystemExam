package models;

public class Genre {
    String genreName;
    String fiction;

    public Genre(String genreName, String fiction) {
        this.genreName = genreName;
        this.fiction = fiction;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getFiction() {
        return fiction;
    }

    public void setFiction(String fiction) {
        this.fiction = fiction;
    }
}
