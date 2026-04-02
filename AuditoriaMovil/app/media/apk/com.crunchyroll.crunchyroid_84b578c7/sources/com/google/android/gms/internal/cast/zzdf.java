package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.internal.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzdf extends zzdu {
    final /* synthetic */ zzdn zza;

    public zzdf(zzdn zzdnVar) {
        this.zza = zzdnVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdv
    public final void zzb(int i) {
        Logger logger;
        logger = zzdn.zza;
        logger.d("onRemoteDisplayEnded", new Object[0]);
        zzdn.zzf(this.zza);
    }
}
