package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12;

import android.content.Context;
import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.d0;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static volatile boolean a;
    private static final AtomicLong b = new AtomicLong(0);
    private static volatile int c = 1;
    private static volatile boolean d = false;
    private static volatile boolean e = true;

    public static void a(int i) {
        c = i;
        if (c == 1 || c == 0) {
            return;
        }
        c = 0;
    }

    public static void a(Context context, d dVar, Map<String, Object> map) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().z()) {
            if (a() && !b()) {
                Log.d("TTMediationSDK", "--==-- event 还未进行sdk初始化");
                return;
            }
            Context d2 = context == null ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() : context;
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException e2) {
                }
            }
            jSONObject.put("eventIndex", b.getAndIncrement());
            jSONObject.put("is_main_process", d0.c(context));
            int l = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().l();
            if (dVar != null) {
                dVar.a("event_id", UUID.randomUUID().toString());
            }
            JSONObject a2 = a.a(d2, dVar, jSONObject);
            if (l == 0 || l == 2) {
                i b2 = i.b(d2, dVar, a2);
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_for12.b.a(b2, true);
                if (a()) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a aVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a(b2.a, b2);
                    aVar.a((byte) 3);
                    aVar.b((byte) 2);
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.a(aVar);
                } else {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.c().a(b2);
                }
            }
            if (l == 0 || l == 1) {
                a b3 = a.b(d2, dVar, a2);
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_for12.b.a(b3, false);
                if (!a()) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a().a(b3);
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a aVar2 = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a(b3.a, b3);
                aVar2.a((byte) 0);
                aVar2.b((byte) 2);
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.a(aVar2);
            }
        }
    }

    public static boolean a() {
        if (!d) {
            synchronized (c.class) {
                if (!d) {
                    e = c == 1;
                    d = true;
                }
            }
        }
        return e;
    }

    public static boolean b() {
        return a;
    }

    public static void c() {
        a = true;
    }
}
