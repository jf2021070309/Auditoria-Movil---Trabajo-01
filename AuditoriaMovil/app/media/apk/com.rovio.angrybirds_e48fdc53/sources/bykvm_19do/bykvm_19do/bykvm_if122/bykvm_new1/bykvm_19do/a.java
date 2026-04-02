package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements b, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b {
    private static volatile a d;
    private static volatile boolean e;
    private b a;
    private int b = 0;
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b c = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.a();

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0058a implements Runnable {
        RunnableC0058a(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.i().b("11111");
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.i().a("11111");
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.i().d();
        }
    }

    private a() {
    }

    public static a s() {
        if (d == null) {
            synchronized (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.class) {
                try {
                    if (d == null) {
                        d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public long a() {
        b bVar = this.a;
        if (bVar == null) {
            return 120000L;
        }
        return bVar.a();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a(String str) {
        b bVar = this.a;
        if (bVar == null) {
            return null;
        }
        return bVar.a(str);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public c a(String str, int i) {
        b bVar = this.a;
        if (bVar == null) {
            return null;
        }
        return bVar.a(str, i);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.b
    public void a(String str, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(str);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().i(z);
        b i = r() ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.i() : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12.a.k();
        this.a = i;
        i.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(), z);
    }

    public void a(Map<String, Object> map) {
        if (s().i()) {
            s().b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a.c);
        } else if (!s().n()) {
            return;
        }
        map.put("if_use_new_sdkinit", Integer.valueOf(s().p()));
        map.put("init_splash_fill_duration", Long.valueOf(s().l()));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void a(JSONArray jSONArray) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(jSONArray);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!e) {
                e = true;
                if (jSONObject.has("if_use_new_sdkinit")) {
                    try {
                        this.b = Integer.parseInt(jSONObject.optString("if_use_new_sdkinit"));
                    } catch (Exception e2) {
                    }
                }
                this.b = 0;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().b("use_new_sdk_init", this.b);
            this.a = r() ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.b.i() : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12.a.k();
            Logger.i("TMe", "if_use_new_sdkinit 判断初始化类型  " + this.a);
            this.a.a(jSONObject);
        } else {
            Logger.i("TMe", "if_use_new_sdkinit 判断初始化类型失败 json为null" + this.a);
            this.a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12.a.k();
        }
        this.a.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().u());
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public void b(String str) {
        this.c.b(str);
    }

    public void b(Map<String, Object> map) {
        if (s().i() || s().n()) {
            map.put("if_use_new_sdkinit", Integer.valueOf(s().p()));
            map.put("init_splash_request_duration", Long.valueOf(s().m()));
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b(JSONObject jSONObject) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.b(jSONObject);
        }
    }

    public void c(Map<String, Object> map) {
        if (s().i()) {
            if (s().k() <= 0) {
                return;
            }
            s().b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a.c);
        } else if (!s().n()) {
            return;
        }
        map.put("if_use_new_sdkinit", Integer.valueOf(s().p()));
        map.put("call_init_method_duration", Long.valueOf(s().k()));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public boolean c() {
        b bVar = this.a;
        if (bVar == null) {
            return false;
        }
        return bVar.c();
    }

    public boolean c(String str) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a = a(str);
        return a != null && a.d();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int d() {
        b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.d();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public boolean e() {
        b bVar = this.a;
        if (bVar == null) {
            return true;
        }
        return bVar.e();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void f() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> g() {
        b bVar = this.a;
        if (bVar == null) {
            return null;
        }
        return bVar.g();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int h() {
        b bVar = this.a;
        if (bVar == null) {
            return 100;
        }
        return bVar.h();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public boolean i() {
        return this.c.i();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public void j() {
        this.c.j();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public long k() {
        return this.c.k();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public long l() {
        return this.c.l();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public long m() {
        return this.c.m();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public boolean n() {
        return this.c.n();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_if122.b
    public void o() {
        this.c.o();
    }

    public int p() {
        int i = this.b;
        if (i != 1) {
            return 0;
        }
        return i;
    }

    public void q() {
        ThreadHelper.runOnThreadPool(new RunnableC0058a(this));
    }

    public boolean r() {
        if (this.b == 0) {
            this.b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().a("use_new_sdk_init", 0);
        }
        return this.b == 1;
    }
}
