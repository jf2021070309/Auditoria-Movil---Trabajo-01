package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.y;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Set;
/* loaded from: classes.dex */
public final class e {
    private static k a;
    private static SharedPreferences b;
    private final SharedPreferences c;

    public e(k kVar) {
        this.c = kVar.J().getSharedPreferences("com.applovin.sdk.preferences." + kVar.x(), 0);
        if (kVar.e()) {
            return;
        }
        a = kVar;
    }

    private static SharedPreferences a(Context context) {
        if (b == null) {
            b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return b;
    }

    public static <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        Object string;
        long j;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    string = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    string = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i = sharedPreferences.getInt(str, 0);
                    }
                    string = Integer.valueOf(i);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j = sharedPreferences.getLong(str, 0L);
                    }
                    string = Long.valueOf(j);
                } else if (Double.class.equals(cls)) {
                    string = Double.valueOf(t != null ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                } else {
                    string = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
                }
                return string != null ? (T) cls.cast(string) : t;
            }
            return t;
        } catch (Throwable th) {
            try {
                r.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                return t;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    }

    private static void a(final SharedPreferences.Editor editor) {
        try {
            if (a != null && ((Boolean) a.a(b.eJ)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                } else if (a.Q() != null) {
                    a.Q().a(new y(a, new Runnable() { // from class: com.applovin.impl.sdk.c.e.1
                        @Override // java.lang.Runnable
                        public void run() {
                            editor.commit();
                        }
                    }), o.a.BACKGROUND);
                }
            }
            editor.apply();
        } catch (Throwable th) {
            r.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    public static <T> void a(d<T> dVar, Context context) {
        a(a(context).edit().remove(dVar.a()));
    }

    public static <T> void a(d<T> dVar, T t, Context context) {
        a(dVar.a(), t, a(context), (SharedPreferences.Editor) null);
    }

    public static <T> void a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long doubleToRawLongBits;
        boolean z = true;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t == null) {
            editor.remove(str);
        } else if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else {
            if (t instanceof Long) {
                doubleToRawLongBits = ((Long) t).longValue();
            } else if (t instanceof Double) {
                doubleToRawLongBits = Double.doubleToRawLongBits(((Double) t).doubleValue());
            } else if (t instanceof String) {
                editor.putString(str, (String) t);
            } else if (t instanceof Set) {
                editor.putStringSet(str, (Set) t);
            } else {
                r.i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                z = false;
            }
            editor.putLong(str, doubleToRawLongBits);
        }
        if (!z || z2) {
            return;
        }
        a(editor);
    }

    public static <T> T b(d<T> dVar, T t, Context context) {
        return (T) a(dVar.a(), t, dVar.b(), a(context));
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public <T> void a(d<T> dVar) {
        a(this.c.edit().remove(dVar.a()));
    }

    public <T> void a(d<T> dVar, T t) {
        a((d<d<T>>) dVar, (d<T>) t, this.c);
    }

    public <T> void a(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        a(dVar.a(), (String) t, sharedPreferences);
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        a(str, t, (SharedPreferences) null, editor);
    }

    public <T> void a(String str, T t, SharedPreferences sharedPreferences) {
        a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public <T> T b(d<T> dVar, T t) {
        return (T) b((d<d<T>>) dVar, (d<T>) t, this.c);
    }

    public <T> T b(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) a(dVar.a(), t, dVar.b(), sharedPreferences);
    }
}
