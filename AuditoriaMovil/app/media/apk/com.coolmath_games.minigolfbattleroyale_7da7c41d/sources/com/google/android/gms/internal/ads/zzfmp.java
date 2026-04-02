package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfmp implements Iterator<Map.Entry> {
    final Iterator<Map.Entry> zza;
    @CheckForNull
    Collection zzb;
    final /* synthetic */ zzfmq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmp(zzfmq zzfmqVar) {
        this.zzc = zzfmqVar;
        this.zza = this.zzc.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.zza.next();
        this.zzb = (Collection) next.getValue();
        return this.zzc.zzb(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        zzflx.zzb(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfnd zzfndVar = this.zzc.zzb;
        i = zzfndVar.zzb;
        zzfndVar.zzb = i - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
