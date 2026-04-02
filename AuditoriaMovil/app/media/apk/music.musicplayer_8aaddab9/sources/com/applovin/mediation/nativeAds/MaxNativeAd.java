package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.applovin.mediation.MaxAdFormat;
/* loaded from: classes.dex */
public class MaxNativeAd {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private final View mediaView;
    private final View optionsView;
    private final String title;

    /* loaded from: classes.dex */
    public static class Builder {
        private MaxAdFormat a;

        /* renamed from: b  reason: collision with root package name */
        private String f4411b;

        /* renamed from: c  reason: collision with root package name */
        private String f4412c;

        /* renamed from: d  reason: collision with root package name */
        private String f4413d;

        /* renamed from: e  reason: collision with root package name */
        private String f4414e;

        /* renamed from: f  reason: collision with root package name */
        private MaxNativeAdImage f4415f;

        /* renamed from: g  reason: collision with root package name */
        private View f4416g;

        /* renamed from: h  reason: collision with root package name */
        private View f4417h;

        /* renamed from: i  reason: collision with root package name */
        private View f4418i;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f4412c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f4413d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f4414e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f4415f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f4416g = view;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f4418i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f4417h = view;
            return this;
        }

        public Builder setTitle(String str) {
            this.f4411b = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class MaxNativeAdImage {
        private Drawable a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f4419b;

        public MaxNativeAdImage(Drawable drawable) {
            this.a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f4419b = uri;
        }

        public Drawable getDrawable() {
            return this.a;
        }

        public Uri getUri() {
            return this.f4419b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.a;
        this.title = builder.f4411b;
        this.advertiser = builder.f4412c;
        this.body = builder.f4413d;
        this.callToAction = builder.f4414e;
        this.icon = builder.f4415f;
        this.iconView = builder.f4416g;
        this.optionsView = builder.f4417h;
        this.mediaView = builder.f4418i;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final String getTitle() {
        return this.title;
    }

    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }
}
