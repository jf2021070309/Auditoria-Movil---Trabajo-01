package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzara implements zzapo, zzapv {
    public static final zzapq zza = new zzaqy();
    private static final int zzb = zzave.zzl("qt  ");
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzaux zzk;
    private int zzl;
    private int zzm;
    private zzapp zzn;
    private zzaqz[] zzo;
    private long zzp;
    private boolean zzq;
    private final zzaux zze = new zzaux(16);
    private final Stack<zzaqi> zzf = new Stack<>();
    private final zzaux zzc = new zzaux(zzauv.zza);
    private final zzaux zzd = new zzaux(4);

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j) throws zzanp {
        zzaru zzaruVar;
        zzaps zzapsVar;
        zzaru zzaruVar2;
        zzarc zza2;
        while (!this.zzf.isEmpty() && this.zzf.peek().zza == j) {
            zzaqi pop = this.zzf.pop();
            if (pop.zzaR == zzaqk.zzE) {
                ArrayList arrayList = new ArrayList();
                zzaps zzapsVar2 = new zzaps();
                zzaqj zzc = pop.zzc(zzaqk.zzaC);
                if (zzc != null) {
                    zzaruVar = zzaqr.zzc(zzc, this.zzq);
                    if (zzaruVar != null) {
                        zzapsVar2.zza(zzaruVar);
                    }
                } else {
                    zzaruVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = LongCompanionObject.MAX_VALUE;
                int i = 0;
                while (i < pop.zzc.size()) {
                    zzaqi zzaqiVar = pop.zzc.get(i);
                    if (zzaqiVar.zzaR == zzaqk.zzG && (zza2 = zzaqr.zza(zzaqiVar, pop.zzc(zzaqk.zzF), -9223372036854775807L, null, this.zzq)) != null) {
                        zzarf zzb2 = zzaqr.zzb(zza2, zzaqiVar.zzd(zzaqk.zzH).zzd(zzaqk.zzI).zzd(zzaqk.zzJ), zzapsVar2);
                        if (zzb2.zza != 0) {
                            zzaqz zzaqzVar = new zzaqz(zza2, zzb2, this.zzn.zzbf(i, zza2.zzb));
                            zzanm zzg = zza2.zzf.zzg(zzb2.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzapsVar2.zzb()) {
                                    zzg = zzg.zzh(zzapsVar2.zzb, zzapsVar2.zzc);
                                }
                                if (zzaruVar != null) {
                                    zzg = zzg.zzj(zzaruVar);
                                }
                            }
                            zzaqzVar.zzc.zza(zzg);
                            zzapsVar = zzapsVar2;
                            zzaruVar2 = zzaruVar;
                            long max = Math.max(j2, zza2.zze);
                            arrayList.add(zzaqzVar);
                            long j4 = zzb2.zzb[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzapsVar2 = zzapsVar;
                            zzaruVar = zzaruVar2;
                        }
                    }
                    zzapsVar = zzapsVar2;
                    zzaruVar2 = zzaruVar;
                    i++;
                    zzapsVar2 = zzapsVar;
                    zzaruVar = zzaruVar2;
                }
                this.zzp = j2;
                this.zzo = (zzaqz[]) arrayList.toArray(new zzaqz[arrayList.size()]);
                this.zzn.zzbg();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                this.zzf.peek().zzb(pop);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final long zzb() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final long zzc(long j) {
        zzaqz[] zzaqzVarArr = this.zzo;
        long j2 = LongCompanionObject.MAX_VALUE;
        for (zzaqz zzaqzVar : zzaqzVarArr) {
            zzarf zzarfVar = zzaqzVar.zzb;
            int zza2 = zzarfVar.zza(j);
            if (zza2 == -1) {
                zza2 = zzarfVar.zzb(j);
            }
            long j3 = zzarfVar.zzb[zza2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzd(zzapp zzappVar) {
        this.zzn = zzappVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzaqz[] zzaqzVarArr = this.zzo;
        if (zzaqzVarArr != null) {
            for (zzaqz zzaqzVar : zzaqzVarArr) {
                zzarf zzarfVar = zzaqzVar.zzb;
                int zza2 = zzarfVar.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzarfVar.zzb(j2);
                }
                zzaqzVar.zzd = zza2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final boolean zzf(zzapn zzapnVar) throws IOException, InterruptedException {
        return zzarb.zzb(zzapnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final int zzg(zzapn zzapnVar, zzapt zzaptVar) throws IOException, InterruptedException {
        zzaqz[] zzaqzVarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzapnVar.zzb(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzi(0);
                    this.zzi = this.zze.zzp();
                    this.zzh = this.zze.zzr();
                }
                if (this.zzi == 1) {
                    zzapnVar.zzb(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzv();
                }
                int i2 = this.zzh;
                if (i2 == zzaqk.zzE || i2 == zzaqk.zzG || i2 == zzaqk.zzH || i2 == zzaqk.zzI || i2 == zzaqk.zzJ || i2 == zzaqk.zzS) {
                    long zzh = (zzapnVar.zzh() + this.zzi) - this.zzj;
                    this.zzf.add(new zzaqi(this.zzh, zzh));
                    if (this.zzi == this.zzj) {
                        zzi(zzh);
                    } else {
                        zzh();
                    }
                } else {
                    int i3 = this.zzh;
                    if (i3 == zzaqk.zzU || i3 == zzaqk.zzF || i3 == zzaqk.zzV || i3 == zzaqk.zzW || i3 == zzaqk.zzao || i3 == zzaqk.zzap || i3 == zzaqk.zzaq || i3 == zzaqk.zzT || i3 == zzaqk.zzar || i3 == zzaqk.zzas || i3 == zzaqk.zzat || i3 == zzaqk.zzau || i3 == zzaqk.zzav || i3 == zzaqk.zzR || i3 == zzaqk.zzd || i3 == zzaqk.zzaC) {
                        zzaup.zzd(this.zzj == 8);
                        zzaup.zzd(this.zzi <= 2147483647L);
                        this.zzk = new zzaux((int) this.zzi);
                        System.arraycopy(this.zze.zza, 0, this.zzk.zza, 0, 8);
                    } else {
                        this.zzk = null;
                    }
                    this.zzg = 1;
                }
            } else if (i != 1) {
                long j = LongCompanionObject.MAX_VALUE;
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    zzaqzVarArr = this.zzo;
                    if (i5 >= zzaqzVarArr.length) {
                        break;
                    }
                    zzaqz zzaqzVar = zzaqzVarArr[i5];
                    int i6 = zzaqzVar.zzd;
                    zzarf zzarfVar = zzaqzVar.zzb;
                    if (i6 != zzarfVar.zza) {
                        long j2 = zzarfVar.zzb[i6];
                        if (j2 < j) {
                            i4 = i5;
                            j = j2;
                        }
                    }
                    i5++;
                }
                if (i4 == -1) {
                    return -1;
                }
                zzaqz zzaqzVar2 = zzaqzVarArr[i4];
                zzapx zzapxVar = zzaqzVar2.zzc;
                int i7 = zzaqzVar2.zzd;
                zzarf zzarfVar2 = zzaqzVar2.zzb;
                long j3 = zzarfVar2.zzb[i7];
                int i8 = zzarfVar2.zzc[i7];
                if (zzaqzVar2.zza.zzg == 1) {
                    j3 += 8;
                    i8 -= 8;
                }
                long zzh2 = (j3 - zzapnVar.zzh()) + this.zzl;
                if (zzh2 < 0 || zzh2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    zzaptVar.zza = j3;
                    return 1;
                }
                int i9 = (int) zzh2;
                boolean z3 = false;
                zzapnVar.zzd(i9, false);
                int i10 = zzaqzVar2.zza.zzk;
                if (i10 == 0) {
                    while (true) {
                        int i11 = this.zzl;
                        if (i11 >= i8) {
                            break;
                        }
                        int zzd = zzapxVar.zzd(zzapnVar, i8 - i11, false);
                        this.zzl += zzd;
                        this.zzm -= zzd;
                    }
                } else {
                    byte[] bArr = this.zzd.zza;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i12 = 4 - i10;
                    while (this.zzl < i8) {
                        int i13 = this.zzm;
                        if (i13 == 0) {
                            zzapnVar.zzb(this.zzd.zza, i12, i10, z3);
                            this.zzd.zzi(z3 ? 1 : 0);
                            this.zzm = this.zzd.zzu();
                            this.zzc.zzi(z3 ? 1 : 0);
                            zzapxVar.zzb(this.zzc, 4);
                            this.zzl += 4;
                            i8 += i12;
                        } else {
                            int zzd2 = zzapxVar.zzd(zzapnVar, i13, z3);
                            this.zzl += zzd2;
                            this.zzm -= zzd2;
                            z3 = false;
                        }
                    }
                }
                int i14 = i8;
                zzarf zzarfVar3 = zzaqzVar2.zzb;
                zzapxVar.zzc(zzarfVar3.zze[i7], zzarfVar3.zzf[i7], i14, 0, null);
                zzaqzVar2.zzd++;
                this.zzl = 0;
                this.zzm = 0;
                return 0;
            } else {
                long j4 = this.zzi - this.zzj;
                long zzh3 = zzapnVar.zzh() + j4;
                zzaux zzauxVar = this.zzk;
                if (zzauxVar != null) {
                    zzapnVar.zzb(zzauxVar.zza, this.zzj, (int) j4, false);
                    if (this.zzh == zzaqk.zzd) {
                        zzaux zzauxVar2 = this.zzk;
                        zzauxVar2.zzi(8);
                        if (zzauxVar2.zzr() == zzb) {
                            z2 = true;
                            break;
                        }
                        zzauxVar2.zzj(4);
                        while (zzauxVar2.zzd() > 0) {
                            if (zzauxVar2.zzr() == zzb) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        this.zzf.peek().zza(new zzaqj(this.zzh, this.zzk));
                    }
                } else if (j4 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    zzapnVar.zzd((int) j4, false);
                } else {
                    zzaptVar.zza = zzapnVar.zzh() + j4;
                    z = true;
                    zzi(zzh3);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(zzh3);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }
}
