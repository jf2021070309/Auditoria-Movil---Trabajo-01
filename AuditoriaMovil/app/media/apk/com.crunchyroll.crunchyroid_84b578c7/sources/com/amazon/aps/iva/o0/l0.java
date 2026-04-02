package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.e0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public final class l0 {

    /* compiled from: CompositionLocal.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ h2<?>[] h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<i, Integer, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h2<?>[] h2VarArr, com.amazon.aps.iva.xb0.p<? super i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i) {
            super(2);
            this.h = h2VarArr;
            this.i = pVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            num.intValue();
            h2<?>[] h2VarArr = this.h;
            h2[] h2VarArr2 = (h2[]) Arrays.copyOf(h2VarArr, h2VarArr.length);
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            l0.a(h2VarArr2, this.i, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(h2<?>[] h2VarArr, com.amazon.aps.iva.xb0.p<? super i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(h2VarArr, "values");
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        j g = iVar.g(-1390796515);
        e0.b bVar = e0.a;
        g.A0(h2VarArr);
        pVar.invoke(g, Integer.valueOf((i >> 3) & 14));
        g.W();
        j2 X = g.X();
        if (X != null) {
            X.d = new a(h2VarArr, pVar, i);
        }
    }

    public static w0 b(com.amazon.aps.iva.xb0.a aVar) {
        s3 s3Var = s3.a;
        com.amazon.aps.iva.yb0.j.f(aVar, "defaultFactory");
        return new w0(s3Var, aVar);
    }

    public static final q3 c(com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "defaultFactory");
        return new q3(aVar);
    }
}
