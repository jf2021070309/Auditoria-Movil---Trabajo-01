package com.amazon.aps.iva.oc0;

import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: Visibilities.kt */
/* loaded from: classes4.dex */
public final class f1 {
    public static final com.amazon.aps.iva.mb0.b a;

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class a extends g1 {
        public static final a c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class b extends g1 {
        public static final b c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class c extends g1 {
        public static final c c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class d extends g1 {
        public static final d c = new d();

        public d() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class e extends g1 {
        public static final e c = new e();

        public e() {
            super("private", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class f extends g1 {
        public static final f c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // com.amazon.aps.iva.oc0.g1
        public final String b() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class g extends g1 {
        public static final g c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class h extends g1 {
        public static final h c = new h();

        public h() {
            super("public", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes4.dex */
    public static final class i extends g1 {
        public static final i c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        com.amazon.aps.iva.mb0.b bVar = new com.amazon.aps.iva.mb0.b();
        bVar.put(f.c, 0);
        bVar.put(e.c, 0);
        bVar.put(b.c, 1);
        bVar.put(g.c, 1);
        bVar.put(h.c, 2);
        bVar.c();
        bVar.m = true;
        if (bVar.i <= 0) {
            bVar = com.amazon.aps.iva.mb0.b.n;
            com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        a = bVar;
    }
}
