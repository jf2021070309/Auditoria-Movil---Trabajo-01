package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzmi {
    private final zzlw zza = new zzlw();
    private final zzme zzb;
    private final zzmh zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzmi(Context context) {
        zzme zzmeVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            zzmeVar = zzamq.zza >= 17 ? zzmg.zzc(applicationContext) : null;
            if (zzmeVar == null) {
                zzmeVar = zzmf.zzc(applicationContext);
            }
        } else {
            zzmeVar = null;
        }
        this.zzb = zzmeVar;
        this.zzc = zzmeVar != null ? zzmh.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    private final void zzm() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.zzg) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r9.zza.zzd() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzn() {
        /*
            r9 = this;
            int r0 = com.google.android.gms.internal.ads.zzamq.zza
            r1 = 30
            if (r0 < r1) goto L6f
            android.view.Surface r0 = r9.zze
            if (r0 != 0) goto Lb
            goto L6f
        Lb:
            com.google.android.gms.internal.ads.zzlw r0 = r9.zza
            boolean r0 = r0.zzc()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzlw r0 = r9.zza
            float r0 = r0.zzg()
            goto L1c
        L1a:
            float r0 = r9.zzf
        L1c:
            float r2 = r9.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = 0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzlw r1 = r9.zza
            boolean r1 = r1.zzc()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzlw r1 = r9.zza
            long r5 = r1.zze()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L65
            goto L66
        L58:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            com.google.android.gms.internal.ads.zzlw r2 = r9.zza
            int r2 = r2.zzd()
            if (r2 < r1) goto L65
            goto L66
        L65:
            r3 = 0
        L66:
            if (r3 == 0) goto L69
            goto L6a
        L69:
            return
        L6a:
            r9.zzg = r0
            r9.zzo(r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmi.zzn():void");
    }

    private final void zzo(boolean z) {
        Surface surface;
        if (zzamq.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f2 = 0.0f;
        if (this.zzd) {
            float f3 = this.zzg;
            if (f3 != -1.0f) {
                f2 = this.zzi * f3;
            }
        }
        if (z || this.zzh != f2) {
            this.zzh = f2;
            zzmc.zza(surface, f2);
        }
    }

    private final void zzp() {
        Surface surface;
        if (zzamq.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzmc.zza(surface, 0.0f);
    }

    public final void zza(int i2) {
        if (this.zzj == i2) {
            return;
        }
        this.zzj = i2;
        zzo(true);
    }

    public final void zzb() {
        if (this.zzb != null) {
            zzmh zzmhVar = this.zzc;
            Objects.requireNonNull(zzmhVar);
            zzmhVar.zzb();
            this.zzb.zza(new zzmd(this) { // from class: com.google.android.gms.internal.ads.zzmb
                private final zzmi zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzmd
                public final void zza(Display display) {
                    this.zza.zzl(display);
                }
            });
        }
    }

    public final void zzc() {
        this.zzd = true;
        zzm();
        zzo(false);
    }

    public final void zzd(Surface surface) {
        if (true == (surface instanceof zzlu)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzp();
        this.zze = surface;
        zzo(true);
    }

    public final void zze() {
        zzm();
    }

    public final void zzf(float f2) {
        this.zzi = f2;
        zzm();
        zzo(false);
    }

    public final void zzg(float f2) {
        this.zzf = f2;
        this.zza.zza();
        zzn();
    }

    public final void zzh(long j2) {
        long j3 = this.zzn;
        if (j3 != -1) {
            this.zzp = j3;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zzb(j2 * 1000);
        zzn();
    }

    public final void zzi() {
        this.zzd = false;
        zzp();
    }

    public final void zzj() {
        zzme zzmeVar = this.zzb;
        if (zzmeVar != null) {
            zzmeVar.zzb();
            zzmh zzmhVar = this.zzc;
            Objects.requireNonNull(zzmhVar);
            zzmhVar.zzc();
        }
    }

    public final long zzk(long j2) {
        long j3;
        if (this.zzp != -1 && this.zza.zzc()) {
            long zzf = this.zzq + (((float) ((this.zzm - this.zzp) * this.zza.zzf())) / this.zzi);
            if (Math.abs(j2 - zzf) <= 20000000) {
                j2 = zzf;
            } else {
                zzm();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j2;
        zzmh zzmhVar = this.zzc;
        if (zzmhVar == null || this.zzk == -9223372036854775807L) {
            return j2;
        }
        long j4 = zzmhVar.zza;
        if (j4 == -9223372036854775807L) {
            return j2;
        }
        long j5 = this.zzk;
        long j6 = (((j2 - j4) / j5) * j5) + j4;
        if (j2 <= j6) {
            j3 = j6 - j5;
        } else {
            j3 = j6;
            j6 = j5 + j6;
        }
        if (j6 - j2 >= j2 - j3) {
            j6 = j3;
        }
        return j6 - this.zzl;
    }

    public final /* bridge */ /* synthetic */ void zzl(Display display) {
        if (display == null) {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.zzk = -9223372036854775807L;
            this.zzl = -9223372036854775807L;
            return;
        }
        double refreshRate = display.getRefreshRate();
        Double.isNaN(refreshRate);
        long j2 = (long) (1.0E9d / refreshRate);
        this.zzk = j2;
        this.zzl = (j2 * 80) / 100;
    }
}
