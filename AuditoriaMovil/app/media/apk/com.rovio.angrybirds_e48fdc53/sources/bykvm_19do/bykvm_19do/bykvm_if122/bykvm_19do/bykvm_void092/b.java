package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.d0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.z;
import com.bytedance.msdk.adapter.config.DefaultAdapterClasses;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.adapter.util.WeakHandler;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.UserInfoForSegment;
import com.bytedance.msdk.api.v2.GMConfigCallback;
import com.bytedance.msdk.api.v2.GMConfigUserInfoForSegment;
import com.facebook.AccessToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements WeakHandler.IHandler {
    private static volatile boolean i;
    private static volatile b j;
    private final bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.a a;
    private final Context b;
    private final WeakHandler f;
    private final AtomicInteger c = new AtomicInteger(0);
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean g = new AtomicBoolean(false);
    private int h = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ GMConfigCallback a;
        final /* synthetic */ AdError b;

        a(b bVar, GMConfigCallback gMConfigCallback, AdError adError) {
            this.a = gMConfigCallback;
            this.b = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            GMConfigCallback gMConfigCallback = this.a;
            if (gMConfigCallback != null) {
                gMConfigCallback.onConfigLoadFail(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0050b implements Runnable {
        final /* synthetic */ GMConfigCallback a;
        final /* synthetic */ List b;

        RunnableC0050b(b bVar, GMConfigCallback gMConfigCallback, List list) {
            this.a = gMConfigCallback;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.onConfigLoaded(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a {
        final /* synthetic */ int[] a;
        final /* synthetic */ int[] b;
        final /* synthetic */ long c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;
        final /* synthetic */ JSONObject f;
        final /* synthetic */ GMConfigCallback g;

        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b a;

            a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b bVar) {
                this.a = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[Catch: all -> 0x0270, TryCatch #6 {all -> 0x0270, blocks: (B:6:0x0018, B:8:0x0028, B:10:0x0047, B:13:0x0074, B:29:0x00e9, B:31:0x0110, B:33:0x0116, B:34:0x011d, B:36:0x012b, B:39:0x0135, B:43:0x0189, B:20:0x00a5, B:27:0x00de, B:22:0x00b7, B:15:0x0082), top: B:79:0x0018 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0135 A[Catch: all -> 0x0270, TryCatch #6 {all -> 0x0270, blocks: (B:6:0x0018, B:8:0x0028, B:10:0x0047, B:13:0x0074, B:29:0x00e9, B:31:0x0110, B:33:0x0116, B:34:0x011d, B:36:0x012b, B:39:0x0135, B:43:0x0189, B:20:0x00a5, B:27:0x00de, B:22:0x00b7, B:15:0x0082), top: B:79:0x0018 }] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x01ab  */
            /* JADX WARN: Type inference failed for: r13v4 */
            /* JADX WARN: Type inference failed for: r13v5 */
            /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r15v0 */
            /* JADX WARN: Type inference failed for: r15v2 */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.String] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 773
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.c.a.run():void");
            }
        }

        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0051b implements Runnable {
            final /* synthetic */ IOException a;

            RunnableC0051b(IOException iOException) {
                this.a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.e("SdkSettingsHelper", "----网络错误，服务器无响应，稍后会尝试重新拉取配置----，setting request failed..." + this.a.getMessage());
                try {
                    b.this.a(c.this.g, new AdError(-2, AdError.getMessage(-2)), c.this.e);
                    Logger.e("SdkSettingsHelper", "----网络错误，重新拉取配置失败----，>>>>> retryLoadSettingData");
                } catch (Throwable th) {
                }
                b.this.d.set(false);
                c cVar = c.this;
                int[] iArr = cVar.b;
                iArr[0] = 0;
                int[] iArr2 = cVar.a;
                iArr2[0] = -2;
                int i = iArr[0];
                int i2 = iArr2[0];
                long currentTimeMillis = System.currentTimeMillis();
                c cVar2 = c.this;
                h.a(i, i2, currentTimeMillis - cVar2.c, cVar2.d, cVar2.e == 0, c.this.f, -1L, (JSONObject) null);
            }
        }

        c(int[] iArr, int[] iArr2, long j, boolean z, int i, JSONObject jSONObject, GMConfigCallback gMConfigCallback) {
            this.a = iArr;
            this.b = iArr2;
            this.c = j;
            this.d = z;
            this.e = i;
            this.f = jSONObject;
            this.g = gMConfigCallback;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b bVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b bVar2) {
            ThreadHelper.runOnMSDKThread(new a(bVar2));
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b bVar, IOException iOException) {
            ThreadHelper.runOnMSDKThread(new RunnableC0051b(iOException));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        public static final String a = n0.a() + ".openadsdk.permission.TT_PANGOLIN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        private final GMConfigCallback a;
        private int b;

        e(GMConfigCallback gMConfigCallback, int i) {
            this.b = 1;
            this.a = gMConfigCallback;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!z.a(b.this.b)) {
                try {
                    b.this.a.a(false);
                    return;
                } catch (Throwable th) {
                    return;
                }
            }
            b.this.d.set(true);
            boolean B = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().B();
            if (!b.i) {
                boolean unused = b.i = true;
                h.a(B);
            }
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_for12.a.a()) {
                return;
            }
            b.this.a(B, this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    private class f extends BroadcastReceiver {
        private f() {
        }

        /* synthetic */ f(b bVar, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            if (intent == null) {
                return;
            }
            Logger.d("SdkSettingsHelper", "--==-- settings receiver");
            if (intent.getIntExtra("b_msg_id", -1) == 1) {
                try {
                    if (TextUtils.equals(intent.getStringExtra("b_msg_process_name"), d0.a(b.this.b))) {
                        str = "--==-- settings receiver, same process, return";
                    } else if (b.this.a == null) {
                        return;
                    } else {
                        Logger.d("SdkSettingsHelper", "--==-- settings receiver loadData");
                        b.this.a.a(false);
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().f();
                        str = "--==-- settings receiver loadData end";
                    }
                    Logger.d("SdkSettingsHelper", str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.a aVar) {
        this.a = aVar == null ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f() : aVar;
        Context d2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d();
        this.b = d2;
        this.f = new WeakHandler(Looper.getMainLooper(), this);
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().u()) {
            try {
                d2.registerReceiver(new f(this, null), new IntentFilter("com.bytedance.msdk.core.setting.SettingsReceiver"), d.a, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static b a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.a aVar) {
        if (j == null) {
            synchronized (b.class) {
                if (j == null) {
                    j = new b(aVar);
                }
            }
        }
        return j;
    }

    private String a(JSONObject jSONObject) {
        JSONObject a2 = n0.a(jSONObject);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str.toLowerCase(), map.get(str));
            }
        }
        return hashMap;
    }

    private void a(GMConfigCallback gMConfigCallback, AdError adError) {
        ThreadHelper.runOnUiThread(new a(this, gMConfigCallback, adError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GMConfigCallback gMConfigCallback, AdError adError, int i2) throws Throwable {
        long j2;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().f("server_dist_host");
        a(gMConfigCallback, adError);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c.q();
        Logger.e("SdkSettingsHelper", "setting 配置拉取失败，尝试再次拉取... mLoadingSuccess:" + this.e.get() + " mRetryCount:" + (this.c.get() + 1));
        this.d.set(false);
        if (this.e.get()) {
            this.g.set(false);
            this.f.removeCallbacksAndMessages(null);
        } else if (this.c.get() > 3) {
            Logger.e("SdkSettingsHelper", "setting 最多尝试四次拉取... ");
        } else {
            this.g.set(true);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.arg1 = this.c.get();
            obtain.arg2 = i2;
            int i3 = this.c.get();
            if (i3 < 3) {
                long j3 = 1;
                for (int i4 = 0; i4 <= i3; i4++) {
                    j3 *= 3;
                }
                j2 = j3 * 1000;
            } else {
                j2 = 120000;
            }
            this.c.incrementAndGet();
            this.f.removeCallbacksAndMessages(null);
            this.f.sendMessageDelayed(obtain, j2);
            Logger.i("SdkSettingsHelper", "setting 重试次数:" + (i3 + 1) + "  重试间隔：" + j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, GMConfigCallback gMConfigCallback, int i2) {
        int[] iArr = new int[1];
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, JSONObject> b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.e().b(i2);
        JSONObject jSONObject = b.get("event_label_value_root");
        JSONObject jSONObject2 = b.get("config_req_label_value_root");
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.c c2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b.b().a().c();
        c2.b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c.g());
        String q = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().q();
        if (!TextUtils.isEmpty(q)) {
            c2.a("X-Tt-Env", q);
            c2.a("x-use-ppe", "1");
        }
        c2.a("User-Agent", com.bytedance.msdk.base.b.b);
        c2.c(a(b(jSONObject2)));
        c2.a(new c(iArr, new int[]{0}, currentTimeMillis, z, i2, jSONObject, gMConfigCallback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0002, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject b(org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.b(org.json.JSONObject):org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.optBoolean("remote_log_enabled")) {
                Logger.openDebugMode();
            }
        } catch (Throwable th) {
        }
    }

    private boolean d() {
        long a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().a("max_expire_time", 0L);
        if (this.e.get() && System.currentTimeMillis() > a2) {
            Logger.i("SdkSettingsHelper", "setting 缓存过期，再次发起请求...");
            this.e.set(false);
            a();
        }
        return System.currentTimeMillis() > a2;
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        Map<String, ITTAdapterConfiguration> a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a();
        List<String> adnNamesSet = DefaultAdapterClasses.getAdnNamesSet();
        if (a2 != null && adnNamesSet != null) {
            for (String str : adnNamesSet) {
                ITTAdapterConfiguration iTTAdapterConfiguration = a2.get(str);
                if (iTTAdapterConfiguration != null) {
                    try {
                        jSONObject.put(str, iTTAdapterConfiguration.getNetworkSdkVersion());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject f() {
        Map<String, String> customInfos;
        JSONObject jSONObject = new JSONObject();
        GMConfigUserInfoForSegment f2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().f();
        if (f2 != null) {
            Map<String, String> customInfos2 = f2.getCustomInfos();
            if (customInfos2 != null) {
                try {
                    for (String str : customInfos2.keySet()) {
                        jSONObject.put(str, customInfos2.get(str));
                    }
                    return jSONObject;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return null;
                }
            }
        } else {
            UserInfoForSegment v = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().v();
            if (v != null && (customInfos = v.getCustomInfos()) != null) {
                try {
                    for (String str2 : customInfos.keySet()) {
                        jSONObject.put(str2, customInfos.get(str2));
                    }
                    return jSONObject;
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return null;
    }

    public static JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        GMConfigUserInfoForSegment f2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().f();
        try {
            if (f2 != null) {
                jSONObject.put(AccessToken.USER_ID_KEY, f2 != null ? f2.getUserId() : "");
                jSONObject.put("channel", f2 != null ? f2.getChannel() : "");
                jSONObject.put("sub_channel", f2 != null ? f2.getSubChannel() : "");
                jSONObject.put("age", f2 != null ? f2.getAge() : 0);
                jSONObject.put("gender", f2 != null ? f2.getGender() : "");
                jSONObject.put("user_value_group", f2 != null ? f2.getUserValueGroup() : "");
            } else {
                UserInfoForSegment v = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().v();
                jSONObject.put(AccessToken.USER_ID_KEY, v != null ? v.getUserId() : "");
                jSONObject.put("channel", v != null ? v.getChannel() : "");
                jSONObject.put("sub_channel", v != null ? v.getSubChannel() : "");
                jSONObject.put("age", v != null ? v.getAge() : 0);
                jSONObject.put("gender", v != null ? v.getGender() : "");
                jSONObject.put("user_value_group", v != null ? v.getUserValueGroup() : "");
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(n0.a());
                intent.setAction("com.bytedance.msdk.core.setting.SettingsReceiver");
                intent.putExtra("b_msg_id", 1);
                intent.putExtra("b_msg_process_name", d0.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().sendBroadcast(intent, d.a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public b a() {
        Logger.e("SdkSettingsHelper", "setting resetRetryCount...");
        this.c.set(0);
        this.g.set(false);
        WeakHandler weakHandler = this.f;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        return this;
    }

    public void a(int i2) {
        try {
            if (this.d.get()) {
                this.h = i2;
                Logger.i("SdkSettingsHelper", "setting 正在加载，无需再次发起请求...");
            } else {
                ThreadHelper.runOnThreadPool(new e(null, i2));
            }
        } catch (Throwable th) {
            Logger.d("SdkSettingsHelper", "load sdk settings error: ", th);
        }
    }

    public void a(GMConfigCallback gMConfigCallback) {
        if (this.h == 2) {
            this.h = -1;
            a(2);
        }
        if (gMConfigCallback != null) {
            ThreadHelper.runOnUiThread(new RunnableC0050b(this, gMConfigCallback, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().r()));
        }
    }

    public void a(List<String> list, GMConfigCallback gMConfigCallback) {
        AdError adError;
        e eVar;
        if (gMConfigCallback == null) {
            return;
        }
        try {
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().u()) {
                if (list != null && list.size() > 0) {
                    if (!this.d.get()) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(list);
                        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b(list)) {
                            eVar = new e(gMConfigCallback, 1);
                        } else if (!d()) {
                            Logger.d("SdkSettingsHelper", "本地配置未过期，直接回调成功");
                            gMConfigCallback.onConfigLoaded(null);
                            return;
                        } else {
                            eVar = new e(gMConfigCallback, 1);
                        }
                        ThreadHelper.runOnThreadPool(eVar);
                        return;
                    }
                    Logger.i("SdkSettingsHelper", "setting 正在加载，无需再次发起请求...");
                    adError = new AdError(AdError.ERROR_CODE_CONFIG_IS_ALREADY_LOADING, AdError.getMessage(AdError.ERROR_CODE_CONFIG_IS_ALREADY_LOADING));
                }
                adError = new AdError(AdError.ERROR_CODE_INPUT_PARAMS_ERROR, AdError.getMessage(AdError.ERROR_CODE_INPUT_PARAMS_ERROR));
            } else {
                adError = new AdError(AdError.ERROR_CODE_NO_PERMISSION, AdError.getMessage(AdError.ERROR_CODE_NO_PERMISSION));
            }
            gMConfigCallback.onConfigLoadFail(adError);
        } catch (Throwable th) {
            Logger.d("SdkSettingsHelper", "load sdk settings error: ", th);
        }
    }

    public void b(int i2) {
        String str;
        w.d(this.b);
        try {
            if (!d()) {
                str = "setting 缓存未过期，无需再次发起请求...";
            } else if (!this.d.get()) {
                ThreadHelper.runOnThreadPool(new e(null, i2));
            } else {
                str = "setting 正在加载，无需再次发起请求...";
            }
            Logger.i("SdkSettingsHelper", str);
        } catch (Throwable th) {
            Logger.d("SdkSettingsHelper", "load sdk settings error: ", th);
        }
    }

    public void c(int i2) {
        if (this.g.get()) {
            Logger.e("SdkSettingsHelper", "setting 正在尝试拉取配置中...");
            return;
        }
        Logger.e("SdkSettingsHelper", "setting 尝试拉取配置...");
        a();
        b(i2);
    }

    @Override // com.bytedance.msdk.adapter.util.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what != 1) {
            return;
        }
        int i2 = message.arg1;
        int i3 = message.arg2;
        if (i2 == 3) {
            this.g.set(false);
        }
        Logger.e("SdkSettingsHelper", "setting 发起尝试拉取配置请求... mLoadingSuccess:" + this.e.get() + "tryCount:" + (i2 + 1));
        try {
            if (this.e.get()) {
                return;
            }
            b(i3);
        } catch (Throwable th) {
        }
    }
}
