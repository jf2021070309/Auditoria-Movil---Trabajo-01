package com.kwad.sdk.api.loader;

import android.content.Context;
import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class d implements Thread.UncaughtExceptionHandler {
    private static d ais;
    private Thread.UncaughtExceptionHandler ait;
    private int aiu;
    private long aiw;
    private Context mContext;
    private boolean DEBUG = false;
    private final AtomicBoolean aiv = new AtomicBoolean();

    private d(Context context) {
        this.mContext = context;
    }

    public static d az(Context context) {
        if (ais == null) {
            synchronized (d.class) {
                if (ais == null) {
                    ais = new d(context);
                }
            }
        }
        return ais;
    }

    public final void bP(int i) {
        this.aiw = System.currentTimeMillis();
        this.aiu = i;
        if (this.DEBUG) {
            Log.d("test.chen", "startCheck:");
        }
    }

    public final void cancel() {
        if (this.DEBUG) {
            Log.d("test.chen", "AutoRevertHandler cancel:");
        }
        this.aiv.set(true);
    }

    public final void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler != this) {
            this.ait = uncaughtExceptionHandler;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (this.DEBUG) {
                Log.d("test.chen", "AutoRevertHandler uncaughtException, mStartCheckTime:" + this.aiw + ",mMaxDuration:" + this.aiu + ",mIsCancel:" + this.aiv.get());
            }
            if (!this.aiv.get() && this.aiw > 0 && System.currentTimeMillis() - this.aiw <= this.aiu) {
                Boolean bool = (Boolean) com.kwad.sdk.api.c.c("filterStack", th);
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                Context context = this.mContext;
                if (context != null && booleanValue) {
                    t.a(context, g.aiC, true);
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.ait;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.ait;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            } catch (Throwable th3) {
                if (this.ait != null) {
                    this.ait.uncaughtException(thread, th);
                }
                throw th3;
            }
        }
    }
}
