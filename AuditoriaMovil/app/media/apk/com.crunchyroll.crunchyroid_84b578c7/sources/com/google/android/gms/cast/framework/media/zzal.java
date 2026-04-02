package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzal extends zzbk {
    final /* synthetic */ c zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(RemoteMediaClient remoteMediaClient, boolean z, c cVar) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzb.zzd;
        zzaqVar.zzA(zzb(), 0, -1L, null, 0, Boolean.TRUE, null, this.zza);
    }
}
