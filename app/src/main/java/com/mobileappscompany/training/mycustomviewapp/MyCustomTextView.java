package com.mobileappscompany.training.mycustomviewapp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by User on 2/20/2017.
 */

public class MyCustomTextView extends TextView {
    public MyCustomTextView(Context context) {
        super(context);
        setStyle();
    }

    public MyCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setStyle();
    }

    public MyCustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setStyle();
    }

    private void setStyle() {
        setText("Stylish custom text view");
        setBackgroundColor(Color.GRAY);
    }
}
