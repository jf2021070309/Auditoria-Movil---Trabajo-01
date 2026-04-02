package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzrp implements zznu, zzot {
    public static final zzoa zza = zzrn.zza;
    private final zzamf zzb;
    private final zzamf zzc;
    private final zzamf zzd;
    private final zzamf zze;
    private final ArrayDeque<zzqv> zzf;
    private final zzrs zzg;
    private final List<zzaiu> zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzamf zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zznx zzr;
    private zzro[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzakn zzx;

    public zzrp() {
        this(0);
    }

    public zzrp(int i2) {
        this.zzi = 0;
        this.zzg = new zzrs();
        this.zzh = new ArrayList();
        this.zze = new zzamf(16);
        this.zzf = new ArrayDeque<>();
        this.zzb = new zzamf(zzalw.zza);
        this.zzc = new zzamf(4);
        this.zzd = new zzamf();
        this.zzn = -1;
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzi(long j2) throws zzaha {
        zzrp zzrpVar;
        zzaiv zzaivVar;
        zzaiv zzaivVar2;
        long j3;
        List<zzrx> list;
        int i2;
        zzrp zzrpVar2;
        zzaiv zzaivVar3;
        char c2;
        int i3;
        zzrp zzrpVar3 = this;
        while (!zzrpVar3.zzf.isEmpty() && zzrpVar3.zzf.peek().zza == j2) {
            zzqv pop = zzrpVar3.zzf.pop();
            if (pop.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = zzrpVar3.zzw == 1;
                zzoj zzojVar = new zzoj();
                zzqw zzc = pop.zzc(1969517665);
                if (zzc != null) {
                    Pair<zzaiv, zzaiv> zzb = zzre.zzb(zzc);
                    zzaiv zzaivVar4 = (zzaiv) zzb.first;
                    zzaiv zzaivVar5 = (zzaiv) zzb.second;
                    if (zzaivVar4 != null) {
                        zzojVar.zza(zzaivVar4);
                    }
                    zzaivVar = zzaivVar5;
                    zzaivVar2 = zzaivVar4;
                } else {
                    zzaivVar = null;
                    zzaivVar2 = null;
                }
                zzqv zzd = pop.zzd(1835365473);
                zzaiv zzc2 = zzd != null ? zzre.zzc(zzd) : null;
                List<zzrx> zza2 = zzre.zza(pop, zzojVar, -9223372036854775807L, null, false, z, zzrm.zza);
                zznx zznxVar = zzrpVar3.zzr;
                Objects.requireNonNull(zznxVar);
                int size = zza2.size();
                long j4 = -9223372036854775807L;
                long j5 = -9223372036854775807L;
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    j3 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    zzrx zzrxVar = zza2.get(i4);
                    if (zzrxVar.zzb == 0) {
                        zzrpVar2 = zzrpVar3;
                        list = zza2;
                        i2 = size;
                    } else {
                        zzru zzruVar = zzrxVar.zza;
                        ArrayList arrayList2 = arrayList;
                        long j6 = zzruVar.zze;
                        if (j6 == j4) {
                            j6 = zzrxVar.zzh;
                        }
                        long max = Math.max(j5, j6);
                        zzro zzroVar = new zzro(zzruVar, zzrxVar, zznxVar.zzB(i4, zzruVar.zzb));
                        int i6 = zzrxVar.zze;
                        list = zza2;
                        zzaft zza3 = zzruVar.zzf.zza();
                        zza3.zzO(i6 + 30);
                        i2 = size;
                        if (zzruVar.zzb == 2 && j6 > 0 && (i3 = zzrxVar.zzb) > 1) {
                            zza3.zzU(i3 / (((float) j6) / 1000000.0f));
                        }
                        if (zzruVar.zzb == 1 && zzojVar.zzb()) {
                            zza3.zzad(zzojVar.zza);
                            zza3.zzae(zzojVar.zzb);
                        }
                        int i7 = zzruVar.zzb;
                        zzaiv[] zzaivVarArr = new zzaiv[2];
                        zzaivVarArr[0] = zzaivVar;
                        zzrpVar2 = this;
                        if (zzrpVar2.zzh.isEmpty()) {
                            c2 = 1;
                            zzaivVar3 = null;
                        } else {
                            zzaivVar3 = new zzaiv(zzrpVar2.zzh);
                            c2 = 1;
                        }
                        zzaivVarArr[c2] = zzaivVar3;
                        zzaiv zzaivVar6 = new zzaiv(new zzaiu[0]);
                        if (i7 == 1) {
                            if (zzaivVar2 != null) {
                                zzaivVar6 = zzaivVar2;
                            }
                        } else if (i7 == 2 && zzc2 != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= zzc2.zza()) {
                                    break;
                                }
                                zzaiu zzb2 = zzc2.zzb(i8);
                                if (zzb2 instanceof zzakk) {
                                    zzakk zzakkVar = (zzakk) zzb2;
                                    if ("com.android.capture.fps".equals(zzakkVar.zza)) {
                                        zzaivVar6 = new zzaiv(zzakkVar);
                                        break;
                                    }
                                }
                                i8++;
                            }
                        }
                        for (int i9 = 0; i9 < 2; i9++) {
                            zzaivVar6 = zzaivVar6.zzc(zzaivVarArr[i9]);
                        }
                        if (zzaivVar6.zza() > 0) {
                            zza3.zzL(zzaivVar6);
                        }
                        zzroVar.zzc.zzs(zza3.zzah());
                        if (zzruVar.zzb == 2 && i5 == -1) {
                            i5 = arrayList2.size();
                        }
                        arrayList = arrayList2;
                        arrayList.add(zzroVar);
                        j5 = max;
                    }
                    i4++;
                    zzrpVar3 = zzrpVar2;
                    zza2 = list;
                    size = i2;
                    j4 = -9223372036854775807L;
                }
                zzrpVar = zzrpVar3;
                zzrpVar.zzu = i5;
                zzrpVar.zzv = j5;
                zzro[] zzroVarArr = (zzro[]) arrayList.toArray(new zzro[0]);
                zzrpVar.zzs = zzroVarArr;
                int length = zzroVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i10 = 0; i10 < zzroVarArr.length; i10++) {
                    jArr[i10] = new long[zzroVarArr[i10].zzb.zzb];
                    jArr2[i10] = zzroVarArr[i10].zzb.zzf[0];
                }
                int i11 = 0;
                while (i11 < zzroVarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < zzroVarArr.length; i13++) {
                        if (!zArr[i13]) {
                            long j8 = jArr2[i13];
                            if (j8 <= j7) {
                                i12 = i13;
                                j7 = j8;
                            }
                        }
                    }
                    int i14 = iArr[i12];
                    long[] jArr3 = jArr[i12];
                    jArr3[i14] = j3;
                    zzrx zzrxVar2 = zzroVarArr[i12].zzb;
                    j3 += zzrxVar2.zzd[i14];
                    int i15 = i14 + 1;
                    iArr[i12] = i15;
                    if (i15 < jArr3.length) {
                        jArr2[i12] = zzrxVar2.zzf[i15];
                    } else {
                        zArr[i12] = true;
                        i11++;
                    }
                }
                zzrpVar.zzt = jArr;
                zznxVar.zzC();
                zznxVar.zzD(zzrpVar);
                zzrpVar.zzf.clear();
                zzrpVar.zzi = 2;
            } else {
                zzrpVar = zzrpVar3;
                if (!zzrpVar.zzf.isEmpty()) {
                    zzrpVar.zzf.peek().zzb(pop);
                }
            }
            zzrpVar3 = zzrpVar;
        }
        if (zzrpVar3.zzi != 2) {
            zzh();
        }
    }

    private static long zzj(zzrx zzrxVar, long j2, long j3) {
        int zzk = zzk(zzrxVar, j2);
        return zzk == -1 ? j3 : Math.min(zzrxVar.zzc[zzk], j3);
    }

    private static int zzk(zzrx zzrxVar, long j2) {
        int zza2 = zzrxVar.zza(j2);
        return zza2 == -1 ? zzrxVar.zzb(j2) : zza2;
    }

    private static int zzl(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzrt.zzb(zznvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzr = zznxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x035c, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r33, com.google.android.gms.internal.ads.zzoq r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j2 == 0) {
            zzh();
            return;
        }
        zzro[] zzroVarArr = this.zzs;
        if (zzroVarArr != null) {
            for (zzro zzroVar : zzroVarArr) {
                zzrx zzrxVar = zzroVar.zzb;
                int zza2 = zzrxVar.zza(j3);
                if (zza2 == -1) {
                    zza2 = zzrxVar.zzb(j3);
                }
                zzroVar.zzd = zza2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        long j3;
        long j4;
        int zzb;
        zzro[] zzroVarArr = this.zzs;
        Objects.requireNonNull(zzroVarArr);
        if (zzroVarArr.length == 0) {
            zzou zzouVar = zzou.zza;
            return new zzor(zzouVar, zzouVar);
        }
        int i2 = this.zzu;
        long j5 = -1;
        if (i2 != -1) {
            zzrx zzrxVar = zzroVarArr[i2].zzb;
            int zzk = zzk(zzrxVar, j2);
            if (zzk == -1) {
                zzou zzouVar2 = zzou.zza;
                return new zzor(zzouVar2, zzouVar2);
            }
            long j6 = zzrxVar.zzf[zzk];
            j3 = zzrxVar.zzc[zzk];
            if (j6 >= j2 || zzk >= zzrxVar.zzb - 1 || (zzb = zzrxVar.zzb(j2)) == -1 || zzb == zzk) {
                j4 = -9223372036854775807L;
            } else {
                j4 = zzrxVar.zzf[zzb];
                j5 = zzrxVar.zzc[zzb];
            }
            j2 = j6;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            zzro[] zzroVarArr2 = this.zzs;
            if (i3 >= zzroVarArr2.length) {
                break;
            }
            if (i3 != this.zzu) {
                zzrx zzrxVar2 = zzroVarArr2[i3].zzb;
                long zzj = zzj(zzrxVar2, j2, j3);
                if (j4 != -9223372036854775807L) {
                    j5 = zzj(zzrxVar2, j4, j5);
                }
                j3 = zzj;
            }
            i3++;
        }
        zzou zzouVar3 = new zzou(j2, j3);
        return j4 == -9223372036854775807L ? new zzor(zzouVar3, zzouVar3) : new zzor(zzouVar3, new zzou(j4, j5));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzv;
    }
}
