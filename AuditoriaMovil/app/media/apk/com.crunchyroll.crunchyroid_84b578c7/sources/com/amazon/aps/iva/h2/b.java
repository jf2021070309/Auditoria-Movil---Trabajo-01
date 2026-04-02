package com.amazon.aps.iva.h2;

import android.content.Context;
import android.graphics.Typeface;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.k;
/* compiled from: AndroidFontLoader.android.kt */
/* loaded from: classes.dex */
public final class b implements c0 {
    public final Context a;

    /* compiled from: AndroidFontLoader.android.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {61, 62}, m = "awaitLoad")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public j i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    public b(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.amazon.aps.iva.h2.c0
    public final Typeface a(j jVar) {
        boolean z;
        boolean z2;
        Object obj;
        Typeface typeface;
        boolean z3 = jVar instanceof com.amazon.aps.iva.h2.a;
        Object obj2 = null;
        Context context = this.a;
        if (!z3) {
            if (!(jVar instanceof h0)) {
                return null;
            }
            int a2 = jVar.a();
            boolean z4 = false;
            if (a2 == 0) {
                z = true;
            } else {
                z = false;
            }
            i0 i0Var = i0.a;
            if (z) {
                com.amazon.aps.iva.yb0.j.e(context, "context");
                typeface = i0Var.a(context, (h0) jVar);
            } else {
                if (a2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    try {
                        com.amazon.aps.iva.yb0.j.e(context, "context");
                        obj = i0Var.a(context, (h0) jVar);
                    } catch (Throwable th) {
                        obj = com.amazon.aps.iva.ab.x.H(th);
                    }
                    if (!(obj instanceof k.a)) {
                        obj2 = obj;
                    }
                    typeface = (Typeface) obj2;
                } else {
                    if (a2 == 2) {
                        z4 = true;
                    }
                    if (z4) {
                        throw new UnsupportedOperationException("Unsupported Async font load path");
                    }
                    throw new IllegalArgumentException("Unknown loading type " + ((Object) l1.J(jVar.a())));
                }
            }
            com.amazon.aps.iva.yb0.j.e(context, "context");
            return g0.a(typeface, ((h0) jVar).d, context);
        }
        com.amazon.aps.iva.h2.a aVar = (com.amazon.aps.iva.h2.a) jVar;
        com.amazon.aps.iva.yb0.j.e(context, "context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // com.amazon.aps.iva.h2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.amazon.aps.iva.h2.j r8, com.amazon.aps.iva.ob0.d<? super android.graphics.Typeface> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.h2.b.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.h2.b$a r0 = (com.amazon.aps.iva.h2.b.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.h2.b$a r0 = new com.amazon.aps.iva.h2.b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.amazon.aps.iva.h2.j r8 = r0.i
            com.amazon.aps.iva.h2.b r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L65
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            com.amazon.aps.iva.ab.x.i0(r9)
            return r9
        L3c:
            com.amazon.aps.iva.ab.x.i0(r9)
            boolean r9 = r8 instanceof com.amazon.aps.iva.h2.a
            r2 = 0
            android.content.Context r6 = r7.a
            if (r9 != 0) goto L89
            boolean r9 = r8 instanceof com.amazon.aps.iva.h2.h0
            if (r9 == 0) goto L75
            r9 = r8
            com.amazon.aps.iva.h2.h0 r9 = (com.amazon.aps.iva.h2.h0) r9
            com.amazon.aps.iva.yb0.j.e(r6, r5)
            r0.h = r7
            r0.i = r8
            r0.l = r3
            com.amazon.aps.iva.ye0.b r3 = com.amazon.aps.iva.se0.r0.b
            com.amazon.aps.iva.h2.c r4 = new com.amazon.aps.iva.h2.c
            r4.<init>(r9, r6, r2)
            java.lang.Object r9 = com.amazon.aps.iva.se0.i.g(r0, r3, r4)
            if (r9 != r1) goto L64
            return r1
        L64:
            r0 = r7
        L65:
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9
            com.amazon.aps.iva.h2.h0 r8 = (com.amazon.aps.iva.h2.h0) r8
            com.amazon.aps.iva.h2.x r8 = r8.d
            android.content.Context r0 = r0.a
            com.amazon.aps.iva.yb0.j.e(r0, r5)
            android.graphics.Typeface r8 = com.amazon.aps.iva.h2.g0.a(r9, r8, r0)
            return r8
        L75:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L89:
            com.amazon.aps.iva.h2.a r8 = (com.amazon.aps.iva.h2.a) r8
            r8.getClass()
            com.amazon.aps.iva.yb0.j.e(r6, r5)
            r0.l = r4
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h2.b.c(com.amazon.aps.iva.h2.j, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.h2.c0
    public final void b() {
    }
}
