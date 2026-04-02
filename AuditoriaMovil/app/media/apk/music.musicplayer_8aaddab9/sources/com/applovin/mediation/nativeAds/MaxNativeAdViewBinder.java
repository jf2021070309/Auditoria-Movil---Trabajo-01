package com.applovin.mediation.nativeAds;

import android.view.View;
/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    public final int advertiserTextViewId;
    public final int bodyTextViewId;
    public final int callToActionButtonId;
    public final int iconContentViewId;
    public final int iconImageViewId;
    public final int layoutResourceId;
    public final View mainView;
    public final int mediaContentFrameLayoutId;
    public final int mediaContentViewGroupId;
    public final int optionsContentFrameLayoutId;
    public final int optionsContentViewGroupId;
    public final String templateType;
    public final int titleTextViewId;

    /* loaded from: classes.dex */
    public static class Builder {
        private final View a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4433b;

        /* renamed from: c  reason: collision with root package name */
        private int f4434c;

        /* renamed from: d  reason: collision with root package name */
        private int f4435d;

        /* renamed from: e  reason: collision with root package name */
        private int f4436e;

        /* renamed from: f  reason: collision with root package name */
        private int f4437f;

        /* renamed from: g  reason: collision with root package name */
        private int f4438g;

        /* renamed from: h  reason: collision with root package name */
        private int f4439h;

        /* renamed from: i  reason: collision with root package name */
        private int f4440i;

        /* renamed from: j  reason: collision with root package name */
        private int f4441j;

        /* renamed from: k  reason: collision with root package name */
        private int f4442k;

        /* renamed from: l  reason: collision with root package name */
        private int f4443l;

        /* renamed from: m  reason: collision with root package name */
        private String f4444m;

        public Builder(int i2) {
            this(i2, null);
        }

        private Builder(int i2, View view) {
            this.f4434c = -1;
            this.f4435d = -1;
            this.f4436e = -1;
            this.f4437f = -1;
            this.f4438g = -1;
            this.f4439h = -1;
            this.f4440i = -1;
            this.f4441j = -1;
            this.f4442k = -1;
            this.f4443l = -1;
            this.f4433b = i2;
            this.a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.a, this.f4433b, this.f4434c, this.f4435d, this.f4436e, this.f4437f, this.f4438g, this.f4439h, this.f4440i, this.f4441j, this.f4442k, this.f4443l, this.f4444m);
        }

        public Builder setAdvertiserTextViewId(int i2) {
            this.f4435d = i2;
            return this;
        }

        public Builder setBodyTextViewId(int i2) {
            this.f4436e = i2;
            return this;
        }

        public Builder setCallToActionButtonId(int i2) {
            this.f4443l = i2;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i2) {
            this.f4438g = i2;
            return this;
        }

        public Builder setIconImageViewId(int i2) {
            this.f4437f = i2;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i2) {
            this.f4442k = i2;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i2) {
            this.f4441j = i2;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i2) {
            this.f4440i = i2;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i2) {
            this.f4439h = i2;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f4444m = str;
            return this;
        }

        public Builder setTitleTextViewId(int i2) {
            this.f4434c = i2;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str) {
        this.mainView = view;
        this.layoutResourceId = i2;
        this.titleTextViewId = i3;
        this.advertiserTextViewId = i4;
        this.bodyTextViewId = i5;
        this.iconImageViewId = i6;
        this.iconContentViewId = i7;
        this.optionsContentViewGroupId = i8;
        this.optionsContentFrameLayoutId = i9;
        this.mediaContentViewGroupId = i10;
        this.mediaContentFrameLayoutId = i11;
        this.callToActionButtonId = i12;
        this.templateType = str;
    }
}
