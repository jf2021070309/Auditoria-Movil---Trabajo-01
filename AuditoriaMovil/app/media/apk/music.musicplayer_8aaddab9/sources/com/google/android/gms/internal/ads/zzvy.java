package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzvy {
    public final int zza;
    public final byte[] zzb;
    public final Map<String, String> zzc;
    public final List<zzvu> zzd;
    public final boolean zze;

    private zzvy(int i2, byte[] bArr, Map<String, String> map, List<zzvu> list, boolean z, long j2) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z;
    }

    @Deprecated
    public zzvy(int i2, byte[] bArr, Map<String, String> map, boolean z, long j2) {
        this(i2, bArr, map, zza(map), z, j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzvy(int r9, byte[] r10, boolean r11, long r12, java.util.List<com.google.android.gms.internal.ads.zzvu> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L5
            r0 = 0
        L3:
            r3 = r0
            goto L33
        L5:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L3
        L10:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzvu r2 = (com.google.android.gms.internal.ads.zzvu) r2
            java.lang.String r3 = r2.zza()
            java.lang.String r2 = r2.zzb()
            r0.put(r3, r2)
            goto L1b
        L33:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvy.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public zzvy(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, zza(map), false, 0L);
    }

    private static List<zzvu> zza(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new zzvu(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
