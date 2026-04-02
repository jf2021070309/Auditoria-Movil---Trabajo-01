package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfnf extends AbstractCollection {
    final /* synthetic */ zzfng zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnf(zzfng zzfngVar) {
        this.zza = zzfngVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzi();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzo();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zzg();
    }
}
