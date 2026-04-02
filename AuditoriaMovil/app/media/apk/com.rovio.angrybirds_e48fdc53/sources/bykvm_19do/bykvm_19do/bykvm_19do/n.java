package bykvm_19do.bykvm_19do.bykvm_19do;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends e2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        super(true, false);
    }

    private boolean a() {
        return Class.forName("miui.os.Build").getName().length() > 0;
    }

    private boolean b() {
        return (!TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.contains("Flyme")) || "flyme".equals(Build.USER);
    }

    private String c() {
        BufferedReader bufferedReader;
        String str = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.build.version.emui").getInputStream()), 1024);
            try {
                str = bufferedReader.readLine();
                bufferedReader.close();
            } catch (Throwable th) {
                th = th;
                try {
                    l0.a(th);
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        String str;
        StringBuilder sb = new StringBuilder(16);
        if (a()) {
            str = "MIUI-";
        } else if (!b()) {
            String c = c();
            if (i.a(c)) {
                sb.append("EMUI-");
            }
            if (!TextUtils.isEmpty(c)) {
                sb.append(c);
                str = "-";
            }
            sb.append(Build.VERSION.INCREMENTAL);
            jSONObject.put("rom", sb.toString());
            return true;
        } else {
            str = "FLYME-";
        }
        sb.append(str);
        sb.append(Build.VERSION.INCREMENTAL);
        jSONObject.put("rom", sb.toString());
        return true;
    }
}
