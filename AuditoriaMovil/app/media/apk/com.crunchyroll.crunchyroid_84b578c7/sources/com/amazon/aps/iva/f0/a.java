package com.amazon.aps.iva.f0;
/* compiled from: AwaitFirstLayoutModifier.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.s1.m0 {
    public boolean c;
    public com.amazon.aps.iva.ob0.i d;

    /* compiled from: AwaitFirstLayoutModifier.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {35}, m = "waitForFirstLayout")
    /* renamed from: com.amazon.aps.iva.f0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0236a extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.ob0.d h;
        public /* synthetic */ Object i;
        public int k;

        public C0236a(com.amazon.aps.iva.ob0.d<? super C0236a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.this.l(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.f0.a.C0236a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.f0.a$a r0 = (com.amazon.aps.iva.f0.a.C0236a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.f0.a$a r0 = new com.amazon.aps.iva.f0.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.ob0.d r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            boolean r5 = r4.c
            if (r5 != 0) goto L5b
            com.amazon.aps.iva.ob0.i r5 = r4.d
            r0.getClass()
            r0.h = r5
            r0.k = r3
            com.amazon.aps.iva.ob0.i r2 = new com.amazon.aps.iva.ob0.i
            com.amazon.aps.iva.ob0.d r0 = com.amazon.aps.iva.a60.b.s(r0)
            r2.<init>(r0)
            r4.d = r2
            java.lang.Object r0 = r2.a()
            if (r0 != r1) goto L53
            return r1
        L53:
            r0 = r5
        L54:
            if (r0 == 0) goto L5b
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            r0.resumeWith(r5)
        L5b:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f0.a.l(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.s1.m0
    public final void z(androidx.compose.ui.node.o oVar) {
        if (!this.c) {
            this.c = true;
            com.amazon.aps.iva.ob0.i iVar = this.d;
            if (iVar != null) {
                iVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
            this.d = null;
        }
    }
}
