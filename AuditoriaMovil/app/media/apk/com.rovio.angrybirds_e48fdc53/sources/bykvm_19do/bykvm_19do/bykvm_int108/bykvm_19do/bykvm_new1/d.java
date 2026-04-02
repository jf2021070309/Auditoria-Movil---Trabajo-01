package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {
    private Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements FilenameFilter {
        a(d dVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str != null && str.endsWith(".npth");
        }
    }

    public d(Context context) {
        this.a = context;
    }

    private bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c a(String str, JSONObject jSONObject) {
        if (jSONObject != null || !TextUtils.isEmpty(str)) {
            if (str.startsWith("launch_")) {
                return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.LAUNCH;
            }
            if (str.startsWith("anr_")) {
                return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.ANR;
            }
            if (str.startsWith("java_")) {
                if (jSONObject.optInt("is_dart") == 1) {
                    return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.DART;
                }
                if (jSONObject.optInt("isJava") == 1) {
                    return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.JAVA;
                }
            }
        }
        return null;
    }

    private void a() {
        SharedPreferences.Editor putLong;
        try {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("npth", 0);
            long j = sharedPreferences.getLong("history_time", -1L);
            if (j < 0) {
                putLong = sharedPreferences.edit().putLong("history_time", System.currentTimeMillis());
            } else if (System.currentTimeMillis() - j <= 86400000) {
                return;
            } else {
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.h.a(this.a));
                putLong = sharedPreferences.edit().putLong("history_time", System.currentTimeMillis());
            }
            putLong.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private File[] a(File file, String str) {
        if (file.exists()) {
            return TextUtils.isEmpty(str) ? file.listFiles() : file.listFiles(new a(this));
        }
        return null;
    }

    private void b() {
        File[] a2 = a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.h.c(this.a), ".npth");
        if (a2 == null) {
            return;
        }
        Arrays.sort(a2, Collections.reverseOrder());
        for (int i = 0; i < a2.length && i < 50; i++) {
            File file = a2[i];
            try {
                if (bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.a.a().a(file.getAbsolutePath())) {
                    bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.a(file);
                } else {
                    bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.c b = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.b(file.getAbsolutePath());
                    if (b != null && b.a() != null) {
                        JSONObject a3 = b.a();
                        a(file.getName(), a3);
                        b.a().put("upload_scene", "launch_scan");
                        if (bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.b.a(b.b(), a3.toString(), b.c()).a() && !bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.d.a(file)) {
                            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.a.a().a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_19do.a.a(file.getAbsolutePath()));
                        }
                    }
                }
            } catch (Exception e) {
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j.b(e);
            }
        }
    }

    public void a(boolean z) {
        a();
        if (z) {
            b();
        }
    }
}
