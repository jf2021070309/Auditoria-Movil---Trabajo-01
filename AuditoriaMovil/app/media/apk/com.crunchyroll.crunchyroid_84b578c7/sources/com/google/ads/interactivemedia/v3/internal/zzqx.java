package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzqx {
    public static zzvq zza(Task task) {
        final zzqw zzqwVar = new zzqw(task);
        task.addOnCompleteListener(zzvw.zzb(), new OnCompleteListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzqv
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzqw zzqwVar2 = zzqw.this;
                if (task2.isCanceled()) {
                    zzqwVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzqwVar2.zzc(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        zzqwVar2.zzd(exception);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzqwVar;
    }
}
