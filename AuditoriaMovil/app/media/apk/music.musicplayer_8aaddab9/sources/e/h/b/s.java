package e.h.b;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class s extends JSONObject {
    public static String c(String str) {
        return (str == null || str.length() == 0) ? "!^!" : str;
    }

    public String a() throws JSONException {
        return c(has("a") ? getString("a") : "");
    }

    public String b() throws JSONException {
        return c(getString("s"));
    }
}
