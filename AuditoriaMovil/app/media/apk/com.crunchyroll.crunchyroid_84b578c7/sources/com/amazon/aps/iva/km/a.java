package com.amazon.aps.iva.km;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CustomizeProfileTooltip.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: CustomizeProfileTooltip.kt */
    /* renamed from: com.amazon.aps.iva.km.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0447a extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0447a h = new C0447a();

        public C0447a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "customize_profile_tooltip");
            return q.a;
        }
    }

    /* compiled from: CustomizeProfileTooltip.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.km.b h;
        public final /* synthetic */ q1<Boolean> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.km.b bVar, q1<Boolean> q1Var) {
            super(1);
            this.h = bVar;
            this.i = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            j.f(bVar, "it");
            this.h.b();
            this.i.setValue(Boolean.FALSE);
            return q.a;
        }
    }

    /* compiled from: CustomizeProfileTooltip.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.km.b h;
        public final /* synthetic */ f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.km.b bVar, f fVar, int i, int i2) {
            super(2);
            this.h = bVar;
            this.i = fVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            a.a(this.h, this.i, iVar, I, this.k);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.km.b r56, com.amazon.aps.iva.a1.f r57, com.amazon.aps.iva.o0.i r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.km.a.a(com.amazon.aps.iva.km.b, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
