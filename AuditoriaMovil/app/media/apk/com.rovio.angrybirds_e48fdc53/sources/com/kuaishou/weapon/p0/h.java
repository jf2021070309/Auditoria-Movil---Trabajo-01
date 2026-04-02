package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class h {
    public static final String a = "re_po_rt";
    private static h e = null;
    private SharedPreferences b;
    private SharedPreferences.Editor c;
    private Context d;

    public h(Context context) {
        try {
            this.d = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("re_po_rt", 4);
            this.b = sharedPreferences;
            this.c = sharedPreferences.edit();
        } catch (Throwable th) {
        }
    }

    public h(Context context, String str) {
        try {
            this.d = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 4);
            this.b = sharedPreferences;
            this.c = sharedPreferences.edit();
        } catch (Throwable th) {
        }
    }

    public static h a() {
        return e;
    }

    public static synchronized h a(Context context, String str) {
        h hVar;
        synchronized (h.class) {
            if (e == null) {
                synchronized (h.class) {
                    if (e == null) {
                        e = new h(context, str);
                    }
                }
            }
            hVar = e;
        }
        return hVar;
    }

    public long a(String str, long j) {
        return this.b.getLong(str, j);
    }

    public String a(String str) {
        return this.b.getString(str, "");
    }

    public void a(Context context) {
        this.d = context;
    }

    public void a(String str, int i) {
        try {
            this.c.putInt(str, i);
            this.c.apply();
        } catch (Throwable th) {
        }
    }

    public void a(String str, int i, boolean z) {
        try {
            this.c.putInt(str, i);
            if (z) {
                this.c.apply();
            }
        } catch (Throwable th) {
        }
    }

    public void a(String str, Boolean bool) {
        this.c.putBoolean(str, bool.booleanValue());
        this.c.apply();
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.c.putString(str, str2);
            this.c.apply();
        } catch (Throwable th) {
        }
    }

    public void a(String str, String str2, boolean z) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.c.putString(str, str2);
            if (z) {
                this.c.apply();
            }
        } catch (Throwable th) {
        }
    }

    public int b(String str) {
        try {
            return this.b.getInt(str, 0);
        } catch (Exception e2) {
            return 0;
        }
    }

    public int b(String str, int i) {
        try {
            return this.b.getInt(str, i);
        } catch (Exception e2) {
            return i;
        }
    }

    public Context b() {
        return this.d;
    }

    public String b(String str, String str2) {
        return this.b.getString(str, str2);
    }

    public String b(String str, String str2, boolean z) {
        String b = b(str, "");
        return !TextUtils.isEmpty(b) ? z ? c.b(b, 2) : b : str2;
    }

    public void b(String str, long j) {
        this.c.putLong(str, j);
        this.c.apply();
    }

    public int c(String str) {
        try {
            return this.b.getInt(str, 0);
        } catch (Exception e2) {
            return 0;
        }
    }

    public int c(String str, int i) {
        try {
            return this.b.getInt(str, i);
        } catch (Exception e2) {
            return i;
        }
    }

    public void c() {
        try {
            this.c.apply();
        } catch (Throwable th) {
        }
    }

    public void c(String str, String str2) {
        try {
            this.c.putString(str, str2);
            this.c.apply();
        } catch (Exception e2) {
        }
    }

    public void c(String str, String str2, boolean z) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (z) {
                str2 = c.b(str2.getBytes(), 2);
            }
            this.c.putString(str, str2);
            this.c.apply();
        } catch (Throwable th) {
        }
    }

    public long d(String str) {
        return this.b.getLong(str, 0L);
    }

    public void d(String str, int i) {
        this.c.putInt(str, i);
        this.c.apply();
    }

    public boolean e(String str) {
        return this.b.getBoolean(str, false);
    }
}
