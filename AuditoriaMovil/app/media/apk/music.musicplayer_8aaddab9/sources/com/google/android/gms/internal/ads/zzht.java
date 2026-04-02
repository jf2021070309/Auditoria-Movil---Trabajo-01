package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzht implements zzhe, zzhd {
    private final zzhe[] zza;
    private zzhd zzd;
    private zzs zze;
    private final zzgs zzh;
    private final ArrayList<zzhe> zzc = new ArrayList<>();
    private zziw zzg = new zzgr(new zziw[0]);
    private final IdentityHashMap<zziu, Integer> zzb = new IdentityHashMap<>();
    private zzhe[] zzf = new zzhe[0];

    public zzht(zzgs zzgsVar, long[] jArr, zzhe[] zzheVarArr, byte... bArr) {
        this.zzh = zzgsVar;
        this.zza = zzheVarArr;
        for (int i2 = 0; i2 < zzheVarArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.zza[i2] = new zzhr(zzheVarArr[i2], j2);
            }
        }
    }

    public final zzhe zza(int i2) {
        zzhe zzheVar;
        zzhe zzheVar2 = this.zza[i2];
        if (zzheVar2 instanceof zzhr) {
            zzheVar = ((zzhr) zzheVar2).zza;
            return zzheVar;
        }
        return zzheVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j2) {
        this.zzd = zzhdVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzhe zzheVar : this.zza) {
            zzheVar.zzb(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzc() throws IOException {
        for (zzhe zzheVar : this.zza) {
            zzheVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final zzs zzd() {
        zzs zzsVar = this.zze;
        Objects.requireNonNull(zzsVar);
        return zzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j2, boolean z) {
        for (zzhe zzheVar : this.zzf) {
            zzheVar.zze(j2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j2) {
        this.zzg.zzf(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        zzhe[] zzheVarArr;
        zzhe[] zzheVarArr2;
        long j2 = -9223372036854775807L;
        for (zzhe zzheVar : this.zzf) {
            long zzg = zzheVar.zzg();
            if (zzg != -9223372036854775807L) {
                if (j2 == -9223372036854775807L) {
                    for (zzhe zzheVar2 : this.zzf) {
                        if (zzheVar2 == zzheVar) {
                            break;
                        } else if (zzheVar2.zzi(zzg) != zzg) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j2 = zzg;
                } else if (zzg != j2) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j2 != -9223372036854775807L && zzheVar.zzi(j2) != j2) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        return this.zzg.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j2) {
        long zzi = this.zzf[0].zzi(j2);
        int i2 = 1;
        while (true) {
            zzhe[] zzheVarArr = this.zzf;
            if (i2 >= zzheVarArr.length) {
                return zzi;
            }
            if (zzheVarArr[i2].zzi(zzi) != zzi) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j2, zzahz zzahzVar) {
        zzhe[] zzheVarArr = this.zzf;
        return (zzheVarArr.length > 0 ? zzheVarArr[0] : this.zza[0]).zzj(j2, zzahzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        return this.zzg.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j2) {
        if (this.zzc.isEmpty()) {
            return this.zzg.zzl(j2);
        }
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zzc.get(i2).zzl(j2);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zzg.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        this.zzc.remove(zzheVar);
        if (this.zzc.isEmpty()) {
            int i2 = 0;
            for (zzhe zzheVar2 : this.zza) {
                i2 += zzheVar2.zzd().zzb;
            }
            zzq[] zzqVarArr = new zzq[i2];
            int i3 = 0;
            for (zzhe zzheVar3 : this.zza) {
                zzs zzd = zzheVar3.zzd();
                int i4 = zzd.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzqVarArr[i3] = zzd.zza(i5);
                    i5++;
                    i3++;
                }
            }
            this.zze = new zzs(zzqVarArr);
            zzhd zzhdVar = this.zzd;
            Objects.requireNonNull(zzhdVar);
            zzhdVar.zzn(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zzhe zzheVar) {
        zzhd zzhdVar = this.zzd;
        Objects.requireNonNull(zzhdVar);
        zzhdVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j2) {
        int length;
        int length2 = zzjgVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzjgVarArr.length;
            if (i2 >= length) {
                break;
            }
            zziu zziuVar = zziuVarArr[i2];
            Integer num = zziuVar == null ? null : this.zzb.get(zziuVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            iArr2[i2] = -1;
            zzjg zzjgVar = zzjgVarArr[i2];
            if (zzjgVar != null) {
                zzq zzb = zzjgVar.zzb();
                int i3 = 0;
                while (true) {
                    zzhe[] zzheVarArr = this.zza;
                    if (i3 >= zzheVarArr.length) {
                        break;
                    } else if (zzheVarArr[i3].zzd().zzb(zzb) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.zzb.clear();
        zziu[] zziuVarArr2 = new zziu[length];
        zziu[] zziuVarArr3 = new zziu[length];
        zzjg[] zzjgVarArr2 = new zzjg[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzjgVarArr.length; i5++) {
                zziuVarArr3[i5] = iArr[i5] == i4 ? zziuVarArr[i5] : null;
                zzjgVarArr2[i5] = iArr2[i5] == i4 ? zzjgVarArr[i5] : null;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            zziu[] zziuVarArr4 = zziuVarArr3;
            zzjg[] zzjgVarArr3 = zzjgVarArr2;
            long zzq = this.zza[i4].zzq(zzjgVarArr2, zArr, zziuVarArr3, zArr2, j3);
            if (i6 == 0) {
                j3 = zzq;
            } else if (zzq != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzjgVarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    zziu zziuVar2 = zziuVarArr4[i7];
                    Objects.requireNonNull(zziuVar2);
                    zziuVarArr2[i7] = zziuVar2;
                    this.zzb.put(zziuVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    zzakt.zzd(zziuVarArr4[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zziuVarArr3 = zziuVarArr4;
            zzjgVarArr2 = zzjgVarArr3;
        }
        System.arraycopy(zziuVarArr2, 0, zziuVarArr, 0, length);
        zzhe[] zzheVarArr2 = (zzhe[]) arrayList.toArray(new zzhe[0]);
        this.zzf = zzheVarArr2;
        this.zzg = new zzgr(zzheVarArr2);
        return j3;
    }
}
