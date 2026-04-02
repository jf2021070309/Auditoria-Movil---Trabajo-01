package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzda extends zzdp {
    final /* synthetic */ int zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ RemoteMediaPlayer zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, int i, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzc = remoteMediaPlayer;
        this.zza = i;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        if (RemoteMediaPlayer.zza(this.zzc, this.zza) != -1) {
            zzaqVar = this.zzc.zzb;
            zzaqVar.zzy(zzb(), new int[]{this.zza}, this.zzb);
            return;
        }
        setResult((zzda) new zzdo(this, new Status(0)));
    }
}
