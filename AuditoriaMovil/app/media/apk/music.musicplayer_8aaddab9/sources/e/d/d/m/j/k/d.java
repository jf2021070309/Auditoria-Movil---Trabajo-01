package e.d.d.m.j.k;

import android.util.Log;
import e.d.d.m.j.j.l;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d {
    public final e.d.d.m.j.n.f a;

    static {
        Charset.forName("UTF-8");
    }

    public d(e.d.d.m.j.n.f fVar) {
        this.a = fVar;
    }

    public static Map<String, String> a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public Map<String, String> b(String str, boolean z) {
        FileInputStream fileInputStream;
        File f2 = z ? this.a.f(str, "internal-keys") : this.a.f(str, "keys");
        if (f2.exists()) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(f2);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                Map<String, String> a = a(l.n(fileInputStream));
                l.a(fileInputStream, "Failed to close user metadata file.");
                return a;
            } catch (Exception e3) {
                e = e3;
                fileInputStream2 = fileInputStream;
                if (e.d.d.m.j.f.a.a(6)) {
                    Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                }
                l.a(fileInputStream2, "Failed to close user metadata file.");
                return Collections.emptyMap();
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                l.a(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        }
        return Collections.emptyMap();
    }

    public String c(String str) {
        FileInputStream fileInputStream;
        File f2 = this.a.f(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!f2.exists()) {
            e.d.d.m.j.f.a.a(3);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(f2);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(l.n(fileInputStream));
                    String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                    e.d.d.m.j.f.a.a(3);
                    l.a(fileInputStream, "Failed to close user metadata file.");
                    return optString;
                } catch (Exception e2) {
                    e = e2;
                    if (e.d.d.m.j.f.a.a(6)) {
                        Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    }
                    l.a(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                l.a(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            l.a(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
