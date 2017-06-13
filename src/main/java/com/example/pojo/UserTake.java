package com.example.pojo;

/**
 * Created by maozz11347 on 2017/6/12.
 */
public interface UserTake {

    User getUser();

    String getName();

    Double getAverageRating();

    default Integer getHeight() {
        return getAverageRating() == null ? null : (int) Math.round(getAverageRating());
    }
}
