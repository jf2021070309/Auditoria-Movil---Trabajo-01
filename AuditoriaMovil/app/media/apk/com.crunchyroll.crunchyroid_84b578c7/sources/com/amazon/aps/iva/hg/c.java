package com.amazon.aps.iva.hg;
/* compiled from: BulkDownload.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class a extends c {
        public static final a a = new a();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class b extends c {
        public static final b a = new b();
    }

    /* compiled from: BulkDownload.kt */
    /* renamed from: com.amazon.aps.iva.hg.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0339c extends c {
        public static final C0339c a = new C0339c();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class d extends c {
        public static final d a = new d();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class f extends c {
        public static final f a = new f();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class g extends c {
        public static final g a = new g();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class h extends c {
        public static final h a = new h();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class i extends c {
        public static final i a = new i();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class j extends c {
        public static final j a = new j();
    }

    /* compiled from: BulkDownload.kt */
    /* loaded from: classes.dex */
    public static final class e extends c {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.a == ((e) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.e.f(new StringBuilder("InProgress(progress="), this.a, ")");
        }

        public e() {
            this(0);
        }
    }
}
