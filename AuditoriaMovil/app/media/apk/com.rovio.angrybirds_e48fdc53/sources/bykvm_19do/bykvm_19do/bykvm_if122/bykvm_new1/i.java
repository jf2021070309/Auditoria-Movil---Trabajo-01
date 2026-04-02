package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i implements g {
    private Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> b = new ConcurrentHashMap();
    private f0 a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.V();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ JSONArray a;

        a(i iVar, JSONArray jSONArray) {
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
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().getSharedPreferences(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.R(), 0).edit().putString("rit_config", b).commit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a;

        b(i iVar, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.a;
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

    private void a() {
        String a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(this.a.d("rit_config"), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
        if (a2 == null || TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            b(new JSONArray(a2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar) {
        ThreadHelper.runOnThreadPool(new b(this, cVar));
    }

    private void b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            this.b.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.b(jSONObject);
                if (b2 != null) {
                    this.b.put(b2.u(), b2);
                    if (b2.w() == 3) {
                        hashMap.put(b2.u(), b2);
                    }
                    String b3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONObject.toString(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
                    if (b3 != null) {
                        this.a.b(b2.u(), b3);
                    }
                    a(b2);
                }
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().b("prime_rit_count", jSONArray.length());
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.i().a(hashMap);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void c(JSONArray jSONArray) {
        ThreadHelper.runOnThreadPool(new a(this, jSONArray));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.b.get(str);
        if (cVar == null && (cVar = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c.g(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(this.a.d(str), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a()))) != null) {
            this.b.put(str, cVar);
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(cVar, i);
        return a2 != null ? a2 : cVar;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void a(JSONArray jSONArray) {
        b(jSONArray);
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        c(jSONArray);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public boolean e() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().a("prime_rit_count", -1) > 0) {
            return false;
        }
        a();
        return this.b.isEmpty();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void f() {
        Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> map = this.b;
        if (map != null) {
            map.clear();
        }
    }
}
