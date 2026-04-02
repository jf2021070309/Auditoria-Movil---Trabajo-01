package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfms implements Iterator {
    @CheckForNull
    public Map.Entry zza;
    public final /* synthetic */ Iterator zzb;
    public final /* synthetic */ zzfmt zzc;

    public zzfms(zzfmt zzfmtVar, Iterator it) {
        this.zzc = zzfmtVar;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2;
        zzflx.zzb(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfnd zzfndVar = this.zzc.zza;
        i2 = zzfndVar.zzb;
        zzfndVar.zzb = i2 - collection.size();
        collection.clear();
        this.zza = null;
    }
}
