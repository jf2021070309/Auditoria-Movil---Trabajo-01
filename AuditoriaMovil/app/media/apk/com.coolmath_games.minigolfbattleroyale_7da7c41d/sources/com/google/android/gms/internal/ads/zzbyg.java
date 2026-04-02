package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbyg implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyg(zzbyh zzbyhVar) {
        this.zza = zzbyhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzf("Operation denied by user.");
    }
}
