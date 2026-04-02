package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzpr extends zzpq {
    private final zzamf zzb;
    private final zzamf zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzpr(zzox zzoxVar) {
        super(zzoxVar);
        this.zzb = new zzamf(zzalw.zza);
        this.zzc = new zzamf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zza(zzamf zzamfVar) throws zzpp {
        int zzn = zzamfVar.zzn();
        int i = zzn >> 4;
        int i2 = zzn & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzpp(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zzb(zzamf zzamfVar, long j) throws zzaha {
        int zzn = zzamfVar.zzn();
        long zzs = j + (zzamfVar.zzs() * 1000);
        if (zzn == 0) {
            if (!this.zze) {
                zzamf zzamfVar2 = new zzamf(new byte[zzamfVar.zzd()]);
                zzamfVar.zzm(zzamfVar2.zzi(), 0, zzamfVar.zzd());
                zzne zza = zzne.zza(zzamfVar2);
                this.zzd = zza.zzb;
                zzaft zzaftVar = new zzaft();
                zzaftVar.zzN("video/avc");
                zzaftVar.zzK(zza.zzf);
                zzaftVar.zzS(zza.zzc);
                zzaftVar.zzT(zza.zzd);
                zzaftVar.zzW(zza.zze);
                zzaftVar.zzP(zza.zza);
                this.zza.zzs(zzaftVar.zzah());
                this.zze = true;
                return false;
            }
        } else if (zzn == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (this.zzf || i != 0) {
                byte[] zzi = this.zzc.zzi();
                zzi[0] = 0;
                zzi[1] = 0;
                zzi[2] = 0;
                int i2 = 4 - this.zzd;
                int i3 = 0;
                while (zzamfVar.zzd() > 0) {
                    zzamfVar.zzm(this.zzc.zzi(), i2, this.zzd);
                    this.zzc.zzh(0);
                    int zzB = this.zzc.zzB();
                    this.zzb.zzh(0);
                    this.zza.zzy(this.zzb, 4);
                    this.zza.zzy(zzamfVar, zzB);
                    i3 = i3 + 4 + zzB;
                }
                this.zza.zzv(zzs, i, i3, 0, null);
                this.zzf = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
