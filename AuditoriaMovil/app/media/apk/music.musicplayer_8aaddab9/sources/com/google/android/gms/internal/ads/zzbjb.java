package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbjb extends zzbjd<String> {
    public zzbjb(int i2, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ String zza(Bundle bundle) {
        String zze = zze();
        if (bundle.containsKey(zze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze) : new String("com.google.android.gms.ads.flag."))) {
            String zze2 = zze();
            return bundle.getString(zze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze2) : new String("com.google.android.gms.ads.flag."));
        }
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, String str) {
        editor.putString(zze(), str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ String zzc(JSONObject jSONObject) {
        return jSONObject.optString(zze(), zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ String zzd(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zze(), zzf());
    }
}
