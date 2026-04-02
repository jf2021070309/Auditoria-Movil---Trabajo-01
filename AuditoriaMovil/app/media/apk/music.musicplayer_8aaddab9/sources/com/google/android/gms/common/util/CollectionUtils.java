package com.google.android.gms.common.util;

import c.f.c;
import com.google.android.gms.common.annotation.KeepForSdk;
import e.a.d.a.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
@KeepForSdk
/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T t) {
        return Collections.singletonList(t);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : listOf(tArr[0]) : listOf();
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k2, V v, K k3, V v2, K k4, V v3) {
        Map zza = zza(3, false);
        zza.put(k2, v);
        zza.put(k3, v2);
        zza.put(k4, v3);
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6) {
        Map zza = zza(6, false);
        zza.put(k2, v);
        zza.put(k3, v2);
        zza.put(k4, v3);
        zza.put(k5, v4);
        zza.put(k6, v5);
        zza.put(k7, v6);
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map zza = zza(length, false);
                    for (int i2 = 0; i2 < kArr.length; i2++) {
                        zza.put(kArr[i2], vArr[i2]);
                    }
                    return Collections.unmodifiableMap(zza);
                }
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException(a.S(66, "Key and values array lengths not equal: ", length, " != ", length2));
    }

    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i2) {
        return i2 == 0 ? new c(0) : zzb(i2, true);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T t, T t2, T t3) {
        Set zzb = zzb(3, false);
        zzb.add(t);
        zzb.add(t2);
        zzb.add(t3);
        return Collections.unmodifiableSet(zzb);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t = tArr[0];
                    T t2 = tArr[1];
                    Set zzb = zzb(2, false);
                    zzb.add(t);
                    zzb.add(t2);
                    return Collections.unmodifiableSet(zzb);
                } else if (length != 3) {
                    if (length != 4) {
                        Set zzb2 = zzb(length, false);
                        Collections.addAll(zzb2, tArr);
                        return Collections.unmodifiableSet(zzb2);
                    }
                    T t3 = tArr[0];
                    T t4 = tArr[1];
                    T t5 = tArr[2];
                    T t6 = tArr[3];
                    Set zzb3 = zzb(4, false);
                    zzb3.add(t3);
                    zzb3.add(t4);
                    zzb3.add(t5);
                    zzb3.add(t6);
                    return Collections.unmodifiableSet(zzb3);
                } else {
                    return setOf(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    private static <K, V> Map<K, V> zza(int i2, boolean z) {
        return i2 <= 256 ? new c.f.a(i2) : new HashMap(i2, 1.0f);
    }

    private static <T> Set<T> zzb(int i2, boolean z) {
        return i2 <= (true != z ? 256 : 128) ? new c(i2) : new HashSet(i2, true != z ? 1.0f : 0.75f);
    }
}
