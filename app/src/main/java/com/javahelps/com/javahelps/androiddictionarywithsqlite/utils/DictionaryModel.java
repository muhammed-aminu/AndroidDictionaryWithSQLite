package com.javahelps.com.javahelps.androiddictionarywithsqlite.utils;

public class DictionaryModel {
    private String id,word,definition;

    public DictionaryModel(String id,String word,String definition) {

        this.id=id;
        this.word=word;
        this.definition=definition;
    }

    public String getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
