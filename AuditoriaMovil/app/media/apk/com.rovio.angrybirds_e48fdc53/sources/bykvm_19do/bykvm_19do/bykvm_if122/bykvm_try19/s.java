package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.qq.e.ads.nativ.NativeUnifiedADAppInfoImpl;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.umeng.analytics.pro.bg;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e
        public List<String> a() {
            return null;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e
        public String b() {
            return w.d(this.a);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e
        public String c() {
            return null;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e
        public Map<String, Object> d() {
            HashMap hashMap = new HashMap();
            hashMap.put("host_appid", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b());
            hashMap.put("sdk_version", "4.2.0.2");
            hashMap.put(PluginConstants.KEY_PLUGIN_VERSION, "4.2.0.2");
            hashMap.put("channel", "gromore");
            return hashMap;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e
        public Map<String, Object> e() {
            HashMap hashMap = new HashMap();
            String c = q.c();
            if (TextUtils.isEmpty(c)) {
                c = w.d(this.a);
            }
            if (!TextUtils.isEmpty(c)) {
                hashMap.put("device_id", c);
            }
            hashMap.put("ac", z.d(this.a));
            hashMap.put("aid", "299838");
            hashMap.put("app_name", "gromore");
            String e = n0.e();
            if (!TextUtils.isEmpty(e)) {
                hashMap.put("app_version", e);
            }
            String d = n0.d();
            if (!TextUtils.isEmpty(d)) {
                hashMap.put("version_code", d);
                hashMap.put("update_version_code", d);
            }
            hashMap.put(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME, "4.2.0.2");
            hashMap.put("device_platform", "android");
            hashMap.put(bg.x, "Android");
            hashMap.put(bg.ai, Build.MODEL);
            hashMap.put("device_mode", Build.MODEL);
            hashMap.put("rom", e0.k());
            hashMap.put("cpu_abi", Build.CPU_ABI);
            hashMap.put(bg.F, Build.BRAND);
            hashMap.put("channel", "gromore");
            hashMap.put(bg.N, Locale.getDefault().getLanguage());
            hashMap.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
            try {
                String str = Build.VERSION.RELEASE;
                if (str != null && str.length() > 10) {
                    str = str.substring(0, 10);
                }
                hashMap.put(bg.y, str);
            } catch (Exception e2) {
            }
            hashMap.put("openudid", w.a(this.a));
            hashMap.put("dpi", String.valueOf(this.a.getResources().getDisplayMetrics().density));
            hashMap.put(bg.z, this.a.getResources().getDisplayMetrics().widthPixels + "*" + this.a.getResources().getDisplayMetrics().heightPixels);
            return hashMap;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e
        public Map<String, Integer> f() {
            return null;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.e
        public String g() {
            return bykvm_19do.bykvm_19do.bykvm_19do.a.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.g {
        b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0002, B:5:0x0015, B:7:0x001d, B:13:0x002b, B:15:0x0035), top: B:19:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        @Override // bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(java.lang.Throwable r4, java.lang.Thread r5) {
            /*
                r3 = this;
                r5 = 0
                r0 = 1
                java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L42
                r1.<init>()     // Catch: java.lang.Throwable -> L42
                java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L42
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L42
                r4.printStackTrace(r2)     // Catch: java.lang.Throwable -> L42
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L42
                if (r4 == 0) goto L43
                java.lang.String r1 = "com.bytedance.msdk"
                boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L42
                if (r1 != 0) goto L28
                java.lang.String r1 = "bykvm"
                boolean r4 = r4.contains(r1)     // Catch: java.lang.Throwable -> L42
                if (r4 == 0) goto L26
                goto L28
            L26:
                r4 = r5
                goto L29
            L28:
                r4 = r0
            L29:
                if (r4 == 0) goto L43
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.s$c r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.s.c.b()     // Catch: java.lang.Throwable -> L42
                java.util.Map r4 = r4.a()     // Catch: java.lang.Throwable -> L42
                if (r4 == 0) goto L40
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.s$c r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.s.c.b()     // Catch: java.lang.Throwable -> L42
                java.util.Map r4 = r4.a()     // Catch: java.lang.Throwable -> L42
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.h.a(r4)     // Catch: java.lang.Throwable -> L42
            L40:
                r5 = r0
                goto L43
            L42:
                r4 = move-exception
            L43:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.s.b.a(java.lang.Throwable, java.lang.Thread):boolean");
        }
    }

    /* loaded from: classes.dex */
    private static class c {
        private static String b = "ad_style";
        private static String c = "ad_id";
        private static String d = "rit";
        private static String e = "request_id";
        private static String f = "ad_slot_type";
        private static String g = "net_type";
        private static String h = "low_memory";
        private static String i = "total_max_memory_rate";
        private static String j = "category";
        private static String k = "commit_hash";
        private static String l = "branch";
        private static String m = "plugin_version";
        private static volatile c n;
        private Map<String, String> a;

        private c() {
            HashMap hashMap = new HashMap();
            this.a = hashMap;
            hashMap.put(b, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(c, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(d, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(e, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(f, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(g, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(h, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(i, DownloadSettingKeys.BugFix.DEFAULT);
            this.a.put(j, "main");
            this.a.put(k, "2454608");
            this.a.put(l, "v4202_adapter");
            this.a.put(m, "4.2.0.2");
        }

        public static c b() {
            if (n == null) {
                synchronized (c.class) {
                    if (n == null) {
                        n = new c();
                    }
                }
            }
            return n;
        }

        public Map<String, String> a() {
            return this.a;
        }
    }

    private static void a() {
        try {
            if (q.h()) {
                return;
            }
            f0 a2 = f0.a((String) null, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
            int a3 = a2.a("applog_so_fail_upload_time", -1);
            int i = Calendar.getInstance().get(6);
            if (a3 != i) {
                a2.b("applog_so_fail_upload_time", i);
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.h.a("applog so load failed");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context) {
        b(context);
    }

    private static void b(Context context) {
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.h.a(context, new a(context), true, false);
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.h.a(new b());
        a();
    }
}
