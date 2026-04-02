package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzsu implements zztb {
    private final zzame zza;
    private final zzamf zzb;
    private final String zzc;
    private String zzd;
    private zzox zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private zzafv zzk;
    private int zzl;
    private long zzm;

    public zzsu() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzd = zzunVar.zzc();
        this.zze = zznxVar.zzB(zzunVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzamf r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsu.zzd(com.google.android.gms.internal.ads.zzamf):void");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }

    public zzsu(String str) {
        this.zza = new zzame(new byte[16], 16);
        this.zzb = new zzamf(this.zza.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
    }
}
