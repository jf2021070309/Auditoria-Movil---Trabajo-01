package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class J implements com.ironsource.environment.k {
    private static J t;
    ac a;
    int b;
    int c;
    int d;
    int e;
    int f;
    boolean g;
    Handler i;
    CountDownTimer j;
    String l;
    String m;
    com.ironsource.mediationsdk.utils.k n;
    String o;
    SegmentListener p;
    boolean q;
    long r;
    com.ironsource.c.b s;
    private HandlerThread w;
    private AtomicBoolean y;
    private NetworkStateReceiver z;
    private final String u = "appKey";
    private final String v = getClass().getSimpleName();
    boolean h = false;
    private boolean x = false;
    List<com.ironsource.mediationsdk.utils.i> k = new ArrayList();
    private b B = new b() { // from class: com.ironsource.mediationsdk.J.1
        /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: Exception -> 0x03b7, TryCatch #1 {Exception -> 0x03b7, blocks: (B:2:0x0000, B:7:0x001a, B:11:0x002c, B:13:0x0032, B:18:0x003f, B:19:0x0043, B:21:0x004e, B:23:0x0054, B:33:0x00a8, B:35:0x00bf, B:36:0x00ca, B:38:0x00d4, B:39:0x00e1, B:41:0x0115, B:43:0x0126, B:48:0x01b1, B:50:0x01e8, B:52:0x01f2, B:53:0x01fd, B:55:0x0205, B:58:0x020a, B:60:0x0215, B:62:0x0219, B:64:0x0223, B:65:0x0228, B:67:0x022e, B:69:0x0232, B:71:0x023c, B:72:0x0241, B:74:0x0247, B:75:0x024c, B:77:0x0252, B:78:0x0257, B:79:0x025f, B:81:0x0265, B:82:0x0279, B:84:0x027f, B:86:0x028d, B:88:0x0295, B:89:0x029e, B:91:0x02b0, B:47:0x01ae, B:92:0x02dd, B:94:0x02e3, B:95:0x02f6, B:97:0x02fc, B:98:0x0308, B:100:0x030f, B:101:0x031b, B:103:0x0321, B:104:0x032b, B:106:0x032f, B:108:0x0339, B:110:0x0355, B:111:0x035f, B:113:0x0363, B:125:0x03af, B:115:0x036d, B:117:0x0373, B:119:0x037f, B:120:0x0383, B:121:0x038b, B:123:0x0391, B:124:0x039d, B:24:0x005b, B:26:0x0075, B:27:0x0079, B:32:0x00a1, B:28:0x007c, B:30:0x0096, B:31:0x009b, B:20:0x0047, B:6:0x0017, B:44:0x01a0, B:3:0x0008), top: B:132:0x0000, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: Exception -> 0x03b7, TryCatch #1 {Exception -> 0x03b7, blocks: (B:2:0x0000, B:7:0x001a, B:11:0x002c, B:13:0x0032, B:18:0x003f, B:19:0x0043, B:21:0x004e, B:23:0x0054, B:33:0x00a8, B:35:0x00bf, B:36:0x00ca, B:38:0x00d4, B:39:0x00e1, B:41:0x0115, B:43:0x0126, B:48:0x01b1, B:50:0x01e8, B:52:0x01f2, B:53:0x01fd, B:55:0x0205, B:58:0x020a, B:60:0x0215, B:62:0x0219, B:64:0x0223, B:65:0x0228, B:67:0x022e, B:69:0x0232, B:71:0x023c, B:72:0x0241, B:74:0x0247, B:75:0x024c, B:77:0x0252, B:78:0x0257, B:79:0x025f, B:81:0x0265, B:82:0x0279, B:84:0x027f, B:86:0x028d, B:88:0x0295, B:89:0x029e, B:91:0x02b0, B:47:0x01ae, B:92:0x02dd, B:94:0x02e3, B:95:0x02f6, B:97:0x02fc, B:98:0x0308, B:100:0x030f, B:101:0x031b, B:103:0x0321, B:104:0x032b, B:106:0x032f, B:108:0x0339, B:110:0x0355, B:111:0x035f, B:113:0x0363, B:125:0x03af, B:115:0x036d, B:117:0x0373, B:119:0x037f, B:120:0x0383, B:121:0x038b, B:123:0x0391, B:124:0x039d, B:24:0x005b, B:26:0x0075, B:27:0x0079, B:32:0x00a1, B:28:0x007c, B:30:0x0096, B:31:0x009b, B:20:0x0047, B:6:0x0017, B:44:0x01a0, B:3:0x0008), top: B:132:0x0000, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[Catch: Exception -> 0x03b7, TryCatch #1 {Exception -> 0x03b7, blocks: (B:2:0x0000, B:7:0x001a, B:11:0x002c, B:13:0x0032, B:18:0x003f, B:19:0x0043, B:21:0x004e, B:23:0x0054, B:33:0x00a8, B:35:0x00bf, B:36:0x00ca, B:38:0x00d4, B:39:0x00e1, B:41:0x0115, B:43:0x0126, B:48:0x01b1, B:50:0x01e8, B:52:0x01f2, B:53:0x01fd, B:55:0x0205, B:58:0x020a, B:60:0x0215, B:62:0x0219, B:64:0x0223, B:65:0x0228, B:67:0x022e, B:69:0x0232, B:71:0x023c, B:72:0x0241, B:74:0x0247, B:75:0x024c, B:77:0x0252, B:78:0x0257, B:79:0x025f, B:81:0x0265, B:82:0x0279, B:84:0x027f, B:86:0x028d, B:88:0x0295, B:89:0x029e, B:91:0x02b0, B:47:0x01ae, B:92:0x02dd, B:94:0x02e3, B:95:0x02f6, B:97:0x02fc, B:98:0x0308, B:100:0x030f, B:101:0x031b, B:103:0x0321, B:104:0x032b, B:106:0x032f, B:108:0x0339, B:110:0x0355, B:111:0x035f, B:113:0x0363, B:125:0x03af, B:115:0x036d, B:117:0x0373, B:119:0x037f, B:120:0x0383, B:121:0x038b, B:123:0x0391, B:124:0x039d, B:24:0x005b, B:26:0x0075, B:27:0x0079, B:32:0x00a1, B:28:0x007c, B:30:0x0096, B:31:0x009b, B:20:0x0047, B:6:0x0017, B:44:0x01a0, B:3:0x0008), top: B:132:0x0000, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d4 A[Catch: Exception -> 0x03b7, TryCatch #1 {Exception -> 0x03b7, blocks: (B:2:0x0000, B:7:0x001a, B:11:0x002c, B:13:0x0032, B:18:0x003f, B:19:0x0043, B:21:0x004e, B:23:0x0054, B:33:0x00a8, B:35:0x00bf, B:36:0x00ca, B:38:0x00d4, B:39:0x00e1, B:41:0x0115, B:43:0x0126, B:48:0x01b1, B:50:0x01e8, B:52:0x01f2, B:53:0x01fd, B:55:0x0205, B:58:0x020a, B:60:0x0215, B:62:0x0219, B:64:0x0223, B:65:0x0228, B:67:0x022e, B:69:0x0232, B:71:0x023c, B:72:0x0241, B:74:0x0247, B:75:0x024c, B:77:0x0252, B:78:0x0257, B:79:0x025f, B:81:0x0265, B:82:0x0279, B:84:0x027f, B:86:0x028d, B:88:0x0295, B:89:0x029e, B:91:0x02b0, B:47:0x01ae, B:92:0x02dd, B:94:0x02e3, B:95:0x02f6, B:97:0x02fc, B:98:0x0308, B:100:0x030f, B:101:0x031b, B:103:0x0321, B:104:0x032b, B:106:0x032f, B:108:0x0339, B:110:0x0355, B:111:0x035f, B:113:0x0363, B:125:0x03af, B:115:0x036d, B:117:0x0373, B:119:0x037f, B:120:0x0383, B:121:0x038b, B:123:0x0391, B:124:0x039d, B:24:0x005b, B:26:0x0075, B:27:0x0079, B:32:0x00a1, B:28:0x007c, B:30:0x0096, B:31:0x009b, B:20:0x0047, B:6:0x0017, B:44:0x01a0, B:3:0x0008), top: B:132:0x0000, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0115 A[Catch: Exception -> 0x03b7, TryCatch #1 {Exception -> 0x03b7, blocks: (B:2:0x0000, B:7:0x001a, B:11:0x002c, B:13:0x0032, B:18:0x003f, B:19:0x0043, B:21:0x004e, B:23:0x0054, B:33:0x00a8, B:35:0x00bf, B:36:0x00ca, B:38:0x00d4, B:39:0x00e1, B:41:0x0115, B:43:0x0126, B:48:0x01b1, B:50:0x01e8, B:52:0x01f2, B:53:0x01fd, B:55:0x0205, B:58:0x020a, B:60:0x0215, B:62:0x0219, B:64:0x0223, B:65:0x0228, B:67:0x022e, B:69:0x0232, B:71:0x023c, B:72:0x0241, B:74:0x0247, B:75:0x024c, B:77:0x0252, B:78:0x0257, B:79:0x025f, B:81:0x0265, B:82:0x0279, B:84:0x027f, B:86:0x028d, B:88:0x0295, B:89:0x029e, B:91:0x02b0, B:47:0x01ae, B:92:0x02dd, B:94:0x02e3, B:95:0x02f6, B:97:0x02fc, B:98:0x0308, B:100:0x030f, B:101:0x031b, B:103:0x0321, B:104:0x032b, B:106:0x032f, B:108:0x0339, B:110:0x0355, B:111:0x035f, B:113:0x0363, B:125:0x03af, B:115:0x036d, B:117:0x0373, B:119:0x037f, B:120:0x0383, B:121:0x038b, B:123:0x0391, B:124:0x039d, B:24:0x005b, B:26:0x0075, B:27:0x0079, B:32:0x00a1, B:28:0x007c, B:30:0x0096, B:31:0x009b, B:20:0x0047, B:6:0x0017, B:44:0x01a0, B:3:0x0008), top: B:132:0x0000, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0308 A[Catch: Exception -> 0x03b7, TryCatch #1 {Exception -> 0x03b7, blocks: (B:2:0x0000, B:7:0x001a, B:11:0x002c, B:13:0x0032, B:18:0x003f, B:19:0x0043, B:21:0x004e, B:23:0x0054, B:33:0x00a8, B:35:0x00bf, B:36:0x00ca, B:38:0x00d4, B:39:0x00e1, B:41:0x0115, B:43:0x0126, B:48:0x01b1, B:50:0x01e8, B:52:0x01f2, B:53:0x01fd, B:55:0x0205, B:58:0x020a, B:60:0x0215, B:62:0x0219, B:64:0x0223, B:65:0x0228, B:67:0x022e, B:69:0x0232, B:71:0x023c, B:72:0x0241, B:74:0x0247, B:75:0x024c, B:77:0x0252, B:78:0x0257, B:79:0x025f, B:81:0x0265, B:82:0x0279, B:84:0x027f, B:86:0x028d, B:88:0x0295, B:89:0x029e, B:91:0x02b0, B:47:0x01ae, B:92:0x02dd, B:94:0x02e3, B:95:0x02f6, B:97:0x02fc, B:98:0x0308, B:100:0x030f, B:101:0x031b, B:103:0x0321, B:104:0x032b, B:106:0x032f, B:108:0x0339, B:110:0x0355, B:111:0x035f, B:113:0x0363, B:125:0x03af, B:115:0x036d, B:117:0x0373, B:119:0x037f, B:120:0x0383, B:121:0x038b, B:123:0x0391, B:124:0x039d, B:24:0x005b, B:26:0x0075, B:27:0x0079, B:32:0x00a1, B:28:0x007c, B:30:0x0096, B:31:0x009b, B:20:0x0047, B:6:0x0017, B:44:0x01a0, B:3:0x0008), top: B:132:0x0000, inners: #0, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 956
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.J.AnonymousClass1.run():void");
        }
    };
    private a A = a.NOT_INIT;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class b implements Runnable {
        String b;
        boolean a = true;
        protected E.a c = new E.a() { // from class: com.ironsource.mediationsdk.J.b.1
            @Override // com.ironsource.mediationsdk.E.a
            public final void a(String str) {
                b.this.a = false;
                b.this.b = str;
            }
        };

        b() {
        }
    }

    private J() {
        this.w = null;
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.w = handlerThread;
        handlerThread.start();
        this.i = new Handler(this.w.getLooper());
        this.b = 1;
        this.c = 0;
        this.d = 62;
        this.e = 12;
        this.f = 5;
        this.y = new AtomicBoolean(true);
        this.g = false;
        this.q = false;
        this.s = new com.ironsource.c.b();
    }

    public static synchronized J a() {
        J j;
        synchronized (J.class) {
            if (t == null) {
                t = new J();
            }
            j = t;
        }
        return j;
    }

    public final synchronized void a(Context context, String str, String str2) {
        Handler handler;
        Runnable runnable;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.y == null || !this.y.compareAndSet(true, false)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            logger.log(ironSourceTag, this.v + ": Multiple calls to init are not allowed", 2);
            return;
        }
        a(a.INIT_IN_PROGRESS);
        this.l = str2;
        this.m = str;
        if (IronSourceUtils.isNetworkConnected(context)) {
            handler = this.i;
            runnable = this.B;
        } else {
            this.x = true;
            if (this.z == null) {
                this.z = new NetworkStateReceiver(context, this);
            }
            context.registerReceiver(this.z, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            handler = new Handler(Looper.getMainLooper());
            runnable = new Runnable() { // from class: com.ironsource.mediationsdk.J.2
                /* JADX WARN: Type inference failed for: r7v0, types: [com.ironsource.mediationsdk.J$2$1] */
                @Override // java.lang.Runnable
                public final void run() {
                    J.this.j = new CountDownTimer(60000L, 15000L) { // from class: com.ironsource.mediationsdk.J.2.1
                        {
                            super(60000L, 15000L);
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            if (J.this.h) {
                                return;
                            }
                            J.this.h = true;
                            for (com.ironsource.mediationsdk.utils.i iVar : J.this.k) {
                                iVar.a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                            }
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                        }

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j) {
                            if (j <= 45000) {
                                J.this.q = true;
                                for (com.ironsource.mediationsdk.utils.i iVar : J.this.k) {
                                    iVar.f();
                                }
                            }
                        }
                    }.start();
                }
            };
        }
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(a aVar) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setInitStatus(old status: " + this.A + ", new status: " + aVar + ")", 0);
        this.A = aVar;
    }

    public final void a(com.ironsource.mediationsdk.utils.i iVar) {
        if (iVar == null) {
            return;
        }
        this.k.add(iVar);
    }

    @Override // com.ironsource.environment.k
    public final void a(boolean z) {
        if (this.x && z) {
            CountDownTimer countDownTimer = this.j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.x = false;
            this.g = true;
            this.i.post(this.B);
        }
    }

    public final synchronized a b() {
        return this.A;
    }

    public final void b(boolean z) {
        Map<String, String> map;
        if (z && TextUtils.isEmpty(E.a().o) && (map = this.n.c.e.g().a) != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.doesClassExist(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    E.a().d(str);
                    return;
                }
            }
        }
    }

    public final synchronized boolean c() {
        return this.q;
    }
}
