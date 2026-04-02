package com.me.game.pm_tools;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes5.dex */
public class x {
    public static Message a(int i, int i2, int i3) {
        Message message = new Message();
        message.what = i;
        message.arg1 = i2;
        message.arg2 = i3;
        return message;
    }

    public static void b(Handler handler, Runnable runnable) {
        c(handler, runnable, 0L);
    }

    public static void c(Handler handler, Runnable runnable, long j) {
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public static void d(Handler handler) {
        f(handler);
    }

    public static void e(Handler handler, Runnable runnable) {
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static void f(Handler handler) {
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static void g(Handler handler, int i) {
        if (handler != null) {
            handler.removeMessages(i);
        }
    }

    public static void h(Handler handler, int i) {
        i(handler, i, 0L);
    }

    public static void i(Handler handler, int i, long j) {
        if (handler != null) {
            handler.sendEmptyMessageDelayed(i, j);
        }
    }

    public static void j(Handler handler, Message message, long j) {
        if (handler != null) {
            handler.sendMessageDelayed(message, j);
        }
    }
}
