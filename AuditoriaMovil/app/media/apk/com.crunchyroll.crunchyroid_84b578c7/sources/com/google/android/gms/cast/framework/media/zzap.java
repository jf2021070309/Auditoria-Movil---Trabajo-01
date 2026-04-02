package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzap extends zzbk {
    final /* synthetic */ int zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(RemoteMediaClient remoteMediaClient, int i, c cVar) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = i;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        int i = this.zza;
        zzaqVar = this.zzc.zzd;
        zzaqVar.zzy(zzb(), new int[]{i}, this.zzb);
    }
}
