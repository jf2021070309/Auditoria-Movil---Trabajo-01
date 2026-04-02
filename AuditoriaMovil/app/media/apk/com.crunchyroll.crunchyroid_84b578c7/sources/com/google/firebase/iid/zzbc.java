package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzbc extends Binder {
    private final zzbe zza;

    public zzbc(zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    public final void zza(final zzbg zzbgVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("FirebaseInstanceId", 3);
            this.zza.zza(zzbgVar.zza).addOnCompleteListener(zzh.zza(), new OnCompleteListener(zzbgVar) { // from class: com.google.firebase.iid.zzbf
                private final zzbg zza;

                {
                    this.zza = zzbgVar;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.zza.zzb();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
