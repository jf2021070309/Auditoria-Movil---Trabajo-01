package com.google.android.gms.internal.cast_tv;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzki implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzkj zzb;

    public zzki(zzkj zzkjVar) {
        zzij zzijVar;
        this.zzb = zzkjVar;
        zzijVar = zzkjVar.zza;
        this.zza = zzijVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
