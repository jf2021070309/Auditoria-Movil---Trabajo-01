package com.google.android.gms.internal.ads;

import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzpl extends zzpq {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzpl(zzox zzoxVar) {
        super(zzoxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zza(zzamf zzamfVar) throws zzpp {
        if (!this.zzc) {
            int zzn = zzamfVar.zzn();
            int i = zzn >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzn >> 2) & 3];
                zzaft zzaftVar = new zzaft();
                zzaftVar.zzN("audio/mpeg");
                zzaftVar.zzaa(1);
                zzaftVar.zzab(i2);
                this.zza.zzs(zzaftVar.zzah());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzaft zzaftVar2 = new zzaft();
                zzaftVar2.zzN(str);
                zzaftVar2.zzaa(1);
                zzaftVar2.zzab(8000);
                this.zza.zzs(zzaftVar2.zzah());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzpp(sb.toString());
            }
            this.zzc = true;
        } else {
            zzamfVar.zzk(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zzb(zzamf zzamfVar, long j) throws zzaha {
        if (this.zze == 2) {
            int zzd = zzamfVar.zzd();
            this.zza.zzy(zzamfVar, zzd);
            this.zza.zzv(j, 1, zzd, 0, null);
            return true;
        }
        int zzn = zzamfVar.zzn();
        if (zzn != 0 || this.zzd) {
            if (this.zze != 10 || zzn == 1) {
                int zzd2 = zzamfVar.zzd();
                this.zza.zzy(zzamfVar, zzd2);
                this.zza.zzv(j, 1, zzd2, 0, null);
                return true;
            }
            return false;
        }
        int zzd3 = zzamfVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzamfVar.zzm(bArr, 0, zzd3);
        zzmv zza = zzmx.zza(bArr);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/mp4a-latm");
        zzaftVar.zzK(zza.zzc);
        zzaftVar.zzaa(zza.zzb);
        zzaftVar.zzab(zza.zza);
        zzaftVar.zzP(Collections.singletonList(bArr));
        this.zza.zzs(zzaftVar.zzah());
        this.zzd = true;
        return false;
    }
}
