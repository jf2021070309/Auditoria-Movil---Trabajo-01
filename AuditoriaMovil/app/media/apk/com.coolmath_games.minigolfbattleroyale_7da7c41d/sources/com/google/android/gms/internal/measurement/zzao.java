package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzao extends zzai implements zzal {
    protected final List<String> zza;
    protected final List<zzap> zzb;
    protected zzg zzc;

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

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        zzg zzc = this.zzc.zzc();
        for (int i = 0; i < this.zza.size(); i++) {
            if (i < list.size()) {
                zzc.zzf(this.zza.get(i), zzgVar.zza(list.get(i)));
            } else {
                zzc.zzf(this.zza.get(i), zzf);
            }
        }
        for (zzap zzapVar : this.zzb) {
            zzap zza = zzc.zza(zzapVar);
            if (zza instanceof zzaq) {
                zza = zzc.zza(zzapVar);
            }
            if (zza instanceof zzag) {
                return ((zzag) zza).zzb();
            }
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final zzap zzt() {
        return new zzao(this);
    }

    public zzao(String str, List<zzap> list, List<zzap> list2, zzg zzgVar) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            for (zzap zzapVar : list) {
                this.zza.add(zzapVar.zzc());
            }
        }
        this.zzb = new ArrayList(list2);
    }
}
