package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfnf extends AbstractCollection {
    public final /* synthetic */ zzfng zza;

    public zzfnf(zzfng zzfngVar) {
        this.zza = zzfngVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzi();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzo();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zzg();
    }
}
