package com.amazon.aps.iva.ks;
/* compiled from: IntroductoryOfferType.kt */
/* loaded from: classes2.dex */
public abstract class j extends com.amazon.aps.iva.is.c {

    /* compiled from: IntroductoryOfferType.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j {
        public static final a a = new a();

        public a() {
            super("Absolute discount");
        }
    }

    /* compiled from: IntroductoryOfferType.kt */
    /* loaded from: classes2.dex */
    public static final class b extends j {
        public static final b a = new b();

        public b() {
            super("Fixed amount");
        }
    }

    /* compiled from: IntroductoryOfferType.kt */
    /* loaded from: classes2.dex */
    public static final class c extends j {
        public static final c a = new c();

        public c() {
            super("Free Trial");
        }
    }

    /* compiled from: IntroductoryOfferType.kt */
    /* loaded from: classes2.dex */
    public static final class d extends j {
        public static final d a = new d();

        public d() {
            super("Percentage discount");
        }
    }

    public j(String str) {
        super("introductoryOffer", str);
    }
}
