package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Collections;
/* loaded from: classes.dex */
public final class zzpl extends zzpq {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzpl(zzox zzoxVar) {
        super(zzoxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final boolean zza(zzamf zzamfVar) throws zzpp {
        if (this.zzc) {
            zzamfVar.zzk(1);
        } else {
            int zzn = zzamfVar.zzn();
            int i2 = zzn >> 4;
            this.zze = i2;
            if (i2 == 2) {
                int i3 = zzb[(zzn >> 2) & 3];
                zzaft zzaftVar = new zzaft();
                zzaftVar.zzN("audio/mpeg");
                zzaftVar.zzaa(1);
                zzaftVar.zzab(i3);
                this.zza.zzs(zzaftVar.zzah());
                this.zzd = true;
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzaft zzaftVar2 = new zzaft();
                zzaftVar2.zzN(str);
                zzaftVar2.zzaa(1);
                zzaftVar2.zzab(8000);
                this.zza.zzs(zzaftVar2.zzah());
                this.zzd = true;
            } else if (i2 != 10) {
                throw new zzpp(a.R(39, "Audio format not supported: ", i2));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final boolean zzb(zzamf zzamfVar, long j2) throws zzaha {
        if (this.zze == 2) {
            int zzd = zzamfVar.zzd();
            this.zza.zzy(zzamfVar, zzd);
            this.zza.zzv(j2, 1, zzd, 0, null);
            return true;
        }
        int zzn = zzamfVar.zzn();
        if (zzn != 0 || this.zzd) {
            if (this.zze != 10 || zzn == 1) {
                int zzd2 = zzamfVar.zzd();
                this.zza.zzy(zzamfVar, zzd2);
                this.zza.zzv(j2, 1, zzd2, 0, null);
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
