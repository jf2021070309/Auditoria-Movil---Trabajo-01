package com.google.ads.interactivemedia.pal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.pal.zzfm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
final class zzas implements Continuation {
    final /* synthetic */ NonceManager zza;

    public zzas(NonceManager nonceManager) {
        this.zza = nonceManager;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) throws Exception {
        Context context;
        Activity zza = NonceManager.zza(this.zza);
        context = this.zza.zzd;
        return ((zzfm) task.getResult()).zzc(context, null, zza);
    }
}
