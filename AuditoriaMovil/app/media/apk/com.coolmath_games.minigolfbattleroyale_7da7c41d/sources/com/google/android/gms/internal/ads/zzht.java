package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzht implements zzhe, zzhd {
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
        for (int i = 0; i < zzheVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzhr(zzheVarArr[i], j);
            }
        }
    }

    public final zzhe zza(int i) {
        zzhe zzheVar;
        zzhe zzheVar2 = this.zza[i];
        if (zzheVar2 instanceof zzhr) {
            zzheVar = ((zzhr) zzheVar2).zza;
            return zzheVar;
        }
        return zzheVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j) {
        this.zzd = zzhdVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzhe zzheVar : this.zza) {
            zzheVar.zzb(this, j);
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
        if (zzsVar != null) {
            return zzsVar;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j, boolean z) {
        for (zzhe zzheVar : this.zzf) {
            zzheVar.zze(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
        this.zzg.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        zzhe[] zzheVarArr;
        zzhe[] zzheVarArr2;
        long j = -9223372036854775807L;
        for (zzhe zzheVar : this.zzf) {
            long zzg = zzheVar.zzg();
            if (zzg != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzhe zzheVar2 : this.zzf) {
                        if (zzheVar2 == zzheVar) {
                            break;
                        } else if (zzheVar2.zzi(zzg) != zzg) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzg;
                } else if (zzg != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzheVar.zzi(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        return this.zzg.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j) {
        long zzi = this.zzf[0].zzi(j);
        int i = 1;
        while (true) {
            zzhe[] zzheVarArr = this.zzf;
            if (i >= zzheVarArr.length) {
                return zzi;
            }
            if (zzheVarArr[i].zzi(zzi) != zzi) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j, zzahz zzahzVar) {
        zzhe[] zzheVarArr = this.zzf;
        return (zzheVarArr.length > 0 ? zzheVarArr[0] : this.zza[0]).zzj(j, zzahzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        return this.zzg.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i = 0; i < size; i++) {
                this.zzc.get(i).zzl(j);
            }
            return false;
        }
        return this.zzg.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zzg.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        this.zzc.remove(zzheVar);
        if (this.zzc.isEmpty()) {
            int i = 0;
            for (zzhe zzheVar2 : this.zza) {
                i += zzheVar2.zzd().zzb;
            }
            zzq[] zzqVarArr = new zzq[i];
            int i2 = 0;
            for (zzhe zzheVar3 : this.zza) {
                zzs zzd = zzheVar3.zzd();
                int i3 = zzd.zzb;
                int i4 = 0;
                while (i4 < i3) {
                    zzqVarArr[i2] = zzd.zza(i4);
                    i4++;
                    i2++;
                }
            }
            this.zze = new zzs(zzqVarArr);
            zzhd zzhdVar = this.zzd;
            if (zzhdVar != null) {
                zzhdVar.zzn(this);
                return;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zzhe zzheVar) {
        zzhd zzhdVar = this.zzd;
        if (zzhdVar != null) {
            zzhdVar.zzp(this);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j) {
        int length;
        ArrayList arrayList;
        int length2 = zzjgVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzjgVarArr.length;
            if (i >= length) {
                break;
            }
            zziu zziuVar = zziuVarArr[i];
            Integer num = zziuVar != null ? this.zzb.get(zziuVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzjg zzjgVar = zzjgVarArr[i];
            if (zzjgVar != null) {
                zzq zzb = zzjgVar.zzb();
                int i2 = 0;
                while (true) {
                    zzhe[] zzheVarArr = this.zza;
                    if (i2 >= zzheVarArr.length) {
                        break;
                    } else if (zzheVarArr[i2].zzd().zzb(zzb) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.zzb.clear();
        zziu[] zziuVarArr2 = new zziu[length];
        zziu[] zziuVarArr3 = new zziu[length];
        zzjg[] zzjgVarArr2 = new zzjg[length];
        ArrayList arrayList2 = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzjgVarArr.length; i4++) {
                zziuVarArr3[i4] = iArr[i4] == i3 ? zziuVarArr[i4] : null;
                zzjgVarArr2[i4] = iArr2[i4] == i3 ? zzjgVarArr[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList3 = arrayList2;
            zziu[] zziuVarArr4 = zziuVarArr3;
            zzjg[] zzjgVarArr3 = zzjgVarArr2;
            long zzq = this.zza[i3].zzq(zzjgVarArr2, zArr, zziuVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zzq;
            } else if (zzq != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzjgVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zziu zziuVar2 = zziuVarArr4[i6];
                    if (zziuVar2 != null) {
                        zziuVarArr2[i6] = zziuVar2;
                        this.zzb.put(zziuVar2, Integer.valueOf(i5));
                        z = true;
                    } else {
                        throw null;
                    }
                } else if (iArr[i6] == i5) {
                    zzakt.zzd(zziuVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList = arrayList3;
                arrayList.add(this.zza[i5]);
            } else {
                arrayList = arrayList3;
            }
            i3 = i5 + 1;
            arrayList2 = arrayList;
            zziuVarArr3 = zziuVarArr4;
            zzjgVarArr2 = zzjgVarArr3;
        }
        System.arraycopy(zziuVarArr2, 0, zziuVarArr, 0, length);
        zzhe[] zzheVarArr2 = (zzhe[]) arrayList2.toArray(new zzhe[0]);
        this.zzf = zzheVarArr2;
        this.zzg = new zzgr(zzheVarArr2);
        return j2;
    }
}
