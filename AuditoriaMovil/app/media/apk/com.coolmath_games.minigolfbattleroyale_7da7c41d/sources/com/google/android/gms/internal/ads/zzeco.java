package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzeco implements Callable {
    private final zzecm zza;

    private zzeco(zzecm zzecmVar) {
        this.zza = zzecmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Callable zza(zzecm zzecmVar) {
        return new zzeco(zzecmVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
