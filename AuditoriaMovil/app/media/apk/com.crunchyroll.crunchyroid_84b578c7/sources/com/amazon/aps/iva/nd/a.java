package com.amazon.aps.iva.nd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: EmptyPersistentMessageCenterAdapter.kt */
/* loaded from: classes.dex */
public final class a {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(-1664321876, C0535a.h, false);
    public static final com.amazon.aps.iva.v0.a b = com.amazon.aps.iva.v0.b.c(-2111181319, b.h, false);

    /* compiled from: EmptyPersistentMessageCenterAdapter.kt */
    /* renamed from: com.amazon.aps.iva.nd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0535a extends l implements p<i, Integer, q> {
        public static final C0535a h = new C0535a();

        public C0535a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.pd.i.a(null, iVar2, 0, 1);
            }
            return q.a;
        }
    }

    /* compiled from: EmptyPersistentMessageCenterAdapter.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
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
