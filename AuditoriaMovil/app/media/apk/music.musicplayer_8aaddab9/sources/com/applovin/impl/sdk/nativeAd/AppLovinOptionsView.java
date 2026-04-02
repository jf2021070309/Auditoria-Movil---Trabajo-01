package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.R;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinOptionsView extends FrameLayout implements AppLovinTouchToClickListener.OnClickListener {
    private final Uri privacyUri;
    private final m sdk;

    public AppLovinOptionsView(Uri uri, m mVar, Context context) {
        super(context);
        this.sdk = mVar;
        this.privacyUri = uri;
        setBackgroundColor(-16777216);
        setAlpha(0.2f);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setImageResource(R.drawable.privacy_icon);
        addView(imageView);
        setOnTouchListener(new AppLovinTouchToClickListener(mVar, com.applovin.impl.sdk.c.b.aS, context, this));
    }

    @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
    public void onClick(View view, PointF pointF) {
        Utils.openUri(this.sdk.L(), this.privacyUri, this.sdk);
    }
}
