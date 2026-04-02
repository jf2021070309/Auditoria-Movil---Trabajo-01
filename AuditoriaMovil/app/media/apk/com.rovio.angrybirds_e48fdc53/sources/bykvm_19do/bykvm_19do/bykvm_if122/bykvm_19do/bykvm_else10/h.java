package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h {
    private String a;
    private a b;
    private List<g> c;
    private List<i> d;
    private JSONObject e;

    /* loaded from: classes.dex */
    public static class a {
        private String a;
        private List<k> b = new ArrayList();

        public void a(String str) {
            this.a = str;
        }

        public void a(List<k> list) {
            this.b = list;
        }
    }

    public JSONObject a() {
        return this.e;
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void a(i iVar) {
    }

    public void a(String str) {
    }

    public void a(List<g> list) {
        this.c = list;
    }

    public void a(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public List<g> b() {
        return this.c;
    }

    public void b(String str) {
        this.a = str;
    }

    public void b(List<i> list) {
        this.d = list;
    }

    public String c() {
        return this.a;
    }

    public void c(String str) {
    }

    public List<k> d() {
        a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public List<i> e() {
        return this.d;
    }

    public boolean f() {
        a aVar = this.b;
        return (aVar == null || TextUtils.isEmpty(aVar.a)) ? false : true;
    }
}
