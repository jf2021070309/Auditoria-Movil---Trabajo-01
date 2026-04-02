package e.d.d.w;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import c.i.d.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class o0 {
    public final SharedPreferences a;

    /* loaded from: classes2.dex */
    public static class a {
        public static final long a = TimeUnit.DAYS.toMillis(7);

        /* renamed from: b  reason: collision with root package name */
        public final String f7691b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7692c;

        /* renamed from: d  reason: collision with root package name */
        public final long f7693d;

        public a(String str, String str2, long j2) {
            this.f7691b = str;
            this.f7692c = str2;
            this.f7693d = j2;
        }

        public static String a(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e2.toString()));
                return null;
            }
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e2) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e2.toString()));
                    return null;
                }
            }
            return new a(str, null, 0L);
        }
    }

    public o0(Context context) {
        File file;
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        Object obj = c.i.d.a.a;
        if (Build.VERSION.SDK_INT >= 21) {
            file = a.c.c(context);
        } else {
            File file2 = new File(context.getApplicationInfo().dataDir, "no_backup");
            synchronized (c.i.d.a.f1993b) {
                if (!file2.exists()) {
                    if (!file2.mkdirs()) {
                        Log.w("ContextCompat", "Unable to create files subdir " + file2.getPath());
                    }
                }
            }
            file = file2;
        }
        File file3 = new File(file, "com.google.android.gms.appid-no-backup");
        if (file3.exists()) {
            return;
        }
        try {
            if (file3.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(valueOf);
                } else {
                    new String("Error creating file in no backup dir: ");
                }
            }
        }
    }

    public final String a(String str, String str2) {
        return e.a.d.a.a.t(new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length()), str, "|T|", str2, "|*");
    }
}
