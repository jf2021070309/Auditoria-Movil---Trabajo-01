package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;
import net.hockeyapp.android.UpdateInfoListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class VersionHelper {
    public static final String VERSION_MAX = "99.0";
    private ArrayList<JSONObject> a;
    private JSONObject b;
    private UpdateInfoListener c;
    private int d;

    public VersionHelper(Context context, String str, UpdateInfoListener updateInfoListener) {
        this.c = updateInfoListener;
        a(context, str);
        a();
    }

    private void a(Context context, String str) {
        this.b = new JSONObject();
        this.a = new ArrayList<>();
        this.d = this.c.getCurrentVersionCode();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int currentVersionCode = this.c.getCurrentVersionCode();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                boolean z = jSONObject.getInt("version") > currentVersionCode;
                boolean z2 = jSONObject.getInt("version") == currentVersionCode && isNewerThanLastUpdateTime(context, jSONObject.getLong("timestamp"));
                if (z || z2) {
                    this.b = jSONObject;
                    currentVersionCode = jSONObject.getInt("version");
                }
                this.a.add(jSONObject);
            }
        } catch (NullPointerException e) {
        } catch (JSONException e2) {
        }
    }

    private void a() {
        Collections.sort(this.a, new Comparator<JSONObject>() { // from class: net.hockeyapp.android.utils.VersionHelper.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                try {
                    if (jSONObject.getInt("version") > jSONObject2.getInt("version")) {
                    }
                } catch (NullPointerException e) {
                } catch (JSONException e2) {
                }
                return 0;
            }
        });
    }

    public String getVersionString() {
        return a(this.b, "shortversion", "") + " (" + a(this.b, "version", "") + ")";
    }

    public String getFileDateString() {
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date(a(this.b, "timestamp", 0L) * 1000));
    }

    public long getFileSizeBytes() {
        boolean booleanValue = Boolean.valueOf(a(this.b, "external", "false")).booleanValue();
        long a = a(this.b, "appsize", 0L);
        if (booleanValue && a == 0) {
            return -1L;
        }
        return a;
    }

    private static String a(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            return str2;
        }
    }

    private static long a(JSONObject jSONObject, String str, long j) {
        try {
            return jSONObject.getLong(str);
        } catch (JSONException e) {
            return j;
        }
    }

    public String getReleaseNotes(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body style='padding: 0px 0px 20px 0px'>");
        int i = 0;
        Iterator<JSONObject> it = this.a.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                JSONObject next = it.next();
                if (i2 > 0) {
                    sb.append(b());
                    if (z) {
                        sb.append(a(i2, next));
                    }
                }
                sb.append(b(i2, next));
                sb.append(c(i2, next));
                i = i2 + 1;
            } else {
                sb.append("</body>");
                sb.append("</html>");
                return sb.toString();
            }
        }
    }

    private Object b() {
        return "<hr style='border-top: 1px solid #c8c8c8; border-bottom: 0px; margin: 40px 10px 0px 10px;' />";
    }

    private String a(int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        String a = a(jSONObject);
        if (!TextUtils.isEmpty(a)) {
            sb.append("<a href='restore:" + a + "'  style='background: #c8c8c8; color: #000; display: block; float: right; padding: 7px; margin: 0px 10px 10px; text-decoration: none;'>Restore</a>");
        }
        return sb.toString();
    }

    private String a(JSONObject jSONObject) {
        try {
            return jSONObject.getString("id");
        } catch (JSONException e) {
            return "";
        }
    }

    private String b(int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        int b = b(this.b);
        int b2 = b(jSONObject);
        String c = c(jSONObject);
        sb.append("<div style='padding: 20px 10px 10px;'><strong>");
        if (i == 0) {
            sb.append("Newest version:");
        } else {
            sb.append("Version " + c + " (" + b2 + "): ");
            if (b2 != b && b2 == this.d) {
                this.d = -1;
                sb.append("[INSTALLED]");
            }
        }
        sb.append("</strong></div>");
        return sb.toString();
    }

    private int b(JSONObject jSONObject) {
        try {
            return jSONObject.getInt("version");
        } catch (JSONException e) {
            return 0;
        }
    }

    private String c(JSONObject jSONObject) {
        try {
            return jSONObject.getString("shortversion");
        } catch (JSONException e) {
            return "";
        }
    }

    private String c(int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        String a = a(jSONObject, "notes", "");
        sb.append("<div style='padding: 0px 10px;'>");
        if (a.trim().length() == 0) {
            sb.append("<em>No information.</em>");
        } else {
            sb.append(a);
        }
        sb.append("</div>");
        return sb.toString();
    }

    public static int compareVersionStrings(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        try {
            Scanner scanner = new Scanner(str.replaceAll("\\-.*", ""));
            Scanner scanner2 = new Scanner(str2.replaceAll("\\-.*", ""));
            scanner.useDelimiter("\\.");
            scanner2.useDelimiter("\\.");
            while (scanner.hasNextInt() && scanner2.hasNextInt()) {
                int nextInt = scanner.nextInt();
                int nextInt2 = scanner2.nextInt();
                if (nextInt < nextInt2) {
                    return -1;
                }
                if (nextInt > nextInt2) {
                    return 1;
                }
            }
            if (scanner.hasNextInt()) {
                return 1;
            }
            return !scanner2.hasNextInt() ? 0 : -1;
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean isNewerThanLastUpdateTime(Context context, long j) {
        if (context == null) {
            return false;
        }
        try {
            return j > (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir).lastModified() / 1000) + 1800;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String mapGoogleVersion(String str) {
        if (str == null || str.equalsIgnoreCase("L")) {
            return "5.0";
        }
        if (str.equalsIgnoreCase("M")) {
            return "6.0";
        }
        if (str.equalsIgnoreCase("N")) {
            return "7.0";
        }
        if (Pattern.matches("^[a-zA-Z]+", str)) {
            return VERSION_MAX;
        }
        return str;
    }
}
