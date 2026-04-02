package com.google.android.gms.internal.ads;

import ch.qos.logback.core.util.FileUtil;
import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzqq implements zznu {
    public static final zzoa zza = zzqo.zza;
    private static final zzaju zzb = zzqp.zza;
    private final zzamf zzc;
    private final zzon zzd;
    private final zzoj zze;
    private final zzol zzf;
    private final zzox zzg;
    private zznx zzh;
    private zzox zzi;
    private zzox zzj;
    private int zzk;
    private zzaiv zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzqs zzq;
    private boolean zzr;

    public zzqq() {
        this(0);
    }

    public zzqq(int i2) {
        this.zzc = new zzamf(10);
        this.zzd = new zzon();
        this.zze = new zzoj();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzol();
        zznt zzntVar = new zznt();
        this.zzg = zzntVar;
        this.zzj = zzntVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzf(com.google.android.gms.internal.ads.zznv r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.zzf(com.google.android.gms.internal.ads.zznv):int");
    }

    private final long zzg(long j2) {
        return ((j2 * 1000000) / this.zzd.zzd) + this.zzm;
    }

    private final boolean zzh(zznv zznvVar, boolean z) throws IOException {
        int i2;
        int i3;
        int zzh;
        int i4 = true != z ? 131072 : FileUtil.BUF_SIZE;
        zznvVar.zzl();
        if (zznvVar.zzn() == 0) {
            zzaiv zza2 = this.zzf.zza(zznvVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zza(zza2);
            }
            i3 = (int) zznvVar.zzm();
            if (!z) {
                ((zznp) zznvVar).zzd(i3, false);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (!zzi(zznvVar)) {
                this.zzc.zzh(0);
                int zzv = this.zzc.zzv();
                if ((i2 == 0 || zzk(zzv, i2)) && (zzh = zzoo.zzh(zzv)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzv);
                        i2 = zzv;
                    }
                    ((zznp) zznvVar).zzj(zzh - 4, false);
                } else {
                    int i7 = i6 + 1;
                    if (i6 == i4) {
                        if (z) {
                            return false;
                        }
                        throw zzaha.zzb("Searched too many bytes.", null);
                    }
                    if (z) {
                        zznvVar.zzl();
                        ((zznp) zznvVar).zzj(i3 + i7, false);
                    } else {
                        ((zznp) zznvVar).zzd(1, false);
                    }
                    i6 = i7;
                    i2 = 0;
                    i5 = 0;
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zznp) zznvVar).zzd(i3 + i6, false);
        } else {
            zznvVar.zzl();
        }
        this.zzk = i2;
        return true;
    }

    private final boolean zzi(zznv zznvVar) throws IOException {
        zzqs zzqsVar = this.zzq;
        if (zzqsVar != null) {
            long zzc = zzqsVar.zzc();
            if (zzc != -1 && zznvVar.zzm() > zzc - 4) {
                return true;
            }
        }
        try {
            return !zznvVar.zzh(this.zzc.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final zzqs zzj(zznv zznvVar, boolean z) throws IOException {
        ((zznp) zznvVar).zzh(this.zzc.zzi(), 0, 4, false);
        this.zzc.zzh(0);
        this.zzd.zza(this.zzc.zzv());
        return new zzql(zznvVar.zzo(), zznvVar.zzn(), this.zzd, false);
    }

    private static boolean zzk(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzh(zznvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzh = zznxVar;
        zzox zzB = zznxVar.zzB(0, 1);
        this.zzi = zzB;
        this.zzj = zzB;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzi);
        int i2 = zzamq.zza;
        int zzf = zzf(zznvVar);
        if (zzf == -1 && (this.zzq instanceof zzqm)) {
            if (this.zzq.zzg() != zzg(this.zzn)) {
                zzqm zzqmVar = (zzqm) this.zzq;
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzqs zzqsVar = this.zzq;
        if (zzqsVar instanceof zzqm) {
            zzqm zzqmVar = (zzqm) zzqsVar;
            throw null;
        }
    }

    public final void zze() {
        this.zzr = true;
    }
}
