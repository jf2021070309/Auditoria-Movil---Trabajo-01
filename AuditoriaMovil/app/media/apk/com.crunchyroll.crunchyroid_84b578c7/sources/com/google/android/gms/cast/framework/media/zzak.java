package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzak extends zzbk {
    final /* synthetic */ int[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ c zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(RemoteMediaClient remoteMediaClient, int[] iArr, int i, c cVar) {
        super(remoteMediaClient, false);
        this.zzd = remoteMediaClient;
        this.zza = iArr;
        this.zzb = i;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzd.zzd;
        zzaqVar.zzz(zzb(), this.zza, this.zzb, this.zzc);
    }
}
