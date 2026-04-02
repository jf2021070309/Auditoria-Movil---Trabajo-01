package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a {
    private b a;
    private byte b;
    private byte c;
    private long d;
    private long e;
    private String f;
    private String g;
    protected JSONObject h;
    private byte i;
    private String j;

    private a() {
    }

    public a(String str, b bVar) {
        this.g = str;
        this.a = bVar;
    }

    public a(String str, JSONObject jSONObject) {
        this.g = str;
        this.h = jSONObject;
    }

    public static bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("priority");
            a aVar = new a();
            aVar.a((byte) optInt);
            aVar.b((byte) optInt2);
            aVar.a(jSONObject.optJSONObject("event"));
            aVar.a(jSONObject.optString("localId"));
            aVar.b(jSONObject.optString("genTime"));
            return aVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public long a() {
        return this.d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void a(byte b) {
        this.b = b;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void a(long j) {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void a(String str) {
        this.g = str;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void a(JSONObject jSONObject) {
        this.h = jSONObject;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public JSONObject b() {
        JSONObject jSONObject;
        b bVar;
        synchronized (this) {
            if (this.h == null && (bVar = this.a) != null) {
                this.h = bVar.a(k());
            }
            jSONObject = this.h;
        }
        return jSONObject;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void b(byte b) {
        this.c = b;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void b(long j) {
        this.e = j;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void b(String str) {
        this.f = str;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public byte c() {
        return this.c;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public void c(long j) {
        this.d = j;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public b d() {
        return this.a;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public long e() {
        return this.e;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public byte f() {
        return this.b;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public byte g() {
        return this.i;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public String h() {
        if (TextUtils.isEmpty(this.g)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.g);
            jSONObject.put("event", b());
            jSONObject.put("genTime", j());
            jSONObject.put("priority", (int) this.c);
            jSONObject.put("type", (int) this.b);
        } catch (Throwable th) {
        }
        return jSONObject.toString();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a
    public String i() {
        return this.g;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.j;
    }
}
