package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcom {
    private final zzcgz zza;
    private final Context zzb;
    private final WeakReference<Context> zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcom(zzcok zzcokVar, zzcol zzcolVar) {
        zzcgz zzcgzVar;
        Context context;
        WeakReference<Context> weakReference;
        zzcgzVar = zzcokVar.zza;
        this.zza = zzcgzVar;
        context = zzcokVar.zzb;
        this.zzb = context;
        weakReference = zzcokVar.zzc;
        this.zzc = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference<Context> zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcgz zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zzb, this.zza.zza);
    }

    public final zzaas zze() {
        return new zzaas(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }
}
