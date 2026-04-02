package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_if122;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    private static Map<String, a> b = new HashMap();
    private SharedPreferences a;

    private a(String str, Context context) {
        if (context != null) {
            this.a = context.getApplicationContext().getSharedPreferences(str, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        a aVar = b.get(str);
        if (aVar == null) {
            a aVar2 = new a(str, context);
            b.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public float a(String str, float f) {
        try {
            return this.a.getFloat(str, f);
        } catch (Throwable th) {
            return f;
        }
    }

    public int a(String str, int i) {
        try {
            return this.a.getInt(str, i);
        } catch (Throwable th) {
            return i;
        }
    }

    public long a(String str, long j) {
        try {
            return this.a.getLong(str, j);
        } catch (Throwable th) {
            return j;
        }
    }

    public String a(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (Throwable th) {
            return str2;
        }
    }

    public void a() {
        try {
            this.a.edit().clear().apply();
        } catch (Throwable th) {
        }
    }

    public void a(String str) {
        try {
            this.a.edit().remove(str).apply();
        } catch (Throwable th) {
        }
    }

    public boolean a(String str, boolean z) {
        try {
            return this.a.getBoolean(str, z);
        } catch (Throwable th) {
            return z;
        }
    }

    public Map<String, ?> b() {
        try {
            return this.a.getAll();
        } catch (Throwable th) {
            return Collections.emptyMap();
        }
    }

    public void b(String str, float f) {
        try {
            this.a.edit().putFloat(str, f).apply();
        } catch (Throwable th) {
        }
    }

    public void b(String str, int i) {
        try {
            this.a.edit().putInt(str, i).apply();
        } catch (Throwable th) {
        }
    }

    public void b(String str, long j) {
        try {
            this.a.edit().putLong(str, j).apply();
        } catch (Throwable th) {
        }
    }

    public void b(String str, String str2) {
        try {
            this.a.edit().putString(str, str2).apply();
        } catch (Throwable th) {
        }
    }

    public void b(String str, boolean z) {
        try {
            this.a.edit().putBoolean(str, z).apply();
        } catch (Throwable th) {
        }
    }
}
