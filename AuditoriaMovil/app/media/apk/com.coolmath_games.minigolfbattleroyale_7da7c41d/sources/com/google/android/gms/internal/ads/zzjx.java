package com.google.android.gms.internal.ads;

import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzjx extends zzjz {
    private zzjw zza;

    protected abstract Pair<zzahx[], zzjg[]> zze(zzjw zzjwVar, int[][][] iArr, int[] iArr2, zzhf zzhfVar, zzaiq zzaiqVar) throws zzaeg;

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzi(Object obj) {
        this.zza = (zzjw) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final zzka zzj(zzahw[] zzahwVarArr, zzs zzsVar, zzhf zzhfVar, zzaiq zzaiqVar) throws zzaeg {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzq[][] zzqVarArr = new zzq[3];
        int[][][] iArr3 = new int[3][];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzsVar.zzb;
            zzqVarArr[i2] = new zzq[i3];
            iArr3[i2] = new int[i3];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = zzahwVarArr[i5].zzG();
        }
        int i6 = 0;
        while (i6 < zzsVar.zzb) {
            zzq zza = zzsVar.zza(i6);
            int zzf = zzalt.zzf(zza.zza(i).zzl);
            int i7 = i4;
            int i8 = i;
            int i9 = i8;
            boolean z = true;
            while (i8 < i4) {
                zzahw zzahwVar = zzahwVarArr[i8];
                int i10 = i;
                while (true) {
                    int i11 = zza.zza;
                    if (i > 0) {
                        break;
                    }
                    i10 = Math.max(i10, zzahwVar.zzH(zza.zza(i)) & 7);
                    i++;
                }
                boolean z2 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z = z2;
                    i9 = i10;
                    i7 = i8;
                } else if (i10 == i9 && zzf == 5 && !z && z2) {
                    i9 = i10;
                    i7 = i8;
                    z = true;
                }
                i8++;
                i4 = 2;
                i = 0;
            }
            if (i7 == i4) {
                int i12 = zza.zza;
                iArr = new int[1];
            } else {
                zzahw zzahwVar2 = zzahwVarArr[i7];
                int i13 = zza.zza;
                int[] iArr5 = new int[1];
                int i14 = 0;
                while (true) {
                    int i15 = zza.zza;
                    if (i14 > 0) {
                        break;
                    }
                    iArr5[i14] = zzahwVar2.zzH(zza.zza(i14));
                    i14++;
                }
                iArr = iArr5;
            }
            int i16 = iArr2[i7];
            zzqVarArr[i7][i16] = zza;
            iArr3[i7][i16] = iArr;
            iArr2[i7] = i16 + 1;
            i6++;
            i4 = 2;
            i = 0;
        }
        zzs[] zzsVarArr = new zzs[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i17 = 0;
        while (i17 < i4) {
            int i18 = iArr2[i17];
            zzsVarArr[i17] = new zzs((zzq[]) zzamq.zzf(zzqVarArr[i17], i18));
            iArr3[i17] = (int[][]) zzamq.zzf(iArr3[i17], i18);
            strArr[i17] = zzahwVarArr[i17].zzc();
            iArr6[i17] = zzahwVarArr[i17].zzac();
            i17++;
            i4 = 2;
        }
        int i19 = i4;
        zzjw zzjwVar = new zzjw(strArr, iArr6, zzsVarArr, iArr4, iArr3, new zzs((zzq[]) zzamq.zzf(zzqVarArr[i19], iArr2[i19])));
        Pair<zzahx[], zzjg[]> zze = zze(zzjwVar, iArr3, iArr4, zzhfVar, zzaiqVar);
        return new zzka((zzahx[]) zze.first, (zzjg[]) zze.second, zzjwVar, null);
    }
}
