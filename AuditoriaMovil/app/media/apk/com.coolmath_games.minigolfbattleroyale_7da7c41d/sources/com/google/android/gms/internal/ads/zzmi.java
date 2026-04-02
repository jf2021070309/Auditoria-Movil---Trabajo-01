package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r9.zza.zzd() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r5 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
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
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r9.zze
            if (r0 != 0) goto Lb
            goto L6d
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
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L58
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzlw r1 = r9.zza
            boolean r1 = r1.zzc()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzlw r1 = r9.zza
            long r3 = r1.zze()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r4 != 0) goto L68
            com.google.android.gms.internal.ads.zzlw r2 = r9.zza
            int r2 = r2.zzd()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            if (r5 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r9.zzg = r0
            r9.zzo(r6)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmi.zzn():void");
    }

    private final void zzo(boolean z) {
        Surface surface;
        if (zzamq.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzmc.zza(surface, f);
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

    public final void zza(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzo(true);
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

    public final void zzf(float f) {
        this.zzi = f;
        zzm();
        zzo(false);
    }

    public final void zzg(float f) {
        this.zzf = f;
        this.zza.zza();
        zzn();
    }

    public final void zzh(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
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
            if (zzmhVar != null) {
                zzmhVar.zzc();
                return;
            }
            throw null;
        }
    }

    public final long zzk(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzc()) {
            long zzf = this.zzq + (((float) (this.zza.zzf() * (this.zzm - this.zzp))) / this.zzi);
            if (Math.abs(j - zzf) <= 20000000) {
                j = zzf;
            } else {
                zzm();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzmh zzmhVar = this.zzc;
        if (zzmhVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j3 = zzmhVar.zza;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.zzk;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j5 = j4 + j5;
            j2 = j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zzl(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.zzk = refreshRate;
            this.zzl = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final void zzb() {
        if (this.zzb != null) {
            zzmh zzmhVar = this.zzc;
            if (zzmhVar != null) {
                zzmhVar.zzb();
                this.zzb.zza(new zzmd(this) { // from class: com.google.android.gms.internal.ads.zzmb
                    private final zzmi zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzmd
                    public final void zza(Display display) {
                        this.zza.zzl(display);
                    }
                });
                return;
            }
            throw null;
        }
    }
}
