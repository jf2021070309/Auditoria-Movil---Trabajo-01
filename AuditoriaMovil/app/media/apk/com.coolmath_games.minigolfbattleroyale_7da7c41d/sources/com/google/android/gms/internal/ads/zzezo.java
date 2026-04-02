package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzezo extends zzfid {
    final /* synthetic */ zzbgt zza;
    final /* synthetic */ zzezq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezo(zzezq zzezqVar, zzbgt zzbgtVar) {
        this.zzb = zzezqVar;
        this.zza = zzbgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfid
    public final void zzu() {
        zzdrw zzdrwVar;
        zzdrwVar = this.zzb.zzf;
        if (zzdrwVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
