package com.google.android.gms.internal.auth;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class zzgt implements Iterator<String> {
    public final Iterator<String> zza;
    public final /* synthetic */ zzgu zzb;

    public zzgt(zzgu zzguVar) {
        zzfa zzfaVar;
        this.zzb = zzguVar;
        zzfaVar = zzguVar.zza;
        this.zza = zzfaVar.iterator();
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
