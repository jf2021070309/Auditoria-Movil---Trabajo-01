package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzb {
    private final int zza = ((Integer) zzbet.zzc().zzc(zzbjl.zzfj)).intValue();
    private final long zzb = ((Long) zzbet.zzc().zzc(zzbjl.zzfk)).longValue();
    private final Map<String, Pair<Long, String>> zzc = Collections.synchronizedMap(new zza(this));

    private final void zze() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.zzc.entrySet().iterator();
            while (it.hasNext() && currentTimeMillis - ((Long) it.next().getValue().first).longValue() > this.zzb) {
                it.remove();
            }
        } catch (ConcurrentModificationException e2) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized void zzb(String str, String str2) {
        this.zzc.put(str, new Pair<>(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()), str2));
        zze();
    }

    public final synchronized String zzc(String str) {
        Pair<Long, String> pair = this.zzc.get(str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zzc.remove(str);
            return str2;
        }
        return null;
    }

    public final synchronized void zzd(String str) {
        this.zzc.remove(str);
    }
}
