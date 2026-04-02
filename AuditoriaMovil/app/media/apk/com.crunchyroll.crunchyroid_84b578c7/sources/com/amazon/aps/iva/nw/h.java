package com.amazon.aps.iva.nw;

import android.content.Context;
import android.content.DialogInterface;
import com.crunchyroll.crunchyroid.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
/* compiled from: RenewFailureDialog.kt */
/* loaded from: classes2.dex */
public final class h implements j {
    public final Context b;
    public final g c;
    public final i d;

    public h(androidx.fragment.app.h hVar, g gVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "context");
        this.b = hVar;
        this.c = gVar;
        this.d = new i(this);
    }

    @Override // com.amazon.aps.iva.nw.j
    public final void g1(int i, int i2) {
        new MaterialAlertDialogBuilder(this.b).setTitle(i).setMessage(i2).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
    }
}
