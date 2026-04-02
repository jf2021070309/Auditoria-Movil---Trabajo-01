package com.google.android.gms.internal.pal;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzafm implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzafn zzb;

    public zzafm(zzafn zzafnVar) {
        zzadn zzadnVar;
        this.zzb = zzafnVar;
        zzadnVar = zzafnVar.zza;
        this.zza = zzadnVar.iterator();
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
