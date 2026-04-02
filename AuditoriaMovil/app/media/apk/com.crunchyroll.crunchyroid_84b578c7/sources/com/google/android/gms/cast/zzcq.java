package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzcq extends zzdp {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ c zze;
    final /* synthetic */ RemoteMediaPlayer zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzf = remoteMediaPlayer;
        this.zza = mediaQueueItemArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzf.zzb;
        zzaqVar.zzx(zzb(), this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
