package com.google.android.gms.internal.pal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzdz implements Runnable {
    final /* synthetic */ zzeb zza;

    public zzdz(zzeb zzebVar) {
        this.zza = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf();
    }
}
