package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1;

import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.b, h, f, e, g {
    private static volatile b e;
    private h a;
    private f b;
    private e c;
    private g d;

    private b() {
    }

    public static b i() {
        if (e == null) {
            synchronized (b.class) {
                if (e == null) {
                    e = new b();
                }
            }
        }
        return e;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public long a() {
        f fVar = this.b;
        if (fVar == null) {
            return 120000L;
        }
        return fVar.a();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a(String str) {
        e eVar = this.c;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a(String str, int i) {
        g gVar = this.d;
        if (gVar == null) {
            return null;
        }
        return gVar.a(str, i);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.b
    public void a(String str, boolean z) {
        this.a = new j();
        this.b = new c();
        this.c = new a();
        this.d = new i();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.h
    public void a(Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c> map) {
        h hVar = this.a;
        if (hVar != null) {
            hVar.a(map);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void a(JSONArray jSONArray) {
        g gVar = this.d;
        if (gVar != null) {
            gVar.a(jSONArray);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public void a(JSONObject jSONObject) {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(jSONObject);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.h
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b(String str) {
        h hVar = this.a;
        if (hVar == null) {
            return null;
        }
        return hVar.b(str);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b(JSONObject jSONObject) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.b(jSONObject);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public boolean c() {
        e eVar = this.c;
        if (eVar == null) {
            return false;
        }
        return eVar.c();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int d() {
        f fVar = this.b;
        if (fVar == null) {
            return 0;
        }
        return fVar.d();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public boolean e() {
        g gVar = this.d;
        if (gVar == null) {
            return true;
        }
        return gVar.e();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.g
    public void f() {
        g gVar = this.d;
        if (gVar != null) {
            gVar.f();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> g() {
        e eVar = this.c;
        if (eVar == null) {
            return null;
        }
        return eVar.g();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int h() {
        f fVar = this.b;
        if (fVar == null) {
            return 100;
        }
        return fVar.h();
    }
}
