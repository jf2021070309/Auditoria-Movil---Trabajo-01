package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfno extends AbstractSet {
    public final /* synthetic */ zzfns zza;

    public zzfno(zzfns zzfnsVar) {
        this.zza = zzfnsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfns zzfnsVar = this.zza;
        Map zzg = zzfnsVar.zzg();
        return zzg != null ? zzg.keySet().iterator() : new zzfnj(zzfnsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Object zzz;
        Object obj2;
        Map zzg = this.zza.zzg();
        if (zzg != null) {
            return zzg.keySet().remove(obj);
        }
        zzz = this.zza.zzz(obj);
        obj2 = zzfns.zzd;
        return zzz != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
