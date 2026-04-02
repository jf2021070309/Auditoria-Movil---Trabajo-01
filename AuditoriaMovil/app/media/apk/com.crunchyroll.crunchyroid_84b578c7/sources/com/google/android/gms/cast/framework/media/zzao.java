package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzao extends zzbk {
    final /* synthetic */ int zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(RemoteMediaClient remoteMediaClient, int i, c cVar) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = i;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzc.zzd;
        zzaqVar.zzA(zzb(), 0, -1L, null, 0, null, Integer.valueOf(this.zza), this.zzb);
    }
}
