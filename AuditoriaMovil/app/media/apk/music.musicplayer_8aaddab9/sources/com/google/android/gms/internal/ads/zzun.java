package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public final class zzun {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzun(int i2, int i3, int i4) {
        String str;
        if (i2 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i2);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.zza = str;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = Level.ALL_INT;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i2 = this.zzd;
        int i3 = i2 == Integer.MIN_VALUE ? this.zzb : i2 + this.zzc;
        this.zzd = i3;
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i3);
        this.zze = sb.toString();
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}
