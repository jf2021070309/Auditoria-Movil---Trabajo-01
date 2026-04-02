package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzoh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzog zzk;
    private final zzaiv zzl;

    private zzoh(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, zzog zzogVar, zzaiv zzaivVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = zzh(i6);
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = zzi(i8);
        this.zzj = j2;
        this.zzk = zzogVar;
        this.zzl = zzaivVar;
    }

    public zzoh(byte[] bArr, int i2) {
        zzame zzameVar = new zzame(bArr, bArr.length);
        zzameVar.zzd(i2 * 8);
        this.zza = zzameVar.zzh(16);
        this.zzb = zzameVar.zzh(16);
        this.zzc = zzameVar.zzh(24);
        this.zzd = zzameVar.zzh(24);
        int zzh = zzameVar.zzh(20);
        this.zze = zzh;
        this.zzf = zzh(zzh);
        this.zzg = zzameVar.zzh(3) + 1;
        int zzh2 = zzameVar.zzh(5) + 1;
        this.zzh = zzh2;
        this.zzi = zzi(zzh2);
        this.zzj = zzamq.zzL(zzameVar.zzh(4), zzameVar.zzh(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzi(int i2) {
        if (i2 != 8) {
            if (i2 != 12) {
                if (i2 != 16) {
                    if (i2 != 20) {
                        return i2 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static zzaiv zzj(List<String> list, List<zzajc> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] zzu = zzamq.zzu(str, "=");
            if (zzu.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new zzaje(zzu[0], zzu[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzaiv(arrayList);
    }

    public final long zza() {
        long j2 = this.zzj;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.zze;
    }

    public final long zzb(long j2) {
        return zzamq.zzy((j2 * this.zze) / 1000000, 0L, this.zzj - 1);
    }

    public final zzafv zzc(byte[] bArr, zzaiv zzaivVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.zzd;
        if (i2 <= 0) {
            i2 = -1;
        }
        zzaiv zzd = zzd(zzaivVar);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/flac");
        zzaftVar.zzO(i2);
        zzaftVar.zzaa(this.zzg);
        zzaftVar.zzab(this.zze);
        zzaftVar.zzP(Collections.singletonList(bArr));
        zzaftVar.zzL(zzd);
        return zzaftVar.zzah();
    }

    public final zzaiv zzd(zzaiv zzaivVar) {
        zzaiv zzaivVar2 = this.zzl;
        return zzaivVar2 == null ? zzaivVar : zzaivVar2.zzc(zzaivVar);
    }

    public final zzoh zze(zzog zzogVar) {
        return new zzoh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzogVar, this.zzl);
    }

    public final zzoh zzf(List<String> list) {
        return new zzoh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzj(list, Collections.emptyList())));
    }

    public final zzoh zzg(List<zzajc> list) {
        return new zzoh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzj(Collections.emptyList(), list)));
    }
}
