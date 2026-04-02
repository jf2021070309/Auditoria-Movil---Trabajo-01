package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.applovin.mediation.MaxAdFormat;
/* loaded from: classes.dex */
public class MaxNativeAd {
    private final MaxAdFormat a;
    private final String b;
    private final String c;
    private final String d;
    private final MaxNativeAdImage e;
    private final View f;
    private final View g;
    private final View h;

    /* loaded from: classes.dex */
    public static class Builder {
        private MaxAdFormat a;
        private String b;
        private String c;
        private String d;
        private MaxNativeAdImage e;
        private View f;
        private View g;
        private View h;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.a = maxAdFormat;
            return this;
        }

        public Builder setBody(String str) {
            this.c = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.d = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.e = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f = view;
            return this;
        }

        public Builder setMediaView(View view) {
            this.h = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.g = view;
            return this;
        }

        public Builder setTitle(String str) {
            this.b = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class MaxNativeAdImage {
        private Drawable a;
        private Uri b;

        public MaxNativeAdImage(Drawable drawable) {
            this.a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.b = uri;
        }

        public Drawable getDrawable() {
            return this.a;
        }

        public Uri getUri() {
            return this.b;
        }
    }

    private MaxNativeAd(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
    }

    public String getBody() {
        return this.c;
    }

    public String getCallToAction() {
        return this.d;
    }

    public MaxAdFormat getFormat() {
        return this.a;
    }

    public MaxNativeAdImage getIcon() {
        return this.e;
    }

    public View getIconView() {
        return this.f;
    }

    public View getMediaView() {
        return this.h;
    }

    public View getOptionsView() {
        return this.g;
    }

    public String getTitle() {
        return this.b;
    }
}
