package com.amazon.aps.iva.el;

import android.content.DialogInterface;
import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

    public /* synthetic */ c(int i, com.amazon.aps.iva.xb0.a aVar) {
        this.b = i;
        this.c = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        com.amazon.aps.iva.xb0.a aVar = this.c;
        switch (i2) {
            case 0:
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = InternalPlayerViewLayout.P;
                com.amazon.aps.iva.yb0.j.f(aVar, "$onPositiveButtonClick");
                aVar.invoke();
                return;
            default:
                int i3 = com.amazon.aps.iva.du.e.e;
                com.amazon.aps.iva.yb0.j.f(aVar, "$onDeleteClick");
                aVar.invoke();
                return;
        }
    }
}
