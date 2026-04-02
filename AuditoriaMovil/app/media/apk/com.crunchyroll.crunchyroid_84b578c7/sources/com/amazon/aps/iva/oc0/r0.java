package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.xd0.i;
/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes4.dex */
public final class r0<T extends com.amazon.aps.iva.xd0.i> {
    public final e a;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, T> b;
    public final com.amazon.aps.iva.fe0.f c;
    public final com.amazon.aps.iva.de0.i d;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(r0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public static final a e = new a();

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static r0 a(com.amazon.aps.iva.xb0.l lVar, e eVar, com.amazon.aps.iva.de0.l lVar2, com.amazon.aps.iva.fe0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(eVar, "classDescriptor");
            com.amazon.aps.iva.yb0.j.f(lVar2, "storageManager");
            com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefinerForOwnerModule");
            return new r0(eVar, lVar2, lVar, fVar);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<T> {
        public final /* synthetic */ r0<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0<T> r0Var) {
            super(0);
            this.h = r0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            r0<T> r0Var = this.h;
            return r0Var.b.invoke(r0Var.c);
        }
    }

    public r0(e eVar, com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.xb0.l lVar2, com.amazon.aps.iva.fe0.f fVar) {
        this.a = eVar;
        this.b = lVar2;
        this.c = fVar;
        this.d = lVar.g(new b(this));
    }

    public final T a(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        fVar.t(com.amazon.aps.iva.ud0.b.j(this.a));
        return (T) com.amazon.aps.iva.ab.x.T(this.d, f[0]);
    }
}
