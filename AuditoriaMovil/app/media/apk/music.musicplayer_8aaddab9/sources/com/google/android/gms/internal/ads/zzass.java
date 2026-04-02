package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
/* loaded from: classes.dex */
public final class zzass implements zzasp, zzaso {
    public final zzasp[] zza;
    private final IdentityHashMap<zzatb, Integer> zzb = new IdentityHashMap<>();
    private zzaso zzc;
    private int zzd;
    private zzatg zze;
    private zzasp[] zzf;
    private zzatd zzg;

    public zzass(zzasp... zzaspVarArr) {
        this.zza = zzaspVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzB(zzatk[] zzatkVarArr, boolean[] zArr, zzatb[] zzatbVarArr, boolean[] zArr2, long j2) {
        int length;
        zzatb[] zzatbVarArr2 = zzatbVarArr;
        int length2 = zzatkVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzatkVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzatb zzatbVar = zzatbVarArr2[i2];
            iArr[i2] = zzatbVar == null ? -1 : this.zzb.get(zzatbVar).intValue();
            iArr2[i2] = -1;
            zzatk zzatkVar = zzatkVarArr[i2];
            if (zzatkVar != null) {
                zzatf zza = zzatkVar.zza();
                int i3 = 0;
                while (true) {
                    zzasp[] zzaspVarArr = this.zza;
                    if (i3 >= zzaspVarArr.length) {
                        break;
                    } else if (zzaspVarArr[i3].zzn().zzb(zza) != -1) {
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
        zzatb[] zzatbVarArr3 = new zzatb[length];
        zzatb[] zzatbVarArr4 = new zzatb[length];
        zzatk[] zzatkVarArr2 = new zzatk[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzatkVarArr.length; i5++) {
                zzatk zzatkVar2 = null;
                zzatbVarArr4[i5] = iArr[i5] == i4 ? zzatbVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzatkVar2 = zzatkVarArr[i5];
                }
                zzatkVarArr2[i5] = zzatkVar2;
            }
            int i6 = i4;
            zzatk[] zzatkVarArr3 = zzatkVarArr2;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i4].zzB(zzatkVarArr2, zArr, zzatbVarArr4, zArr2, j3);
            if (i6 == 0) {
                j3 = zzB;
            } else if (zzB != j3) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzatkVarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    zzaup.zzd(zzatbVarArr4[i7] != null);
                    zzatb zzatbVar2 = zzatbVarArr4[i7];
                    zzatbVarArr3[i7] = zzatbVar2;
                    this.zzb.put(zzatbVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    zzaup.zzd(zzatbVarArr4[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzatkVarArr2 = zzatkVarArr3;
            zzatbVarArr2 = zzatbVarArr;
        }
        zzatb[] zzatbVarArr5 = zzatbVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzatbVarArr3, 0, zzatbVarArr5, 0, length);
        zzasp[] zzaspVarArr2 = new zzasp[arrayList3.size()];
        this.zzf = zzaspVarArr2;
        arrayList3.toArray(zzaspVarArr2);
        this.zzg = new zzasd(this.zzf);
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j2) {
        return this.zzg.zzb(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final /* bridge */ /* synthetic */ void zzbh(zzasp zzaspVar) {
        if (this.zze == null) {
            return;
        }
        this.zzc.zzbh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final void zzj(zzasp zzaspVar) {
        int i2 = this.zzd - 1;
        this.zzd = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (zzasp zzaspVar2 : this.zza) {
            i3 += zzaspVar2.zzn().zzb;
        }
        zzatf[] zzatfVarArr = new zzatf[i3];
        int i4 = 0;
        for (zzasp zzaspVar3 : this.zza) {
            zzatg zzn = zzaspVar3.zzn();
            int i5 = zzn.zzb;
            int i6 = 0;
            while (i6 < i5) {
                zzatfVarArr[i4] = zzn.zza(i6);
                i6++;
                i4++;
            }
        }
        this.zze = new zzatg(zzatfVarArr);
        this.zzc.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzl(zzaso zzasoVar, long j2) {
        this.zzc = zzasoVar;
        zzasp[] zzaspVarArr = this.zza;
        this.zzd = zzaspVarArr.length;
        for (zzasp zzaspVar : zzaspVarArr) {
            zzaspVar.zzl(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzm() throws IOException {
        for (zzasp zzaspVar : this.zza) {
            zzaspVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final zzatg zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzo(long j2) {
        for (zzasp zzaspVar : this.zzf) {
            zzaspVar.zzo(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzp() {
        zzasp[] zzaspVarArr;
        long zzp = this.zza[0].zzp();
        int i2 = 1;
        while (true) {
            zzasp[] zzaspVarArr2 = this.zza;
            if (i2 >= zzaspVarArr2.length) {
                if (zzp != -9223372036854775807L) {
                    for (zzasp zzaspVar : this.zzf) {
                        if (zzaspVar != this.zza[0] && zzaspVar.zzr(zzp) != zzp) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzp;
            } else if (zzaspVarArr2[i2].zzp() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzq() {
        long j2 = Long.MAX_VALUE;
        for (zzasp zzaspVar : this.zzf) {
            long zzq = zzaspVar.zzq();
            if (zzq != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzq);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzr(long j2) {
        long zzr = this.zzf[0].zzr(j2);
        int i2 = 1;
        while (true) {
            zzasp[] zzaspVarArr = this.zzf;
            if (i2 >= zzaspVarArr.length) {
                return zzr;
            }
            if (zzaspVarArr[i2].zzr(zzr) != zzr) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i2++;
        }
    }
}
