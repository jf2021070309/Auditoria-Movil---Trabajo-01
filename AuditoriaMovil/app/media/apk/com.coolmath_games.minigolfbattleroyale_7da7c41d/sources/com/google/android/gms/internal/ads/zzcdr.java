package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcdr implements zzfrz<Void> {
    final /* synthetic */ zzfsm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdr(zzcds zzcdsVar, zzfsm zzfsmVar) {
        this.zza = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        List list;
        list = zzcds.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Void r2) {
        List list;
        list = zzcds.zzc;
        list.remove(this.zza);
    }
}
