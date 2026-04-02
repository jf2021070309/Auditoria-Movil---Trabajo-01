package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzao extends zzai implements zzal {
    public final List<String> zza;
    public final List<zzap> zzb;
    public zzg zzc;

    private zzao(zzao zzaoVar) {
        super(zzaoVar.zzd);
        ArrayList arrayList = new ArrayList(zzaoVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzaoVar.zza);
        ArrayList arrayList2 = new ArrayList(zzaoVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzaoVar.zzb);
        this.zzc = zzaoVar.zzc;
    }

    public zzao(String str, List<zzap> list, List<zzap> list2, zzg zzgVar) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            for (zzap zzapVar : list) {
                this.zza.add(zzapVar.zzi());
            }
        }
        this.zzb = new ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        zzg zza = this.zzc.zza();
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            if (i2 < list.size()) {
                zza.zze(this.zza.get(i2), zzgVar.zzb(list.get(i2)));
            } else {
                zza.zze(this.zza.get(i2), zzap.zzf);
            }
        }
        for (zzap zzapVar : this.zzb) {
            zzap zzb = zza.zzb(zzapVar);
            if (zzb instanceof zzaq) {
                zzb = zza.zzb(zzapVar);
            }
            if (zzb instanceof zzag) {
                return ((zzag) zzb).zzb();
            }
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzao(this);
    }
}
