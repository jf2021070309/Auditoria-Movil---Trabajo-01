package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzfs {
    Object[] zza;
    int zzb;
    zzfr zzc;

    public zzfs() {
        this(4);
    }

    private final void zzb(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfl.zza(length, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfs zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzb(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzb(this.zzb + 1);
            zzfh.zza(key, value);
            Object[] objArr = this.zza;
            int i = this.zzb;
            int i2 = i + i;
            objArr[i2] = key;
            objArr[i2 + 1] = value;
            this.zzb = i + 1;
        }
        return this;
    }

    public zzfs(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
