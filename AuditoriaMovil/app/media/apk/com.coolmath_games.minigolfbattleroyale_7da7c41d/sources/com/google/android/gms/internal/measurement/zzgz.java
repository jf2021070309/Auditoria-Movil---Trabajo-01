package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
final class zzgz extends ContentObserver {
    final /* synthetic */ zzha zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgz(zzha zzhaVar, Handler handler) {
        super(null);
        this.zza = zzhaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzc();
    }
}
