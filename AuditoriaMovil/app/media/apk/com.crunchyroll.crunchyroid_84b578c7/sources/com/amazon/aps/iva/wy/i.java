package com.amazon.aps.iva.wy;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
/* compiled from: EtpBaseInteractor.kt */
/* loaded from: classes2.dex */
public abstract class i implements j, g0 {
    public static final int $stable = 8;
    private final /* synthetic */ g0 $$delegate_0 = z.j();

    /* compiled from: EtpBaseInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.EtpBaseInteractor$launchCatching$1", f = "EtpBaseInteractor.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ l<com.amazon.aps.iva.ob0.d<? super T>, Object> j;
        public final /* synthetic */ l<T, q> k;
        public final /* synthetic */ l<Throwable, q> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super com.amazon.aps.iva.ob0.d<? super T>, ? extends Object> lVar, l<? super T, q> lVar2, l<? super Throwable, q> lVar3, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = lVar;
            this.k = lVar2;
            this.l = lVar3;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, this.l, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r4.h
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r4.i
                com.amazon.aps.iva.se0.g0 r0 = (com.amazon.aps.iva.se0.g0) r0
                com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.lang.Throwable -> L11
                goto L3a
            L11:
                r5 = move-exception
                goto L36
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                com.amazon.aps.iva.ab.x.i0(r5)
                java.lang.Object r5 = r4.i
                com.amazon.aps.iva.se0.g0 r5 = (com.amazon.aps.iva.se0.g0) r5
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super T>, java.lang.Object> r1 = r4.j
                r4.i = r5     // Catch: java.lang.Throwable -> L32
                r4.h = r2     // Catch: java.lang.Throwable -> L32
                java.lang.Object r1 = r1.invoke(r4)     // Catch: java.lang.Throwable -> L32
                if (r1 != r0) goto L2f
                return r0
            L2f:
                r0 = r5
                r5 = r1
                goto L3a
            L32:
                r0 = move-exception
                r3 = r0
                r0 = r5
                r5 = r3
            L36:
                com.amazon.aps.iva.kb0.k$a r5 = com.amazon.aps.iva.ab.x.H(r5)
            L3a:
                boolean r1 = r5 instanceof com.amazon.aps.iva.kb0.k.a
                r1 = r1 ^ r2
                if (r1 == 0) goto L4c
                boolean r1 = com.amazon.aps.iva.e.z.E(r0)
                if (r1 == 0) goto L4c
                com.amazon.aps.iva.xb0.l<T, com.amazon.aps.iva.kb0.q> r1 = r4.k
                if (r1 == 0) goto L4c
                r1.invoke(r5)
            L4c:
                java.lang.Throwable r5 = com.amazon.aps.iva.kb0.k.a(r5)
                if (r5 == 0) goto L63
                boolean r1 = r5 instanceof java.util.concurrent.CancellationException
                if (r1 != 0) goto L63
                boolean r0 = com.amazon.aps.iva.e.z.E(r0)
                if (r0 == 0) goto L63
                com.amazon.aps.iva.xb0.l<java.lang.Throwable, com.amazon.aps.iva.kb0.q> r0 = r4.l
                if (r0 == 0) goto L63
                r0.invoke(r5)
            L63:
                com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wy.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void launchCatching$default(i iVar, g0 g0Var, l lVar, l lVar2, l lVar3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                lVar2 = null;
            }
            if ((i & 4) != 0) {
                lVar3 = null;
            }
            iVar.launchCatching(g0Var, lVar, lVar2, lVar3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchCatching");
    }

    @Override // com.amazon.aps.iva.wy.j
    public void cancelRunningApiCalls() {
        z.l(this, null);
    }

    @Override // com.amazon.aps.iva.se0.g0
    public com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final <T> void launchCatching(g0 g0Var, l<? super com.amazon.aps.iva.ob0.d<? super T>, ? extends Object> lVar, l<? super T, q> lVar2, l<? super Throwable, q> lVar3) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new a(lVar, lVar2, lVar3, null), 3);
    }
}
