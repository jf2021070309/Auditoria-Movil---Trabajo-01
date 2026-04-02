package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzddq implements Runnable {
    private final WeakReference<zzddr> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzddq(zzddr zzddrVar, zzddp zzddpVar) {
        this.zza = new WeakReference<>(zzddrVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzddr zzddrVar = this.zza.get();
        if (zzddrVar != null) {
            zzddrVar.zzk(zzddo.zza);
        }
    }
}
