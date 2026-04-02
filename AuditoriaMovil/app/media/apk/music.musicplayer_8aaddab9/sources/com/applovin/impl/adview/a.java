package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class a extends RelativeLayout {
    private final ProgressBar a;

    public a(Context context, int i2, int i3) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i3);
        this.a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i2 == -2 || i2 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i2);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i2) {
        this.a.getIndeterminateDrawable().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
    }
}
