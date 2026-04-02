package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgkx {
    public static <T> List<T> zza(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> HashSet<T> zzb(int i) {
        return new HashSet<>(zzd(i));
    }

    public static <K, V> LinkedHashMap<K, V> zzc(int i) {
        return new LinkedHashMap<>(zzd(i));
    }

    private static int zzd(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
