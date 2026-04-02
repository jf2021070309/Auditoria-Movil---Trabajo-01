package com.amazon.aps.iva.dv;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.q;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.v0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: CrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.r70.a {
    public static final /* synthetic */ int g = 0;
    public final q b;
    public final com.amazon.aps.iva.fv.a c;
    public a d;
    public final v0 e;
    public final i0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, q qVar, com.amazon.aps.iva.fv.a aVar) {
        super(new ComposeView(context, null, 6));
        com.amazon.aps.iva.yb0.j.f(qVar, "touchHelper");
        com.amazon.aps.iva.yb0.j.f(aVar, "reorderListener");
        this.b = qVar;
        this.c = aVar;
        v0 e = x.e(Boolean.FALSE);
        this.e = e;
        this.f = com.amazon.aps.iva.dg.b.h(e);
    }

    @Override // com.amazon.aps.iva.r70.a
    public final void G4() {
        this.e.setValue(Boolean.TRUE);
    }

    public final void H6(a aVar, com.amazon.aps.iva.v0.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar2, FirebaseAnalytics.Param.CONTENT);
        this.d = aVar;
        View view = this.itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        ((ComposeView) view).setContent(com.amazon.aps.iva.v0.b.c(984630308, new i(aVar2, this), true));
    }

    @Override // com.amazon.aps.iva.r70.a
    public final void U2() {
        super.U2();
        a aVar = this.d;
        if (aVar != null) {
            this.c.w6(aVar, getBindingAdapterPosition());
        }
    }

    @Override // com.amazon.aps.iva.r70.a
    public final void b1() {
        this.e.setValue(Boolean.FALSE);
    }
}
