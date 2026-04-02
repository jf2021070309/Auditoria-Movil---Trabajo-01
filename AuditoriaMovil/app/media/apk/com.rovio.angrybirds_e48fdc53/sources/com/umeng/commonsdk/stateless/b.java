package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.util.LinkedList;
/* compiled from: UMSLNetWorkSender.java */
/* loaded from: classes3.dex */
public class b {
    public static final int a = 273;
    private static Context b = null;
    private static final int f = 274;
    private static final int g = 275;
    private static final int h = 512;
    private static a i;
    private static IntentFilter j;
    private static HandlerThread c = null;
    private static Handler d = null;
    private static Object e = new Object();
    private static volatile boolean k = false;
    private static LinkedList<String> l = new LinkedList<>();

    public static void a(boolean z) {
        k = z;
        if (z) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
            b(f);
            return;
        }
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UMSLNetWorkSender.java */
    /* loaded from: classes3.dex */
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if ((i & 8) == 8) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
                b.a((int) b.f);
            }
        }
    }

    public static boolean a() {
        synchronized (e) {
            if (i != null) {
                return true;
            }
            return false;
        }
    }

    public b(Context context) {
        synchronized (e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    b = applicationContext;
                    if (applicationContext != null && c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        c = handlerThread;
                        handlerThread.start();
                        if (i == null) {
                            String str = b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f;
                            File file = new File(str);
                            if (!file.exists()) {
                                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            a aVar = new a(str);
                            i = aVar;
                            aVar.startWatching();
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (d == null) {
                            d = new Handler(c.getLooper()) { // from class: com.umeng.commonsdk.stateless.b.1
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i2 = message.what;
                                    if (i2 != 512) {
                                        switch (i2) {
                                            case b.a /* 273 */:
                                                b.l();
                                                return;
                                            case b.f /* 274 */:
                                                b.n();
                                                return;
                                            case b.g /* 275 */:
                                                b.p();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    b.q();
                                }
                            };
                        }
                    }
                }
            }
        }
    }

    public static void a(int i2) {
        Handler handler;
        if (k && (handler = d) != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i2;
            d.sendMessage(obtainMessage);
        }
    }

    public static void b(int i2) {
        Handler handler;
        try {
            if (k && (handler = d) != null && !handler.hasMessages(i2)) {
                Message obtainMessage = d.obtainMessage();
                obtainMessage.what = i2;
                d.sendMessage(obtainMessage);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(b, th);
        }
    }

    private static void i() {
        File[] c2 = d.c(b);
        if (c2 != null) {
            if (l.size() > 0) {
                l.clear();
            }
            for (File file : c2) {
                l.add(file.getAbsolutePath());
            }
        }
    }

    private static String j() {
        String str = null;
        try {
            String peek = l.peek();
            if (peek != null) {
                try {
                    l.removeFirst();
                    return peek;
                } catch (Throwable th) {
                    str = peek;
                    return str;
                }
            }
            return peek;
        } catch (Throwable th2) {
        }
    }

    private static void k() {
        String j2;
        String str;
        String str2;
        if (l.size() <= 0) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            if (Build.VERSION.SDK_INT >= 9) {
                j2 = l.pollFirst();
            } else {
                j2 = j();
            }
            if (!TextUtils.isEmpty(j2)) {
                File file = new File(j2);
                if (!file.exists()) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                    continue;
                } else {
                    c cVar = new c(b);
                    byte[] bArr = null;
                    try {
                        bArr = d.a(j2);
                    } catch (Exception e2) {
                    }
                    String name = file.getName();
                    if (TextUtils.isEmpty(name)) {
                        str = "u";
                    } else {
                        str = name.substring(0, 1);
                    }
                    String c2 = d.c(d.d(name));
                    if (!com.umeng.commonsdk.vchannel.a.c.equalsIgnoreCase(c2)) {
                        str2 = "";
                    } else {
                        str2 = com.umeng.commonsdk.vchannel.a.a;
                    }
                    if (cVar.a(bArr, c2, str2, str) && !file.delete()) {
                        file.delete();
                        continue;
                    }
                }
            }
        } while (j2 != null);
        l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        File a2;
        if (!k || b == null) {
            return;
        }
        do {
            try {
                a2 = d.a(b);
                if (a2 != null && a2.getParentFile() != null && !TextUtils.isEmpty(a2.getParentFile().getName())) {
                    c cVar = new c(b);
                    String str = new String(Base64.decode(a2.getParentFile().getName(), 0));
                    if (!com.umeng.commonsdk.internal.a.a.equalsIgnoreCase(str) && !com.umeng.commonsdk.internal.a.b.equalsIgnoreCase(str) && !com.umeng.commonsdk.internal.a.H.equalsIgnoreCase(str)) {
                        ULog.i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        byte[] bArr = null;
                        try {
                            bArr = d.a(a2.getAbsolutePath());
                        } catch (Exception e2) {
                        }
                        String str2 = "";
                        if (com.umeng.commonsdk.vchannel.a.c.equalsIgnoreCase(str)) {
                            str2 = com.umeng.commonsdk.vchannel.a.a;
                        }
                        String str3 = "u";
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str)) {
                            str3 = "s";
                        }
                        if (cVar.a(bArr, str, str2, (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) ? "p" : "p")) {
                            ULog.i("walle", "[stateless] Send envelope file success, delete it.");
                            File file = new File(a2.getAbsolutePath());
                            if (!file.delete()) {
                                ULog.i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                                file.delete();
                            }
                            continue;
                        } else {
                            ULog.i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                    }
                    new File(a2.getAbsolutePath()).delete();
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(b, th);
            }
        } while (a2 != null);
        m();
    }

    private static void m() {
        try {
            File file = new File(b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                d.a(file);
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        if (!k || b == null) {
            return;
        }
        i();
        k();
        c();
    }

    private static void o() {
        try {
            File file = new File(b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                b(a);
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p() {
        o();
    }

    public static void b() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        b(f);
    }

    public static void c() {
        b(g);
    }

    public static void d() {
        b(512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q() {
    }
}
