package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public final class zzflc {
    public static <V> zzfsm<V> zza(Task<V> task) {
        final zzfsu zza = zzfsu.zza();
        task.addOnCompleteListener(zzfst.zza(), new OnCompleteListener(zza) { // from class: com.google.android.gms.internal.ads.zzflb
            private final zzfsu zza;

            {
                this.zza = zza;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfsu zzfsuVar = this.zza;
                if (task2.isCanceled()) {
                    zzfsuVar.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfsuVar.zzp(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception == null) {
                        throw new IllegalStateException();
                    }
                    zzfsuVar.zzq(exception);
                }
            }
        });
        return zza;
    }
}
