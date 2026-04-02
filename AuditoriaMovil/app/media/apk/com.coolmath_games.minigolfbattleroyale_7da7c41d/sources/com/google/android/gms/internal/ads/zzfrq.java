package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfrq<V> extends zzfrd<Object, V> {
    @CheckForNull
    private zzfrp<?> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrq(zzfoe<? extends zzfsm<?>> zzfoeVar, boolean z, Executor executor, Callable<V> callable) {
        super(zzfoeVar, z, false);
        this.zza = new zzfro(this, callable, executor);
        zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfrp zzJ(zzfrq zzfrqVar, zzfrp zzfrpVar) {
        zzfrqVar.zza = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    final void zzA() {
        zzfrp<?> zzfrpVar = this.zza;
        if (zzfrpVar != null) {
            zzfrpVar.zze();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzB(int i) {
        super.zzB(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzn() {
        zzfrp<?> zzfrpVar = this.zza;
        if (zzfrpVar != null) {
            zzfrpVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    final void zzz(int i, @CheckForNull Object obj) {
    }
}
