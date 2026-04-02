package com.amazon.aps.iva.ks;
/* compiled from: NetworkConnectionProperty.kt */
/* loaded from: classes2.dex */
public abstract class m extends com.amazon.aps.iva.is.c {

    /* compiled from: NetworkConnectionProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends m {
        public static final a a = new a();

        public a() {
            super("mobile");
        }
    }

    /* compiled from: NetworkConnectionProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends m {
        public static final b a = new b();

        public b() {
            super("wifi");
        }
    }

    public m(String str) {
        super("connection", str);
    }
}
