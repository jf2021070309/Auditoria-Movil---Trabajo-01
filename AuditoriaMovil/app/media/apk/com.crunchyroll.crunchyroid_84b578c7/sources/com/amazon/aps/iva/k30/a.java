package com.amazon.aps.iva.k30;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.l40.b1;
import com.amazon.aps.iva.o30.c;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
/* compiled from: ScreenPolicyChangePresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<b> {
    public final PolicyChangeMonitor b;
    public final c c;

    /* compiled from: ScreenPolicyChangePresenter.kt */
    /* renamed from: com.amazon.aps.iva.k30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0430a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public C0430a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a aVar = a.this;
            aVar.getClass();
            aVar.c.d();
            return q.a;
        }
    }

    public a(PolicyChangeMonitor policyChangeMonitor, b1 b1Var, b bVar) {
        super(bVar, new j[0]);
        this.b = policyChangeMonitor;
        this.c = b1Var;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        C0430a c0430a = new C0430a();
        this.b.observePolicyChange(getView(), c0430a);
    }
}
