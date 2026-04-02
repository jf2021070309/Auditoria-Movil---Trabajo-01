package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfrq<V> extends zzfrd<Object, V> {
    @CheckForNull
    private zzfrp<?> zza;

    public zzfrq(zzfoe<? extends zzfsm<?>> zzfoeVar, boolean z, Executor executor, Callable<V> callable) {
        super(zzfoeVar, z, false);
        this.zza = new zzfro(this, callable, executor);
        zzb();
    }

    public static /* synthetic */ zzfrp zzJ(zzfrq zzfrqVar, zzfrp zzfrpVar) {
        zzfrqVar.zza = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzA() {
        zzfrp<?> zzfrpVar = this.zza;
        if (zzfrpVar != null) {
            zzfrpVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzB(int i2) {
        super.zzB(i2);
        if (i2 == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzn() {
        zzfrp<?> zzfrpVar = this.zza;
        if (zzfrpVar != null) {
            zzfrpVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final void zzz(int i2, @CheckForNull Object obj) {
    }
}
