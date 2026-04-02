package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzhv extends zzgq<Integer> {
    private static final zzagk zza;
    private final zzhh[] zzb;
    private final zzaiq[] zzc;
    private final ArrayList<zzhh> zzd;
    private final Map<Object, Long> zze;
    private final zzfpj<Object, zzgm> zzf;
    private int zzg;
    private long[][] zzh;
    private zzhu zzi;
    private final zzgs zzj;

    static {
        zzagb zzagbVar = new zzagb();
        zzagbVar.zza("MergingMediaSource");
        zza = zzagbVar.zzc();
    }

    public zzhv(boolean z, boolean z2, zzhh... zzhhVarArr) {
        zzgs zzgsVar = new zzgs();
        this.zzb = zzhhVarArr;
        this.zzj = zzgsVar;
        this.zzd = new ArrayList<>(Arrays.asList(zzhhVarArr));
        this.zzg = -1;
        this.zzc = new zzaiq[zzhhVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfpr.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzA(zzhe zzheVar) {
        zzht zzhtVar = (zzht) zzheVar;
        int i2 = 0;
        while (true) {
            zzhh[] zzhhVarArr = this.zzb;
            if (i2 >= zzhhVarArr.length) {
                return;
            }
            zzhhVarArr[i2].zzA(zzhtVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzhe zzC(zzhf zzhfVar, zzko zzkoVar, long j2) {
        int length = this.zzb.length;
        zzhe[] zzheVarArr = new zzhe[length];
        int zzi = this.zzc[0].zzi(zzhfVar.zza);
        for (int i2 = 0; i2 < length; i2++) {
            zzheVarArr[i2] = this.zzb[i2].zzC(zzhfVar.zzc(this.zzc[i2].zzj(zzi)), zzkoVar, j2 - this.zzh[zzi][i2]);
        }
        return new zzht(this.zzj, this.zzh[zzi], zzheVarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    public final void zza(zzay zzayVar) {
        super.zza(zzayVar);
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzw(Integer.valueOf(i2), this.zzb[i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        super.zzd();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzhh
    public final void zzu() throws IOException {
        zzhu zzhuVar = this.zzi;
        if (zzhuVar != null) {
            throw zzhuVar;
        }
        super.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final /* bridge */ /* synthetic */ void zzv(Integer num, zzhh zzhhVar, zzaiq zzaiqVar) {
        int i2;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i2 = zzaiqVar.zzg();
            this.zzg = i2;
        } else {
            int zzg = zzaiqVar.zzg();
            int i3 = this.zzg;
            if (zzg != i3) {
                this.zzi = new zzhu(0);
                return;
            }
            i2 = i3;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance(long.class, i2, this.zzc.length);
        }
        this.zzd.remove(zzhhVar);
        this.zzc[num.intValue()] = zzaiqVar;
        if (this.zzd.isEmpty()) {
            zze(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final /* bridge */ /* synthetic */ zzhf zzx(Integer num, zzhf zzhfVar) {
        if (num.intValue() == 0) {
            return zzhfVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzagk zzz() {
        zzhh[] zzhhVarArr = this.zzb;
        return zzhhVarArr.length > 0 ? zzhhVarArr[0].zzz() : zza;
    }
}
