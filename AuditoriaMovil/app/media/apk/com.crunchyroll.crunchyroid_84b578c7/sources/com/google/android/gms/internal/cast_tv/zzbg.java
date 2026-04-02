package com.google.android.gms.internal.cast_tv;

import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbg extends zzk {
    final /* synthetic */ String zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ zzbp zzc;

    public zzbg(zzbp zzbpVar, String str, c cVar) {
        this.zzc = zzbpVar;
        this.zza = str;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzl
    public final zzbr zze() {
        this.zzc.zzn(this.zza, this.zzb, null);
        return new zzbr(null);
    }
}
