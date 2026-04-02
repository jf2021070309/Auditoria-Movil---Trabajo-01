package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.api.UserInfoForSegment;
import com.bytedance.msdk.api.v2.GMConfigCallback;
import com.bytedance.msdk.api.v2.GMConfigUserInfoForSegment;
import com.bytedance.msdk.api.v2.GMPrivacyConfig;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private static final b K = new b();
    private boolean A;
    private JSONObject B;
    private boolean C;
    private String D;
    private boolean E;
    private boolean F;
    private String G;
    private boolean H;
    private ValueSet I;
    private int[] J;
    private String[] c;
    private String d;
    private String e;
    private String i;
    private boolean j;
    private String k;
    private Map<String, String> l;
    private String m;
    private String n;
    @Deprecated
    private UserInfoForSegment s;
    private GMConfigUserInfoForSegment t;
    private Map<String, Object> x;
    private List<String> y;
    private boolean z;
    private int a = 0;
    private boolean b = false;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private Set<String> o = new HashSet();
    private Map<String, Map<String, String>> p = new HashMap();
    private Map<String, Map<String, String>> q = new HashMap();
    private Map<String, Object> r = new HashMap();
    private int u = 2;
    private long v = -1;
    private GMPrivacyConfig w = new GMPrivacyConfig();

    private b() {
    }

    public static b L() {
        return K;
    }

    private static void h(String str) {
        b0.a(str, "appid不能为空");
    }

    private static void i(String str) {
        b0.a(str, "name不能为空");
    }

    public boolean A() {
        return this.z;
    }

    public boolean B() {
        return this.j;
    }

    public boolean C() {
        return this.A;
    }

    public boolean D() {
        return this.f;
    }

    public boolean E() {
        return this.g;
    }

    public boolean F() {
        return this.h;
    }

    public boolean G() {
        return this.b;
    }

    public boolean H() {
        return this.E;
    }

    public boolean I() {
        return this.F;
    }

    public boolean J() {
        return ("com.header.app.untext".equals(a.d().getPackageName()) && "5001121".equals(this.d)) || ("com.bytedance.mediation_demo".equals(a.d().getPackageName()) && "5001121".equals(this.d));
    }

    public boolean K() {
        return this.C;
    }

    public String a() {
        if (TextUtils.isEmpty(this.n)) {
            String c = f0.a((String) null, a.d()).c();
            this.n = c;
            if (TextUtils.isEmpty(c)) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                f0.a((String) null, a.d()).e(valueOf);
                this.n = valueOf;
                return valueOf;
            }
        }
        return this.n;
    }

    public void a(int i) {
        this.u = i;
    }

    public void a(long j) {
        try {
            f0 W = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W();
            if (W.a("first_install_time", -1L) == -1) {
                this.v = j;
                W.b("first_install_time", j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(ValueSet valueSet) {
        this.I = valueSet;
    }

    @Deprecated
    public void a(UserInfoForSegment userInfoForSegment, boolean z) {
        if (z) {
            this.s = userInfoForSegment;
            return;
        }
        UserInfoForSegment userInfoForSegment2 = this.s;
        boolean equals = (userInfoForSegment2 == null && userInfoForSegment == null) ? true : (userInfoForSegment2 == null || userInfoForSegment == null) ? false : userInfoForSegment2.equals(userInfoForSegment);
        this.s = userInfoForSegment;
        if (equals) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(a.f()).a().a(1);
    }

    public void a(GMConfigUserInfoForSegment gMConfigUserInfoForSegment, boolean z) {
        if (z) {
            this.t = gMConfigUserInfoForSegment;
            return;
        }
        GMConfigUserInfoForSegment gMConfigUserInfoForSegment2 = this.t;
        boolean equals = (gMConfigUserInfoForSegment2 == null && gMConfigUserInfoForSegment == null) ? true : (gMConfigUserInfoForSegment2 == null || gMConfigUserInfoForSegment == null) ? false : gMConfigUserInfoForSegment2.equals(gMConfigUserInfoForSegment);
        this.t = gMConfigUserInfoForSegment;
        if (equals) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(a.f()).a().a(1);
    }

    public void a(GMPrivacyConfig gMPrivacyConfig) {
        if (gMPrivacyConfig != null) {
            this.w = gMPrivacyConfig;
        }
    }

    public void a(Object obj, Object obj2) {
        if ((obj instanceof List) && (obj2 instanceof GMConfigCallback)) {
            try {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(a.f()).a((List) obj, (GMConfigCallback) obj2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(String str) {
        h(str);
        this.d = str;
    }

    public void a(List<String> list) {
        this.y = list;
    }

    public void a(Map<String, String> map) {
        this.l = map;
    }

    public void a(Set<String> set) {
        if (set != null) {
            this.o.addAll(set);
        }
    }

    public void a(JSONObject jSONObject) {
        this.B = jSONObject;
    }

    public void a(boolean z) {
        this.z = z;
    }

    public void a(int... iArr) {
        this.J = iArr;
    }

    public void a(String[] strArr) {
        this.c = strArr;
    }

    public String b() {
        return this.d;
    }

    public void b(int i) {
        this.a = i;
    }

    public void b(String str) {
        i(str);
        this.e = str;
    }

    public void b(Map<String, Object> map) {
        this.x = map;
    }

    public void b(boolean z) {
        this.A = z;
        if (z) {
            try {
                Class.forName("com.bykv.vk.openvk.TTVfSdk");
            } catch (ClassNotFoundException e) {
                this.A = false;
                e.printStackTrace();
            }
        }
    }

    public JSONObject c() {
        return this.B;
    }

    public void c(String str) {
        this.D = str;
    }

    public void c(Map<String, Map<String, String>> map) {
        if (map != null) {
            this.p.putAll(map);
        }
    }

    public void c(boolean z) {
        this.j = z;
    }

    public Map<String, String> d() {
        return this.l;
    }

    public void d(String str) {
        this.k = str;
    }

    public void d(Map<String, Map<String, String>> map) {
        if (map != null) {
            this.q.putAll(map);
        }
    }

    public void d(boolean z) {
        this.f = z;
    }

    public long e() {
        long j;
        long j2 = this.v;
        if (j2 != -1) {
            return j2;
        }
        try {
            f0 W = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W();
            long a = W.a("first_install_time", -1L);
            if (a == -1) {
                long currentTimeMillis = System.currentTimeMillis();
                W.b("first_install_time", currentTimeMillis);
                this.v = currentTimeMillis;
                j = currentTimeMillis;
            } else {
                this.v = a;
                j = a;
            }
            return j;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public void e(String str) {
        this.m = str;
    }

    public void e(Map<String, String> map) {
        if (this.l == null) {
            this.l = new HashMap();
        }
        if (map == null || map.size() <= 0) {
            return;
        }
        this.l.putAll(map);
    }

    public void e(boolean z) {
        this.g = z;
    }

    public GMConfigUserInfoForSegment f() {
        return this.t;
    }

    public void f(String str) {
        this.i = str;
    }

    public void f(boolean z) {
        this.h = z;
    }

    public Map<String, Object> g() {
        this.r.put(MediationConstant.KEY_GM_USB, e.d());
        return this.r;
    }

    public void g(String str) {
        this.G = str;
    }

    public void g(boolean z) {
        this.b = z;
    }

    public Map<String, Object> h() {
        return this.x;
    }

    public void h(boolean z) {
        this.E = z;
    }

    public String i() {
        return this.e;
    }

    public void i(boolean z) {
        this.H = z;
    }

    public String j() {
        return this.D;
    }

    public void j(boolean z) {
        this.F = z;
    }

    public String k() {
        return this.k;
    }

    public void k(boolean z) {
        this.C = z;
    }

    public String l() {
        return this.m;
    }

    public String[] m() {
        return this.c;
    }

    public int n() {
        return this.u;
    }

    public int o() {
        return this.a;
    }

    public int[] p() {
        return this.J;
    }

    public String q() {
        if (("com.header.app.untext".equals(a.d().getPackageName()) && "5001121".equals(this.d)) || ("com.bytedance.mediation_demo".equals(a.d().getPackageName()) && "5001121".equals(this.d))) {
            try {
                return f0.a("tt_mediation_ppe_info", a.d()).d("tt_ppe_content");
            } catch (Exception e) {
            }
        }
        return null;
    }

    public List<String> r() {
        return this.y;
    }

    public GMPrivacyConfig s() {
        return this.w;
    }

    public String t() {
        return this.i;
    }

    public boolean u() {
        return this.H;
    }

    @Deprecated
    public UserInfoForSegment v() {
        return this.s;
    }

    public ValueSet w() {
        return this.I;
    }

    public String x() {
        return this.G;
    }

    public boolean y() {
        return ("com.header.app.untext".equals(a.d().getPackageName()) && "5001121".equals(this.d)) || ("com.bytedance.mediation_demo".equals(a.d().getPackageName()) && "5001121".equals(this.d)) || ("com.msdk.qa.monkey".equals(a.d().getPackageName()) && "5001121".equals(this.d));
    }

    public boolean z() {
        String a = n0.a();
        return "com.header.app.untext".equals(a) || "com.bytedance.mediation_demo".equals(a) || "com.msdk.qa.monkey".equals(a);
    }
}
