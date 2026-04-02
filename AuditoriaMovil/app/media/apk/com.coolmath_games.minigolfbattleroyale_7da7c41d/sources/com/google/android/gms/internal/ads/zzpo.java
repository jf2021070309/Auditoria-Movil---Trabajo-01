package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzpo extends zzpq {
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
        for (int i = 0; i < zzB; i++) {
            String zzh = zzh(zzamfVar);
            Object zzj = zzj(zzamfVar, zzamfVar.zzn());
            if (zzj != null) {
                hashMap.put(zzh, zzj);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zza(zzamf zzamfVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    protected final boolean zzb(zzamf zzamfVar, long j) {
        if (zzamfVar.zzn() == 2 && "onMetaData".equals(zzh(zzamfVar)) && zzamfVar.zzn() == 8) {
            HashMap<String, Object> zzi = zzi(zzamfVar);
            Object obj = zzi.get(IronSourceConstants.EVENTS_DURATION);
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
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
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

    private static Object zzj(zzamf zzamfVar, int i) {
        if (i == 0) {
            return zzg(zzamfVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzamfVar.zzn() == 1);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzamfVar).doubleValue());
                        zzamfVar.zzk(2);
                        return date;
                    }
                    int zzB = zzamfVar.zzB();
                    ArrayList arrayList = new ArrayList(zzB);
                    for (int i2 = 0; i2 < zzB; i2++) {
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
        } else {
            return zzh(zzamfVar);
        }
    }
}
