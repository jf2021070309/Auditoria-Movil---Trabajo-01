package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092;

import android.os.SystemClock;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.f;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.r;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMConfigCallback;
import com.bytedance.msdk.api.v2.GMSettingConfigCallback;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.a {
    private int H;
    private String I;
    private String a;
    private long b;
    private long c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private String i;
    private String j;
    private int k;
    private long o;
    private long p;
    private int y;
    private String l = null;
    private int m = 0;
    private String n = "log-api.pangolin-sdk-toutiao.com/service/2/app_log/";
    private int q = Integer.MAX_VALUE;
    private List<GMSettingConfigCallback> r = new CopyOnWriteArrayList();
    private Map<String, Boolean> s = new HashMap();
    private final AtomicBoolean t = new AtomicBoolean(false);
    private int u = 0;
    private Map<String, String> v = new ConcurrentHashMap();
    private Map<String, List<String>> w = new ConcurrentHashMap();
    private double x = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    private Map<String, e> z = new ConcurrentHashMap();
    private int A = 0;
    private int B = 259200000;
    private final Map<String, List<e>> C = new ConcurrentHashMap();
    private final Map<String, f> D = new ConcurrentHashMap();
    private final Map<String, Integer> E = new ConcurrentHashMap();
    private final Map<String, Integer> F = new ConcurrentHashMap();
    private final List<d> G = new CopyOnWriteArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1.b {
        final /* synthetic */ boolean a;
        final /* synthetic */ long b;
        final /* synthetic */ JSONObject c;
        final /* synthetic */ boolean d;

        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0052a implements GMConfigCallback {
            C0052a(a aVar) {
            }

            @Override // com.bytedance.msdk.api.v2.GMConfigCallback
            public void onConfigLoadFail(AdError adError) {
            }

            @Override // com.bytedance.msdk.api.v2.GMConfigCallback
            public void onConfigLoaded(List<String> list) {
                Logger.d("TMe", "初始化更新pangle配置成功");
            }
        }

        a(boolean z, long j, JSONObject jSONObject, boolean z2) {
            this.a = z;
            this.b = j;
            this.c = jSONObject;
            this.d = z2;
        }

        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1.b
        public void a() {
            Logger.e("TTMediationSDK_SDK_Init", "MSDK init finish.........hasConfig:" + this.a);
            if (this.a) {
                if (!c.this.t.get()) {
                    c.this.t.set(true);
                    int c = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.c();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c.j();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = this.b;
                    try {
                        JSONObject jSONObject = this.c;
                        if (jSONObject != null) {
                            jSONObject.put("adn_time", elapsedRealtime2 - j);
                        }
                    } catch (Throwable th) {
                    }
                    if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.d()) {
                        Logger.d("TMe", "-----==---- 正常上报sdk_init_end");
                        boolean z = this.d;
                        h.a(elapsedRealtime, c, z ? 1 : 0, -1L, this.c);
                    } else {
                        Logger.d("TMe", "-----==---- 延时上报sdk_init_end");
                        boolean z2 = this.d;
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.a(elapsedRealtime, c, z2 ? 1 : 0, this.c);
                    }
                    c.this.a0();
                    Logger.d("TTMediationSDK", "sdk init end, duration: " + elapsedRealtime + ", initAdnCount: " + c + ", isFromLocalConfig: " + this.d);
                }
                b.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()).a(new C0052a(this));
                c.this.b0();
                if (this.d) {
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.a.c();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.h();
            }
        }
    }

    public static String P() {
        return "tt_sdk_adn_init_settings_" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b();
    }

    public static String Q() {
        return "tt_sdk_app_common_settings_" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b();
    }

    public static String R() {
        return "tt_sdk_rit_settings_" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b();
    }

    public static f0 S() {
        return f0.a(P(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
    }

    public static f0 T() {
        return f0.a(Q(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
    }

    public static String U() {
        return "tt_sdk_settings_" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b();
    }

    public static f0 V() {
        return f0.a(R(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
    }

    public static f0 W() {
        return f0.a(U(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
    }

    public static f0 X() {
        return f0.a(Y(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
    }

    public static String Y() {
        return "tt_sdk_splash_settings_" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b();
    }

    private boolean Z() {
        Boolean bool = this.s.get("active_control");
        return bool == null || !bool.booleanValue();
    }

    private String a(JSONArray jSONArray) {
        JSONArray optJSONArray;
        if (jSONArray != null) {
            ConcurrentHashMap<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.b> concurrentHashMap = new ConcurrentHashMap<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("break_request_error_code")) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        arrayList.add(optJSONArray.optString(i2));
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.b bVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.b();
                    bVar.a(optJSONObject.optLong("break_request_duration"));
                    bVar.a(arrayList);
                    concurrentHashMap.put(optJSONObject.optString(GMAdConstant.EXTRA_ADNNAME), bVar);
                }
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.c.a().a(concurrentHashMap);
            return jSONArray.toString();
        }
        char c = 31;
        while (true) {
            switch (c) {
                case 29:
                    return null;
                case 30:
                case 31:
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.c.a().a(null);
                    c = 29;
                default:
                    c = 29;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        if (this.G.size() > 0) {
            synchronized (this.G) {
                for (d dVar : this.G) {
                    dVar.callback();
                }
                this.G.clear();
            }
        }
    }

    private String b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                f.a(jSONArray.optJSONObject(i), this.D);
            } catch (Exception e) {
                Logger.w("TTMediationSDK", "maybe some rit parse dynamic rules fail .....");
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    private void b(JSONObject jSONObject) {
        this.v.clear();
        this.u = 0;
        if (jSONObject == null) {
            return;
        }
        this.u = jSONObject.optInt("if_sample", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("call_stack_path");
        if (optJSONObject != null) {
            try {
                Iterator<String> keys = optJSONObject.keys();
                if (keys != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = optJSONObject.optString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                            this.v.put(next, optString);
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        if (C()) {
            synchronized (this.r) {
                for (GMSettingConfigCallback gMSettingConfigCallback : this.r) {
                    gMSettingConfigCallback.configLoad();
                }
                this.r.clear();
            }
        }
    }

    private void c(JSONObject jSONObject) {
        this.w.clear();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                if (optJSONArray.get(i) != null) {
                                    arrayList.add(optJSONArray.get(i).toString());
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(next) && !arrayList.isEmpty()) {
                            this.w.put(next, arrayList);
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    private String d(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return "";
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(e.a(next, jSONArray.optJSONObject(i)));
                    }
                    this.C.put(next, arrayList);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    private void e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.F.clear();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.F.put(next, Integer.valueOf(jSONObject.optInt(next)));
        }
    }

    private String f(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.z.put(next, e.a(next, jSONObject.optJSONObject(next)));
            }
            return jSONObject.toString();
        }
        return null;
    }

    private String g(JSONObject jSONObject) {
        this.s.clear();
        if (jSONObject != null) {
            try {
                if (jSONObject.optBoolean("ad_event_control")) {
                    this.s.put("ad_event_control", true);
                }
                if (jSONObject.optBoolean("type_banner_control")) {
                    this.s.put("type_banner_control", true);
                }
                if (jSONObject.optBoolean("type_interaction_control")) {
                    this.s.put("type_interaction_control", true);
                }
                if (jSONObject.optBoolean("type_interactionfull_control")) {
                    this.s.put("type_interactionfull_control", true);
                }
                if (jSONObject.optBoolean("type_splash_control")) {
                    this.s.put("type_splash_control", true);
                }
                if (jSONObject.optBoolean("type_feed_control")) {
                    this.s.put("type_feed_control", true);
                }
                if (jSONObject.optBoolean("type_reward_control")) {
                    this.s.put("type_reward_control", true);
                }
                if (jSONObject.optBoolean("type_full_control")) {
                    this.s.put("type_full_control", true);
                }
                if (jSONObject.optBoolean("type_native_control")) {
                    this.s.put("type_native_control", true);
                }
                return jSONObject.toString();
            } catch (Exception e) {
            }
        }
        return null;
    }

    private String h(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.k = jSONObject.optInt("fetch_ad_type", 0);
            return jSONObject.toString();
        }
        return null;
    }

    private void i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.E.clear();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.E.put(next, Integer.valueOf(jSONObject.optInt(next)));
        }
    }

    private void j(String str) {
        try {
            com.bytedance.msdk.core.admanager.reward.rewardagain.c.a(new JSONArray(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public boolean A() {
        if (Z()) {
            Boolean bool = this.s.get("type_banner_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean B() {
        return (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().e() || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().c()) ? false : true;
    }

    public boolean C() {
        return (TextUtils.isEmpty(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b()) || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().e() || !y()) ? false : true;
    }

    public boolean D() {
        if (Z()) {
            Boolean bool = this.s.get("type_feed_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean E() {
        if (Z()) {
            Boolean bool = this.s.get("type_full_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean F() {
        if (Z()) {
            Boolean bool = this.s.get("type_interaction_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean G() {
        if (Z()) {
            Boolean bool = this.s.get("type_interactionfull_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean H() {
        if (Z()) {
            Boolean bool = this.s.get("type_native_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean I() {
        return this.m == 1;
    }

    public boolean J() {
        if (Z()) {
            Boolean bool = this.s.get("type_reward_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean K() {
        if (Z()) {
            Boolean bool = this.s.get("type_splash_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }

    public boolean L() {
        if (this.q == Integer.MAX_VALUE) {
            this.q = 1;
        }
        return this.q == 1;
    }

    public boolean M() {
        return this.y == 1;
    }

    public boolean N() {
        return this.k == 1;
    }

    public boolean O() {
        return this.H == 1;
    }

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a(String str) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str);
    }

    public List<String> a(List<String> list) {
        if (list != null && list.size() > 0) {
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().e()) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, 101) == null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return null;
    }

    public void a() {
        W().a();
        this.a = null;
    }

    public void a(int i) {
        this.y = i;
    }

    public void a(d dVar) {
        if (dVar == null || !y()) {
            this.G.add(dVar);
        } else {
            dVar.callback();
        }
    }

    public void a(GMSettingConfigCallback gMSettingConfigCallback) {
        if (gMSettingConfigCallback == null) {
            return;
        }
        if (C()) {
            gMSettingConfigCallback.configLoad();
            return;
        }
        synchronized (this.r) {
            if (!this.r.contains(gMSettingConfigCallback)) {
                this.r.add(gMSettingConfigCallback);
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optInt("state_code") != 30004) {
            return;
        }
        f0 W = W();
        this.b = jSONObject.optLong("max_age");
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.b;
        this.c = currentTimeMillis + j;
        W.b("max_age", j);
        W.b("max_expire_time", this.c);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.a
    public void a(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        boolean z2;
        String b;
        String b2;
        String b3;
        String b4;
        String b5;
        String b6;
        if (jSONObject == null) {
            return;
        }
        try {
            this.a = jSONObject.optString("etag");
            this.b = jSONObject.optLong("max_age");
            this.c = System.currentTimeMillis() + this.b;
            this.d = jSONObject.optString("ab_version");
            this.e = jSONObject.optString("ab_params");
            this.f = jSONObject.optString(bg.O);
            this.g = jSONObject.optString("transparent_params");
            this.y = jSONObject.optInt("if_test");
            this.h = jSONObject.optInt("if_get_detail_return");
            this.i = jSONObject.optString("ecpm_precision_level");
            this.j = jSONObject.optString("fetch_primerit_level");
            String optString = jSONObject.optString("url");
            this.l = jSONObject.optString("app_abtest");
            this.m = jSONObject.optInt("innerLog", 0);
            this.n = jSONObject.optString("app_log_url", "log-api.pangolin-sdk-toutiao.com/service/2/app_log/");
            this.o = jSONObject.optLong("break_request_times", 0L);
            this.p = jSONObject.optLong("break_request_hold_time", 10000L);
            this.H = jSONObject.optInt("ex_info", 0);
            this.I = jSONObject.optString("ex_");
            this.A = jSONObject.optInt("if_enable_label", 0);
            this.B = jSONObject.optInt("ecpm_ttl", 259200000);
            int optInt = jSONObject.optInt("support_tnc", Integer.MAX_VALUE);
            this.q = optInt;
            if (optInt != 0 && optInt != 1) {
                this.q = 1;
            }
            this.x = jSONObject.optDouble("custom_adn_sample_ratio", PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.a.c().a(this.o, this.p);
            JSONObject optJSONObject = jSONObject.optJSONObject("supervisor_feature");
            if (optJSONObject != null) {
                r.a(true);
                r.a(optJSONObject);
            } else {
                r.a(false);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("ra_info");
            if (optJSONArray != null) {
                com.bytedance.msdk.core.admanager.reward.rewardagain.c.a(optJSONArray);
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(jSONObject.optJSONObject("app_common_config"));
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().b(jSONObject.optJSONObject("adn_init_conf"));
            String a2 = a(jSONObject.optJSONArray("adn_control_conf"));
            String h = h(jSONObject.optJSONObject("poor_network_config"));
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(jSONObject.optJSONArray("rit_conf"));
            String g = g(jSONObject.optJSONObject("module_disable_control"));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("call_stack_conf");
            b(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("custom_adn_feature");
            c(optJSONObject3);
            JSONObject optJSONObject4 = jSONObject.optJSONObject("timeout_req");
            i(optJSONObject4);
            JSONObject optJSONObject5 = jSONObject.optJSONObject("is_callback");
            e(optJSONObject5);
            String f = f(jSONObject.optJSONObject("label_outputs"));
            String d = d(jSONObject.optJSONObject("label_group_infos"));
            String b7 = b(jSONObject.optJSONArray("dynamic_rules"));
            f0 W = W();
            W.b("etag", this.a);
            W.b("max_age", this.b);
            W.b("max_expire_time", this.c);
            W.b("ab_version", this.d);
            W.b("ab_params", this.e);
            W.b(bg.O, this.f);
            W.b("transparent_params", this.g);
            W.b("if_test", this.y);
            W.b("network_permission", this.h);
            W.b("ecpm_precision_level", this.i);
            W.b("fetch_primerit_level", this.j);
            W.b("app_abtest", this.l);
            W.b("module_control", g);
            W.b("tt_app_log_url", this.n);
            W.b("break_request_times", this.o);
            W.b("break_request_hold_time", this.p);
            W.b("ex_info", this.H);
            W.b("if_enable_label", this.A);
            W.b("cpm_expire_time", this.B);
            W.b("key_supervisor_feature", optJSONObject != null ? optJSONObject.toString() : "");
            W.b("custom_adn_sample_ratio", (float) this.x);
            if (optJSONObject2 != null) {
                W.b("call_stack", optJSONObject2.toString());
            } else {
                W.b("call_stack", "");
            }
            if (optJSONObject3 != null) {
                W.b("custom_adn_feature", optJSONObject3.toString());
            } else {
                W.b("custom_adn_feature", "");
            }
            if (optJSONObject4 != null) {
                W.b("timeout_req", optJSONObject4.toString());
            } else {
                W.b("timeout_req", "");
            }
            if (optJSONObject5 != null) {
                W.b("is_callback", optJSONObject5.toString());
            } else {
                W.b("is_callback", "");
            }
            if (optString == null || TextUtils.isEmpty(optString)) {
                W.f("server_dist_host");
            } else {
                String b8 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(optString, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
                if (b8 != null) {
                    W.b("server_dist_host", b8);
                }
            }
            if (a2 != null && (b6 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(a2, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) != null) {
                W.b("adn_control_conf", b6);
            }
            if (h != null) {
                W.b("network_conf", h);
            }
            if (!TextUtils.isEmpty(f) && (b5 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(f, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) != null) {
                W.b("label_outputs", b5);
            }
            if (!TextUtils.isEmpty(d) && (b4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(d, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) != null) {
                W.b("label_group_infos", b4);
            }
            if (!TextUtils.isEmpty(b7) && (b3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(b7, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) != null) {
                W.b("dynamic_rules", b3);
            }
            if (!TextUtils.isEmpty(this.I) && (b2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(this.I, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) != null) {
                W.b("ex_", b2);
            }
            if (optJSONArray != null) {
                String jSONArray = optJSONArray.toString();
                if (!TextUtils.isEmpty(jSONArray) && (b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONArray, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a())) != null) {
                    W.b("reward_again_styles", b);
                }
            }
            W.b("is_config_from_assert", z);
            W.b("has_config_in_sp", true);
            jSONObject2 = null;
            z2 = false;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                jSONObject2 = null;
                z2 = false;
            } catch (Throwable th2) {
                a(false, (JSONObject) null);
                throw th2;
            }
        }
        a(z2, jSONObject2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.a
    public void a(boolean z) {
        f0 W;
        JSONObject c;
        JSONObject jSONObject;
        int optInt;
        String str;
        try {
            W = W();
        } catch (Throwable th) {
            if (z) {
                return;
            }
        }
        if (!W.a("has_config_in_sp") && (c = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().c()) != null) {
            int optInt2 = c.optInt("cypher", -1);
            if (optInt2 == 2) {
                String a2 = n0.a(c.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE));
                if (!TextUtils.isEmpty(a2)) {
                    jSONObject = new JSONObject(a2);
                    c = jSONObject;
                }
                optInt = c.optInt("state_code");
                String optString = c.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int[] iArr = new int[1];
                iArr[0] = 0;
                if (optInt == 20000 || c == null || TextUtils.isEmpty(c.toString())) {
                    str = " 解密错误或者解析错误：stateCode=" + optInt + "，msg=" + optString;
                } else {
                    iArr[0] = 2;
                    c.optJSONObject("adn_init_conf");
                    if (c.optString("app_id").equals(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b())) {
                        a(c, true);
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a((JSONObject) null);
                        if (z) {
                            return;
                        }
                        a(true, (JSONObject) null);
                    }
                    str = "本地配置appid或appkey非法";
                }
                Logger.i("TTMediationSDK", str);
            } else {
                if (optInt2 == 1) {
                    String a3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(c.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
                    if (!TextUtils.isEmpty(a3)) {
                        Logger.d("TTMediationSDK", "setting data : " + a3.toString());
                        jSONObject = new JSONObject(a3);
                        c = jSONObject;
                    }
                } else if (optInt2 == 0) {
                    c = new JSONObject(c.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE));
                }
                optInt = c.optInt("state_code");
                String optString2 = c.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int[] iArr2 = new int[1];
                iArr2[0] = 0;
                if (optInt == 20000) {
                }
                str = " 解密错误或者解析错误：stateCode=" + optInt + "，msg=" + optString2;
                Logger.i("TTMediationSDK", str);
            }
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a((JSONObject) null);
        this.a = W.d("etag");
        this.b = W.c("max_age");
        this.c = W.c("max_expire_time");
        this.d = W.d("ab_version");
        this.e = W.d("ab_params");
        this.f = W.d(bg.O);
        this.g = W.d("transparent_params");
        this.y = W.b("if_test");
        this.h = W.b("network_permission");
        this.i = W.d("ecpm_precision_level");
        this.j = W.d("fetch_primerit_level");
        this.n = W.a("tt_app_log_url", "log-api.pangolin-sdk-toutiao.com/service/2/app_log/");
        this.o = W.a("break_request_times", 0L);
        this.p = W.a("break_request_hold_time", 10000L);
        this.H = W.a("ex_info", 0);
        this.A = W.a("if_enable_label", 0);
        this.B = W.a("cpm_expire_time", 259200000);
        this.x = W.a("custom_adn_sample_ratio", 0.0f);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.a.c().a(this.o, this.p);
        if (!TextUtils.isEmpty(W.d("app_abtest"))) {
            this.l = W.d("app_abtest");
        }
        String d = W.d("network_conf");
        if (!TextUtils.isEmpty(d)) {
            h(new JSONObject(d));
        }
        String d2 = W.d("reward_again_styles");
        if (!TextUtils.isEmpty(d2)) {
            j(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d2, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a()));
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12.a.k().i();
        String d3 = W.d("adn_control_conf");
        if (!TextUtils.isEmpty(d3)) {
            if (!d3.startsWith("[") && !d3.startsWith("{")) {
                d3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d3, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            }
            a(new JSONArray(d3));
        }
        String d4 = W.d("module_control");
        if (!TextUtils.isEmpty(d4)) {
            g(new JSONObject(d4));
        }
        boolean a4 = W.a("all_active_control");
        if (a4) {
            this.s.put("active_control", Boolean.valueOf(a4));
        }
        String d5 = W.d("call_stack");
        if (!TextUtils.isEmpty(d5)) {
            b(new JSONObject(d5));
        }
        String d6 = W.d("custom_adn_feature");
        if (!TextUtils.isEmpty(d6)) {
            c(new JSONObject(d6));
        }
        String d7 = W.d("timeout_req");
        if (!TextUtils.isEmpty(d7)) {
            i(new JSONObject(d7));
        }
        String d8 = W.d("is_callback");
        if (!TextUtils.isEmpty(d8)) {
            e(new JSONObject(d8));
        }
        String d9 = W.d("key_supervisor_feature");
        if (TextUtils.isEmpty(d9)) {
            r.a(false);
        } else {
            r.a(true);
            r.a(new JSONObject(d9));
        }
        String d10 = W.d("label_outputs");
        if (!TextUtils.isEmpty(d10)) {
            if (!d10.startsWith("[") && !d10.startsWith("{")) {
                d10 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d10, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            }
            if (!TextUtils.isEmpty(d10)) {
                f(new JSONObject(d10));
            }
        }
        String d11 = W.d("label_group_infos");
        if (!TextUtils.isEmpty(d11)) {
            if (!d11.startsWith("[") && !d11.startsWith("{")) {
                d11 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d11, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            }
            if (!TextUtils.isEmpty(d11)) {
                d(new JSONObject(d11));
            }
        }
        String d12 = W.d("dynamic_rules");
        if (!TextUtils.isEmpty(d12)) {
            if (!d12.startsWith("[") && !d12.startsWith("{")) {
                d12 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d12, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            }
            if (!TextUtils.isEmpty(d12)) {
                b(new JSONArray(d12));
            }
        }
        String d13 = W.d("ex_");
        if (!TextUtils.isEmpty(d13) && !d13.startsWith("[") && !d13.startsWith("{")) {
            this.I = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(d13, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
        }
        if (z) {
            return;
        }
        a(true, (JSONObject) null);
    }

    public void a(boolean z, JSONObject jSONObject) {
        new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b().a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), new a(B(), SystemClock.elapsedRealtime(), jSONObject, z));
    }

    public boolean a(long j) {
        return j < ((long) this.B);
    }

    public boolean a(String str, int i) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a2;
        return !TextUtils.isEmpty(str) && (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().e() || (a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, 101)) == null || a2.w() == i);
    }

    public boolean a(String str, String str2) {
        List<k> F;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, 101);
        if (a2 != null && (F = a2.F()) != null) {
            for (k kVar : F) {
                if (kVar != null && TextUtils.equals(kVar.d(), str2)) {
                    return kVar.C();
                }
            }
        }
        return false;
    }

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a b(String str) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str);
    }

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b(String str, int i) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, i);
    }

    public void b(int i) {
        this.q = i;
    }

    public void b(GMSettingConfigCallback gMSettingConfigCallback) {
        if (gMSettingConfigCallback == null) {
            return;
        }
        synchronized (this.r) {
            if (this.r.contains(gMSettingConfigCallback)) {
                this.r.remove(gMSettingConfigCallback);
            }
        }
    }

    public boolean b() {
        return this.A == 1;
    }

    public boolean b(List<String> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (String str : list) {
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, 101) == null) {
                return false;
            }
        }
        return true;
    }

    public long c(String str) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b = b(str, 101);
        if (b != null) {
            return b.d();
        }
        return 3000L;
    }

    public String c() {
        return this.l;
    }

    public String d() {
        return this.n;
    }

    public List<e> d(String str) {
        return this.C.get(str);
    }

    public f e(String str) {
        return this.D.get(str);
    }

    public Map<String, String> e() {
        return this.v;
    }

    public String f() {
        return this.f;
    }

    public boolean f(String str) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a2;
        Map<Integer, List<k>> E;
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().e() || !(TextUtils.isEmpty(str) || (a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, 101)) == null || (E = a2.E()) == null || E.size() == 0);
    }

    public int g() {
        return this.B;
    }

    public boolean g(String str) {
        return (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().c() || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().e() || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str, 101) == null) ? false : true;
    }

    public Map<String, List<String>> h() {
        return this.w;
    }

    public boolean h(String str) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().c(str);
    }

    public double i() {
        return this.x;
    }

    public void i(String str) {
        boolean z;
        try {
            f0 W = W();
            if ("2".equals(str)) {
                z = true;
                this.s.put("active_control", true);
            } else {
                z = false;
                this.s.put("active_control", false);
            }
            W.b("all_active_control", z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String j() {
        if (this.a == null) {
            this.a = W().d("etag");
        }
        return this.a;
    }

    public int k() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().h();
    }

    public int l() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().d();
    }

    public String m() {
        return this.I;
    }

    public int n() {
        return this.y;
    }

    public Map<String, Integer> o() {
        return this.F;
    }

    public Map<String, e> p() {
        return this.z;
    }

    public long q() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a();
    }

    public Map<String, Integer> r() {
        return this.E;
    }

    public String s() {
        return this.g;
    }

    public boolean t() {
        return Integer.valueOf(this.i).intValue() > 0;
    }

    public boolean u() {
        return "1".equals(this.j);
    }

    public boolean v() {
        return this.h >= 1;
    }

    public boolean w() {
        try {
            return Integer.valueOf(this.i).intValue() > 1;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean x() {
        return this.u == 1;
    }

    public boolean y() {
        return this.t.get();
    }

    public boolean z() {
        if (Z()) {
            Boolean bool = this.s.get("ad_event_control");
            return bool == null || !bool.booleanValue();
        }
        return false;
    }
}
