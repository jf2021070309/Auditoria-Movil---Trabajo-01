package com.facebook.ads;

import android.content.Context;
import android.widget.RelativeLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.n.a;
import com.facebook.ads.internal.n.h;
/* loaded from: classes2.dex */
public class ANGenericTemplateView extends RelativeLayout {
    private final a a;

    public ANGenericTemplateView(Context context, NativeAd nativeAd, NativeAdView.Type type, h hVar) {
        super(context);
        MediaView mediaView = new MediaView(getContext());
        mediaView.setNativeAd(nativeAd);
        this.a = new a(context, nativeAd.getInternalNativeAd(), this, new AdChoicesView(getContext(), nativeAd, true), mediaView, type.a(), hVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a();
    }
}
