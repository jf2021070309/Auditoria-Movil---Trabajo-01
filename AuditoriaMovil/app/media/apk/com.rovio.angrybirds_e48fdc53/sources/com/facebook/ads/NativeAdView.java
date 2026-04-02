package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.n.i;
/* loaded from: classes2.dex */
public class NativeAdView {

    /* loaded from: classes2.dex */
    public enum Type {
        HEIGHT_100(i.HEIGHT_100),
        HEIGHT_120(i.HEIGHT_120),
        HEIGHT_300(i.HEIGHT_300),
        HEIGHT_400(i.HEIGHT_400);
        
        private final i a;

        Type(i iVar) {
            this.a = iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public i a() {
            return this.a;
        }

        public int getHeight() {
            return this.a.b();
        }

        public int getValue() {
            return this.a.b();
        }

        public int getWidth() {
            return this.a.a();
        }
    }

    public static View render(Context context, NativeAd nativeAd, Type type) {
        return render(context, nativeAd, type, null);
    }

    public static View render(Context context, NativeAd nativeAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAd.isNativeConfigEnabled()) {
            nativeAdViewAttributes = nativeAd.getAdViewAttributes();
        } else if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        nativeAd.a(type);
        return new ANGenericTemplateView(context, nativeAd, type, nativeAdViewAttributes != null ? nativeAdViewAttributes.a() : null);
    }
}
