package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.firebase.iid.zzaw;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
public class FirebaseMessagingService extends zzf {
    private static final Queue<String> zza = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.zzf
    public final Intent zza(Intent intent) {
        return zzaw.zza().zzb();
    }

    @Override // com.google.firebase.messaging.zzf
    public final boolean zzb(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                }
            }
            if (zzp.zzd(intent)) {
                zzp.zza(intent);
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (r1.equals("send_error") == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    @Override // com.google.firebase.messaging.zzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.zzc(android.content.Intent):void");
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
