package com.amazon.aps.iva.dv;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(1462544673, a.h, false);
    public static final com.amazon.aps.iva.v0.a b = com.amazon.aps.iva.v0.b.c(-138902674, C0207b.h, false);

    /* compiled from: CrunchylistAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ev.a.a(iVar2, 0);
            }
            return q.a;
        }
    }

    /* compiled from: CrunchylistAdapter.kt */
    /* renamed from: com.amazon.aps.iva.dv.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0207b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.a<? extends q>, com.amazon.aps.iva.o0.i, Integer, q> {
        public static final C0207b h = new C0207b();

        public C0207b() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final q invoke(com.amazon.aps.iva.xb0.a<? extends q> aVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(aVar, "it");
            if ((intValue & 81) == 16 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(b.a, iVar2, 6);
            }
            return q.a;
        }
    }
}
