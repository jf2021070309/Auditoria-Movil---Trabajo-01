package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzto implements zztb {
    private final String zza;
    private final zzamf zzb = new zzamf(1024);
    private final zzame zzc;
    private zzox zzd;
    private String zze;
    private zzafv zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzto(String str) {
        this.zza = str;
        byte[] zzi = this.zzb.zzi();
        this.zzc = new zzame(zzi, zzi.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzame zzameVar) throws zzaha {
        int zzb = zzameVar.zzb();
        zzmv zzb2 = zzmx.zzb(zzameVar, true);
        this.zzu = zzb2.zzc;
        this.zzr = zzb2.zza;
        this.zzt = zzb2.zzb;
        return zzb - zzameVar.zzb();
    }

    private static long zzg(zzame zzameVar) {
        return zzameVar.zzh((zzameVar.zzh(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzd = zznxVar.zzB(zzunVar.zzb(), 1);
        this.zze = zzunVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r14.zzl == false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzamf r15) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzd(com.google.android.gms.internal.ads.zzamf):void");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
