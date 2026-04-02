package com.amazon.aps.iva.ks;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: DownloadQualityProperty.kt */
/* loaded from: classes2.dex */
public abstract class f extends com.amazon.aps.iva.is.c {
    private final String value;

    /* compiled from: DownloadQualityProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {
        public static final a a = new a();

        public a() {
            super("high");
        }
    }

    /* compiled from: DownloadQualityProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f {
        public static final b a = new b();

        public b() {
            super("low");
        }
    }

    /* compiled from: DownloadQualityProperty.kt */
    /* loaded from: classes2.dex */
    public static final class c extends f {
        public static final c a = new c();

        public c() {
            super(FirebaseAnalytics.Param.MEDIUM);
        }
    }

    public f(String str) {
        super("preferredSyncQuality", str);
        this.value = str;
    }

    public final String b() {
        return this.value;
    }
}
