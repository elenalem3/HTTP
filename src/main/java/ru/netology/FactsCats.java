package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsCats {
    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public FactsCats(@JsonProperty("id") String id,
                     @JsonProperty("text") String text,
                     @JsonProperty("type") String type,
                     @JsonProperty("user") String user,
                     @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Facts: " +
                "\n\t Number = " + id +
                "\n\t Message = " + text +
                "\n\t Animal = " + type +
                "\n\t Username = " + user +
                "\n\t Voices = " + upvotes +
                "\n";
    }
}
