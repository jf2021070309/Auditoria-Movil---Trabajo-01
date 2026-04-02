package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzdd extends zzdp {
    final /* synthetic */ MediaInfo zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long[] zzd;
    final /* synthetic */ c zze;
    final /* synthetic */ RemoteMediaPlayer zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdd(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, long[] jArr, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzf = remoteMediaPlayer;
        this.zza = mediaInfo;
        this.zzb = z;
        this.zzc = j;
        this.zzd = jArr;
        this.zze = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) {
        Object obj;
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        obj = this.zzf.zza;
        synchronized (obj) {
            zzaqVar = this.zzf.zzb;
            com.google.android.gms.cast.internal.zzas zzb = zzb();
            MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
            builder.setMediaInfo(this.zza);
            builder.setAutoplay(Boolean.valueOf(this.zzb));
            builder.setCurrentTime(this.zzc);
            builder.setActiveTrackIds(this.zzd);
            builder.setCustomData(this.zze);
            zzaqVar.zzp(zzb, builder.build());
        }
    }
}
