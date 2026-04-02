package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzcx {
    public final String zza;
    public final Uri zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    @Nullable
    public final zzdd<Context, Boolean> zzi;

    public zzcx(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzcx(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzdd<Context, Boolean> zzddVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcx zza() {
        if (this.zzc.isEmpty()) {
            return new zzcx(null, this.zzb, this.zzc, this.zzd, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzcz<Double> zzb(String str, double d2) {
        return new zzcv(this, str, Double.valueOf(0.0d), true);
    }

    public final zzcz<Long> zzc(String str, long j2) {
        return new zzct(this, str, Long.valueOf(j2), true);
    }

    public final zzcz<Boolean> zzd(String str, boolean z) {
        return new zzcu(this, str, Boolean.valueOf(z), true);
    }

    public final <T> zzcz<T> zze(String str, T t, zzhl zzhlVar) {
        return new zzcw(this, "getTokenRefactor__blocked_packages", t, true, zzhlVar, null);
    }
}
