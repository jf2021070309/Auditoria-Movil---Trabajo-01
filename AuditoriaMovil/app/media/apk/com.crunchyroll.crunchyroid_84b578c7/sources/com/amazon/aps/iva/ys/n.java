package com.amazon.aps.iva.ys;

import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.us.z;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
import com.google.android.gms.cast.MediaError;
/* compiled from: SignInDelegate.kt */
/* loaded from: classes2.dex */
public final class n implements com.ellation.crunchyroll.application.g {
    public final com.amazon.aps.iva.bo.f a;
    public final com.amazon.aps.iva.z50.a b;
    public final c c;
    public final com.amazon.aps.iva.sv.k d;
    public final ChromecastUserStatusInteractor e;
    public final com.amazon.aps.iva.nz.f f;
    public final com.amazon.aps.iva.fz.j g;
    public final com.amazon.aps.iva.mh.a h;
    public final com.amazon.aps.iva.dh.c i;
    public final com.amazon.aps.iva.rd.f j;
    public final com.amazon.aps.iva.wh.e k;
    public final w l;

    /* compiled from: SignInDelegate.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.application.SignInDelegateImpl", f = "SignInDelegate.kt", l = {MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "onSignIn")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public n h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return n.this.a(this);
        }
    }

    public n(com.amazon.aps.iva.bo.f fVar, com.amazon.aps.iva.z50.b bVar, c cVar, com.amazon.aps.iva.sv.k kVar, ChromecastUserStatusInteractor chromecastUserStatusInteractor, com.amazon.aps.iva.nz.f fVar2, com.amazon.aps.iva.fz.k kVar2, com.amazon.aps.iva.mh.b bVar2, com.amazon.aps.iva.dh.c cVar2, com.amazon.aps.iva.rd.f fVar3, com.amazon.aps.iva.wh.e eVar, z zVar) {
        this.a = fVar;
        this.b = bVar;
        this.c = cVar;
        this.d = kVar;
        this.e = chromecastUserStatusInteractor;
        this.f = fVar2;
        this.g = kVar2;
        this.h = bVar2;
        this.i = cVar2;
        this.j = fVar3;
        this.k = eVar;
        this.l = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.ellation.crunchyroll.application.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.ys.n.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ys.n$a r0 = (com.amazon.aps.iva.ys.n.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ys.n$a r0 = new com.amazon.aps.iva.ys.n$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.ys.n r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L7b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.bo.f r6 = r5.a
            java.lang.String r6 = r6.b()
            com.amazon.aps.iva.z50.a r2 = r5.b
            boolean r4 = r2.b(r6)
            if (r4 == 0) goto L47
            com.amazon.aps.iva.fz.j r4 = r5.g
            r4.k()
        L47:
            r2.a(r6)
            com.amazon.aps.iva.sv.k r6 = r5.d
            r6.onSignIn()
            com.amazon.aps.iva.ys.c r6 = r5.c
            r6.h2()
            com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor r6 = r5.e
            r6.onSignIn()
            com.amazon.aps.iva.nz.f r6 = r5.f
            r6.onSignIn()
            com.amazon.aps.iva.mh.a r6 = r5.h
            r6.onSignIn()
            com.amazon.aps.iva.dh.c r6 = r5.i
            r6.a()
            com.amazon.aps.iva.rd.f r6 = r5.j
            r6.a()
            r0.h = r5
            r0.k = r3
            com.amazon.aps.iva.wh.e r6 = r5.k
            java.lang.Object r6 = r6.W1(r0)
            if (r6 != r1) goto L7a
            return r1
        L7a:
            r0 = r5
        L7b:
            com.amazon.aps.iva.us.w r6 = r0.l
            r6.b()
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ys.n.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
