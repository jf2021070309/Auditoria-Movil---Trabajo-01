package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.util.Set;
/* loaded from: classes.dex */
public final class e {
    private static m a;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f3951b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f3952c;

    public e(m mVar) {
        StringBuilder y = e.a.d.a.a.y("com.applovin.sdk.preferences.");
        y.append(mVar.z());
        this.f3952c = mVar.L().getSharedPreferences(y.toString(), 0);
        if (mVar.e()) {
            return;
        }
        a = mVar;
    }

    private static SharedPreferences a(Context context) {
        if (f3951b == null) {
            f3951b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f3951b;
    }

    public static <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        Object string;
        long j2;
        int i2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    string = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    string = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i2 = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i2 = sharedPreferences.getInt(str, 0);
                    }
                    string = Integer.valueOf(i2);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j2 = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j2 = sharedPreferences.getLong(str, 0L);
                    }
                    string = Long.valueOf(j2);
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
                v.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                return t;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    }

    private static void a(final SharedPreferences.Editor editor) {
        try {
            m mVar = a;
            if (mVar != null && ((Boolean) mVar.a(b.eO)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                } else if (a.S() != null) {
                    a.S().a(new z(a, new Runnable() { // from class: com.applovin.impl.sdk.c.e.1
                        @Override // java.lang.Runnable
                        public void run() {
                            editor.commit();
                        }
                    }), o.a.BACKGROUND);
                }
            }
            editor.apply();
        } catch (Throwable th) {
            v.c("SharedPreferencesManager", "Unable to apply changes", th);
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
                v.i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
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
        a(this.f3952c.edit().remove(dVar.a()));
    }

    public <T> void a(d<T> dVar, T t) {
        a((d<d<T>>) dVar, (d<T>) t, this.f3952c);
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
        return (T) b((d<d<T>>) dVar, (d<T>) t, this.f3952c);
    }

    public <T> T b(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) a(dVar.a(), t, dVar.b(), sharedPreferences);
    }
}
