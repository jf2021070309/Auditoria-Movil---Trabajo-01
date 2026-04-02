package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzxd extends zzwq {
    public zzxd() {
    }

    public zzxd(zzxc zzxcVar, SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<zzvu> zza(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new zzvu(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}
