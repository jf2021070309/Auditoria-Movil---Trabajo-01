package com.me.game.pmadsdk.utils;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public class HandlerUtils {
    public static void sendEmptyMessage(Handler handler, int what) {
        sendEmptyMessageDelayed(handler, what, 0L);
    }

    public static void sendEmptyMessageDelayed(Handler handler, int what, long delayMillis) {
        if (handler != null) {
            handler.sendEmptyMessageDelayed(what, delayMillis);
        }
    }

    public static void sendMessageDelayed(Handler handler, Message msg, long delayMillis) {
        if (handler != null) {
            handler.sendMessageDelayed(msg, delayMillis);
        }
    }

    public static Message obtainMessage(int what, int arg1, int arg2) {
        Message message = new Message();
        message.what = what;
        message.arg1 = arg1;
        message.arg2 = arg2;
        return message;
    }

    public static void post(Handler handler, Runnable r) {
        postDelayed(handler, r, 0L);
    }

    public static void postDelayed(Handler handler, Runnable r, long delayMillis) {
        if (handler != null) {
            handler.postDelayed(r, delayMillis);
        }
    }

    public static void removeMessages(Handler handler, int what) {
        if (handler != null) {
            handler.removeMessages(what);
        }
    }

    public static void removeCallbacks(Handler handler, Runnable r) {
        if (handler != null) {
            handler.removeCallbacks(r);
        }
    }

    public static void removeCallbacksAndMessages(Handler handler) {
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static void release(Handler handler) {
        removeCallbacksAndMessages(handler);
    }
}
