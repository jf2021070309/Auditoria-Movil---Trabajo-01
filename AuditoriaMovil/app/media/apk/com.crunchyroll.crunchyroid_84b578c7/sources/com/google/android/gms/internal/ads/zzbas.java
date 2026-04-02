package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbas extends zzbax {
    public zzbas(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Integer.valueOf(cVar.optInt(zzn(), ((Integer) zzm()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Integer) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(zzn(), ((Integer) zzm()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(zzn(), ((Integer) obj).intValue());
    }
}
