package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzfmr<T> implements Iterator<T> {
    final Iterator<Map.Entry> zza;
    @CheckForNull
    Object zzb;
    @CheckForNull
    Collection zzc;
    Iterator zzd;
    final /* synthetic */ zzfnd zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmr(zzfnd zzfndVar) {
        Map map;
        this.zze = zzfndVar;
        map = zzfndVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfow.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.zzd.hasNext()) {
            Map.Entry next = this.zza.next();
            this.zzb = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return (T) this.zzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zzd.remove();
        Collection collection = this.zzc;
        collection.getClass();
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfnd zzfndVar = this.zze;
        i = zzfndVar.zzb;
        zzfndVar.zzb = i - 1;
    }
}
