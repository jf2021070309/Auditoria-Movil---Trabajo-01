package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceIdService extends zzb {
    @Override // com.google.firebase.iid.zzb
    protected final Intent zzb(Intent intent) {
        return zzav.zzai().a.poll();
    }

    @Override // com.google.firebase.iid.zzb
    public final void zzd(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            onTokenRefresh();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length()).append("Received command: ").append(stringExtra).append(" - ").append(valueOf).toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.getInstance().e();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.getInstance().i();
            }
        }
    }

    @Deprecated
    public void onTokenRefresh() {
    }
}
