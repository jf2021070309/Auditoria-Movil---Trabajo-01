package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_19do.e;
import com.bytedance.mapplog.util.TTEncryptUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class q {
    private static volatile String a = "";
    private static volatile String b = "";
    private static volatile boolean c;
    private static volatile ExecutorService d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements RejectedExecutionHandler {
        a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = q.a = this.a;
            w.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), q.a);
            if (TextUtils.isEmpty(q.a)) {
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.f();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements bykvm_19do.bykvm_19do.bykvm_19do.c {
        c() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.c
        public void a(String str, String str2, String str3) {
            Logger.i("TTMediationSDK_SDK_Init", "applod from onIdLoaded ------------: did = " + str);
            q.d(str);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.c
        public void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
            Logger.i("TTMediationSDK_SDK_Init", "applod from onRemoteIdGet ------------: did = " + str2);
            q.d(str2);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.c
        public void a(boolean z, JSONObject jSONObject) {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.c
        public void b(boolean z, JSONObject jSONObject) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements bykvm_19do.bykvm_19do.bykvm_19do.e {
        d() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.e
        public void a(e.a aVar) {
            if (!TextUtils.isEmpty(q.b) || aVar == null || TextUtils.isEmpty(aVar.a)) {
                return;
            }
            Logger.i("TTMediationSDK_SDK_Init", "applod ------------: oaid = " + aVar.a);
            String unused = q.b = aVar.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements bykvm_19do.bykvm_19do.bykvm_19do.g {
        final /* synthetic */ Context a;

        e(Context context) {
            this.a = context;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.g
        public String a() {
            return w.i(this.a);
        }
    }

    public static void a(Context context) {
        b(context);
    }

    public static byte[] a(byte[] bArr, int i) {
        return TTEncryptUtils.a(bArr, i);
    }

    private static void b(Context context) {
        if (c) {
            return;
        }
        c = true;
        bykvm_19do.bykvm_19do.bykvm_19do.h hVar = new bykvm_19do.bykvm_19do.bykvm_19do.h("299838", "gromore");
        hVar.b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState());
        hVar.c(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseMacAddress());
        hVar.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseAndroidId());
        hVar.a(new e(context));
        bykvm_19do.bykvm_19do.bykvm_19do.a.a(context, hVar);
        c();
        d();
        HashMap hashMap = new HashMap();
        hashMap.put("host_appid", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b());
        hashMap.put("is_plugin", false);
        hashMap.put("sdk_version", "4.2.0.2");
        hashMap.put(PluginConstants.KEY_PLUGIN_VERSION, "4.2.0.2");
        hashMap.put("channel", "gromore");
        hashMap.put("sdk_api_version", "4.2.0.2");
        bykvm_19do.bykvm_19do.bykvm_19do.a.a(hashMap);
        Logger.i("TTMediationSDK_SDK_Init", "applod ------------: init end ");
    }

    public static String c() {
        if (TextUtils.isEmpty(a)) {
            a = bykvm_19do.bykvm_19do.bykvm_19do.a.g();
            Logger.i("TTMediationSDK_SDK_Init", "applod ------------: did from get = " + a);
            if (TextUtils.isEmpty(a)) {
                e();
            }
        }
        return a;
    }

    public static String d() {
        if (TextUtils.isEmpty(b) && TextUtils.isEmpty(b)) {
            f();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        g();
        d.execute(new b(str));
    }

    private static void e() {
        bykvm_19do.bykvm_19do.bykvm_19do.a.a(new c());
    }

    private static void f() {
        bykvm_19do.bykvm_19do.bykvm_19do.a.a(new d());
    }

    private static void g() {
        if (d == null) {
            synchronized (q.class) {
                if (d == null) {
                    d = ThreadHelper.initSingleThreadExecutor("applog", 5, new a());
                }
            }
        }
    }

    public static boolean h() {
        return bykvm_19do.bykvm_19do.bykvm_19do.a.n();
    }
}
