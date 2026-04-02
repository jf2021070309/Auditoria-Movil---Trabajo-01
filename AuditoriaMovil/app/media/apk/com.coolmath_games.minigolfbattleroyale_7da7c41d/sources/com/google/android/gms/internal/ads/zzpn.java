package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzpn implements zznu {
    public static final zzoa zza = zzpm.zza;
    private zznx zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzpl zzp;
    private zzpr zzq;
    private final zzamf zzb = new zzamf(4);
    private final zzamf zzc = new zzamf(9);
    private final zzamf zzd = new zzamf(11);
    private final zzamf zze = new zzamf();
    private final zzpo zzf = new zzpo();
    private int zzh = 1;

    private final zzamf zze(zznv zznvVar) throws IOException {
        if (this.zzm > this.zze.zzj()) {
            zzamf zzamfVar = this.zze;
            int zzj = zzamfVar.zzj();
            zzamfVar.zzb(new byte[Math.max(zzj + zzj, this.zzm)], 0);
        } else {
            this.zze.zzh(0);
        }
        this.zze.zzf(this.zzm);
        ((zznp) zznvVar).zza(this.zze.zzi(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzD(new zzos(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(this.zzb.zzi(), 0, 3, false);
        this.zzb.zzh(0);
        if (this.zzb.zzr() != 4607062) {
            return false;
        }
        zznpVar.zzh(this.zzb.zzi(), 0, 2, false);
        this.zzb.zzh(0);
        if ((this.zzb.zzo() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        zznpVar.zzh(this.zzb.zzi(), 0, 4, false);
        this.zzb.zzh(0);
        int zzv = this.zzb.zzv();
        zznvVar.zzl();
        zznpVar.zzj(zzv, false);
        zznpVar.zzh(this.zzb.zzi(), 0, 4, false);
        this.zzb.zzh(0);
        return this.zzb.zzv() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzg = zznxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r17, com.google.android.gms.internal.ads.zzoq r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpn.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }
}
