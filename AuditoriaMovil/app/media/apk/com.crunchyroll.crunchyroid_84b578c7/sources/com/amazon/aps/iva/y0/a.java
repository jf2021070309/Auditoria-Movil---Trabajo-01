package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.y0.m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.y0.b {

    /* compiled from: Snapshot.kt */
    /* renamed from: com.amazon.aps.iva.y0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0877a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0877a(ArrayList arrayList) {
            super(1);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "state");
            List<com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q>> list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(obj);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, com.amazon.aps.iva.y0.b> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
            super(1);
            this.h = lVar;
            this.i = lVar2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.y0.b invoke(k kVar) {
            int i;
            k kVar2 = kVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "invalid");
            synchronized (m.c) {
                i = m.e;
                m.e = i + 1;
            }
            return new com.amazon.aps.iva.y0.b(i, kVar2, this.h, this.i);
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, f> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final f invoke(k kVar) {
            int i;
            k kVar2 = kVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "invalid");
            synchronized (m.c) {
                i = m.e;
                m.e = i + 1;
            }
            return new f(i, kVar2, this.h);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r5, com.amazon.aps.iva.y0.k r6) {
        /*
            r4 = this;
            java.lang.Object r0 = com.amazon.aps.iva.y0.m.c
            monitor-enter(r0)
            java.util.ArrayList r1 = com.amazon.aps.iva.y0.m.i     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ 1
            r3 = 0
            if (r2 == 0) goto L13
            java.util.ArrayList r1 = com.amazon.aps.iva.lb0.x.Z0(r1)     // Catch: java.lang.Throwable -> L2a
            goto L14
        L13:
            r1 = r3
        L14:
            if (r1 == 0) goto L24
            java.lang.Object r2 = com.amazon.aps.iva.lb0.x.R0(r1)     // Catch: java.lang.Throwable -> L2a
            com.amazon.aps.iva.xb0.l r2 = (com.amazon.aps.iva.xb0.l) r2     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L25
            com.amazon.aps.iva.y0.a$a r2 = new com.amazon.aps.iva.y0.a$a     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            goto L25
        L24:
            r2 = r3
        L25:
            monitor-exit(r0)
            r4.<init>(r5, r6, r3, r2)
            return
        L2a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y0.a.<init>(int, com.amazon.aps.iva.y0.k):void");
    }

    @Override // com.amazon.aps.iva.y0.b
    public final com.amazon.aps.iva.y0.b A(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
        b bVar = new b(lVar, lVar2);
        m.a aVar = m.a;
        return (com.amazon.aps.iva.y0.b) ((h) m.f(new o(bVar)));
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void c() {
        synchronized (m.c) {
            int i = this.d;
            if (i >= 0) {
                m.v(i);
                this.d = -1;
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void k(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void l(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void m() {
        m.a();
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final h t(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
        c cVar = new c(lVar);
        m.a aVar = m.a;
        return (h) m.f(new o(cVar));
    }

    @Override // com.amazon.aps.iva.y0.b
    public final i v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
