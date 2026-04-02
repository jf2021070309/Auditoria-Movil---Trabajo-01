package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzsw extends zzsx implements NavigableMap {
    private static final Comparator zza;
    private static final zzsw zzb;
    private final transient zztp zzc;
    private final transient zzso zzd;
    private final transient zzsw zze;

    static {
        zztf zztfVar = zztf.zza;
        zza = zztfVar;
        zztp zzs = zzsy.zzs(zztfVar);
        int i = zzso.zzd;
        zzb = new zzsw(zzs, zzti.zza, null);
    }

    public zzsw(zztp zztpVar, zzso zzsoVar, zzsw zzswVar) {
        this.zzc = zztpVar;
        this.zzd = zzsoVar;
        this.zze = zzswVar;
    }

    public static zzsw zzk(Comparator comparator) {
        if (zztf.zza.equals(comparator)) {
            return zzb;
        }
        zztp zzs = zzsy.zzs(comparator);
        int i = zzso.zzd;
        return new zzsw(zzs, zzti.zza, null);
    }

    public static zzsw zzm() {
        return zzb;
    }

    private final zzsw zzq(int i, int i2) {
        if (i == 0) {
            if (i2 != this.zzd.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i == i2) {
            return zzk(((zzsy) this.zzc).zza);
        }
        return new zzsw(this.zzc.zzw(i, i2), this.zzd.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return zztd.zza(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((zzsy) this.zzc).zza;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.zzc.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzth zzrwVar;
        zzsw zzswVar = this.zze;
        if (zzswVar == null) {
            if (isEmpty()) {
                Comparator comparator = ((zzsy) this.zzc).zza;
                if (comparator instanceof zzth) {
                    zzrwVar = (zzth) comparator;
                } else {
                    zzrwVar = new zzrw(comparator);
                }
                return zzk(zzrwVar.zza());
            }
            return new zzsw((zztp) this.zzc.descendingSet(), this.zzd.zzh(), this);
        }
        return zzswVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzd().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.zzc.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return zztd.zza(floorEntry(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r4 < 0) goto L3;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.ads.interactivemedia.v3.internal.zztp r0 = r3.zzc
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            com.google.ads.interactivemedia.v3.internal.zzso r2 = r0.zzd     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.zza     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            com.google.ads.interactivemedia.v3.internal.zzso r0 = r3.zzd
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzsw.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return zztd.zza(higherEntry(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.zzc;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzd().get(this.zzd.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.zzc.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return zztd.zza(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.zzc;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzsk zza() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzsk zzb() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zze() {
        if (isEmpty()) {
            return zzto.zza;
        }
        return new zzsv(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zzf() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final /* synthetic */ zzst zzh() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final boolean zzi() {
        if (!this.zzc.zzd.zzf() && !this.zzd.zzf()) {
            return false;
        }
        return true;
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzl */
    public final zzsw headMap(Object obj, boolean z) {
        zztp zztpVar = this.zzc;
        obj.getClass();
        return zzq(0, zztpVar.zzu(obj, z));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzn */
    public final zzsw subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (((zzsy) this.zzc).zza.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw new IllegalArgumentException(zzro.zzb("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzo */
    public final zzsw tailMap(Object obj, boolean z) {
        zztp zztpVar = this.zzc;
        obj.getClass();
        return zzq(zztpVar.zzv(obj, z), this.zzd.size());
    }
}
