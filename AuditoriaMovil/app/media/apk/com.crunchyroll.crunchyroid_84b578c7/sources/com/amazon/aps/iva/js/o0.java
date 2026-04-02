package com.amazon.aps.iva.js;
/* compiled from: UserSubscriptionTypeProperty.kt */
/* loaded from: classes2.dex */
public abstract class o0 extends com.amazon.aps.iva.is.c {

    /* compiled from: UserSubscriptionTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends o0 {
        public static final a a = new a();

        public a() {
            super("CR subscribed users");
        }
    }

    /* compiled from: UserSubscriptionTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends o0 {
        public static final b a = new b();

        public b() {
            super("FN subscribed users");
        }
    }

    public o0(String str) {
        super("userType", str);
    }
}
