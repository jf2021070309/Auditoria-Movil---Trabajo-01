package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes.dex */
public final class zzcmf implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult zza;

    public zzcmf(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.confirm();
    }
}
