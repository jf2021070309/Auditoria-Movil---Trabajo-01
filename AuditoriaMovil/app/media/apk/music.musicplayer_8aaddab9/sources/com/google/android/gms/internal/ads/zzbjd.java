package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class zzbjd<T> {
    private final int zza;
    private final String zzb;
    private final T zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzbjd(int i2, int i3, String str, T t) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = str;
        zzbet.zzb().zza(this);
    }

    public static zzbjd<Boolean> zzg(int i2, String str, Boolean bool) {
        return new zzbix(i2, str, bool);
    }

    public static zzbjd<Integer> zzh(int i2, String str, int i3) {
        return new zzbiy(1, str, Integer.valueOf(i3));
    }

    public static zzbjd<Long> zzi(int i2, String str, long j2) {
        return new zzbiz(1, str, Long.valueOf(j2));
    }

    public static zzbjd<Float> zzj(int i2, String str, float f2) {
        return new zzbja(1, str, Float.valueOf(f2));
    }

    public static zzbjd<String> zzk(int i2, String str, String str2) {
        return new zzbjb(1, str, str2);
    }

    public static zzbjd<String> zzl(int i2, String str) {
        zzbjd<String> zzk = zzk(1, "gads:sdk_core_constants:experiment_id", null);
        zzbet.zzb().zzb(zzk);
        return zzk;
    }

    public abstract T zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, T t);

    public abstract T zzc(JSONObject jSONObject);

    public abstract T zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final T zzf() {
        return this.zzc;
    }

    public final int zzm() {
        return this.zza;
    }
}
