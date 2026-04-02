package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import java.security.SecureRandom;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class n0 {
    private static String a = null;
    private static String b = null;
    private static String c = null;
    private static String d = "ToolUtils";

    public static String a() {
        String str;
        synchronized (n0.class) {
            if (TextUtils.isEmpty(a) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() != null) {
                a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().getPackageName();
            }
            str = a;
        }
        return str;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 17) {
            return str;
        }
        return a.a(str.substring(17), b(str.substring(1, 17)));
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                String a2 = a.a();
                String str = 2 + a2 + a.b(jSONObject.toString(), a.a(a2));
                if (TextUtils.isEmpty(str)) {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                } else {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
                    jSONObject2.put("cypher", 2);
                }
            } catch (Throwable th) {
                try {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                } catch (Throwable th2) {
                }
            }
        }
        return jSONObject2;
    }

    public static String b() {
        try {
            byte[] bArr = new byte[8];
            new SecureRandom().nextBytes(bArr);
            return o.a(bArr);
        } catch (Exception e) {
            return null;
        }
    }

    private static String b(String str) {
        String a2 = a.a(str);
        if (str == null) {
            String a3 = b.a();
            return a3.concat(a3).substring(8, 24);
        }
        return a2;
    }

    public static String c() {
        String str;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception e) {
            str = "unKnow";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(";");
        if (lastIndexOf != -1 && str.length() > lastIndexOf) {
            int i = lastIndexOf + 1;
            String substring = str.substring(0, i);
            str = substring.concat(" " + Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry() + ";").concat(str.substring(i));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String d() {
        String str;
        synchronized (n0.class) {
            if (TextUtils.isEmpty(b) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() != null) {
                PackageInfo packageInfo = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().getPackageManager().getPackageInfo(a(), 0);
                b = String.valueOf(packageInfo.versionCode);
                c = packageInfo.versionName;
            }
            str = b;
        }
        return str;
    }

    public static String e() {
        String str;
        synchronized (n0.class) {
            if (TextUtils.isEmpty(c) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() != null) {
                PackageInfo packageInfo = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().getPackageManager().getPackageInfo(a(), 0);
                b = String.valueOf(packageInfo.versionCode);
                c = packageInfo.versionName;
            }
            str = c;
        }
        return str;
    }
}
