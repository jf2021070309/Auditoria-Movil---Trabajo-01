package com.amazon.aps.iva.ez;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.r;
/* compiled from: Resource.kt */
/* loaded from: classes2.dex */
public final class h {

    /* compiled from: Resource.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ g<T> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<T, com.amazon.aps.iva.o0.i, Integer, q> i;
        public final /* synthetic */ r<Throwable, T, com.amazon.aps.iva.o0.i, Integer, q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<T, com.amazon.aps.iva.o0.i, Integer, q> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g<? extends T> gVar, com.amazon.aps.iva.xb0.q<? super T, ? super com.amazon.aps.iva.o0.i, ? super Integer, q> qVar, r<? super Throwable, ? super T, ? super com.amazon.aps.iva.o0.i, ? super Integer, q> rVar, com.amazon.aps.iva.xb0.q<? super T, ? super com.amazon.aps.iva.o0.i, ? super Integer, q> qVar2, int i, int i2) {
            super(2);
            this.h = gVar;
            this.i = qVar;
            this.j = rVar;
            this.k = qVar2;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            h.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void a(com.amazon.aps.iva.ez.g<? extends T> r12, com.amazon.aps.iva.xb0.q<? super T, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r13, com.amazon.aps.iva.xb0.r<? super java.lang.Throwable, ? super T, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r14, com.amazon.aps.iva.xb0.q<? super T, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r15, com.amazon.aps.iva.o0.i r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ez.h.a(com.amazon.aps.iva.ez.g, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.xb0.r, com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static u b(v vVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "transform");
        return d0.b(vVar, new i(null, lVar));
    }

    public static final <T> void c(v<g<T>> vVar, T t) {
        com.amazon.aps.iva.yb0.j.f(vVar, "<this>");
        vVar.k(new g.b(t));
    }

    public static void d(v vVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "<this>");
        vVar.k(new d(new g.b(null)));
    }

    public static final <T> g<T> e(Object obj) {
        Throwable a2 = com.amazon.aps.iva.kb0.k.a(obj);
        if (a2 == null) {
            return new g.c(obj, null);
        }
        return new g.a(null, a2);
    }
}
