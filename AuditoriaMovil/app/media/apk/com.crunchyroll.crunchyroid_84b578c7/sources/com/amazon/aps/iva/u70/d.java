package com.amazon.aps.iva.u70;

import com.amazon.aps.iva.kb0.q;
import com.google.android.material.snackbar.BaseTransientBottomBar;
/* compiled from: ActionSnackbar.kt */
/* loaded from: classes2.dex */
public final class d extends BaseTransientBottomBar.BaseCallback<c> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> a;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> b;

    public d(com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
    public final void onDismissed(c cVar, int i) {
        super.onDismissed(cVar, i);
        if (i == 1) {
            this.a.invoke();
        } else {
            this.b.invoke();
        }
    }
}
