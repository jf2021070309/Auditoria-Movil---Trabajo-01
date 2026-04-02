package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzpo extends zzpq {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzpo() {
        super(new zznt());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzamf zzamfVar) {
        return Double.valueOf(Double.longBitsToDouble(zzamfVar.zzx()));
    }

    private static String zzh(zzamf zzamfVar) {
        int zzo = zzamfVar.zzo();
        int zzg = zzamfVar.zzg();
        zzamfVar.zzk(zzo);
        return new String(zzamfVar.zzi(), zzg, zzo);
    }

    private static HashMap<String, Object> zzi(zzamf zzamfVar) {
        int zzB = zzamfVar.zzB();
        HashMap<String, Object> hashMap = new HashMap<>(zzB);
        for (int i2 = 0; i2 < zzB; i2++) {
            String zzh = zzh(zzamfVar);
            Object zzj = zzj(zzamfVar, zzamfVar.zzn());
            if (zzj != null) {
                hashMap.put(zzh, zzj);
            }
        }
        return hashMap;
    }

    private static Object zzj(zzamf zzamfVar, int i2) {
        if (i2 == 0) {
            return zzg(zzamfVar);
        }
        if (i2 == 1) {
            return Boolean.valueOf(zzamfVar.zzn() == 1);
        } else if (i2 == 2) {
            return zzh(zzamfVar);
        } else {
            if (i2 != 3) {
                if (i2 != 8) {
                    if (i2 != 10) {
                        if (i2 != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzamfVar).doubleValue());
                        zzamfVar.zzk(2);
                        return date;
                    }
                    int zzB = zzamfVar.zzB();
                    ArrayList arrayList = new ArrayList(zzB);
                    for (int i3 = 0; i3 < zzB; i3++) {
                        Object zzj = zzj(zzamfVar, zzamfVar.zzn());
                        if (zzj != null) {
                            arrayList.add(zzj);
                        }
                    }
                    return arrayList;
                }
                return zzi(zzamfVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String zzh = zzh(zzamfVar);
                int zzn = zzamfVar.zzn();
                if (zzn == 9) {
                    return hashMap;
                }
                Object zzj2 = zzj(zzamfVar, zzn);
                if (zzj2 != null) {
                    hashMap.put(zzh, zzj2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final boolean zza(zzamf zzamfVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final boolean zzb(zzamf zzamfVar, long j2) {
        if (zzamfVar.zzn() == 2 && "onMetaData".equals(zzh(zzamfVar)) && zzamfVar.zzn() == 8) {
            HashMap<String, Object> zzi = zzi(zzamfVar);
            Object obj = zzi.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj5 = list.get(i2);
                        Object obj6 = list2.get(i2);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i2] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }
}
