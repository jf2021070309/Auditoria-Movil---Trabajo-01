package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfno extends AbstractSet {
    final /* synthetic */ zzfns zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
        if (zzg != null) {
            return zzg.keySet().iterator();
        }
        return new zzfnj(zzfnsVar);
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
