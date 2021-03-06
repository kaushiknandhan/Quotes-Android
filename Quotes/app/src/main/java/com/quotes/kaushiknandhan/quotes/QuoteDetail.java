package com.quotes.kaushiknandhan.quotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * This class is used to find details of a particular list-data.
 * Created by kaushik nandhan on 2/24/2017.
 */

public class QuoteDetail extends AppCompatActivity {
    private ImageView mImageView;
    private TextView mQuote;
    private int mPosition;
    private DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote_detail);
        Intent i = getIntent();
        mPosition = i.getIntExtra("position", 0);
        mDataSource = new DataSource();
        mImageView = (ImageView) findViewById(R.id.image);
        mQuote = (TextView) findViewById(R.id.quote);
        mImageView.setImageResource(mDataSource.getmPhotoHdPool().
                get(mPosition));
        mQuote.setText(getResources().getString(mDataSource.getmQuotePool()
                .get(mPosition)));

    }
}
