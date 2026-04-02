package com.umeng.ccg;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;
/* compiled from: Dispatch.java */
/* loaded from: classes3.dex */
public class b {
    public static final int a = 101;
    public static final int b = 102;
    public static final int c = 103;
    public static final int d = 104;
    public static final int e = 105;
    public static final int f = 106;
    public static final int g = 107;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 201;
    public static final int l = 202;
    public static final int m = 203;
    public static final int n = 301;
    public static final int o = 302;
    public static final int p = 303;
    private static HandlerThread q = null;
    private static Handler r = null;
    private static HashMap<Integer, a> s = null;
    private static final int t = 256;

    /* compiled from: Dispatch.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Object obj, int i);
    }

    public static void a(Context context, int i2, int i3, a aVar, Object obj, long j2) {
        if (context == null || aVar == null) {
            return;
        }
        if (s == null) {
            s = new HashMap<>();
        }
        Integer valueOf = Integer.valueOf(i3 / 100);
        if (!s.containsKey(valueOf)) {
            s.put(valueOf, aVar);
        }
        if (q == null || r == null) {
            a();
        }
        try {
            Handler handler = r;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i2;
                obtainMessage.arg1 = i3;
                obtainMessage.obj = obj;
                r.sendMessageDelayed(obtainMessage, j2);
            }
        } catch (Throwable th) {
        }
    }

    public static void a(Context context, int i2, a aVar, Object obj) {
        a(context, 256, i2, aVar, obj, 0L);
    }

    public static void a(Context context, int i2, a aVar, Object obj, long j2) {
        a(context, 256, i2, aVar, obj, j2);
    }

    private b() {
    }

    private static synchronized void a() {
        synchronized (b.class) {
            try {
                if (q == null) {
                    HandlerThread handlerThread = new HandlerThread("ccg_dispatch");
                    q = handlerThread;
                    handlerThread.start();
                    if (r == null) {
                        r = new Handler(q.getLooper()) { // from class: com.umeng.ccg.b.1
                            @Override // android.os.Handler
                            public void handleMessage(Message message) {
                                if (message.what == 256) {
                                    b.b(message);
                                }
                            }
                        };
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        int i2 = message.arg1;
        Object obj = message.obj;
        Integer valueOf = Integer.valueOf(i2 / 100);
        HashMap<Integer, a> hashMap = s;
        if (hashMap == null) {
            return;
        }
        a aVar = null;
        if (hashMap.containsKey(valueOf)) {
            aVar = s.get(valueOf);
        }
        if (aVar != null) {
            aVar.a(obj, i2);
        }
    }
}
