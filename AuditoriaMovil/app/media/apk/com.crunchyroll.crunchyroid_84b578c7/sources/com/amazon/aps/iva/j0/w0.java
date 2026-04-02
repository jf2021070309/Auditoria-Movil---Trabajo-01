package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.b0.h;
/* compiled from: LongPressTextDragObserver.kt */
/* loaded from: classes.dex */
public final class w0 {

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ g1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1 g1Var) {
            super(1);
            this.h = g1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e1.c cVar) {
            this.h.b(cVar.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ g1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g1 g1Var) {
            super(0);
            this.h = g1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.onStop();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ g1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g1 g1Var) {
            super(0);
            this.h = g1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.onCancel();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ g1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g1 g1Var) {
            super(2);
            this.h = g1Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.p1.y yVar, com.amazon.aps.iva.e1.c cVar) {
            long j = cVar.a;
            com.amazon.aps.iva.yb0.j.f(yVar, "<anonymous parameter 0>");
            this.h.d(j);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final Object a(com.amazon.aps.iva.p1.f0 f0Var, g1 g1Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        a aVar = new a(g1Var);
        b bVar = new b(g1Var);
        c cVar = new c(g1Var);
        d dVar2 = new d(g1Var);
        h.a aVar2 = com.amazon.aps.iva.b0.h.a;
        Object b2 = com.amazon.aps.iva.b0.c0.b(f0Var, new com.amazon.aps.iva.b0.j(null, bVar, cVar, aVar, dVar2), dVar);
        com.amazon.aps.iva.pb0.a aVar3 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (b2 != aVar3) {
            b2 = com.amazon.aps.iva.kb0.q.a;
        }
        if (b2 == aVar3) {
            return b2;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
