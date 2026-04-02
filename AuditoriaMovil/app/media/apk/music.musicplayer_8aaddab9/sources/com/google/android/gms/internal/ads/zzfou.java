package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class zzfou extends zzfql {
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzfou(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
