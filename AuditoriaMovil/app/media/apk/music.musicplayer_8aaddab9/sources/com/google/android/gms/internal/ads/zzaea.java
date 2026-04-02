package com.google.android.gms.internal.ads;

import android.util.Log;
import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public final class zzaea implements zzafy {
    private final zzko zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private int zzg;
    private boolean zzh;

    public zzaea() {
        zzko zzkoVar = new zzko(true, 65536);
        zzk(2500, 0, "bufferForPlaybackMs", "0");
        zzk(Level.TRACE_INT, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzk(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzk(50000, Level.TRACE_INT, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(50000, 50000, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", "0");
        this.zza = zzkoVar;
        this.zzb = zzadx.zzb(50000L);
        this.zzc = zzadx.zzb(50000L);
        this.zzd = zzadx.zzb(2500L);
        this.zze = zzadx.zzb(5000L);
        this.zzg = 13107200;
        this.zzf = zzadx.zzb(0L);
    }

    private final void zzj(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zza();
        }
    }

    private static void zzk(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        zzakt.zzb(z, sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zza() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzb() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzf(long j2, long j3, float f2) {
        int zzg = this.zza.zzg();
        int i2 = this.zzg;
        long j4 = this.zzb;
        if (f2 > 1.0f) {
            j4 = Math.min(zzamq.zzJ(j4, f2), this.zzc);
        }
        if (j3 < Math.max(j4, 500000L)) {
            boolean z = zzg < i2;
            this.zzh = z;
            if (!z && j3 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.zzc || zzg >= i2) {
            this.zzh = false;
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzg(long j2, float f2, boolean z, long j3) {
        long zzK = zzamq.zzK(j2, f2);
        long j4 = z ? this.zze : this.zzd;
        if (j3 != -9223372036854775807L) {
            j4 = Math.min(j3 / 2, j4);
        }
        return j4 <= 0 || zzK >= j4 || this.zza.zzg() >= this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzko zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzi(zzahv[] zzahvVarArr, zzs zzsVar, zzjg[] zzjgVarArr) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= 2) {
                int max = Math.max(13107200, i3);
                this.zzg = max;
                this.zza.zzb(max);
                return;
            }
            if (zzjgVarArr[i2] != null) {
                i3 += zzahvVarArr[i2].zzac() != 1 ? 131072000 : 13107200;
            }
            i2++;
        }
    }
}
