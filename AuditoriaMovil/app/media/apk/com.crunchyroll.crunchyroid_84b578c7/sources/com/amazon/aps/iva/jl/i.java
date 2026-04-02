package com.amazon.aps.iva.jl;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: StreamOverCellularPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<j> implements g {
    public final com.amazon.aps.iva.jl.a b;

    /* compiled from: StreamOverCellularPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "show");
            boolean booleanValue = bool2.booleanValue();
            i iVar = i.this;
            if (booleanValue) {
                iVar.getView().z8(new h(iVar.b));
            } else {
                iVar.getView().dc();
            }
            return q.a;
        }
    }

    /* compiled from: StreamOverCellularPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
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

    public i(InternalPlayerViewLayout internalPlayerViewLayout, com.amazon.aps.iva.jl.a aVar) {
        super(internalPlayerViewLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.o2().e(getView(), new b(new a()));
    }
}
