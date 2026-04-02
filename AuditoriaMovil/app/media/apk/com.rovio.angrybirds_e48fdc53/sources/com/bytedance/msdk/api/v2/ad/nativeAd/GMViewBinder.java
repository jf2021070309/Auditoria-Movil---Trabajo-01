package com.bytedance.msdk.api.v2.ad.nativeAd;

import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GMViewBinder {
    public final int callToActionId;
    public final int decriptionTextId;
    public final Map<String, Integer> extras;
    public final int groupImage1Id;
    public final int groupImage2Id;
    public final int groupImage3Id;
    public final int iconImageId;
    public final int layoutId;
    public final int logoLayoutId;
    public final int mainImageId;
    public final int mediaViewId;
    public final int shakeViewContainerId;
    public final int sourceId;
    public final int titleId;

    /* loaded from: classes.dex */
    public static class Builder {
        protected int a;
        protected int b;
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        protected int i;
        protected int j;
        protected int k;
        protected int l;
        protected int m;
        protected Map<String, Integer> n;

        public Builder(int i) {
            this.n = Collections.emptyMap();
            this.a = i;
            this.n = new HashMap();
        }

        public Builder addExtra(String str, int i) {
            this.n.put(str, Integer.valueOf(i));
            return this;
        }

        public Builder addExtras(Map<String, Integer> map) {
            this.n = new HashMap(map);
            return this;
        }

        public GMViewBinder build() {
            return new GMViewBinder(this);
        }

        public Builder callToActionId(int i) {
            this.d = i;
            return this;
        }

        public Builder descriptionTextId(int i) {
            this.c = i;
            return this;
        }

        public Builder groupImage1Id(int i) {
            this.j = i;
            return this;
        }

        public Builder groupImage2Id(int i) {
            this.k = i;
            return this;
        }

        public Builder groupImage3Id(int i) {
            this.l = i;
            return this;
        }

        public Builder iconImageId(int i) {
            this.e = i;
            return this;
        }

        public Builder logoLayoutId(int i) {
            this.i = i;
            return this;
        }

        public Builder mainImageId(int i) {
            this.f = i;
            return this;
        }

        public Builder mediaViewIdId(int i) {
            this.g = i;
            return this;
        }

        public Builder shakeViewContainerId(int i) {
            this.m = i;
            return this;
        }

        public Builder sourceId(int i) {
            this.h = i;
            return this;
        }

        public Builder titleId(int i) {
            this.b = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GMViewBinder(Builder builder) {
        this.layoutId = builder.a;
        this.titleId = builder.b;
        this.decriptionTextId = builder.c;
        this.callToActionId = builder.d;
        this.iconImageId = builder.e;
        this.mainImageId = builder.f;
        this.mediaViewId = builder.g;
        this.sourceId = builder.h;
        this.extras = builder.n;
        this.groupImage1Id = builder.j;
        this.groupImage2Id = builder.k;
        this.groupImage3Id = builder.l;
        this.logoLayoutId = builder.i;
        this.shakeViewContainerId = builder.m;
    }

    public static MediationViewBinder gmToCSJMViewBinder(GMViewBinder gMViewBinder) {
        if (gMViewBinder != null) {
            MediationViewBinder.Builder builder = new MediationViewBinder.Builder(gMViewBinder.layoutId);
            builder.titleId(gMViewBinder.titleId).callToActionId(gMViewBinder.callToActionId).descriptionTextId(gMViewBinder.decriptionTextId).groupImage1Id(gMViewBinder.groupImage1Id).groupImage2Id(gMViewBinder.groupImage2Id).groupImage3Id(gMViewBinder.groupImage3Id).mainImageId(gMViewBinder.mainImageId).mediaViewIdId(gMViewBinder.mediaViewId).iconImageId(gMViewBinder.iconImageId).logoLayoutId(gMViewBinder.logoLayoutId).sourceId(gMViewBinder.sourceId).addExtras(gMViewBinder.extras);
            return builder.build();
        }
        return null;
    }
}
