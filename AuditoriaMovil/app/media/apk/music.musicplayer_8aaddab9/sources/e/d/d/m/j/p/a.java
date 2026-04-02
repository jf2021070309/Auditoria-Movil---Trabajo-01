package e.d.d.m.j.p;

import android.util.Log;
import e.d.d.m.j.j.l;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public final File a;

    public a(e.d.d.m.j.n.f fVar) {
        this.a = fVar.a("com.crashlytics.settings.json");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public JSONObject a() {
        Exception e2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        fVar.a(3);
        FileInputStream fileInputStream2 = 0;
        try {
            try {
                File file = this.a;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(l.n(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e3) {
                        e2 = e3;
                        if (e.d.d.m.j.f.a.a(6)) {
                            Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e2);
                        }
                        l.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    fVar.a(2);
                    jSONObject = null;
                }
                l.a(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                fileInputStream2 = fVar;
                th = th;
                l.a(fileInputStream2, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            l.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }
}
