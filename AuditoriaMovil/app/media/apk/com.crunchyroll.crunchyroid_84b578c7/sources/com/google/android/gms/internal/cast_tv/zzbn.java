package com.google.android.gms.internal.cast_tv;

import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzbn implements zzx {
    final /* synthetic */ zzbp zza;

    public /* synthetic */ zzbn(zzbp zzbpVar, zzbm zzbmVar) {
        this.zza = zzbpVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzx
    public final void zza(String str, int i, List list, List list2) {
        try {
            zzbp.zzf(this.zza).zzx(str, i, list, list2, null);
        } catch (RemoteException unused) {
        }
    }
}
