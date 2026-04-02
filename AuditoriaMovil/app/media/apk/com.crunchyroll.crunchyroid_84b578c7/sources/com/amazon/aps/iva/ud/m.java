package com.amazon.aps.iva.ud;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p4.n;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ProgressLayout.kt */
/* loaded from: classes.dex */
public final class m {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(43514177, a.h, false);
    public static final com.amazon.aps.iva.v0.a b = com.amazon.aps.iva.v0.b.c(-1925569589, b.h, false);
    public static final com.amazon.aps.iva.v0.a c = com.amazon.aps.iva.v0.b.c(-894427307, c.h, false);

    /* compiled from: ProgressLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.d, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y4.d dVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            com.amazon.aps.iva.yb0.j.f(dVar, "$this$Column");
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.r4.g.a(com.amazon.aps.iva.ff0.b.K(com.amazon.aps.iva.ff0.b.q(n.a.b)), new com.amazon.aps.iva.b5.d(defpackage.i.d(-756447)), iVar, 0, 0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProgressLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.d, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y4.d dVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            num.intValue();
            com.amazon.aps.iva.yb0.j.f(dVar, "$this$Column");
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.p4.a aVar = new com.amazon.aps.iva.p4.a(R.drawable.cr_logo_primary);
            n.a aVar2 = n.a.b;
            float f = 20;
            com.amazon.aps.iva.p4.q.a(aVar, "", com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(aVar2, f), f), 0, iVar2, 56, 8);
            com.amazon.aps.iva.y4.c.a(com.amazon.aps.iva.ff0.b.L(com.amazon.aps.iva.ff0.b.o(aVar2)), 1, 1, m.a, iVar2, 3072, 0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProgressLayout.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.y4.c.a(com.amazon.aps.iva.e.w.K(com.amazon.aps.iva.ff0.b.L(com.amazon.aps.iva.ff0.b.o(n.a.b)), 12), 0, 2, m.b, iVar2, 3072, 2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }
}
