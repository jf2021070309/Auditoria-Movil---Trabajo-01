package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbiz extends zzbjd<Long> {
    public zzbiz(int i2, String str, Long l2) {
        super(1, str, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Long zza(Bundle bundle) {
        String zze = zze();
        if (bundle.containsKey(zze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze) : new String("com.google.android.gms.ads.flag."))) {
            String zze2 = zze();
            return Long.valueOf(bundle.getLong(zze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Long l2) {
        editor.putLong(zze(), l2.longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Long zzc(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zze(), zzf().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Long zzd(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zze(), zzf().longValue()));
    }
}
