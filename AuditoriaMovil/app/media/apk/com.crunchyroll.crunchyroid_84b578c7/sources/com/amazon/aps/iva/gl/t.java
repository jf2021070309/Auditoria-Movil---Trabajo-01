package com.amazon.aps.iva.gl;

import androidx.lifecycle.LiveData;
/* compiled from: PlayerTapToSeekPresenter.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.wy.b<u> {
    public final v b;
    public final LiveData<com.amazon.aps.iva.nk.j> c;

    /* compiled from: PlayerTapToSeekPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nk.j jVar) {
            boolean z = jVar.m.b;
            t tVar = t.this;
            if (z) {
                tVar.getView().wc();
            } else {
                tVar.getView().d8();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerTapToSeekPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            t tVar = t.this;
            if (booleanValue) {
                tVar.getView().e0();
                tVar.getView().N9();
            } else {
                tVar.getView().c2();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerTapToSeekPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, LiveData liveData, u uVar) {
        super(uVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(uVar, "view");
        this.b = wVar;
        this.c = liveData;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        c cVar = new c(new a());
        this.c.e(getView(), cVar);
        com.amazon.aps.iva.ez.e.a(this.b.l1(), getView(), new b());
    }
}
