package com.amazon.aps.iva.ks;
/* compiled from: MembershipPlanBillingNotificationType.kt */
/* loaded from: classes2.dex */
public abstract class k extends com.amazon.aps.iva.is.c {

    /* compiled from: MembershipPlanBillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k {
        public static final a a = new a();

        public a() {
            super("Account Hold");
        }
    }

    /* compiled from: MembershipPlanBillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k {
        public static final b a = new b();

        public b() {
            super("Active");
        }
    }

    /* compiled from: MembershipPlanBillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k {
        public static final c a = new c();

        public c() {
            super("Free");
        }
    }

    /* compiled from: MembershipPlanBillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k {
        public static final d a = new d();

        public d() {
            super("In Grace");
        }
    }

    /* compiled from: MembershipPlanBillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k {
        public static final e a = new e();

        public e() {
            super("Renew");
        }
    }

    public k(String str) {
        super("billingNotificationType", str);
    }
}
