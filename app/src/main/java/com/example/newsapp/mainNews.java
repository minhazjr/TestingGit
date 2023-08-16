package com.example.newsapp;

import java.util.ArrayList;

public class mainNews {

    private String Status;
    private String totalResults;
    private ArrayList<ModelClass> articles;


    public mainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        Status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
