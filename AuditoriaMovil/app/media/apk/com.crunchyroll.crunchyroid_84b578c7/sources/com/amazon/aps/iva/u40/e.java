package com.amazon.aps.iva.u40;

import com.amazon.aps.iva.js.e;
import com.amazon.aps.iva.kb0.q;
/* compiled from: SignInPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, q> {
    public final /* synthetic */ g h;

    /* compiled from: SignInPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.SIGNED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.OWNERSHIP_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(k kVar) {
        k kVar2 = kVar;
        com.amazon.aps.iva.yb0.j.f(kVar2, "signInState");
        int i = a.a[kVar2.ordinal()];
        g gVar = this.h;
        if (i != 1) {
            if (i == 2) {
                g.s6(gVar).b();
                ((l) gVar.getView()).U1();
            }
        } else {
            gVar.h.i(e.a.a, ((l) gVar.getView()).t1(), null);
            ((com.amazon.aps.iva.t40.e) gVar.getView()).U1();
            ((l) gVar.getView()).f0();
            ((l) gVar.getView()).closeScreen();
        }
        return q.a;
    }
}
