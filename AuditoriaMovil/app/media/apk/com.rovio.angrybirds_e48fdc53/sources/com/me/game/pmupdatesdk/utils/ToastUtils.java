package com.me.game.pmupdatesdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.me.game.pmupdatesdk.PMUpdateSDK;
import java.lang.reflect.Field;
/* loaded from: classes7.dex */
public class ToastUtils {
    private static volatile ToastUtils mIns = null;
    private Toast textToast = null;

    public static ToastUtils getIns() {
        synchronized (ToastUtils.class) {
            if (mIns == null) {
                mIns = new ToastUtils();
            }
        }
        return mIns;
    }

    private ToastUtils() {
    }

    public void showShortToast(int resId) {
        showToast(PMUpdateSDK.mPMUpdateSDK.getString(resId), 0);
    }

    public void showShortToast(String text) {
        showToast(text, 0);
    }

    public void showLongToast(int resId) {
        showToast(PMUpdateSDK.mPMUpdateSDK.getString(resId), 1);
    }

    public void showLongToast(String text) {
        showToast(text, 1);
    }

    public void showToast(final String text, final int duration) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.me.game.pmupdatesdk.utils.ToastUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (ToastUtils.this.textToast != null) {
                        ToastUtils.this.textToast.cancel();
                        ToastUtils.this.textToast = null;
                    }
                    ToastUtils.this.textToast = Toast.makeText(PMUpdateSDK.mPMUpdateSDK, text, duration);
                    ToastUtils.hookToast(ToastUtils.this.textToast);
                    ToastUtils.this.textToast.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            PMUpdateSDK.mPMUpdateSDK.post(runnable);
        }
    }

    public void popupToast(Handler handler, int resId, int duration) {
        popupToast(handler, PMUpdateSDK.mPMUpdateSDK.getString(resId), duration, 0L);
    }

    public void popupToast(Handler handler, String text, int duration) {
        popupToast(handler, text, duration, 0L);
    }

    public void popupToast(Handler handler, int resId, int duration, long delayMillis) {
        popupToast(handler, PMUpdateSDK.mPMUpdateSDK.getString(resId), duration, delayMillis);
    }

    public void popupToast(Handler handler, final String text, final int duration, long delayMillis) {
        HandlerUtils.postDelayed(handler, new Runnable() { // from class: com.me.game.pmupdatesdk.utils.ToastUtils.2
            @Override // java.lang.Runnable
            public void run() {
                ToastUtils.this.showToast(text, duration);
            }
        }, delayMillis);
    }

    public static void hookToast(Toast toast) {
        try {
            Field fTn = Toast.class.getDeclaredField("mTN");
            fTn.setAccessible(true);
            Object oTn = fTn.get(toast);
            Class<?> cTn = oTn.getClass();
            Field fHandle = cTn.getDeclaredField("mHandler");
            fHandle.setAccessible(true);
            fHandle.set(oTn, new HandlerProxy((Handler) fHandle.get(oTn)));
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class HandlerProxy extends Handler {
        private Handler mHandler;

        public HandlerProxy(Handler handler) {
            this.mHandler = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            try {
                this.mHandler.handleMessage(msg);
            } catch (Exception e) {
            }
        }
    }
}
