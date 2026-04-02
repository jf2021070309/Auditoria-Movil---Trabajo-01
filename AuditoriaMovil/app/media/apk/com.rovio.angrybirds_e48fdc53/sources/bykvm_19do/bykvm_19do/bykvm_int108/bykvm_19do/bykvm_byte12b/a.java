package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.h;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.o;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.i;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private volatile Context a;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0061a implements Runnable {
        final /* synthetic */ JSONObject a;

        RunnableC0061a(a aVar, JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String a = b.a(i.e().d());
            try {
                this.a.put("upload_scene", "direct");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            b.a(a, this.a.toString());
        }
    }

    private a(Context context) {
        this.a = context;
    }

    public static a a() {
        if (b == null) {
            b = new a(i.b());
        }
        return b;
    }

    public String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.a(h.c(this.a), h.b(), b.a(i.e().d()), jSONObject, b.a());
            } catch (Throwable th) {
            }
        }
        return null;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String a = b.a(i.e().d());
            String a2 = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.a(h.c(this.a), h.a(), a, jSONObject, b.b());
            jSONObject.put("upload_scene", "direct");
            if (b.a(a, jSONObject.toString()).a()) {
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.a(a2);
            }
        } catch (Throwable th) {
        }
    }

    public void c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        o.a(new RunnableC0061a(this, jSONObject));
    }
}
