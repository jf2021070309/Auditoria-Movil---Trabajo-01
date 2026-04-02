package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzem {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzem(String str, String str2, Bundle bundle, long j2) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j2;
    }

    public static zzem zzb(zzat zzatVar) {
        return new zzem(zzatVar.zza, zzatVar.zzc, zzatVar.zzb.zzc(), zzatVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(obj.length() + String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        a.M(sb, "origin=", str, ",name=", str2);
        return a.r(sb, ",params=", obj);
    }

    public final zzat zza() {
        return new zzat(this.zza, new zzar(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
