package com.amazon.aps.iva.xd0;
/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes4.dex */
public final class h extends com.amazon.aps.iva.xd0.a {
    public final com.amazon.aps.iva.de0.i<i> b;

    /* compiled from: LazyScopeAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<i> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.a<? extends i> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final i invoke() {
            i invoke = this.h.invoke();
            if (invoke instanceof com.amazon.aps.iva.xd0.a) {
                return ((com.amazon.aps.iva.xd0.a) invoke).h();
            }
            return invoke;
        }
    }

    public h(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.xb0.a<? extends i> aVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        this.b = lVar.g(new a(aVar));
    }

    @Override // com.amazon.aps.iva.xd0.a
    public final i i() {
        return this.b.invoke();
    }
}
