package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzgh implements zzgp {
    final /* synthetic */ zzgi zza;

    public zzgh(zzgi zzgiVar) {
        this.zza = zzgiVar;
    }

    @Override // com.google.android.gms.internal.pal.zzgp
    public final Boolean zza(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }
}
