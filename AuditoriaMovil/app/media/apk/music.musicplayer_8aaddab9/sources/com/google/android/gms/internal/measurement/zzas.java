package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class zzas implements Iterator<zzap> {
    public final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzas(zzat zzatVar) {
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
        String str2;
        int i2 = this.zzb;
        str = this.zza.zza;
        if (i2 < str.length()) {
            str2 = this.zza.zza;
            int i3 = this.zzb;
            this.zzb = i3 + 1;
            return new zzat(String.valueOf(str2.charAt(i3)));
        }
        throw new NoSuchElementException();
    }
}
