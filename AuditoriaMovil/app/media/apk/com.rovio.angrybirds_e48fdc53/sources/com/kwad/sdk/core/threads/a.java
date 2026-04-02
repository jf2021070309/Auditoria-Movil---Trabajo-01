package com.kwad.sdk.core.threads;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.kwad.sdk.utils.bn;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class a {
    private static Map<String, WeakReference<C0259a>> avg = new ConcurrentHashMap();

    /* renamed from: com.kwad.sdk.core.threads.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0259a {
        private HandlerThread avh;
        private Handler mHandler;

        public C0259a(String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                str2 = "ksad-HT";
            } else {
                str2 = "ksad-" + str;
            }
            HandlerThread handlerThread = new HandlerThread(str2);
            this.avh = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.avh.getLooper());
        }

        public final bn b(bn.a aVar) {
            return new bn(aVar, this.avh.getLooper());
        }

        public final Handler getHandler() {
            return this.mHandler;
        }
    }

    public static synchronized Handler CM() {
        Handler handler;
        synchronized (a.class) {
            handler = dE("commonHT").getHandler();
        }
        return handler;
    }

    public static synchronized Handler CN() {
        Handler handler;
        synchronized (a.class) {
            handler = dE("reportHT").getHandler();
        }
        return handler;
    }

    public static synchronized bn a(bn.a aVar) {
        bn b;
        synchronized (a.class) {
            b = dE("commonHT").b(aVar);
        }
        return b;
    }

    private static C0259a dE(String str) {
        WeakReference<C0259a> weakReference = avg.get(str);
        if (weakReference == null || weakReference.get() == null) {
            C0259a c0259a = new C0259a(str);
            avg.put(str, new WeakReference<>(c0259a));
            return c0259a;
        }
        return weakReference.get();
    }
}
