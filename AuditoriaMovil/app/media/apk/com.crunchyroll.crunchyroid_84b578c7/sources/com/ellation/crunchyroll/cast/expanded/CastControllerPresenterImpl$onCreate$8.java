package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CastControllerPresenterImpl$onCreate$8 extends i implements l<com.amazon.aps.iva.u70.i, q> {
    public CastControllerPresenterImpl$onCreate$8(Object obj) {
        super(1, obj, CastControllerView.class, "showSnackbar", "showSnackbar(Lcom/ellation/widgets/snackbar/MessageSnackbarUiModel;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(com.amazon.aps.iva.u70.i iVar) {
        invoke2(iVar);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.amazon.aps.iva.u70.i iVar) {
        j.f(iVar, "p0");
        ((CastControllerView) this.receiver).showSnackbar(iVar);
    }
}
