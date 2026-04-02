package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzacx implements Runnable {
    final /* synthetic */ zzacy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacx(zzacy zzacyVar) {
        this.zza = zzacyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzacy.zza(this.zza);
    }
}
