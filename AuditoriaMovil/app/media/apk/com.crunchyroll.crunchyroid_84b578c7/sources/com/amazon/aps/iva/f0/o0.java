package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.x0.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: LazySaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class o0 implements com.amazon.aps.iva.x0.i, com.amazon.aps.iva.x0.e {
    public final com.amazon.aps.iva.x0.i a;
    public final y1 b;
    public final LinkedHashSet c;

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, Boolean> {
        public final /* synthetic */ com.amazon.aps.iva.x0.i h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.x0.i iVar) {
            super(1);
            this.h = iVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Object obj) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(obj, "it");
            com.amazon.aps.iva.x0.i iVar = this.h;
            if (iVar != null) {
                z = iVar.a(obj);
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
        public final /* synthetic */ Object i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.i = obj;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            o0 o0Var = o0.this;
            LinkedHashSet linkedHashSet = o0Var.c;
            Object obj = this.i;
            linkedHashSet.remove(obj);
            return new r0(o0Var, obj);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Object i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i) {
            super(2);
            this.i = obj;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            Object obj = this.i;
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.j;
            o0.this.f(obj, pVar, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public o0(com.amazon.aps.iva.x0.i iVar, Map<String, ? extends List<? extends Object>> map) {
        a aVar = new a(iVar);
        q3 q3Var = com.amazon.aps.iva.x0.k.a;
        this.a = new com.amazon.aps.iva.x0.j(map, aVar);
        this.b = com.amazon.aps.iva.cq.b.c0(null);
        this.c = new LinkedHashSet();
    }

    @Override // com.amazon.aps.iva.x0.i
    public final boolean a(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        return this.a.a(obj);
    }

    @Override // com.amazon.aps.iva.x0.i
    public final i.a b(String str, com.amazon.aps.iva.xb0.a<? extends Object> aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        return this.a.b(str, aVar);
    }

    @Override // com.amazon.aps.iva.x0.e
    public final void c(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.x0.e eVar = (com.amazon.aps.iva.x0.e) this.b.getValue();
        if (eVar != null) {
            eVar.c(obj);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.amazon.aps.iva.x0.i
    public final Map<String, List<Object>> d() {
        com.amazon.aps.iva.x0.e eVar = (com.amazon.aps.iva.x0.e) this.b.getValue();
        if (eVar != null) {
            for (Object obj : this.c) {
                eVar.c(obj);
            }
        }
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.x0.i
    public final Object e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        return this.a.e(str);
    }

    @Override // com.amazon.aps.iva.x0.e
    public final void f(Object obj, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(-697180401);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.x0.e eVar = (com.amazon.aps.iva.x0.e) this.b.getValue();
        if (eVar != null) {
            eVar.f(obj, pVar, g, (i & 112) | 520);
            x0.a(obj, new b(obj), g);
            j2 X = g.X();
            if (X != null) {
                X.d = new c(obj, pVar, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
