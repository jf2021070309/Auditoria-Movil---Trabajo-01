package com.google.android.gms.measurement.internal;

import c.f.a;
import com.google.android.gms.internal.measurement.zzoa;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzt {
    public final /* synthetic */ zzz zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzgd zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map<Integer, Long> zzg;
    private Map<Integer, List<Long>> zzh;

    public /* synthetic */ zzt(zzz zzzVar, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgdVar;
    }

    public /* synthetic */ zzt(zzz zzzVar, String str, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new a();
        this.zzh = new a();
    }

    public static /* bridge */ /* synthetic */ BitSet zzb(zzt zztVar) {
        return zztVar.zze;
    }

    public final com.google.android.gms.internal.measurement.zzfk zza(int i2) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzfj zzb = com.google.android.gms.internal.measurement.zzfk.zzb();
        zzb.zza(i2);
        zzb.zzc(this.zzc);
        com.google.android.gms.internal.measurement.zzgd zzgdVar = this.zzd;
        if (zzgdVar != null) {
            zzb.zzd(zzgdVar);
        }
        com.google.android.gms.internal.measurement.zzgc zzf = com.google.android.gms.internal.measurement.zzgd.zzf();
        zzf.zzb(zzku.zzs(this.zze));
        zzf.zzd(zzku.zzs(this.zzf));
        Map<Integer, Long> map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int intValue = num.intValue();
                Long l2 = this.zzg.get(Integer.valueOf(intValue));
                if (l2 != null) {
                    com.google.android.gms.internal.measurement.zzfl zzc = com.google.android.gms.internal.measurement.zzfm.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l2.longValue());
                    arrayList2.add(zzc.zzaA());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf.zza(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzge zzd = com.google.android.gms.internal.measurement.zzgf.zzd();
                zzd.zzb(num2.intValue());
                List<Long> list2 = this.zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzgf) zzd.zzaA());
            }
            list = arrayList3;
        }
        zzf.zzc(list);
        zzb.zzb(zzf);
        return zzb.zzaA();
    }

    public final void zzc(zzx zzxVar) {
        int zza = zzxVar.zza();
        Boolean bool = zzxVar.zzd;
        if (bool != null) {
            this.zzf.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzxVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzxVar.zzf != null) {
            Map<Integer, Long> map = this.zzg;
            Integer valueOf = Integer.valueOf(zza);
            Long l2 = map.get(valueOf);
            long longValue = zzxVar.zzf.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzxVar.zzg != null) {
            Map<Integer, List<Long>> map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza);
            List<Long> list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList<>();
                this.zzh.put(valueOf2, list);
            }
            if (zzxVar.zzc()) {
                list.clear();
            }
            zzoa.zzc();
            zzaf zzf = this.zza.zzs.zzf();
            String str = this.zzb;
            zzdx<Boolean> zzdxVar = zzdy.zzY;
            if (zzf.zzs(str, zzdxVar) && zzxVar.zzb()) {
                list.clear();
            }
            zzoa.zzc();
            if (!this.zza.zzs.zzf().zzs(this.zzb, zzdxVar)) {
                list.add(Long.valueOf(zzxVar.zzg.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(zzxVar.zzg.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }
}
