package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzaq extends zzbk {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ c zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(RemoteMediaClient remoteMediaClient, int i, long j, c cVar) {
        super(remoteMediaClient, false);
        this.zzd = remoteMediaClient;
        this.zza = i;
        this.zzb = j;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzd.zzd;
        zzaqVar.zzA(zzb(), this.zza, this.zzb, null, 0, null, null, this.zzc);
    }
}
