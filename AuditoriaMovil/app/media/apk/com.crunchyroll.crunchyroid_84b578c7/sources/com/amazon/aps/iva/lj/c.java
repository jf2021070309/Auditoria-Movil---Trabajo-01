package com.amazon.aps.iva.lj;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.cj.k;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.ve0.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState;
import com.google.zxing.aztec.encoder.Encoder;
/* compiled from: PlayheadRepository.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.zj.c, com.amazon.aps.iva.sk.a {
    public final EtpContentService a;
    public final com.amazon.aps.iva.nz.b b;
    public final LifecycleAwareState<com.amazon.aps.iva.sk.b> c;

    /* compiled from: PlayheadRepository.kt */
    @e(c = "com.crunchyroll.player.data.repositories.PlayheadRepository", f = "PlayheadRepository.kt", l = {27}, m = "savePlayhead")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public c h;
        public String i;
        public String j;
        public long k;
        public /* synthetic */ Object l;
        public int n;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return c.this.b(null, null, 0L, this);
        }
    }

    /* compiled from: PlayheadRepository.kt */
    @e(c = "com.crunchyroll.player.data.repositories.PlayheadRepository$savePlayhead$2", f = "PlayheadRepository.kt", l = {Encoder.DEFAULT_EC_PERCENT}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<g<? super q>, d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.i = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g<? super q> gVar, d<? super q> dVar) {
            return ((b) create(gVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                q qVar = q.a;
                this.h = 1;
                if (((g) this.i).a(qVar, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public c(int i) {
        k kVar = n.d;
        if (kVar != null) {
            EtpContentService etpContentService = kVar.getEtpContentService();
            com.amazon.aps.iva.ye0.c cVar = r0.a;
            t1 t1Var = com.amazon.aps.iva.xe0.k.a;
            j.f(t1Var, "dispatcher");
            com.amazon.aps.iva.nz.c cVar2 = b.a.a;
            if (cVar2 == null) {
                cVar2 = new com.amazon.aps.iva.nz.c(t1Var);
                b.a.a = cVar2;
            }
            j.f(etpContentService, "etpContentService");
            this.a = etpContentService;
            this.b = cVar2;
            this.c = new LifecycleAwareState<>();
            return;
        }
        j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.sk.a
    public final LifecycleAwareState<com.amazon.aps.iva.sk.b> a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // com.amazon.aps.iva.zj.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, long r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.kb0.q>> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.lj.c.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.lj.c$a r0 = (com.amazon.aps.iva.lj.c.a) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.lj.c$a r0 = new com.amazon.aps.iva.lj.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r7 = r0.k
            java.lang.String r6 = r0.j
            java.lang.String r5 = r0.i
            com.amazon.aps.iva.lj.c r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L2f
            goto L55
        L2f:
            r9 = move-exception
            goto L5a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r9 = r4.a     // Catch: java.lang.Throwable -> L58
            com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBody r2 = new com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBody     // Catch: java.lang.Throwable -> L58
            r2.<init>(r5, r7)     // Catch: java.lang.Throwable -> L58
            r0.h = r4     // Catch: java.lang.Throwable -> L58
            r0.i = r5     // Catch: java.lang.Throwable -> L58
            r0.j = r6     // Catch: java.lang.Throwable -> L58
            r0.k = r7     // Catch: java.lang.Throwable -> L58
            r0.n = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r9 = r9.savePlayhead(r2, r0)     // Catch: java.lang.Throwable -> L58
            if (r9 != r1) goto L54
            return r1
        L54:
            r0 = r4
        L55:
            com.amazon.aps.iva.jf0.a0 r9 = (com.amazon.aps.iva.jf0.a0) r9     // Catch: java.lang.Throwable -> L2f
            goto L5e
        L58:
            r9 = move-exception
            r0 = r4
        L5a:
            com.amazon.aps.iva.kb0.k$a r9 = com.amazon.aps.iva.ab.x.H(r9)
        L5e:
            com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState<com.amazon.aps.iva.sk.b> r1 = r0.c
            com.amazon.aps.iva.sk.b r2 = new com.amazon.aps.iva.sk.b
            boolean r9 = r9 instanceof com.amazon.aps.iva.kb0.k.a
            r9 = r9 ^ r3
            r2.<init>(r7, r9, r5)
            r1.b(r2)
            com.amazon.aps.iva.nz.a r7 = new com.amazon.aps.iva.nz.a
            r7.<init>(r5, r6)
            com.amazon.aps.iva.nz.a[] r5 = new com.amazon.aps.iva.nz.a[]{r7}
            com.amazon.aps.iva.nz.b r6 = r0.b
            r6.b(r5)
            com.amazon.aps.iva.lj.c$b r5 = new com.amazon.aps.iva.lj.c$b
            r6 = 0
            r5.<init>(r6)
            com.amazon.aps.iva.ve0.j0 r6 = new com.amazon.aps.iva.ve0.j0
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.lj.c.b(java.lang.String, java.lang.String, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
