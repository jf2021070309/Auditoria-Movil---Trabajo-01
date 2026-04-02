package com.amazon.aps.iva.qm;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import java.util.Collection;
import java.util.LinkedList;
/* compiled from: ProfileActivationViewModel.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.ez.b implements a0, g0 {
    public final k b;
    public final com.amazon.aps.iva.pm.b c;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d d;
    public final LinkedList e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<String>> f;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>> g;

    /* compiled from: ProfileActivationViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationViewModelImpl$loadRandomUsername$1", f = "ProfileActivationViewModel.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public LinkedList h;
        public int i;
        public /* synthetic */ Object j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.j = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object H;
            LinkedList linkedList;
            b0 b0Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            b0 b0Var2 = b0.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        linkedList = this.h;
                        b0Var = (b0) this.j;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    g0 g0Var = (g0) this.j;
                    LinkedList linkedList2 = b0Var2.e;
                    k kVar = b0Var2.b;
                    this.j = b0Var2;
                    this.h = linkedList2;
                    this.i = 1;
                    Object usernames = kVar.getUsernames(this);
                    if (usernames == aVar) {
                        return aVar;
                    }
                    linkedList = linkedList2;
                    obj = usernames;
                    b0Var = b0Var2;
                }
                linkedList.addAll((Collection) obj);
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<String>> vVar = b0Var.f;
                Object poll = b0Var.e.poll();
                com.amazon.aps.iva.yb0.j.c(poll);
                vVar.k(new g.c(poll, null));
                H = com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                H = com.amazon.aps.iva.ab.x.H(th);
            }
            Throwable a = com.amazon.aps.iva.kb0.k.a(H);
            if (a != null) {
                b0Var2.f.k(new g.a(null, a));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProfileActivationViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationViewModelImpl$setUsername$1", f = "ProfileActivationViewModel.kt", l = {53, 54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.k = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.k, dVar);
            bVar.i = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r6.h
                com.amazon.aps.iva.qm.b0 r2 = com.amazon.aps.iva.qm.b0.this
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L4a
                goto L47
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.i
                com.amazon.aps.iva.qm.b0 r1 = (com.amazon.aps.iva.qm.b0) r1
                com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L4a
                goto L3a
            L23:
                com.amazon.aps.iva.ab.x.i0(r7)
                java.lang.Object r7 = r6.i
                com.amazon.aps.iva.se0.g0 r7 = (com.amazon.aps.iva.se0.g0) r7
                java.lang.String r7 = r6.k
                com.amazon.aps.iva.qm.k r1 = r2.b     // Catch: java.lang.Throwable -> L4a
                r6.i = r2     // Catch: java.lang.Throwable -> L4a
                r6.h = r4     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r7 = r1.W0(r7, r6)     // Catch: java.lang.Throwable -> L4a
                if (r7 != r0) goto L39
                return r0
            L39:
                r1 = r2
            L3a:
                com.amazon.aps.iva.pm.b r7 = r1.c     // Catch: java.lang.Throwable -> L4a
                r6.i = r5     // Catch: java.lang.Throwable -> L4a
                r6.h = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r7 = r7.r1(r6)     // Catch: java.lang.Throwable -> L4a
                if (r7 != r0) goto L47
                return r0
            L47:
                com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel r7 = (com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel) r7     // Catch: java.lang.Throwable -> L4a
                goto L4f
            L4a:
                r7 = move-exception
                com.amazon.aps.iva.kb0.k$a r7 = com.amazon.aps.iva.ab.x.H(r7)
            L4f:
                boolean r0 = r7 instanceof com.amazon.aps.iva.kb0.k.a
                r0 = r0 ^ r4
                if (r0 == 0) goto L68
                r0 = r7
                com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel r0 = (com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel) r0
                com.amazon.aps.iva.qm.k r0 = r2.b
                r0.l0()
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>> r0 = r2.g
                com.amazon.aps.iva.ez.g$c r1 = new com.amazon.aps.iva.ez.g$c
                com.amazon.aps.iva.kb0.q r3 = com.amazon.aps.iva.kb0.q.a
                r1.<init>(r3, r5)
                r0.k(r1)
            L68:
                java.lang.Throwable r7 = com.amazon.aps.iva.kb0.k.a(r7)
                if (r7 == 0) goto L78
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>> r0 = r2.g
                com.amazon.aps.iva.ez.g$a r1 = new com.amazon.aps.iva.ez.g$a
                r1.<init>(r5, r7)
                r0.k(r1)
            L78:
                com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qm.b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(k kVar, com.amazon.aps.iva.pm.c cVar) {
        super(kVar, cVar);
        com.amazon.aps.iva.yb0.j.f(kVar, "interactor");
        this.b = kVar;
        this.c = cVar;
        this.d = com.amazon.aps.iva.e.z.j();
        this.e = new LinkedList();
        this.f = new com.amazon.aps.iva.i5.v<>();
        this.g = new com.amazon.aps.iva.i5.v<>();
    }

    @Override // com.amazon.aps.iva.qm.a0
    public final com.amazon.aps.iva.i5.v D4() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.qm.a0
    public final void Z4() {
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<String>> vVar = this.f;
        com.amazon.aps.iva.ez.h.c(vVar, null);
        LinkedList linkedList = this.e;
        if (linkedList.isEmpty()) {
            com.amazon.aps.iva.se0.i.d(this, null, null, new a(null), 3);
            return;
        }
        Object poll = linkedList.poll();
        com.amazon.aps.iva.yb0.j.c(poll);
        vVar.k(new g.c(poll, null));
    }

    @Override // com.amazon.aps.iva.qm.a0
    public final com.amazon.aps.iva.i5.v c0() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.d.b;
    }

    @Override // com.amazon.aps.iva.qm.a0
    public final void setUsername(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "username");
        com.amazon.aps.iva.ez.h.c(this.g, null);
        com.amazon.aps.iva.se0.i.d(this, null, null, new b(str, null), 3);
    }
}
