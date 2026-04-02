package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.g;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.j;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.m;
import com.bytedance.msdk.adapter.config.IGMInitAdnResult;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.ad.custom.init.GMCustomAdapterConfiguration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b {
    private static final bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1.a e = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1.a();
    private static Map<String, Pair<Boolean, String>> f = new ConcurrentHashMap();
    private static final CountDownLatch g = new CountDownLatch(1);
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicBoolean c = new AtomicBoolean(false);
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1.b d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb;
            String str;
            if (b.f.containsKey("pangle")) {
                b.j();
            }
            Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 支持ADN初始化信息 start ---------------------");
            for (Map.Entry entry : b.f.entrySet()) {
                if (entry.getValue() != null) {
                    if (!((Boolean) ((Pair) entry.getValue()).first).booleanValue()) {
                        sb = new StringBuilder();
                        sb.append("adnName = ");
                        sb.append((String) entry.getKey());
                        sb.append(" 初始化失败 ");
                        str = (String) ((Pair) entry.getValue()).second;
                    } else if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().h((String) entry.getKey())) {
                        sb = new StringBuilder();
                        sb.append("adnName = ");
                        sb.append((String) entry.getKey());
                        str = " 自定义ADN调用初始化方法成功，请开发者确保接入的自定义ADN初始化结果";
                    } else {
                        Logger.i("TTMediationSDK_SDK_Init", "adnName = " + ((String) entry.getKey()) + " 初始化成功");
                    }
                    sb.append(str);
                    Logger.e("TTMediationSDK_SDK_Init", sb.toString());
                }
            }
            Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 支持ADN初始化信息 end ---------------------");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0055b implements Runnable {
        final /* synthetic */ Context a;

        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b$b$a */
        /* loaded from: classes.dex */
        class a implements IGMInitAdnResult {
            a() {
            }

            @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
            public void fail(AdError adError) {
                b.this.b.set(true);
                b.this.g();
            }

            @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
            public void success() {
                b.this.b.set(true);
                b.this.g();
            }
        }

        RunnableC0055b(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.a, new a());
            b.this.f(this.a);
            b.this.h(this.a);
            b.this.a.set(true);
            b.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        final /* synthetic */ Context a;

        c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b(this.a);
            b.this.a(this.a);
            b.this.c(this.a);
            b.this.i(this.a);
            b.this.g(this.a);
            b.j(this.a);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.b.a(this.a);
            b.this.c.set(true);
            b.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements IGMInitAdnResult {
        final /* synthetic */ IGMInitAdnResult a;

        d(b bVar, IGMInitAdnResult iGMInitAdnResult) {
            this.a = iGMInitAdnResult;
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void fail(AdError adError) {
            b.i();
            IGMInitAdnResult iGMInitAdnResult = this.a;
            if (iGMInitAdnResult != null) {
                iGMInitAdnResult.fail(adError);
            }
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void success() {
            b.i();
            IGMInitAdnResult iGMInitAdnResult = this.a;
            if (iGMInitAdnResult != null) {
                iGMInitAdnResult.success();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        final /* synthetic */ Context a;

        e(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d(this.a);
            b.this.e(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.b.get() && b.this.a.get() && b.this.c.get() && b.this.d != null && b.this.a.get() && b.this.c.get() && b.this.d != null) {
                b.this.d.a();
            }
        }
    }

    public static GMCustomAdapterConfiguration a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return e.b(str);
    }

    public static String a(Map<String, Object> map, String str) {
        return e.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.a(context).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, IGMInitAdnResult iGMInitAdnResult) {
        j.a(context).a(new d(this, iGMInitAdnResult));
    }

    public static void a(String str, Pair<Boolean, String> pair) {
        f.put(str, pair);
    }

    public static Map<String, Object> b(Map<String, Object> map, String str) {
        return e.b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.b(context).e();
    }

    public static int c() {
        return f.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.e(context).e();
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1.a d() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        RunnableC0055b runnableC0055b = new RunnableC0055b(context);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnableC0055b.run();
        } else {
            ThreadHelper.runOnUiThread(runnableC0055b);
        }
    }

    public static String e() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a("pangle");
        String a3 = a2 != null ? a2.a() : null;
        return TextUtils.isEmpty(a3) ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b() : a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        ThreadHelper.runOnThreadPool(new c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.f(context).e();
    }

    public static boolean f() {
        return g.getCount() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ThreadHelper.runOnMSDKThread(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context) {
        new g(context).e();
    }

    public static void h() {
        synchronized (b.class) {
            ThreadHelper.runOnThreadPool(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Context context) {
        new h(context).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i() {
        g.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        new l(context).e();
    }

    public static void j() {
        try {
            g.await(4000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public static void j(Context context) {
        new m(context).e();
    }

    public void a(Context context, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1.b bVar) {
        this.d = bVar;
        this.a.set(false);
        this.c.set(false);
        this.b.set(false);
        ThreadHelper.runOnUiThread(new e(context));
    }
}
