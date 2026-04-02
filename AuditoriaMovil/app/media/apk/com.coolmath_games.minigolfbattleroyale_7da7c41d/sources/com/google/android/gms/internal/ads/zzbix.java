package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbix extends zzbjd<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbix(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Boolean zza(Bundle bundle) {
        String zze = zze();
        if (bundle.containsKey(zze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze) : new String("com.google.android.gms.ads.flag."))) {
            String zze2 = zze();
            return Boolean.valueOf(bundle.getBoolean(zze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(zze(), bool.booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Boolean zzc(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(zze(), zzf().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Boolean zzd(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zze(), zzf().booleanValue()));
    }
}
