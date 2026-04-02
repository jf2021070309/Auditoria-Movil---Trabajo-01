package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwl;
/* loaded from: classes.dex */
public final class zzbk implements zzwg {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbo zzb;

    public zzbk(zzbr zzbrVar, String str, zzbo zzboVar) {
        this.zza = str;
        this.zzb = zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zza(zzwl zzwlVar) {
        String str = this.zza;
        String exc = zzwlVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        zzcgt.zzi(sb.toString());
        this.zzb.zza((zzbo) null);
    }
}
