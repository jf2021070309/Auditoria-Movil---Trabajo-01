package com.amazon.aps.iva.py;

import android.content.Intent;
import com.amazon.aps.iva.ez.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oy.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: InAppUpdatesPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<c> {
    public final com.amazon.aps.iva.oy.b b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;

    /* compiled from: InAppUpdatesPresenter.kt */
    /* renamed from: com.amazon.aps.iva.py.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0627a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oy.a, q> {
        public C0627a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.oy.a aVar) {
            a.q6(a.this, aVar);
            return q.a;
        }
    }

    /* compiled from: InAppUpdatesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            a aVar = a.this;
            a.q6(aVar, (com.amazon.aps.iva.oy.a) aVar.b.q4().d());
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, com.amazon.aps.iva.oy.b bVar, com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(cVar, "view");
        this.b = bVar;
        this.c = aVar;
    }

    public static final void q6(a aVar, com.amazon.aps.iva.oy.a aVar2) {
        boolean a;
        boolean a2;
        boolean a3;
        if (aVar.c.invoke().booleanValue()) {
            boolean z = true;
            if (aVar2 instanceof a.i) {
                a = true;
            } else {
                a = j.a(aVar2, a.b.i);
            }
            if (a) {
                aVar.getView().jg(aVar2);
                aVar.getView().k();
                return;
            } else if (j.a(aVar2, a.C0587a.i)) {
                aVar.getView().Le();
                aVar.getView().f();
                return;
            } else {
                if (j.a(aVar2, a.h.i)) {
                    a2 = true;
                } else {
                    a2 = j.a(aVar2, a.f.i);
                }
                if (a2) {
                    a3 = true;
                } else {
                    a3 = j.a(aVar2, a.c.i);
                }
                if (!a3) {
                    z = j.a(aVar2, a.e.i);
                }
                if (z) {
                    aVar.getView().f();
                    return;
                }
                return;
            }
        }
        aVar.getView().f();
    }

    public final void e6() {
        com.amazon.aps.iva.oy.b bVar = this.b;
        com.amazon.aps.iva.oy.a aVar = (com.amazon.aps.iva.oy.a) bVar.q4().d();
        if (aVar instanceof a.i) {
            bVar.u1((a.i) aVar);
        } else if (aVar instanceof a.b) {
            bVar.s5();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == 0) {
            e6();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().f();
        com.amazon.aps.iva.oy.b bVar = this.b;
        bVar.q4().e(getView(), new com.amazon.aps.iva.py.b(new C0627a()));
        e.a(bVar.n4(), getView(), new b());
    }
}
