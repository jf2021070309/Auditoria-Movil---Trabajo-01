package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzpr extends zzpq {
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
    public final boolean zza(zzamf zzamfVar) throws zzpp {
        int zzn = zzamfVar.zzn();
        int i2 = zzn >> 4;
        int i3 = zzn & 15;
        if (i3 == 7) {
            this.zzg = i2;
            return i2 != 5;
        }
        throw new zzpp(a.R(39, "Video format not supported: ", i3));
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final boolean zzb(zzamf zzamfVar, long j2) throws zzaha {
        int zzn = zzamfVar.zzn();
        long zzs = (zzamfVar.zzs() * 1000) + j2;
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
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf || i2 != 0) {
                byte[] zzi = this.zzc.zzi();
                zzi[0] = 0;
                zzi[1] = 0;
                zzi[2] = 0;
                int i3 = 4 - this.zzd;
                int i4 = 0;
                while (zzamfVar.zzd() > 0) {
                    zzamfVar.zzm(this.zzc.zzi(), i3, this.zzd);
                    this.zzc.zzh(0);
                    int zzB = this.zzc.zzB();
                    this.zzb.zzh(0);
                    this.zza.zzy(this.zzb, 4);
                    this.zza.zzy(zzamfVar, zzB);
                    i4 = i4 + 4 + zzB;
                }
                this.zza.zzv(zzs, i2, i4, 0, null);
                this.zzf = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
