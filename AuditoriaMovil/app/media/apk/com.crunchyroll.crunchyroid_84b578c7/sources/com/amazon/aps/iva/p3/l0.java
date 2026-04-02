package com.amazon.aps.iva.p3;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: ViewGroup.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {119, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l0 extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ne0.j<? super View>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public ViewGroup i;
    public View j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ViewGroup o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ViewGroup viewGroup, com.amazon.aps.iva.ob0.d<? super l0> dVar) {
        super(dVar);
        this.o = viewGroup;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        l0 l0Var = new l0(this.o, dVar);
        l0Var.n = obj;
        return l0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ne0.j<? super View> jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((l0) create(jVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0098 -> B:25:0x009a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a1 -> B:27:0x00a5). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r12.m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r12.l
            int r4 = r12.k
            android.view.ViewGroup r5 = r12.i
            java.lang.Object r6 = r12.n
            com.amazon.aps.iva.ne0.j r6 = (com.amazon.aps.iva.ne0.j) r6
            com.amazon.aps.iva.ab.x.i0(r13)
            r13 = r12
            goto L9a
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            int r1 = r12.l
            int r4 = r12.k
            android.view.View r5 = r12.j
            android.view.ViewGroup r6 = r12.i
            java.lang.Object r7 = r12.n
            com.amazon.aps.iva.ne0.j r7 = (com.amazon.aps.iva.ne0.j) r7
            com.amazon.aps.iva.ab.x.i0(r13)
            r13 = r12
            goto L64
        L35:
            com.amazon.aps.iva.ab.x.i0(r13)
            java.lang.Object r13 = r12.n
            com.amazon.aps.iva.ne0.j r13 = (com.amazon.aps.iva.ne0.j) r13
            android.view.ViewGroup r1 = r12.o
            int r4 = r1.getChildCount()
            r5 = 0
            r6 = r12
        L44:
            if (r5 >= r4) goto Laa
            android.view.View r7 = r1.getChildAt(r5)
            r6.n = r13
            r6.i = r1
            r6.j = r7
            r6.k = r5
            r6.l = r4
            r6.m = r3
            com.amazon.aps.iva.pb0.a r8 = r13.b(r7, r6)
            if (r8 != r0) goto L5d
            return r0
        L5d:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r10
        L64:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto La1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            com.amazon.aps.iva.p3.l0 r8 = new com.amazon.aps.iva.p3.l0
            r9 = 0
            r8.<init>(r5, r9)
            r13.n = r7
            r13.i = r6
            r13.j = r9
            r13.k = r4
            r13.l = r1
            r13.m = r2
            r7.getClass()
            com.amazon.aps.iva.ne0.i r5 = new com.amazon.aps.iva.ne0.i
            r5.<init>()
            com.amazon.aps.iva.ob0.d r8 = com.amazon.aps.iva.a60.b.o(r8, r5, r5)
            r5.e = r8
            java.lang.Object r5 = r7.g(r5, r13)
            com.amazon.aps.iva.pb0.a r8 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            if (r5 != r8) goto L93
            goto L95
        L93:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
        L95:
            if (r5 != r0) goto L98
            return r0
        L98:
            r5 = r6
            r6 = r7
        L9a:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto La5
        La1:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        La5:
            int r4 = r4 + r3
            r10 = r5
            r5 = r4
            r4 = r10
            goto L44
        Laa:
            com.amazon.aps.iva.kb0.q r13 = com.amazon.aps.iva.kb0.q.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p3.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
