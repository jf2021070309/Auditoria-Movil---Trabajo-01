package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfoo extends zzfql {
    final Iterator<? extends zzfoe> zza;
    Iterator zzb = zzfov.zza;
    final /* synthetic */ zzfor zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoo(zzfor zzforVar) {
        this.zzc = zzforVar;
        this.zza = ((zzfoj) this.zzc.zzb.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = this.zza.next().iterator();
        }
        return this.zzb.next();
    }
}
