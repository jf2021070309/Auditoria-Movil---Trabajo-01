package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbyi implements View.OnClickListener {
    final /* synthetic */ zzbyj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyi(zzbyj zzbyjVar) {
        this.zza = zzbyjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
