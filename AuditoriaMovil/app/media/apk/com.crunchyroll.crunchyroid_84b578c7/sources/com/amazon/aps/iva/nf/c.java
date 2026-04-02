package com.amazon.aps.iva.nf;

import com.amazon.aps.iva.ks.p;
/* compiled from: RestrictionOverlay.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class a extends c {
        public static final a a = new a();
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class b extends c {
        public static final b a = new b();
    }

    /* compiled from: RestrictionOverlay.kt */
    /* renamed from: com.amazon.aps.iva.nf.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0538c extends c {
        public static final C0538c a = new C0538c();
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class d extends c {
        public static final d a = new d();
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class e extends c {
        public static final e a = new e();
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class g extends c {
        public final com.amazon.aps.iva.rf.f a;

        public g(com.amazon.aps.iva.rf.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof g) && com.amazon.aps.iva.yb0.j.a(this.a, ((g) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PremiumDub(uiModel=" + this.a + ")";
        }
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class h extends c {
        public final String a;

        public h(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof h) && com.amazon.aps.iva.yb0.j.a(this.a, ((h) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("RecoverableError(code="), this.a, ")");
        }
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class i extends c {
        public final p a;
        public final com.amazon.aps.iva.ks.e b;

        public i(p pVar, com.amazon.aps.iva.ks.e eVar) {
            this.a = pVar;
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, iVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            p pVar = this.a;
            if (pVar == null) {
                hashCode = 0;
            } else {
                hashCode = pVar.hashCode();
            }
            int i2 = hashCode * 31;
            com.amazon.aps.iva.ks.e eVar = this.b;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            return "RestrictedContent(ratingData=" + this.a + ", contentMediaProperty=" + this.b + ")";
        }
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class j extends c {
        public final boolean a;
        public final int b;

        public j(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return Integer.hashCode(this.b) + (r0 * 31);
        }

        public final String toString() {
            return "StreamsLimitReached(upgradesAvailable=" + this.a + ", upsellButtonText=" + this.b + ")";
        }
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class k extends c {
        public static final k a = new k();
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class l extends c {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && com.amazon.aps.iva.yb0.j.a(this.a, ((l) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("UnrecoverableError(code="), this.a, ")");
        }
    }

    /* compiled from: RestrictionOverlay.kt */
    /* loaded from: classes.dex */
    public static final class f extends c {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && this.a == ((f) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "Premium(isMusic=" + this.a + ")";
        }

        public f() {
            this(false);
        }
    }
}
