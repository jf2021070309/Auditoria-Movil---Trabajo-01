package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;
/* loaded from: classes.dex */
public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context, com.applovin.impl.sdk.m mVar) {
        super(context, null, 0);
    }

    public void setVideoSize(int i2, int i3) {
        getHolder().setFixedSize(i2, i3);
        requestLayout();
        invalidate();
    }
}
