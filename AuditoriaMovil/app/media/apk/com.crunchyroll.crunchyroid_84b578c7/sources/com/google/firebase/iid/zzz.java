package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
final class zzz implements zzb {
    private final ExecutorService zza;

    public zzz(ExecutorService executorService) {
        this.zza = executorService;
    }

    @Override // com.google.firebase.iid.zzb
    public final Task<Integer> zza(final Intent intent) {
        return Tasks.call(this.zza, new Callable(intent) { // from class: com.google.firebase.iid.zzy
            private final Intent zza;

            {
                this.zza = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Intent intent2 = this.zza;
                String stringExtra = intent2.getStringExtra("CMD");
                if (stringExtra != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        new StringBuilder(String.valueOf(intent2.getExtras()).length() + stringExtra.length() + 21);
                    }
                    if (!"RST".equals(stringExtra) && !"RST_FULL".equals(stringExtra)) {
                        if ("SYNC".equals(stringExtra)) {
                            FirebaseInstanceId.getInstance().zzg();
                        }
                    } else {
                        FirebaseInstanceId.getInstance().zze();
                    }
                }
                return -1;
            }
        });
    }
}
