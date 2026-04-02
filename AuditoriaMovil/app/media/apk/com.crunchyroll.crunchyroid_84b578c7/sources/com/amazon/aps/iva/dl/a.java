package com.amazon.aps.iva.dl;

import com.amazon.aps.iva.el.c0;
import com.amazon.aps.iva.el.e0;
import com.amazon.aps.iva.ez.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ControlsVisibilityPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.dl.b> {
    public final c b;
    public final e0 c;

    /* compiled from: ControlsVisibilityPresenter.kt */
    /* renamed from: com.amazon.aps.iva.dl.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0199a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public C0199a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a.this.b.x8();
            return q.a;
        }
    }

    /* compiled from: ControlsVisibilityPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$observeEvent");
            boolean isVisible = c0Var2.isVisible();
            a aVar = a.this;
            if (isVisible) {
                aVar.getView().c9();
            } else {
                aVar.getView().e0();
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.dl.b bVar, d dVar, com.amazon.aps.iva.gl.c cVar) {
        super(bVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(bVar, "view");
        this.b = dVar;
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        e.a(this.b.R0(), getView(), new b());
    }

    public final boolean q6(Integer num, com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        boolean z;
        c0 c0Var;
        j.f(aVar, "handleChildClick");
        if (num != null && num.intValue() == 1) {
            c cVar = this.b;
            com.amazon.aps.iva.ez.d dVar = (com.amazon.aps.iva.ez.d) cVar.R0().d();
            if (dVar != null && (c0Var = (c0) dVar.b) != null && c0Var.isVisible()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Boolean invoke = aVar.invoke();
                if (invoke.booleanValue()) {
                    cVar.x8();
                } else {
                    cVar.e0();
                }
                return invoke.booleanValue();
            } else if (aVar.invoke().booleanValue()) {
                return true;
            } else {
                this.c.d(new C0199a());
                return false;
            }
        }
        aVar.invoke();
        return true;
    }
}
