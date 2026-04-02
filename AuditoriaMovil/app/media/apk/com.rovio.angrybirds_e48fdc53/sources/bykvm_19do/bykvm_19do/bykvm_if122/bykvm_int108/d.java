package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w;
import com.bytedance.msdk.adapter.util.Logger;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    private static Context a;
    private static a b;
    private static a c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private final String c;
        private final long d;
        private final int e;
        private final int f;
        private final JSONObject g;
        private volatile boolean b = false;
        private int i = 0;
        private final long h = System.currentTimeMillis();
        private final Handler a = new Handler(Looper.getMainLooper());

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0057a implements Runnable {
            RunnableC0057a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.b(w.d(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
                a.d(a.this);
                if (a.this.i >= 5 || d.d()) {
                    a.this.a(1);
                    return;
                }
                Logger.d("TMe", "--==-- 重试一次 eventType:" + a.this.c + ", 重试次数：" + a.this.i);
                a.this.a();
            }
        }

        public a(String str, long j, int i, int i2, JSONObject jSONObject) {
            this.c = str;
            this.d = j;
            this.e = i;
            this.f = i2;
            this.g = jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.a.postDelayed(new RunnableC0057a(), 500L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
            if (r1 != 1) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(r9.d, r9.e, r9.f, r9.h, r9.g);
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000d, B:8:0x0012, B:9:0x003d, B:13:0x0066, B:26:0x008f, B:27:0x009d, B:18:0x0078, B:21:0x0082, B:12:0x0044), top: B:33:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(int r10) {
            /*
                r9 = this;
                monitor-enter(r9)
                android.os.Handler r0 = r9.a     // Catch: java.lang.Throwable -> La4
                r1 = 0
                r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> La4
                boolean r0 = r9.b     // Catch: java.lang.Throwable -> La4
                if (r0 == 0) goto Ld
                goto La2
            Ld:
                r0 = 1
                r9.b = r0     // Catch: java.lang.Throwable -> La4
                if (r10 != r0) goto L41
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
                r10.<init>()     // Catch: java.lang.Throwable -> La4
                java.lang.String r1 = "TMe"
                java.lang.String r2 = "--==-- 最终上报：eventType:"
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r2 = r9.c     // Catch: java.lang.Throwable -> La4
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r2 = ", 重试次数："
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                int r2 = r9.i     // Catch: java.lang.Throwable -> La4
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r2 = ", did: "
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.a()     // Catch: java.lang.Throwable -> La4
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La4
            L3d:
                com.bytedance.msdk.adapter.util.Logger.d(r1, r10)     // Catch: java.lang.Throwable -> La4
                goto L66
            L41:
                r1 = 2
                if (r10 != r1) goto L66
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
                r10.<init>()     // Catch: java.lang.Throwable -> La4
                java.lang.String r1 = "TMe"
                java.lang.String r2 = "--==-- 最终上报：eventType:"
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r2 = r9.c     // Catch: java.lang.Throwable -> La4
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r2 = ", 从applog回调中上报, did: "
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.a()     // Catch: java.lang.Throwable -> La4
                r10.append(r2)     // Catch: java.lang.Throwable -> La4
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La4
                goto L3d
            L66:
                java.lang.String r10 = r9.c     // Catch: java.lang.Throwable -> La4
                r1 = -1
                int r2 = r10.hashCode()     // Catch: java.lang.Throwable -> La4
                r3 = -834688111(0xffffffffce3fab91, float:-8.0392301E8)
                if (r2 == r3) goto L82
                r3 = 270071285(0x1018f5f5, float:3.0166193E-29)
                if (r2 == r3) goto L78
                goto L8b
            L78:
                java.lang.String r2 = "sdk_init"
                boolean r10 = r10.equals(r2)     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L8b
                r1 = 0
                goto L8b
            L82:
                java.lang.String r2 = "sdk_init_end"
                boolean r10 = r10.equals(r2)     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L8b
                r1 = r0
            L8b:
                if (r1 == 0) goto L9d
                if (r1 != r0) goto La2
                long r2 = r9.d     // Catch: java.lang.Throwable -> La4
                int r4 = r9.e     // Catch: java.lang.Throwable -> La4
                int r5 = r9.f     // Catch: java.lang.Throwable -> La4
                long r6 = r9.h     // Catch: java.lang.Throwable -> La4
                org.json.JSONObject r8 = r9.g     // Catch: java.lang.Throwable -> La4
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(r2, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> La4
                goto La2
            L9d:
                long r0 = r9.h     // Catch: java.lang.Throwable -> La4
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.b(r0)     // Catch: java.lang.Throwable -> La4
            La2:
                monitor-exit(r9)
                return
            La4:
                r10 = move-exception
                monitor-exit(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.a.a(int):void");
        }

        static /* synthetic */ int d(a aVar) {
            int i = aVar.i;
            aVar.i = i + 1;
            return i;
        }
    }

    static /* synthetic */ String a() {
        return c();
    }

    public static void a(long j, int i, int i2, JSONObject jSONObject) {
        a aVar = new a("sdk_init_end", j, i, i2, jSONObject);
        c = aVar;
        aVar.a();
    }

    public static void a(Context context) {
        a = context;
    }

    private static Context b() {
        Context context = a;
        return context != null ? context : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f0.a("tt_device_info", b()).b("did", str);
    }

    private static String c() {
        return f0.a("tt_device_info", b()).a("did", (String) null);
    }

    public static boolean d() {
        return !TextUtils.isEmpty(f0.a("tt_device_info", b()).a("did", (String) null));
    }

    public static void e() {
        a aVar = new a("sdk_init", 0L, 0, 0, null);
        b = aVar;
        aVar.a();
    }

    public static void f() {
        a aVar = b;
        if (aVar == null) {
            Logger.d("TMe", "--==-- sdkInit埋点还未产生，applog回调已触发，直接return");
            return;
        }
        if (aVar.b) {
            Logger.d("TMe", "--==-- applog回调触发时，sdkInit埋点已经上报，直接return");
        } else {
            b.a(2);
        }
        b = null;
    }

    public static void g() {
        a aVar = c;
        if (aVar == null) {
            Logger.d("TMe", "--==-- sdkInitEnd埋点还未产生，applog回调已触发，直接return");
            return;
        }
        if (aVar.b) {
            Logger.d("TMe", "--==-- applog回调触发时，sdkInitEnd埋点已经上报，直接return");
        } else {
            c.a(2);
        }
        c = null;
    }
}
