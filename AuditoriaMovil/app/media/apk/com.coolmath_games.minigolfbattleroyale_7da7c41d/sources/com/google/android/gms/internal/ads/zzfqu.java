package com.google.android.gms.internal.ads;

import java.lang.Throwable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfqu<V, X extends Throwable> extends zzfqv<V, X, zzfln<? super X, ? extends V>, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqu(zzfsm<? extends V> zzfsmVar, Class<X> cls, zzfln<? super X, ? extends V> zzflnVar) {
        super(zzfsmVar, cls, zzflnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqv
    final void zza(V v) {
        zzp(v);
    }

    @Override // com.google.android.gms.internal.ads.zzfqv
    final /* bridge */ /* synthetic */ Object zzb(Object obj, Throwable th) throws Exception {
        return ((zzfln) obj).apply(th);
    }
}
