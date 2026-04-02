package com.amazon.aps.iva.ks;
/* compiled from: BillingNotificationType.kt */
/* loaded from: classes2.dex */
public abstract class b extends com.amazon.aps.iva.is.c {
    private final String typeProperty;

    /* compiled from: BillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b {
        public static final a a = new a();

        public a() {
            super("Account Hold");
        }
    }

    /* compiled from: BillingNotificationType.kt */
    /* renamed from: com.amazon.aps.iva.ks.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0457b extends b {
        public static final C0457b a = new C0457b();

        public C0457b() {
            super("Final In Grace");
        }
    }

    /* compiled from: BillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class c extends b {
        public static final c a = new c();

        public c() {
            super("Initial In Grace");
        }
    }

    /* compiled from: BillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class d extends b {
        public static final d a = new d();

        public d() {
            super("Final Renew");
        }
    }

    /* compiled from: BillingNotificationType.kt */
    /* loaded from: classes2.dex */
    public static final class e extends b {
        public static final e a = new e();

        public e() {
            super("Initial Renew");
        }
    }

    public b(String str) {
        super("billingNotificationType", str);
        this.typeProperty = str;
    }

    public final String b() {
        return this.typeProperty;
    }
}
