package e.d.d.w;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes2.dex */
public class e0 {
    public final Bundle a;

    public e0(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.a = new Bundle(bundle);
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String j2 = j(str);
        return "1".equals(j2) || Boolean.parseBoolean(j2);
    }

    public Integer b(String str) {
        String j2 = j(str);
        if (TextUtils.isEmpty(j2)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(j2));
        } catch (NumberFormatException unused) {
            String n2 = n(str);
            StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 38 + String.valueOf(j2).length());
            e.a.d.a.a.M(sb, "Couldn't parse value of ", n2, "(", j2);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public JSONArray c(String str) {
        String j2 = j(str);
        if (TextUtils.isEmpty(j2)) {
            return null;
        }
        try {
            return new JSONArray(j2);
        } catch (JSONException unused) {
            String n2 = n(str);
            StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 50 + String.valueOf(j2).length());
            e.a.d.a.a.M(sb, "Malformed JSON for key ", n2, ": ", j2);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public int[] d() {
        JSONArray c2 = c("gcm.n.light_settings");
        if (c2 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c2.length() == 3) {
                int parseColor = Color.parseColor(c2.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = c2.optInt(1);
                    iArr[2] = c2.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e2) {
            String obj = c2.toString();
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(obj.length() + 60 + String.valueOf(message).length());
            e.a.d.a.a.M(sb, "LightSettings is invalid: ", obj, ". ", message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String obj2 = c2.toString();
            e.a.d.a.a.N(new StringBuilder(obj2.length() + 58), "LightSettings is invalid: ", obj2, ". Skipping setting LightSettings", "NotificationParams");
            return null;
        }
    }

    public Uri e() {
        String j2 = j("gcm.n.link_android");
        if (TextUtils.isEmpty(j2)) {
            j2 = j("gcm.n.link");
        }
        if (TextUtils.isEmpty(j2)) {
            return null;
        }
        return Uri.parse(j2);
    }

    public Object[] f(String str) {
        JSONArray c2 = c(String.valueOf(str).concat("_loc_args"));
        if (c2 == null) {
            return null;
        }
        int length = c2.length();
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = c2.optString(i2);
        }
        return strArr;
    }

    public String g(String str) {
        return j(String.valueOf(str).concat("_loc_key"));
    }

    public Long h(String str) {
        String j2 = j(str);
        if (TextUtils.isEmpty(j2)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(j2));
        } catch (NumberFormatException unused) {
            String n2 = n(str);
            StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 38 + String.valueOf(j2).length());
            e.a.d.a.a.M(sb, "Couldn't parse value of ", n2, "(", j2);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public String i(Resources resources, String str, String str2) {
        String j2 = j(str2);
        if (TextUtils.isEmpty(j2)) {
            String g2 = g(str2);
            if (TextUtils.isEmpty(g2)) {
                return null;
            }
            int identifier = resources.getIdentifier(g2, "string", str);
            if (identifier == 0) {
                String n2 = n(str2.concat("_loc_key"));
                Log.w("NotificationParams", e.a.d.a.a.t(new StringBuilder(String.valueOf(n2).length() + 49 + str2.length()), n2, " resource not found: ", str2, " Default value will be used."));
                return null;
            }
            Object[] f2 = f(str2);
            if (f2 == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, f2);
            } catch (MissingFormatArgumentException e2) {
                String n3 = n(str2);
                String arrays = Arrays.toString(f2);
                StringBuilder sb = new StringBuilder(String.valueOf(n3).length() + 58 + String.valueOf(arrays).length());
                e.a.d.a.a.M(sb, "Missing format argument for ", n3, ": ", arrays);
                sb.append(" Default value will be used.");
                Log.w("NotificationParams", sb.toString(), e2);
                return null;
            }
        }
        return j2;
    }

    public String j(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (this.a.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public long[] k() {
        JSONArray c2 = c("gcm.n.vibrate_timings");
        if (c2 == null) {
            return null;
        }
        try {
            if (c2.length() > 1) {
                int length = c2.length();
                long[] jArr = new long[length];
                for (int i2 = 0; i2 < length; i2++) {
                    jArr[i2] = c2.optLong(i2);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String obj = c2.toString();
            e.a.d.a.a.N(new StringBuilder(obj.length() + 74), "User defined vibrateTimings is invalid: ", obj, ". Skipping setting vibrateTimings.", "NotificationParams");
            return null;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
