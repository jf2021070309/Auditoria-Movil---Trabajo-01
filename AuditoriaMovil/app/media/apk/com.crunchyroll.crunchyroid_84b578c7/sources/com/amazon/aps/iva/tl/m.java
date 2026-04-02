package com.amazon.aps.iva.tl;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: ReportProblemSettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.wy.b<o> implements l {
    public final boolean b;
    public final com.amazon.aps.iva.vl.b c;
    public final d d;
    public final c e;
    public final com.amazon.aps.iva.dh.c f;
    public com.amazon.aps.iva.vl.a g;

    /* compiled from: ReportProblemSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.vl.a>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends com.amazon.aps.iva.vl.a> list) {
            List<? extends com.amazon.aps.iva.vl.a> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "options");
            m.this.getView().cb(list2);
            return q.a;
        }
    }

    public m(com.amazon.aps.iva.dh.c cVar, b bVar, e eVar, k kVar, com.amazon.aps.iva.vl.b bVar2, boolean z) {
        super(kVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = z;
        this.c = bVar2;
        this.d = eVar;
        this.e = bVar;
        this.f = cVar;
    }

    @Override // com.amazon.aps.iva.tl.l
    public final void A1() {
        if (this.b) {
            getView().Tf();
        } else {
            getView().x();
        }
    }

    @Override // com.amazon.aps.iva.ul.c
    public final void E4(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "problemDescription");
        if (this.b) {
            getView().Tf();
        } else {
            getView().O();
        }
        this.e.a().k(new com.amazon.aps.iva.ez.d<>(n.b));
        this.d.a(getView().ua().getId(), getView().eh(), str);
        this.f.b();
    }

    @Override // com.amazon.aps.iva.tl.l
    public final void M2() {
        if (this.g == null) {
            getView().We();
        }
        com.amazon.aps.iva.vl.a ua = getView().ua();
        this.g = ua;
        if (ua != null) {
            getView().xd(this.c.e(ua));
        }
    }

    @Override // com.amazon.aps.iva.ul.c
    public final boolean a() {
        if (com.amazon.aps.iva.oe0.m.b0(getView().getProblemDescription())) {
            if (this.b) {
                getView().Tf();
            } else {
                getView().x();
            }
            return true;
        }
        getView().ya();
        return false;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.c(new a());
    }
}
