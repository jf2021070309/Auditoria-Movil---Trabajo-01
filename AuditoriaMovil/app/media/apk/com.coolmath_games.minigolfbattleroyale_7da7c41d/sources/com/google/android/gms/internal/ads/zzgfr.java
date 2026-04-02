package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgfr<T extends zzgfq<T>> {
    private static final zzgfr zzd = new zzgfr(true);
    final zzgik<T, Object> zza = new zzgic(16);
    private boolean zzb;
    private boolean zzc;

    private zzgfr() {
    }

    public static <T extends zzgfq<T>> zzgfr<T> zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzd(T r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzgje r0 = r4.zzb()
            com.google.android.gms.internal.ads.zzggk.zza(r5)
            com.google.android.gms.internal.ads.zzgje r1 = com.google.android.gms.internal.ads.zzgje.DOUBLE
            com.google.android.gms.internal.ads.zzgjf r1 = com.google.android.gms.internal.ads.zzgjf.INT
            com.google.android.gms.internal.ads.zzgjf r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzghi
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzggp
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzggc
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgex
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.ads.zzgje r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzgjf r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgfr.zzd(com.google.android.gms.internal.ads.zzgfq, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgfr zzgfrVar = new zzgfr();
        for (int i = 0; i < this.zza.zze(); i++) {
            Map.Entry<T, Object> zzf = this.zza.zzf(i);
            zzgfrVar.zzc(zzf.getKey(), zzf.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzg()) {
            zzgfrVar.zzc(entry.getKey(), entry.getValue());
        }
        zzgfrVar.zzc = this.zzc;
        return zzgfrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgfr) {
            return this.zza.equals(((zzgfr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final void zzc(T t, Object obj) {
        if (t.zzc()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            zzd(t, obj);
        }
        if (obj instanceof zzggp) {
            this.zzc = true;
        }
        this.zza.put(t, obj);
    }

    private zzgfr(boolean z) {
        zzb();
        zzb();
    }
}
