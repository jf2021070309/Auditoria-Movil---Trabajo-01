package com.google.android.gms.internal.ads;

import android.util.Pair;
/* loaded from: classes.dex */
public abstract class zzjx extends zzjz {
    private zzjw zza;

    public abstract Pair<zzahx[], zzjg[]> zze(zzjw zzjwVar, int[][][] iArr, int[] iArr2, zzhf zzhfVar, zzaiq zzaiqVar) throws zzaeg;

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
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = zzsVar.zzb;
            zzqVarArr[i3] = new zzq[i4];
            iArr3[i3] = new int[i4];
        }
        int i5 = 2;
        int[] iArr4 = new int[2];
        for (int i6 = 0; i6 < 2; i6++) {
            iArr4[i6] = zzahwVarArr[i6].zzG();
        }
        int i7 = 0;
        while (i7 < zzsVar.zzb) {
            zzq zza = zzsVar.zza(i7);
            int zzf = zzalt.zzf(zza.zza(i2).zzl);
            int i8 = 0;
            int i9 = 2;
            int i10 = 0;
            boolean z = true;
            while (i8 < i5) {
                zzahw zzahwVar = zzahwVarArr[i8];
                int i11 = 0;
                while (i2 <= 0) {
                    i11 = Math.max(i11, zzahwVar.zzH(zza.zza(i2)) & 7);
                    i2++;
                }
                boolean z2 = iArr2[i8] == 0;
                if (i11 > i10) {
                    z = z2;
                    i10 = i11;
                    i9 = i8;
                } else if (i11 == i10 && zzf == 5 && !z && z2) {
                    i10 = i11;
                    i9 = i8;
                    z = true;
                }
                i8++;
                i5 = 2;
                i2 = 0;
            }
            if (i9 == i5) {
                iArr = new int[1];
            } else {
                zzahw zzahwVar2 = zzahwVarArr[i9];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zzahwVar2.zzH(zza.zza(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i9];
            zzqVarArr[i9][i13] = zza;
            iArr3[i9][i13] = iArr;
            iArr2[i9] = i13 + 1;
            i7++;
            i5 = 2;
            i2 = 0;
        }
        zzs[] zzsVarArr = new zzs[i5];
        String[] strArr = new String[i5];
        int[] iArr6 = new int[i5];
        int i14 = 0;
        while (i14 < i5) {
            int i15 = iArr2[i14];
            zzsVarArr[i14] = new zzs((zzq[]) zzamq.zzf(zzqVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzamq.zzf(iArr3[i14], i15);
            strArr[i14] = zzahwVarArr[i14].zzc();
            iArr6[i14] = zzahwVarArr[i14].zzac();
            i14++;
            i5 = 2;
        }
        zzjw zzjwVar = new zzjw(strArr, iArr6, zzsVarArr, iArr4, iArr3, new zzs((zzq[]) zzamq.zzf(zzqVarArr[2], iArr2[2])));
        Pair<zzahx[], zzjg[]> zze = zze(zzjwVar, iArr3, iArr4, zzhfVar, zzaiqVar);
        return new zzka((zzahx[]) zze.first, (zzjg[]) zze.second, zzjwVar, null);
    }
}
