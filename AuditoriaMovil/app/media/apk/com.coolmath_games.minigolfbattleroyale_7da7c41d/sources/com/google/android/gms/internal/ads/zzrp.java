package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    private final void zzh() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzi(long j) throws zzaha {
        zzrp zzrpVar;
        zzaiv zzaivVar;
        zzaiv zzaivVar2;
        long j2;
        List<zzrx> list;
        int i;
        zzrp zzrpVar2;
        zzaiv zzaivVar3;
        char c;
        int i2;
        zzrp zzrpVar3 = this;
        while (!zzrpVar3.zzf.isEmpty() && zzrpVar3.zzf.peek().zza == j) {
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
                if (zznxVar != null) {
                    int size = zza2.size();
                    long j3 = -9223372036854775807L;
                    long j4 = -9223372036854775807L;
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        j2 = 0;
                        if (i3 >= size) {
                            break;
                        }
                        zzrx zzrxVar = zza2.get(i3);
                        if (zzrxVar.zzb == 0) {
                            zzrpVar2 = zzrpVar3;
                            list = zza2;
                            i = size;
                        } else {
                            zzru zzruVar = zzrxVar.zza;
                            ArrayList arrayList2 = arrayList;
                            long j5 = zzruVar.zze;
                            if (j5 == j3) {
                                j5 = zzrxVar.zzh;
                            }
                            long max = Math.max(j4, j5);
                            zzro zzroVar = new zzro(zzruVar, zzrxVar, zznxVar.zzB(i3, zzruVar.zzb));
                            int i5 = zzrxVar.zze;
                            list = zza2;
                            zzaft zza3 = zzruVar.zzf.zza();
                            zza3.zzO(i5 + 30);
                            i = size;
                            if (zzruVar.zzb == 2 && j5 > 0 && (i2 = zzrxVar.zzb) > 1) {
                                zza3.zzU(i2 / (((float) j5) / 1000000.0f));
                            }
                            int i6 = zzruVar.zzb;
                            int i7 = zzrl.zzb;
                            if (i6 == 1 && zzojVar.zzb()) {
                                zza3.zzad(zzojVar.zza);
                                zza3.zzae(zzojVar.zzb);
                            }
                            int i8 = zzruVar.zzb;
                            zzaiv[] zzaivVarArr = new zzaiv[2];
                            zzaivVarArr[0] = zzaivVar;
                            zzrpVar2 = this;
                            if (zzrpVar2.zzh.isEmpty()) {
                                c = 1;
                                zzaivVar3 = null;
                            } else {
                                zzaivVar3 = new zzaiv(zzrpVar2.zzh);
                                c = 1;
                            }
                            zzaivVarArr[c] = zzaivVar3;
                            zzaiv zzaivVar6 = new zzaiv(new zzaiu[0]);
                            if (i8 == 1) {
                                if (zzaivVar2 != null) {
                                    zzaivVar6 = zzaivVar2;
                                }
                            } else if (i8 == 2 && zzc2 != null) {
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= zzc2.zza()) {
                                        break;
                                    }
                                    zzaiu zzb2 = zzc2.zzb(i9);
                                    if (zzb2 instanceof zzakk) {
                                        zzakk zzakkVar = (zzakk) zzb2;
                                        if ("com.android.capture.fps".equals(zzakkVar.zza)) {
                                            zzaivVar6 = new zzaiv(zzakkVar);
                                            break;
                                        }
                                    }
                                    i9++;
                                }
                            }
                            for (int i10 = 0; i10 < 2; i10++) {
                                zzaivVar6 = zzaivVar6.zzc(zzaivVarArr[i10]);
                            }
                            if (zzaivVar6.zza() > 0) {
                                zza3.zzL(zzaivVar6);
                            }
                            zzroVar.zzc.zzs(zza3.zzah());
                            if (zzruVar.zzb == 2 && i4 == -1) {
                                i4 = arrayList2.size();
                            }
                            arrayList = arrayList2;
                            arrayList.add(zzroVar);
                            j4 = max;
                        }
                        i3++;
                        zzrpVar3 = zzrpVar2;
                        zza2 = list;
                        size = i;
                        j3 = -9223372036854775807L;
                    }
                    zzrpVar = zzrpVar3;
                    zzrpVar.zzu = i4;
                    zzrpVar.zzv = j4;
                    zzro[] zzroVarArr = (zzro[]) arrayList.toArray(new zzro[0]);
                    zzrpVar.zzs = zzroVarArr;
                    int length = zzroVarArr.length;
                    long[][] jArr = new long[length];
                    int[] iArr = new int[length];
                    long[] jArr2 = new long[length];
                    boolean[] zArr = new boolean[length];
                    for (int i11 = 0; i11 < zzroVarArr.length; i11++) {
                        jArr[i11] = new long[zzroVarArr[i11].zzb.zzb];
                        jArr2[i11] = zzroVarArr[i11].zzb.zzf[0];
                    }
                    int i12 = 0;
                    while (i12 < zzroVarArr.length) {
                        long j6 = LongCompanionObject.MAX_VALUE;
                        int i13 = -1;
                        for (int i14 = 0; i14 < zzroVarArr.length; i14++) {
                            if (!zArr[i14]) {
                                long j7 = jArr2[i14];
                                if (j7 <= j6) {
                                    i13 = i14;
                                    j6 = j7;
                                }
                            }
                        }
                        int i15 = iArr[i13];
                        long[] jArr3 = jArr[i13];
                        jArr3[i15] = j2;
                        zzrx zzrxVar2 = zzroVarArr[i13].zzb;
                        j2 += zzrxVar2.zzd[i15];
                        int i16 = i15 + 1;
                        iArr[i13] = i16;
                        if (i16 < jArr3.length) {
                            jArr2[i13] = zzrxVar2.zzf[i16];
                        } else {
                            zArr[i13] = true;
                            i12++;
                        }
                    }
                    zzrpVar.zzt = jArr;
                    zznxVar.zzC();
                    zznxVar.zzD(zzrpVar);
                    zzrpVar.zzf.clear();
                    zzrpVar.zzi = 2;
                } else {
                    throw null;
                }
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

    private static long zzj(zzrx zzrxVar, long j, long j2) {
        int zzk = zzk(zzrxVar, j);
        return zzk == -1 ? j2 : Math.min(zzrxVar.zzc[zzk], j2);
    }

    private static int zzk(zzrx zzrxVar, long j) {
        int zza2 = zzrxVar.zza(j);
        return zza2 == -1 ? zzrxVar.zzb(j) : zza2;
    }

    private static int zzl(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
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

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzro[] zzroVarArr = this.zzs;
        if (zzroVarArr != null) {
            for (zzro zzroVar : zzroVarArr) {
                zzrx zzrxVar = zzroVar.zzb;
                int zza2 = zzrxVar.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzrxVar.zzb(j2);
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
    public final zzor zzf(long j) {
        long j2;
        long j3;
        int zzb;
        zzro[] zzroVarArr = this.zzs;
        if (zzroVarArr == null) {
            throw null;
        }
        if (zzroVarArr.length == 0) {
            zzou zzouVar = zzou.zza;
            return new zzor(zzouVar, zzouVar);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zzrx zzrxVar = zzroVarArr[i].zzb;
            int zzk = zzk(zzrxVar, j);
            if (zzk == -1) {
                zzou zzouVar2 = zzou.zza;
                return new zzor(zzouVar2, zzouVar2);
            }
            long j5 = zzrxVar.zzf[zzk];
            j2 = zzrxVar.zzc[zzk];
            if (j5 >= j || zzk >= zzrxVar.zzb - 1 || (zzb = zzrxVar.zzb(j)) == -1 || zzb == zzk) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzrxVar.zzf[zzb];
                j4 = zzrxVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = LongCompanionObject.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzro[] zzroVarArr2 = this.zzs;
            if (i2 >= zzroVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzrx zzrxVar2 = zzroVarArr2[i2].zzb;
                long zzj = zzj(zzrxVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzrxVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzou zzouVar3 = new zzou(j, j2);
        if (j3 == -9223372036854775807L) {
            return new zzor(zzouVar3, zzouVar3);
        }
        return new zzor(zzouVar3, new zzou(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzv;
    }

    public zzrp(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:184:0x035d, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r33, com.google.android.gms.internal.ads.zzoq r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }
}
