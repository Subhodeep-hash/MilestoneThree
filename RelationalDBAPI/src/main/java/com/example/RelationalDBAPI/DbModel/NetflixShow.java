package com.example.RelationalDBAPI.DbModel;

import javax.persistence.*;

@Entity
@Table(name = "netflix_shows")
public class NetflixShow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHOW_ID", nullable = false)
    private Integer id;

    @Column(name = "SHOW_SEQ")
    private String showSeq;

    @Column(name = "SHOW_TYPE")
    private String showType;

    @Column(name = "SHOW_TITLE")
    private String showTitle;

    @Column(name = "SHOW_DIRECTOR")
    private String showDirector;

    @Column(name = "SHOW_CAST")
    private String showCast;

    @Column(name = "SHOW_COUNTRY")
    private String showCountry;

    @Column(name = "SHOW_DATE_ADDED")
    private String showDateAdded;

    @Column(name = "SHOW_RELEASE_YEAR", length = 10)
    private String showReleaseYear;

    @Column(name = "SHOW_RATING", length = 10)
    private String showRating;

    @Column(name = "SHOW_DURATION", length = 20)
    private String showDuration;

    @Column(name = "SHOW_DESCRIPTION", length = 500)
    private String showDescription;

    @Column(name = "SHOW_LISTED_IN", length = 100)
    private String showListedIn;

    public String getShowListedIn() {
        return showListedIn;
    }

    public void setShowListedIn(String showListedIn) {
        this.showListedIn = showListedIn;
    }

    public String getShowDescription() {
        return showDescription;
    }

    public void setShowDescription(String showDescription) {
        this.showDescription = showDescription;
    }

    public String getShowDuration() {
        return showDuration;
    }

    public void setShowDuration(String showDuration) {
        this.showDuration = showDuration;
    }

    public String getShowRating() {
        return showRating;
    }

    public void setShowRating(String showRating) {
        this.showRating = showRating;
    }

    public String getShowReleaseYear() {
        return showReleaseYear;
    }

    public void setShowReleaseYear(String showReleaseYear) {
        this.showReleaseYear = showReleaseYear;
    }

    public String getShowDateAdded() {
        return showDateAdded;
    }

    public void setShowDateAdded(String showDateAdded) {
        this.showDateAdded = showDateAdded;
    }

    public String getShowCountry() {
        return showCountry;
    }

    public void setShowCountry(String showCountry) {
        this.showCountry = showCountry;
    }

    public String getShowCast() {
        return showCast;
    }

    public void setShowCast(String showCast) {
        this.showCast = showCast;
    }

    public String getShowDirector() {
        return showDirector;
    }

    public void setShowDirector(String showDirector) {
        this.showDirector = showDirector;
    }

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getShowSeq() {
        return showSeq;
    }

    public void setShowSeq(String showSeq) {
        this.showSeq = showSeq;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}