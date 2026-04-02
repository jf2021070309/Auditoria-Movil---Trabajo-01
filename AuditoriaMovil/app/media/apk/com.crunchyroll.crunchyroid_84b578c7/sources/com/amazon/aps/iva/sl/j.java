package com.amazon.aps.iva.sl;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ll.o;
import java.util.List;
/* compiled from: QualitySettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.wy.b<k> implements i {
    public final o b;

    /* compiled from: QualitySettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<List<? extends g>, q> {
        public a(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, k.class, "showQualityOptions", "showQualityOptions(Ljava/util/List;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends g> list) {
            List<? extends g> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "p0");
            ((k) this.receiver).gf(list2);
            return q.a;
        }
    }

    /* compiled from: QualitySettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<g, q> {
        public b(com.amazon.aps.iva.wy.h hVar) {
            super(1, hVar, k.class, "selectQualityOption", "selectQualityOption(Lcom/crunchyroll/player/settings/quality/QualitySetting;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g gVar) {
            g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "p0");
            ((k) this.receiver).Yh(gVar2);
            return q.a;
        }
    }

    /* compiled from: QualitySettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
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

    public j(h hVar, o oVar) {
        super(hVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = oVar;
    }

    @Override // com.amazon.aps.iva.sl.i
    public final void c6(g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "videoQuality");
        this.b.l4(gVar);
        getView().O();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        o oVar = this.b;
        oVar.s0().e(getView(), new c(new a(getView())));
        oVar.p().e(getView(), new c(new b(getView())));
    }
}
