package androidx.lifecycle;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.e2;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.r0;
/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class c<T> extends com.amazon.aps.iva.i5.u<T> {
    public com.amazon.aps.iva.i5.d<T> m;

    /* compiled from: CoroutineLiveData.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ c<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.m = null;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c(com.amazon.aps.iva.ob0.g gVar, long j, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.i5.s<T>, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        e2 e2Var = new e2((j1) gVar.get(j1.b.b));
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        this.m = new com.amazon.aps.iva.i5.d<>(this, pVar, j, z.i(com.amazon.aps.iva.xe0.k.a.C().plus(gVar).plus(e2Var)), new a(this));
    }

    @Override // com.amazon.aps.iva.i5.u, androidx.lifecycle.LiveData
    public final void g() {
        super.g();
        com.amazon.aps.iva.i5.d<T> dVar = this.m;
        if (dVar != null) {
            c2 c2Var = dVar.g;
            if (c2Var != null) {
                c2Var.a(null);
            }
            dVar.g = null;
            if (dVar.f == null) {
                dVar.f = com.amazon.aps.iva.se0.i.d(dVar.d, null, null, new com.amazon.aps.iva.i5.c(dVar, null), 3);
            }
        }
    }

    @Override // com.amazon.aps.iva.i5.u, androidx.lifecycle.LiveData
    public final void h() {
        super.h();
        com.amazon.aps.iva.i5.d<T> dVar = this.m;
        if (dVar != null) {
            if (dVar.g == null) {
                com.amazon.aps.iva.ye0.c cVar = r0.a;
                dVar.g = com.amazon.aps.iva.se0.i.d(dVar.d, com.amazon.aps.iva.xe0.k.a.C(), null, new com.amazon.aps.iva.i5.b(dVar, null), 2);
                return;
            }
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.kb0.q m(com.amazon.aps.iva.ob0.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.i5.f
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.i5.f r0 = (com.amazon.aps.iva.i5.f) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.i5.f r0 = new com.amazon.aps.iva.i5.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r0 = r0.j
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 != r1) goto L28
            com.amazon.aps.iva.ab.x.i0(r5)
            r5 = 0
            goto L34
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L30:
            com.amazon.aps.iva.ab.x.i0(r5)
            r5 = r4
        L34:
            r5.getClass()
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.c.m(com.amazon.aps.iva.ob0.d):com.amazon.aps.iva.kb0.q");
    }
}
