package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfnr extends AbstractCollection {
    final /* synthetic */ zzfns zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnr(zzfns zzfnsVar) {
        this.zza = zzfnsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfns zzfnsVar = this.zza;
        Map zzg = zzfnsVar.zzg();
        if (zzg != null) {
            return zzg.values().iterator();
        }
        return new zzfnl(zzfnsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
