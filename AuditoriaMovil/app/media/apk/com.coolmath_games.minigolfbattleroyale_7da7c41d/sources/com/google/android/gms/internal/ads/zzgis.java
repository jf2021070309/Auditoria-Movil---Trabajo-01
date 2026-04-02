package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgis implements Iterator<String> {
    final Iterator<String> zza;
    final /* synthetic */ zzgit zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgis(zzgit zzgitVar) {
        zzggs zzggsVar;
        this.zzb = zzgitVar;
        zzggsVar = this.zzb.zza;
        this.zza = zzggsVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
