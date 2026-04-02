package e.d.d.m.j.p.k;

import android.text.TextUtils;
import e.d.d.m.j.j.i0;
import e.d.d.m.j.m.b;
import e.d.d.m.j.m.c;
import e.d.d.m.j.p.j.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7536b;

    public a(String str, b bVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f7536b = bVar;
        this.a = str;
    }

    public final e.d.d.m.j.m.a a(e.d.d.m.j.m.a aVar, f fVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.8");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f7528b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f7529c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f7530d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((i0) fVar.f7531e).c());
        return aVar;
    }

    public final void b(e.d.d.m.j.m.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f7498c.put(str, str2);
        }
    }

    public final Map<String, String> c(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f7534h);
        hashMap.put("display_version", fVar.f7533g);
        hashMap.put("source", Integer.toString(fVar.f7535i));
        String str = fVar.f7532f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject d(c cVar) {
        int i2 = cVar.a;
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        fVar.a(2);
        if (!(i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203)) {
            StringBuilder z = e.a.d.a.a.z("Settings request failed; (status: ", i2, ") from ");
            z.append(this.a);
            fVar.b(z.toString());
            return null;
        }
        String str = cVar.f7499b;
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
            StringBuilder y = e.a.d.a.a.y("Failed to parse settings JSON from ");
            y.append(this.a);
            fVar2.e(y.toString(), e2);
            fVar2.d("Settings response " + str);
            return null;
        }
    }
}
