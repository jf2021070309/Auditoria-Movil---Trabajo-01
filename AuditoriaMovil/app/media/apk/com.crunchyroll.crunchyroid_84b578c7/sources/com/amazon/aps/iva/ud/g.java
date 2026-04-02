package com.amazon.aps.iva.ud;

import android.content.Context;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.q4.c;
import com.crunchyroll.crunchyroid.R;
import java.util.Locale;
/* compiled from: EmptyLayout.kt */
/* loaded from: classes.dex */
public final class g {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(997286537, a.h, false);
    public static final com.amazon.aps.iva.v0.a b = com.amazon.aps.iva.v0.b.c(474607531, b.h, false);

    /* compiled from: EmptyLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: EmptyLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                String string = ((Context) iVar2.i(com.amazon.aps.iva.p4.h.b)).getString(R.string.widget_continue_watching_browse_all);
                com.amazon.aps.iva.yb0.j.e(string, "LocalContext.current\n   …inue_watching_browse_all)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                com.amazon.aps.iva.s4.j jVar = new com.amazon.aps.iva.s4.j(b0.class, com.amazon.aps.iva.e.w.m(new c.b(new c.a("ctaButtonText"), upperCase)));
                n.a aVar = n.a.b;
                com.amazon.aps.iva.y4.c.a(com.amazon.aps.iva.e.w.K(com.amazon.aps.iva.ff0.b.L(com.amazon.aps.iva.ff0.b.o(aVar)), 12), 0, 2, com.amazon.aps.iva.v0.b.b(iVar2, -34208607, new i(upperCase)), iVar2, 3072, 2);
                com.amazon.aps.iva.y4.b.a(com.amazon.aps.iva.ab.x.A(com.amazon.aps.iva.ff0.b.q(com.amazon.aps.iva.ff0.b.o(aVar)), jVar), null, g.a, iVar2, 384, 2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }
}
