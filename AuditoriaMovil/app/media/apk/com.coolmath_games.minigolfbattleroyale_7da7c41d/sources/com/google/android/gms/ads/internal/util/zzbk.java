package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzbk implements zzwg {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(zzbr zzbrVar, String str, zzbo zzboVar) {
        this.zza = str;
        this.zzb = zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zza(zzwl zzwlVar) {
        String str = this.zza;
        String zzwlVar2 = zzwlVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzwlVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzwlVar2);
        zze.zzi(sb.toString());
        this.zzb.zza((zzbo) null);
    }
}
