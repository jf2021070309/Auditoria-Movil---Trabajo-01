package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class zzar implements Iterator<zzap> {
    public final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i2 = this.zzb;
        str = this.zza.zza;
        return i2 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzap next() {
        String str;
        int i2 = this.zzb;
        str = this.zza.zza;
        if (i2 < str.length()) {
            int i3 = this.zzb;
            this.zzb = i3 + 1;
            return new zzat(String.valueOf(i3));
        }
        throw new NoSuchElementException();
    }
}
