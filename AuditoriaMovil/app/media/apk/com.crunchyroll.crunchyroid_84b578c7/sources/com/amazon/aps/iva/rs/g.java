package com.amazon.aps.iva.rs;
/* compiled from: BillingConnectionStatus.kt */
/* loaded from: classes2.dex */
public abstract class g {

    /* compiled from: BillingConnectionStatus.kt */
    /* loaded from: classes2.dex */
    public static final class a extends g {
        public static final a a = new a();
    }

    /* compiled from: BillingConnectionStatus.kt */
    /* loaded from: classes2.dex */
    public static final class b extends g {
        public static final b a = new b();
    }

    /* compiled from: BillingConnectionStatus.kt */
    /* loaded from: classes2.dex */
    public static final class c extends g {
        public static final c a = new c();
    }

    /* compiled from: BillingConnectionStatus.kt */
    /* loaded from: classes2.dex */
    public static final class d extends g {
        public final String a;

        public d(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "message");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && com.amazon.aps.iva.yb0.j.a(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Unavailable(message="), this.a, ")");
        }

        public d() {
            this("");
        }
    }

    /* compiled from: BillingConnectionStatus.kt */
    /* loaded from: classes2.dex */
    public static final class e extends g {
        public final String a;

        public e(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "message");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && com.amazon.aps.iva.yb0.j.a(this.a, ((e) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Unexpected(message="), this.a, ")");
        }

        public e() {
            this("");
        }
    }
}
