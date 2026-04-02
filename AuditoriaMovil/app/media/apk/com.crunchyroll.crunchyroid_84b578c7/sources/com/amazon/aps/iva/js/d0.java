package com.amazon.aps.iva.js;
/* compiled from: RestrictedModalTypeProperty.kt */
/* loaded from: classes2.dex */
public abstract class d0 extends com.amazon.aps.iva.is.c {

    /* compiled from: RestrictedModalTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends d0 {
        public static final a a = new a();

        public a() {
            super("contact customer support");
        }
    }

    /* compiled from: RestrictedModalTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends d0 {
        public static final b a = new b();

        public b() {
            super("no new sessions allowed");
        }
    }

    /* compiled from: RestrictedModalTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class c extends d0 {
        public static final c a = new c();

        public c() {
            super("force password reset");
        }
    }

    public d0(String str) {
        super("modalType", str);
    }
}
