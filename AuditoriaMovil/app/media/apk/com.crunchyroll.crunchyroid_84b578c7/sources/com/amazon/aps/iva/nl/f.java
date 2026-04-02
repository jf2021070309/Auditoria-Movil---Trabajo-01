package com.amazon.aps.iva.nl;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.e0.e0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
/* compiled from: AudioSettingsList.kt */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: AudioSettingsList.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nl.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AudioSettingsList.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.nl.a> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.nl.a> aVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> lVar) {
            super(1);
            this.h = aVar;
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "$this$LazyColumn");
            com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.nl.a> aVar = this.h;
            e0Var2.a(aVar.size(), new j(aVar, i.h), com.amazon.aps.iva.v0.b.c(-632812321, new k(aVar, this.i), true));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AudioSettingsList.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.nl.a> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.nl.a> aVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> lVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = fVar;
            this.j = lVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            f.a(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.nl.a> aVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        f.a aVar2;
        a aVar3;
        com.amazon.aps.iva.yb0.j.f(aVar, "options");
        com.amazon.aps.iva.o0.j g = iVar.g(-1273026474);
        if ((i2 & 2) != 0) {
            aVar2 = f.a.c;
        } else {
            aVar2 = fVar;
        }
        if ((i2 & 4) != 0) {
            aVar3 = a.h;
        } else {
            aVar3 = lVar;
        }
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.a1.f fVar2 = aVar2;
        com.amazon.aps.iva.e0.b.a(fVar2, null, null, false, null, null, null, false, new b(aVar, aVar3), g, (i >> 3) & 14, 254);
        j2 X = g.X();
        if (X != null) {
            X.d = new c(aVar, aVar2, aVar3, i, i2);
        }
    }
}
