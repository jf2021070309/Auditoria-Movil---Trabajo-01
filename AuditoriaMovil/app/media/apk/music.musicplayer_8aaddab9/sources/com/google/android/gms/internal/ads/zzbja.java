package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbja extends zzbjd<Float> {
    public zzbja(int i2, String str, Float f2) {
        super(1, str, f2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Float zza(Bundle bundle) {
        String zze = zze();
        if (bundle.containsKey(zze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze) : new String("com.google.android.gms.ads.flag."))) {
            String zze2 = zze();
            return Float.valueOf(bundle.getFloat(zze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Float f2) {
        editor.putFloat(zze(), f2.floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Float zzc(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zze(), zzf().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Float zzd(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zze(), zzf().floatValue()));
    }
}
