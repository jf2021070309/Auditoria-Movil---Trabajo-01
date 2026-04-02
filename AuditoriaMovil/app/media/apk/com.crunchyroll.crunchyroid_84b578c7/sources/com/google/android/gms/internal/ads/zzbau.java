package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbau extends zzbax {
    public zzbau(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Float.valueOf((float) cVar.optDouble(zzn(), ((Float) zzm()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Float) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zzn(), ((Float) zzm()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(zzn(), ((Float) obj).floatValue());
    }
}
