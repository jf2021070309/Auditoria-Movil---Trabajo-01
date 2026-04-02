package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.config.TTBaseAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.b {
    private static volatile a h;
    private f0 a;
    private Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> b = new ConcurrentHashMap();
    private Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> c = new ConcurrentHashMap();
    private Map<String, c> d = new ConcurrentHashMap();
    private int e = 100;
    private int f = 0;
    private long g = 120000;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0059a implements Runnable {
        final /* synthetic */ JSONArray a;

        RunnableC0059a(a aVar, JSONArray jSONArray) {
            this.a = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            String b;
            JSONArray jSONArray = this.a;
            if (jSONArray != null) {
                String jSONArray2 = jSONArray.toString();
                if (TextUtils.isEmpty(jSONArray2) || (b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONArray2, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) == null) {
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().getSharedPreferences(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.U(), 0).edit().putString("rit_conf", b).commit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ c a;

        b(a aVar, c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = this.a;
            if (cVar == null || cVar.u() == null) {
                return;
            }
            if (this.a.L()) {
                if (m.b().a(this.a.k())) {
                    m.b().b(this.a.k());
                }
                if (m.b().a(this.a.j())) {
                    m.b().b(this.a.j());
                }
            } else {
                m b = m.b();
                b.e(this.a.u() + "");
                m b2 = m.b();
                b2.d(this.a.u() + "");
            }
            for (k kVar : this.a.F()) {
                if (kVar.D()) {
                    if (l.b().a(kVar.o())) {
                        l.b().b(kVar.o());
                    }
                    if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b().a(kVar.n())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b().b(kVar.n());
                    }
                } else {
                    l b3 = l.b();
                    b3.b(this.a.u() + "", kVar.d());
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k b4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b();
                    b4.c(this.a.u() + "", kVar.d());
                }
            }
        }
    }

    private a() {
    }

    private static List<String> a(Context context) {
        String str;
        List<ProviderInfo> queryContentProviders = context.getPackageManager().queryContentProviders(context.getApplicationInfo().processName, context.getApplicationInfo().uid, 131072);
        if (queryContentProviders == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        context.getPackageName();
        for (ProviderInfo providerInfo : queryContentProviders) {
            String str2 = providerInfo.name;
            char c = 65535;
            switch (str2.hashCode()) {
                case -2132028139:
                    if (str2.equals("com.baidu.mobads.sdk.api.BdFileProvider")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1630533804:
                    if (str2.equals("com.mbridge.msdk.foundation.tools.MBFileProvider")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1097984862:
                    if (str2.equals("com.sigmob.sdk.SigmobFileProvider")) {
                        c = 4;
                        break;
                    }
                    break;
                case 8917003:
                    if (str2.equals("com.tencent.klevin.utils.FileProvider")) {
                        c = 5;
                        break;
                    }
                    break;
                case 405711305:
                    if (str2.equals("com.google.android.gms.ads.MobileAdsInitProvider")) {
                        c = 6;
                        break;
                    }
                    break;
                case 787345346:
                    if (str2.equals("com.bykv.vk.openvk.TTFileProvider")) {
                        c = 1;
                        break;
                    }
                    break;
                case 980611709:
                    if (str2.equals("com.kwad.sdk.api.proxy.app.AdSdkFileProvider")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1010345138:
                    if (str2.equals("com.bytedance.sdk.openadsdk.TTFileProvider")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1011081416:
                    if (str2.equals("com.unity")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1719438508:
                    if (str2.equals("com.qq.e.comm.GDTFileProvider")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = "pangle";
                    break;
                case 1:
                    str = "pangle_custom";
                    break;
                case 2:
                    str = "gdt";
                    break;
                case 3:
                    str = "baidu";
                    break;
                case 4:
                    str = "sigmob";
                    break;
                case 5:
                    str = "klevin";
                    break;
                case 6:
                    str = "admob";
                    break;
                case 7:
                    str = "ks";
                    break;
                case '\b':
                    str = "mintegral";
                    break;
                case '\t':
                    str = "unity";
                    break;
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    private void a(c cVar) {
        ThreadHelper.runOnThreadPool(new b(this, cVar));
    }

    private void b(JSONArray jSONArray) {
        if (jSONArray == null || this.a == null) {
            return;
        }
        this.d.clear();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                c b2 = c.b(jSONObject);
                if (b2 != null) {
                    this.d.put(b2.u(), b2);
                    String b3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONObject.toString(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
                    if (b3 != null) {
                        this.a.b(b2.u(), b3);
                    }
                    a(b2);
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        this.a.b("prime_rit_count", length);
    }

    private String c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            j();
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("app_id");
                        String optString2 = optJSONObject.optString(TTBaseAdapterConfiguration.APP_KEY_EXTRA_KEY);
                        String optString3 = optJSONObject.optString("custom_type");
                        if (TextUtils.equals(optString3, "1")) {
                            this.c.put(next, new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a(next, optString, optString2, optJSONObject.optString("init_class_name"), optJSONObject.optString("banner_class_name"), optJSONObject.optString("interstitial_class_name"), optJSONObject.optString("reward_class_name"), optJSONObject.optString("full_video_class_name"), optJSONObject.optString("splash_class_name"), optJSONObject.optString("feed_class_name"), optJSONObject.optString("draw_class_name"), optString3));
                        } else {
                            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a aVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a(optString, optString2);
                            if (TextUtils.equals(next, "pangle") && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().C()) {
                                this.b.put("pangle_custom", aVar);
                            }
                            this.b.put(next, aVar);
                        }
                    }
                    jSONObject2 = jSONObject;
                }
            }
            return jSONObject.toString();
        }
        return null;
    }

    private void c(JSONArray jSONArray) {
        ThreadHelper.runOnThreadPool(new RunnableC0059a(this, jSONArray));
    }

    private void j() {
        this.b.clear();
        this.c.clear();
    }

    public static a k() {
        if (h == null) {
            synchronized (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.class) {
                try {
                    if (h == null) {
                        h = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    private void l() throws JSONException {
        f0 f0Var = this.a;
        if (f0Var != null) {
            String d = f0Var.d("adn_init_conf");
            if (TextUtils.isEmpty(d)) {
                return;
            }
            if (!d.startsWith("[") && !d.startsWith("{")) {
                d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            }
            c(new JSONObject(d));
        }
    }

    private void m() throws JSONException {
        f0 f0Var = this.a;
        if (f0Var != null) {
            String d = f0Var.d("tt_app_common_config");
            if (TextUtils.isEmpty(d)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(d);
            int optInt = jSONObject.optInt("event_batch_size", 100);
            this.e = optInt;
            if (optInt <= 0 || optInt > 1000) {
                this.e = 100;
            }
            this.f = jSONObject.optInt("event_send_type", 0);
            long optLong = jSONObject.optLong("event_routine_interval", 120000L);
            this.g = optLong;
            if (optLong < 10000 || optLong > 300000) {
                this.g = 120000L;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(jSONObject.optInt("pre_fetch_count", 20));
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(jSONObject.optInt("if_use_new_loglib", 0));
        }
    }

    private void n() throws JSONException {
        f0 f0Var = this.a;
        if (f0Var != null) {
            String d = f0Var.d("rit_conf");
            if (TextUtils.isEmpty(d)) {
                return;
            }
            if (!d.startsWith("[") && !d.startsWith("{")) {
                d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            }
            b(new JSONArray(d));
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public long a() {
        return this.g;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a(String str) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a aVar = this.b.get(str);
        return aVar != null ? aVar : this.c.get(str);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public c a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c cVar = this.d.get(str);
        if (cVar == null && (cVar = c.g(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(this.a.d(str), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a()))) != null) {
            this.d.put(str, cVar);
        }
        c a = d.a(cVar, i);
        return a != null ? a : cVar;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.b
    public void a(String str, boolean z) {
        this.a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void a(JSONArray jSONArray) {
        b(jSONArray);
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        c(jSONArray);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public void a(JSONObject jSONObject) {
        if (jSONObject == null || this.a == null) {
            return;
        }
        int optInt = jSONObject.optInt("event_batch_size", 100);
        this.e = optInt;
        if (optInt <= 0 || optInt > 1000) {
            this.e = 100;
        }
        this.f = jSONObject.optInt("event_send_type", 0);
        long optLong = jSONObject.optLong("event_routine_interval", 120000L);
        this.g = optLong;
        if (optLong < 10000 || optLong > 300000) {
            this.g = 120000L;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(jSONObject.optInt("pre_fetch_count", 20));
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(jSONObject.optInt("if_use_new_loglib", 0));
        Logger.e("TTSETTING", "save--mEventBatchSize=" + this.e + ",mEventSendType=" + this.f + ", routineInterval=" + this.g);
        this.a.b("tt_app_common_config", jSONObject.toString());
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b() {
        Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> map;
        List<String> a;
        Context d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d();
        if (d == null || (map = this.b) == null) {
            return;
        }
        int i = d.getApplicationInfo().targetSdkVersion;
        Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 接入信息 start ---------------------");
        Logger.d("TTMediationSDK_SDK_Init", "当前接入的GroMore SDK版本是：4.2.0.2");
        if ((Build.VERSION.SDK_INT >= 24 || i >= 24) && (a = a(d)) != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!"unity".equals(next) && !"pangle_custom".equals(next)) {
                    if ("pangle".equals(next) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().C()) {
                        next = "pangle_custom";
                    }
                    if (a.contains(next)) {
                        Logger.i("TTMediationSDK_SDK_Init", "已按要求接入三方广告sdk【" + next + "】");
                    } else {
                        Logger.e("TTMediationSDK_SDK_Init", "未按要求接入三方广告sdk【" + next + "】，请检查接入配置");
                    }
                }
            }
        }
        Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 接入信息 end ---------------------");
        Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 版本信息 start ---------------------");
        Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> map2 = this.b;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                if (!TextUtils.equals(str, "pangle")) {
                    ITTAdapterConfiguration a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a(str);
                    if (a2 != null) {
                        a2.checkVersion();
                    } else {
                        Logger.e("TTMediationSDK_InitChecker", "没有引入" + str + "Adapter,请检查相关引入情况");
                    }
                }
            }
        }
        Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 版本信息 end ---------------------");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b(JSONObject jSONObject) {
        String c;
        String b2;
        if (this.a == null || (c = c(jSONObject)) == null || (b2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(c, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) == null) {
            return;
        }
        this.a.b("adn_init_conf", b2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public boolean c() {
        return this.b.isEmpty() && this.c.isEmpty();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int d() {
        return this.f;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public boolean e() {
        if (this.a.a("prime_rit_count", -1) > 0) {
            return false;
        }
        try {
            n();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.d.isEmpty();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void f() {
        Map<String, c> map = this.d;
        if (map != null) {
            map.clear();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> entry : this.c.entrySet()) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a value = entry.getValue();
            if (value != null && value.d()) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int h() {
        return this.e;
    }

    public void i() throws JSONException {
        l();
        m();
    }
}
