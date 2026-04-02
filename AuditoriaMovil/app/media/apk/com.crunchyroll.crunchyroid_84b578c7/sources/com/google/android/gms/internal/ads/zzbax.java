package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.ads.internal.client.zzba;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbax {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zzbax(int i, String str, Object obj, zzbaw zzbawVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        zzba.zza().zzd(this);
    }

    public static zzbax zzf(int i, String str, float f) {
        return new zzbau(1, str, Float.valueOf(f));
    }

    public static zzbax zzg(int i, String str, int i2) {
        return new zzbas(1, str, Integer.valueOf(i2));
    }

    public static zzbax zzh(int i, String str, long j) {
        return new zzbat(1, str, Long.valueOf(j));
    }

    public static zzbax zzi(int i, String str, Boolean bool) {
        return new zzbar(i, str, bool);
    }

    public static zzbax zzj(int i, String str, String str2) {
        return new zzbav(1, str, str2);
    }

    public static zzbax zzk(int i, String str) {
        zzbax zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        zzba.zza().zzc(zzj);
        return zzj;
    }

    public abstract Object zza(c cVar);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
