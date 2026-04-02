package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzur extends zzui {
    private zzuq zza;

    public zzur(zzsk zzskVar, boolean z, Executor executor, Callable callable) {
        super(zzskVar, false, false);
        this.zza = new zzup(this, callable, executor);
        zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final void zzn() {
        zzuq zzuqVar = this.zza;
        if (zzuqVar != null) {
            zzuqVar.zzh();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzui
    public final void zzp() {
        zzuq zzuqVar = this.zza;
        if (zzuqVar != null) {
            zzuqVar.zzf();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzui
    public final void zzr(int i) {
        super.zzr(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
