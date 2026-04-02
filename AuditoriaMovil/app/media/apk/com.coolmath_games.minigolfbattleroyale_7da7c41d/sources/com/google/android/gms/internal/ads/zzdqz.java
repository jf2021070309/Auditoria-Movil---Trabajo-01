package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdqz implements zzfrz<zzcml> {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqz(zzdrh zzdrhVar, String str, Map map) {
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcml zzcmlVar) {
        zzcmlVar.zze(this.zza, this.zzb);
    }
}
