package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes.dex */
public final class zzcmd implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsResult zza;

    public zzcmd(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
