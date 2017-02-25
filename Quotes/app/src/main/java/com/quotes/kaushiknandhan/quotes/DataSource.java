package com.quotes.kaushiknandhan.quotes;

import java.util.ArrayList;

/**
 * DataSource is a class which adds the list of images and quotes and returns the same when called.
 * Created by kaushik nandhan on 2/23/2017.
 */

public class DataSource {
    private ArrayList<Integer> mPhotoPool;
    private ArrayList<Integer> mQuotePool;
    private ArrayList<Integer> mPhotoHdPool;

    public ArrayList<Integer> getmPhotoHdPool() {
        return mPhotoHdPool;
    }
    public ArrayList<Integer> getmPhotoPool() {
        return mPhotoPool;
    }
    public ArrayList<Integer> getmQuotePool() {
        return mQuotePool;
    }
    public int getDataSourceLength() {
        return mPhotoPool.size();
    }

    // Using constructor to initialize the ArrayList, add all the images and quotes in the list.
    public DataSource() {
        mPhotoPool = new ArrayList();
        mQuotePool = new ArrayList();
        mPhotoHdPool = new ArrayList();
        setupPhotoPool();
        setupQuotePool();
        setupPhotoHDPool();
    }
    // adding images to the List
    private void setupPhotoPool() {
        mPhotoPool.add(R.drawable.steve_1);
        mPhotoPool.add(R.drawable.steve_2);
        mPhotoPool.add(R.drawable.steve_3);
        mPhotoPool.add(R.drawable.steve_4);
        mPhotoPool.add(R.drawable.steve_5);
        mPhotoPool.add(R.drawable.rabindranath_tagore_1);
        mPhotoPool.add(R.drawable.rabindranath_tagore_2);
        mPhotoPool.add(R.drawable.rabindranath_tagore_3);
        mPhotoPool.add(R.drawable.rabindranath_tagore_4);
        mPhotoPool.add(R.drawable.rabindranath_tagore_5);
//        mPhotoPool.add(R.drawable.steve_6);
//        mPhotoPool.add(R.drawable.steve_7);
//        mPhotoPool.add(R.drawable.steve_8);
//        mPhotoPool.add(R.drawable.steve_9);
//        mPhotoPool.add(R.drawable.steve_10);
    }
    // adding strings to the List
    private void setupQuotePool() {
        mQuotePool.add(R.string.quote_1);
        mQuotePool.add(R.string.quote_2);
        mQuotePool.add(R.string.quote_3);
        mQuotePool.add(R.string.quote_4);
        mQuotePool.add(R.string.quote_5);
        mQuotePool.add(R.string.quote_11);
        mQuotePool.add(R.string.quote_12);
        mQuotePool.add(R.string.quote_13);
        mQuotePool.add(R.string.quote_14);
        mQuotePool.add(R.string.quote_15);

//        mQuotePool.add(R.string.quote_6);
//        mQuotePool.add(R.string.quote_7);
//        mQuotePool.add(R.string.quote_8);
//        mQuotePool.add(R.string.quote_9);
//        mQuotePool.add(R.string.quote_10);

    }
    // adding HD images to the list
    private void setupPhotoHDPool() {
        mPhotoHdPool.add(R.drawable.steve_hd_1);
        mPhotoHdPool.add(R.drawable.steve_hd_2);
        mPhotoHdPool.add(R.drawable.steve_hd_3);
        mPhotoHdPool.add(R.drawable.steve_hd_4);
        mPhotoHdPool.add(R.drawable.steve_hd_5);
        mPhotoHdPool.add(R.drawable.rabindranath_tagore_1_hd);
        mPhotoHdPool.add(R.drawable.rabindranath_tagore_2_hd);
        mPhotoHdPool.add(R.drawable.rabindranath_tagore_3_hd);
        mPhotoHdPool.add(R.drawable.rabindranath_tagore_4_hd);
        mPhotoHdPool.add(R.drawable.rabindranath_tagore_5_hd);
//        mPhotoHdPool.add(R.drawable.steve_hd_6);
//        mPhotoHdPool.add(R.drawable.steve_hd_7);
//        mPhotoHdPool.add(R.drawable.steve_hd_8);
//        mPhotoHdPool.add(R.drawable.steve_hd_9);
//        mPhotoHdPool.add(R.drawable.apple_hd);
    }



}
