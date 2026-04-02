package com.amazon.aps.iva.m10;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: GenresListAdapter.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(-343602330, C0500a.h, false);
    public static final com.amazon.aps.iva.v0.a b = com.amazon.aps.iva.v0.b.c(-1366590343, b.h, false);

    /* compiled from: GenresListAdapter.kt */
    /* renamed from: com.amazon.aps.iva.m10.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0500a extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public static final C0500a h = new C0500a();

        public C0500a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                c.a(null, iVar2, 0, 1);
            }
            return q.a;
        }
    }

    /* compiled from: GenresListAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(a.a, iVar2, 6);
            }
            return q.a;
        }
    }
}
