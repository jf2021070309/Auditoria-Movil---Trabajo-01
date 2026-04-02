package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzffh {
    private final Clock zza;
    private final Map<String, List<String>> zzb = new HashMap();
    private final Map<String, Long> zzc = new HashMap();

    public zzffh(Clock clock) {
        this.zza = clock;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        this.zzb.get(str).add(str2);
    }

    public final void zza(String str) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
            return;
        }
        long elapsedRealtime = this.zza.elapsedRealtime();
        long longValue = this.zzc.remove(str).longValue();
        StringBuilder sb = new StringBuilder(20);
        sb.append(elapsedRealtime - longValue);
        zzd(str, sb.toString());
    }

    public final void zzb(String str, String str2) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
            return;
        }
        long elapsedRealtime = this.zza.elapsedRealtime();
        long longValue = this.zzc.remove(str).longValue();
        StringBuilder sb = new StringBuilder(str2.length() + 20);
        sb.append(str2);
        sb.append(elapsedRealtime - longValue);
        zzd(str, sb.toString());
    }

    public final List<zzffg> zzc() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.zzb.entrySet()) {
            int i2 = 0;
            if (entry.getValue().size() > 1) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    i2++;
                    StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 12);
                    sb.append(key);
                    sb.append(".");
                    sb.append(i2);
                    arrayList.add(new zzffg(sb.toString(), str));
                }
            } else {
                arrayList.add(new zzffg(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return arrayList;
    }
}
