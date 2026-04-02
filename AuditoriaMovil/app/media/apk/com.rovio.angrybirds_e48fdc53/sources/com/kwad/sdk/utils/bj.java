package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.io.Closeable;
/* loaded from: classes3.dex */
public final class bj {
    private static long jO = 400;
    private static final Handler aKx = new Handler(Looper.getMainLooper());

    public static void a(Context context, Vibrator vibrator) {
        vibrate(context, vibrator, jO);
    }

    public static void a(Runnable runnable, Object obj, long j) {
        Handler handler = aKx;
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = null;
        handler.sendMessageDelayed(obtain, j);
    }

    public static void b(Context context, Vibrator vibrator) {
        if (vibrator == null || al.ao(context, "android.permission.VIBRATE") != 0) {
            return;
        }
        vibrator.cancel();
    }

    public static void b(Runnable runnable) {
        aKx.removeCallbacks(runnable);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    public static void postOnUiThread(Runnable runnable) {
        aKx.post(runnable);
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            aKx.post(runnable);
        }
    }

    public static void runOnUiThreadDelay(Runnable runnable, long j) {
        aKx.postDelayed(runnable, j);
    }

    public static void vibrate(Context context, Vibrator vibrator, long j) {
        if (vibrator != null) {
            try {
                if (al.ao(context, "android.permission.VIBRATE") == 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
                    } else {
                        vibrator.vibrate(j);
                    }
                }
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTrace(th);
            }
        }
    }
}
