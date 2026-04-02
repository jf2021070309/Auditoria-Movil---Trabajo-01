package com.amazon.aps.iva.z40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AppForceUpgradePresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<b> {
    public final c b;

    /* compiled from: AppForceUpgradePresenter.kt */
    /* renamed from: com.amazon.aps.iva.z40.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0912a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public C0912a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a.this.getView().T2();
            return q.a;
        }
    }

    public a(com.ellation.crunchyroll.presentation.update.a aVar, c cVar) {
        super(aVar, new j[0]);
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        C0912a c0912a = new C0912a();
        this.b.a(getView(), c0912a);
    }
}
