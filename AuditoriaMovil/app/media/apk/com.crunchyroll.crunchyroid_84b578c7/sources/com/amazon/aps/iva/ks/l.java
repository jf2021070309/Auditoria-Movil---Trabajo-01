package com.amazon.aps.iva.ks;
/* compiled from: MigrationResultProperty.kt */
/* loaded from: classes2.dex */
public abstract class l extends com.amazon.aps.iva.is.c {
    private final String value;

    /* compiled from: MigrationResultProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l {
        public static final a a = new a();

        public a() {
            super("Scenario 1 FN Free Trial Upsell");
        }
    }

    /* compiled from: MigrationResultProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l {
        public static final b a = new b();

        public b() {
            super("Scenario 1 FN Premium Access");
        }
    }

    /* compiled from: MigrationResultProperty.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l {
        public static final c a = new c();

        public c() {
            super("Scenario 3 FN Premium Access");
        }
    }

    /* compiled from: MigrationResultProperty.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l {
        public static final d a = new d();

        public d() {
            super("Scenario 2 CR Subscribed");
        }
    }

    /* compiled from: MigrationResultProperty.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l {
        public static final e a = new e();

        public e() {
            super("Scenario 2 FN & CR Free Access");
        }
    }

    /* compiled from: MigrationResultProperty.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l {
        public static final f a = new f();

        public f() {
            super("Scenario 2 FN & CR Subscribed");
        }
    }

    public l(String str) {
        super("migrationResult", str);
        this.value = str;
    }
}
