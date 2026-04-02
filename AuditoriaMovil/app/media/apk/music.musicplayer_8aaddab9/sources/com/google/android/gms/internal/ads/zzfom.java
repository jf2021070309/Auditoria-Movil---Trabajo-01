package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzfom<K, V> {
    public Object[] zza;
    public int zzb;

    public zzfom() {
        this(4);
    }

    public zzfom(int i2) {
        this.zza = new Object[i2 + i2];
        this.zzb = 0;
    }

    private final void zzd(int i2) {
        int i3 = i2 + i2;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i3 > length) {
            this.zza = Arrays.copyOf(objArr, zzfod.zzd(length, i3));
        }
    }

    public final zzfom<K, V> zza(K k2, V v) {
        zzd(this.zzb + 1);
        zzfni.zza(k2, v);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + i2;
        objArr[i3] = k2;
        objArr[i3 + 1] = v;
        this.zzb = i2 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfom<K, V> zzb(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfon<K, V> zzc() {
        return zzfqc.zzh(this.zzb, this.zza);
    }
}
