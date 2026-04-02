package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzf(com.google.android.gms.internal.ads.zznv r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.zzf(com.google.android.gms.internal.ads.zznv):int");
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final boolean zzh(zznv zznvVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzh;
        int i3 = true != z ? 131072 : 32768;
        zznvVar.zzl();
        if (zznvVar.zzn() == 0) {
            zzaiv zza2 = this.zzf.zza(zznvVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zza(zza2);
            }
            i = (int) zznvVar.zzm();
            if (!z) {
                ((zznp) zznvVar).zzd(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!zzi(zznvVar)) {
                this.zzc.zzh(0);
                int zzv = this.zzc.zzv();
                if ((i2 == 0 || zzk(zzv, i2)) && (zzh = zzoo.zzh(zzv)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzv);
                        i2 = zzv;
                    }
                    ((zznp) zznvVar).zzj(zzh - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw zzaha.zzb("Searched too many bytes.", null);
                    }
                    if (!z) {
                        ((zznp) zznvVar).zzd(1, false);
                    } else {
                        zznvVar.zzl();
                        ((zznp) zznvVar).zzj(i + i6, false);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zznp) zznvVar).zzd(i + i5, false);
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

    private static boolean zzk(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
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
        int i = zzamq.zza;
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
    public final void zzd(long j, long j2) {
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

    public zzqq(int i) {
        this.zzc = new zzamf(10);
        this.zzd = new zzon();
        this.zze = new zzoj();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzol();
        zznt zzntVar = new zznt();
        this.zzg = zzntVar;
        this.zzj = zzntVar;
    }
}
