package com.amazon.aps.iva.uk;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.presentation.buffering.PlayerBufferingLayout;
/* compiled from: PlayerBufferingPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public final com.amazon.aps.iva.uk.a b;

    /* compiled from: PlayerBufferingPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            j.e(bool2, "isVisible");
            boolean booleanValue = bool2.booleanValue();
            e eVar = e.this;
            if (booleanValue) {
                eVar.getView().k();
            } else {
                eVar.getView().f();
            }
            return q.a;
        }
    }

    /* compiled from: PlayerBufferingPresenter.kt */
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
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public e(PlayerBufferingLayout playerBufferingLayout, c cVar) {
        super(playerBufferingLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.a().e(getView(), new b(new a()));
    }
}
