package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.facebook.ads.internal.a.d;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.share.internal.ShareConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class o extends ab implements d.a {
    private static final String a = o.class.getSimpleName();
    private com.facebook.ads.internal.n.f A;
    private String B;
    private String C;
    private com.facebook.ads.internal.n.h D;
    private List<com.facebook.ads.internal.n.e> E;
    private int G;
    private String H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private com.facebook.ads.internal.m.c P;
    private e.d Q;
    private Context b;
    private ac c;
    private Uri d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private com.facebook.ads.internal.n.f j;
    private com.facebook.ads.internal.n.f k;
    private com.facebook.ads.internal.n.g l;
    private String m;
    private com.facebook.ads.internal.a.c n;
    private Collection<String> o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private String w;
    private String x;
    private com.facebook.ads.internal.n.j y;
    private String z;
    private int F = -1;
    private long N = 0;
    private a.EnumC0112a O = null;

    private boolean H() {
        return this.e != null && this.e.length() > 0 && (this.j != null || this.I) && this.k != null;
    }

    private void I() {
        if (this.M) {
            return;
        }
        if (this.P != null) {
            this.P.a(this.m);
        }
        this.M = true;
    }

    private void a(Context context, JSONObject jSONObject, com.facebook.ads.internal.m.c cVar, String str, int i, int i2) {
        this.I = true;
        this.b = context;
        this.P = cVar;
        this.F = i;
        this.G = i2;
        a(jSONObject, str);
    }

    private void a(Map<String, String> map, final Map<String, String> map2) {
        try {
            final Map<String, String> c = c(map);
            new Handler().postDelayed(new Runnable() { // from class: com.facebook.ads.internal.adapters.o.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.isEmpty(o.this.H)) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(map2);
                    hashMap.putAll(c);
                    if (o.this.P != null) {
                        o.this.P.e(o.this.H, hashMap);
                    }
                }
            }, this.s * 1000);
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:8|(1:10)(1:59)|11|(1:13)|14|(3:55|56|(15:58|17|(1:19)|20|21|22|23|24|(1:26)(3:44|(1:46)(1:48)|47)|27|28|29|(4:33|(2:35|36)|37|38)|40|41))|16|17|(0)|20|21|22|23|24|(0)(0)|27|28|29|(5:31|33|(0)|37|38)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0180, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a2, code lost:
        android.util.Log.e(com.facebook.ads.internal.adapters.o.a, "Unable to parse carousel data.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c A[Catch: JSONException -> 0x01a1, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01a1, blocks: (B:29:0x0133, B:31:0x013b, B:33:0x0141, B:35:0x014c, B:49:0x0194), top: B:53:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONObject r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.o.a(org.json.JSONObject, java.lang.String):void");
    }

    private Map<String, String> c(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map.containsKey("view")) {
            hashMap.put("view", map.get("view"));
        }
        if (map.containsKey("snapshot")) {
            hashMap.put("snapshot", map.get("snapshot"));
        }
        return hashMap;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String A() {
        return this.z;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public List<com.facebook.ads.internal.n.e> B() {
        if (c_()) {
            return this.E;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int C() {
        return this.F;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int D() {
        return this.G;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.c E() {
        return com.facebook.ads.internal.n.c.AN;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String G() {
        if (c_()) {
            I();
            return this.g;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.a.d.a
    public com.facebook.ads.internal.a.c a() {
        return this.n;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(int i) {
        if (c_() && i == 0 && this.N > 0 && this.O != null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.N, this.O, this.C));
            this.N = 0L;
            this.O = null;
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(Context context, ac acVar, com.facebook.ads.internal.m.c cVar, Map<String, Object> map, e.d dVar) {
        this.b = context;
        this.c = acVar;
        this.P = cVar;
        this.Q = dVar;
        JSONObject jSONObject = (JSONObject) map.get(ShareConstants.WEB_DIALOG_PARAM_DATA);
        a(jSONObject, com.facebook.ads.internal.q.a.j.a(jSONObject, "ct"));
        if (com.facebook.ads.internal.a.d.a(context, this, cVar)) {
            acVar.a(this, new com.facebook.ads.internal.protocol.a(AdErrorType.NO_FILL, "No Fill"));
            return;
        }
        if (acVar != null) {
            acVar.a(this);
        }
        com.facebook.ads.internal.j.a.a = this.C;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(View view, List<View> list) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(ac acVar) {
        this.c = acVar;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(Map<String, String> map) {
        if (c_() && !this.L) {
            if (this.c != null) {
                this.c.b(this);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.I) {
                hashMap.put("cardind", String.valueOf(this.F));
                hashMap.put("cardcnt", String.valueOf(this.G));
            }
            if (!TextUtils.isEmpty(c()) && this.P != null) {
                this.P.a(c(), hashMap);
            }
            if (f() || e()) {
                a(map, hashMap);
            }
            this.L = true;
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean a_() {
        return c_() && this.d != null;
    }

    @Override // com.facebook.ads.internal.a.d.a
    public Collection<String> b() {
        return this.o;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b(Map<String, String> map) {
        if (c_()) {
            if (com.facebook.ads.internal.l.a.c(this.b) && com.facebook.ads.internal.q.a.x.a(map)) {
                Log.e(a, "Click happened on lockscreen ad");
                return;
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            com.facebook.ads.internal.q.a.d.a(this.b, "Click logged");
            if (this.c != null) {
                this.c.c(this);
            }
            if (this.I) {
                hashMap.put("cardind", String.valueOf(this.F));
                hashMap.put("cardcnt", String.valueOf(this.G));
            }
            com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(this.b, this.P, this.H, this.d, hashMap);
            if (a2 != null) {
                try {
                    this.N = System.currentTimeMillis();
                    this.O = a2.a();
                    a2.b();
                } catch (Exception e) {
                    Log.e(a, "Error executing action", e);
                }
            }
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b_() {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String c() {
        return this.H;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean c_() {
        return this.J && this.K;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean d() {
        return c_() && this.p;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean e() {
        return c_() && this.r;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean f() {
        return c_() && this.q;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean g() {
        return c_() && this.D != null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean h() {
        return true;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int i() {
        if (this.t < 0 || this.t > 100) {
            return 0;
        }
        return this.t;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int j() {
        return this.u;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int k() {
        return this.v;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f l() {
        if (c_()) {
            return this.j;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f m() {
        if (c_()) {
            return this.k;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.h n() {
        if (c_()) {
            return this.D;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String o() {
        if (c_()) {
            I();
            return this.e;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String p() {
        if (c_()) {
            I();
            return this.f;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String q() {
        if (c_()) {
            I();
            return com.facebook.ads.internal.q.a.p.a(this.g);
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String r() {
        if (c_()) {
            I();
            return this.h;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String s() {
        if (c_()) {
            I();
            return this.i;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.g t() {
        if (c_()) {
            I();
            return this.l;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f u() {
        if (c_()) {
            return this.A;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String v() {
        if (c_()) {
            return this.B;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String w() {
        if (c_()) {
            return "AdChoices";
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String x() {
        if (c_()) {
            return this.w;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String y() {
        if (c_()) {
            return this.x;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.j z() {
        return !c_() ? com.facebook.ads.internal.n.j.DEFAULT : this.y;
    }
}
