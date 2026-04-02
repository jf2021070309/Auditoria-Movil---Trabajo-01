package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzbb extends zzbk {
    final /* synthetic */ double zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(RemoteMediaClient remoteMediaClient, double d, c cVar) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = d;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzc.zzd;
        zzaqVar.zzG(zzb(), this.zza, this.zzb);
    }
}
