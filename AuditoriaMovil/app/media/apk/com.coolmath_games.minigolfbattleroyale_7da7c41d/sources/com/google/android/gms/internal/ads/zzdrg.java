package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzdrg<T> implements zzbpr<Object> {
    final /* synthetic */ zzdrh zza;
    private final WeakReference<T> zzb;
    private final String zzc;
    private final zzbpr<T> zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdrg(zzdrh zzdrhVar, WeakReference weakReference, String str, zzbpr zzbprVar, zzdre zzdreVar) {
        this.zza = zzdrhVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        T t = this.zzb.get();
        if (t == null) {
            this.zza.zzf(this.zzc, this);
        } else {
            this.zzd.zza(t, map);
        }
    }
}
