package com.amazon.aps.iva.ce;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.xw.u0;
import com.amazon.aps.iva.xw.v0;
import com.amazon.aps.iva.xw.w0;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.auth.otpview.OtpTextLayout;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: OtpTextLayout.kt */
/* loaded from: classes.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<androidx.constraintlayout.widget.c, q> {
    public final /* synthetic */ OtpTextLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OtpTextLayout otpTextLayout) {
        super(1);
        this.h = otpTextLayout;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(androidx.constraintlayout.widget.c cVar) {
        androidx.constraintlayout.widget.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$modifyConstraints");
        ConstraintLayout constraintLayout = (ConstraintLayout) this.h.b.c;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.otpTextContainer");
        v0 a = w0.a(constraintLayout);
        ArrayList arrayList = new ArrayList(r.Y(a));
        Iterator<View> it = a.iterator();
        while (true) {
            u0 u0Var = (u0) it;
            if (!u0Var.hasNext()) {
                break;
            }
            arrayList.add(Integer.valueOf(((View) u0Var.next()).getId()));
        }
        int[] W0 = x.W0(arrayList);
        if (W0.length >= 2) {
            cVar2.k(W0[0]).e.W = 1;
            cVar2.h(W0[0], 1, 0, 1, -1);
            for (int i = 1; i < W0.length; i++) {
                int i2 = i - 1;
                cVar2.h(W0[i], 1, W0[i2], 2, -1);
                cVar2.h(W0[i2], 2, W0[i], 1, -1);
            }
            cVar2.h(W0[W0.length - 1], 2, 0, 2, -1);
            return q.a;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }
}
