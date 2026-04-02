package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.amazon.aps.iva.h5.a;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class FirebaseInstanceIdReceiver extends a {
    private final ExecutorService zza = zzh.zzb();

    public static final /* synthetic */ void zza(boolean z, BroadcastReceiver.PendingResult pendingResult, Task task) {
        int i;
        if (z) {
            if (task.isSuccessful()) {
                i = ((Integer) task.getResult()).intValue();
            } else {
                i = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
            }
            pendingResult.setResultCode(i);
        }
        pendingResult.finish();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        zzb zzaVar;
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof Intent) {
            intent2 = (Intent) parcelableExtra;
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            intent = intent2;
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            zzaVar = new zzz(this.zza);
        } else {
            zzaVar = new zza(context, this.zza);
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        zzaVar.zza(intent).addOnCompleteListener(this.zza, new OnCompleteListener(isOrderedBroadcast, goAsync) { // from class: com.google.firebase.iid.zzr
            private final boolean zza;
            private final BroadcastReceiver.PendingResult zzb;

            {
                this.zza = isOrderedBroadcast;
                this.zzb = goAsync;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseInstanceIdReceiver.zza(this.zza, this.zzb, task);
            }
        });
    }
}
