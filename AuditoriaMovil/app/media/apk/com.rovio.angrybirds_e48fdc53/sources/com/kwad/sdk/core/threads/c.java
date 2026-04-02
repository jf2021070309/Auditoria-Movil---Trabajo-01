package com.kwad.sdk.core.threads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static int avA;
    private static int avz;
    private static long interval;
    private static long startTime;
    public static final String TAG = c.class.getSimpleName();
    private static int avy = 0;
    private static final ConcurrentHashMap<ThreadPoolExecutor, Long> avB = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<ThreadPoolExecutor, String> avC = new ConcurrentHashMap<>();

    static /* synthetic */ int Dg() {
        int i = avy;
        avy = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(d dVar) {
        com.kwad.sdk.core.threads.a.b.avG = true;
        com.kwad.sdk.core.threads.a.a.avG = true;
        interval = dVar.interval;
        avA = dVar.avF;
        HandlerThread handlerThread = new HandlerThread("pollingHT");
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        startTime = SystemClock.elapsedRealtime();
        handler.post(new aw() { // from class: com.kwad.sdk.core.threads.c.2
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                ExecutorService dF;
                for (String str : GlobalThreadPools.Da()) {
                    if (str != null && !c.avC.containsValue(str) && (dF = GlobalThreadPools.dF(str)) != null && (dF instanceof ThreadPoolExecutor) && !c.avB.containsKey(dF)) {
                        c.a((ThreadPoolExecutor) dF, str);
                    }
                }
                int i = 0;
                for (ThreadPoolExecutor threadPoolExecutor : c.avC.keySet()) {
                    i += threadPoolExecutor.getPoolSize();
                    b b = c.b(threadPoolExecutor, (String) c.avC.get(threadPoolExecutor));
                    if (b != null) {
                        KSLoggerReporter.B(b.toJson());
                    }
                }
                b bVar = new b();
                bVar.avo = "total";
                bVar.avr = i;
                KSLoggerReporter.B(bVar.toJson());
                c.Dg();
                if (c.avy < c.avA) {
                    handler.postDelayed(this, c.interval);
                }
            }
        });
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, String str) {
        avB.put(threadPoolExecutor, Long.valueOf(threadPoolExecutor.getCompletedTaskCount()));
        avC.put(threadPoolExecutor, str);
    }

    public static b b(ThreadPoolExecutor threadPoolExecutor, String str) {
        if (threadPoolExecutor == null) {
            return null;
        }
        b bVar = new b();
        bVar.avo = str;
        bVar.avp = threadPoolExecutor.getCorePoolSize();
        bVar.avq = threadPoolExecutor.getMaximumPoolSize();
        bVar.avr = threadPoolExecutor.getPoolSize();
        bVar.avs = threadPoolExecutor.getActiveCount();
        bVar.avv = threadPoolExecutor.getQueue() == null ? 0 : threadPoolExecutor.getQueue().size();
        ConcurrentHashMap<ThreadPoolExecutor, Long> concurrentHashMap = avB;
        long longValue = (!concurrentHashMap.containsKey(threadPoolExecutor) || concurrentHashMap.get(threadPoolExecutor) == null) ? 0L : concurrentHashMap.get(threadPoolExecutor).longValue();
        long completedTaskCount = threadPoolExecutor.getCompletedTaskCount();
        bVar.avu = completedTaskCount - longValue;
        concurrentHashMap.put(threadPoolExecutor, Long.valueOf(completedTaskCount));
        if (threadPoolExecutor instanceof com.kwad.sdk.core.threads.a.c) {
            bVar.avt = ((com.kwad.sdk.core.threads.a.c) threadPoolExecutor).Dk();
        } else {
            bVar.avt = 0L;
        }
        bVar.avw = SystemClock.elapsedRealtime() - startTime;
        bVar.interval = interval;
        bVar.avx = avz;
        return bVar;
    }

    public static void dG(final String str) {
        g.execute(new aw() { // from class: com.kwad.sdk.core.threads.c.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                d dH;
                if (TextUtils.isEmpty(str) || (dH = c.dH(str)) == null || dH.avz == 0) {
                    return;
                }
                int unused = c.avz = dH.avz;
                if (Math.random() * c.avz >= 1.0d) {
                    return;
                }
                c.a(dH);
            }
        });
    }

    public static d dH(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            d dVar = new d();
            dVar.parseJson(jSONObject);
            return dVar;
        } catch (Exception e) {
            return null;
        }
    }
}
