package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzdc {
    public static final zzdc zza = new zzdc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdc(int i2, int i3, int i4) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzamq.zzP(i4) ? zzamq.zzS(i4, i3) : -1;
    }

    public final String toString() {
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        StringBuilder w = a.w(83, "AudioFormat[sampleRate=", i2, ", channelCount=", i3);
        w.append(", encoding=");
        w.append(i4);
        w.append(']');
        return w.toString();
    }
}
