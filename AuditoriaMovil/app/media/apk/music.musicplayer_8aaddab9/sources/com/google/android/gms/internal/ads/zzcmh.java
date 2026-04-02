package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* loaded from: classes.dex */
public final class zzcmh implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult zza;

    public zzcmh(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.cancel();
    }
}
