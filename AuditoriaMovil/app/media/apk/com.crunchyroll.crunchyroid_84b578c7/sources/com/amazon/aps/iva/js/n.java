package com.amazon.aps.iva.js;
/* compiled from: LoginPurposeProperty.kt */
/* loaded from: classes2.dex */
public abstract class n extends com.amazon.aps.iva.is.c {

    /* compiled from: LoginPurposeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends n {
        public static final a a = new a();

        public a() {
            super("Access Crunchyroll");
        }
    }

    /* compiled from: LoginPurposeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends n {
        public static final b a = new b();

        public b() {
            super("User Migration");
        }
    }

    public n(String str) {
        super("loginPurpose", str);
    }
}
