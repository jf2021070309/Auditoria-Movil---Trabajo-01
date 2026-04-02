package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes2.dex */
public final class zzav {
    private static zzav b;
    private final SimpleArrayMap<String, String> c = new SimpleArrayMap<>();
    private Boolean d = null;
    final Queue<Intent> a = new ArrayDeque();
    private final Queue<Intent> e = new ArrayDeque();

    public static synchronized zzav zzai() {
        zzav zzavVar;
        synchronized (zzav.class) {
            if (b == null) {
                b = new zzav();
            }
            zzavVar = b;
        }
        return zzavVar;
    }

    private zzav() {
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, a(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    public static void zzb(Context context, Intent intent) {
        context.sendBroadcast(a(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    public static void zzc(Context context, Intent intent) {
        context.sendBroadcast(a(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    private static Intent a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public final Intent zzaj() {
        return this.e.poll();
    }

    public final int zzb(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Starting service: ".concat(valueOf) : new String("Starting service: "));
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -842411455:
                if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
                    c = 0;
                    break;
                }
                break;
            case 41532704:
                if (str.equals("com.google.firebase.MESSAGING_EVENT")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.a.offer(intent);
                break;
            case 1:
                this.e.offer(intent);
                break;
            default:
                String valueOf2 = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf2.length() != 0 ? "Unknown service action: ".concat(valueOf2) : new String("Unknown service action: "));
                return TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: SecurityException -> 0x0115, IllegalStateException -> 0x0124, TryCatch #4 {IllegalStateException -> 0x0124, SecurityException -> 0x0115, blocks: (B:12:0x0028, B:14:0x002c, B:17:0x0035, B:18:0x003b, B:20:0x0043, B:22:0x0049, B:55:0x0108), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: SecurityException -> 0x0115, IllegalStateException -> 0x0124, TryCatch #4 {IllegalStateException -> 0x0124, SecurityException -> 0x0115, blocks: (B:12:0x0028, B:14:0x002c, B:17:0x0035, B:18:0x003b, B:20:0x0043, B:22:0x0049, B:55:0x0108), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: SecurityException -> 0x0115, IllegalStateException -> 0x0124, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0124, SecurityException -> 0x0115, blocks: (B:12:0x0028, B:14:0x002c, B:17:0x0035, B:18:0x003b, B:20:0x0043, B:22:0x0049, B:55:0x0108), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108 A[Catch: SecurityException -> 0x0115, IllegalStateException -> 0x0124, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0124, SecurityException -> 0x0115, blocks: (B:12:0x0028, B:14:0x002c, B:17:0x0035, B:18:0x003b, B:20:0x0043, B:22:0x0049, B:55:0x0108), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(android.content.Context r7, android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzav.a(android.content.Context, android.content.Intent):int");
    }
}
