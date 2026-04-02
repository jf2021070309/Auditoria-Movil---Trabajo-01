package com.google.android.gms.internal.common;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class zzaa<E> extends zzab<E> {
    public Object[] zza = new Object[4];
    public int zzb = 0;
    public boolean zzc;

    public zzaa(int i2) {
    }

    private final void zzb(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i2) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i3 = length + (length >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i3);
        this.zzc = false;
    }

    public final zzaa<E> zza(E e2) {
        Objects.requireNonNull(e2);
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = e2;
        return this;
    }
}
