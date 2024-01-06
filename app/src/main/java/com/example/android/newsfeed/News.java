
package com.example.android.newsfeed;


public class News {

    private String mTitle;

    private String mSection;

    private String mAuthor;

    private String mDate;

    private String mUrl;

    private String mThumbnail;

    private String mTrailTextHtml;


    public News(String title, String section, String author, String date, String url, String thumbnail, String trailText) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mUrl = url;
        mThumbnail = thumbnail;
        mTrailTextHtml = trailText;
    }


    public String getTitle() {
        return mTitle;
    }


    public String getSection() {
        return mSection;
    }


    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }


    public String getUrl() {
        return mUrl;
    }


    public String getThumbnail() {
        return mThumbnail;
    }


    public String getTrailTextHtml() {
        return mTrailTextHtml;
    }
}
