package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PreferenceManager.java */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public String f;
    public PreferenceScreen g;
    public c h;
    public a i;
    public b j;

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean nf(Preference preference);
    }

    public e(Context context) {
        this.a = context;
        this.f = context.getPackageName() + "_preferences";
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public final SharedPreferences.Editor b() {
        if (this.e) {
            if (this.d == null) {
                this.d = c().edit();
            }
            return this.d;
        }
        return c().edit();
    }

    public final SharedPreferences c() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }
}
