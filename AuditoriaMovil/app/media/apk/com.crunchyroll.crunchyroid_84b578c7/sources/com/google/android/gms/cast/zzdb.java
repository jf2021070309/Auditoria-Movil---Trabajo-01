package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzdb extends zzdp {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ c zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, int i, long j, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = i;
        this.zzb = j;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        if (RemoteMediaPlayer.zza(this.zzd, this.zza) != -1) {
            zzaqVar = this.zzd.zzb;
            zzaqVar.zzA(zzb(), this.zza, this.zzb, null, 0, null, null, this.zzc);
            return;
        }
        setResult((zzdb) new zzdo(this, new Status(0)));
    }
}
