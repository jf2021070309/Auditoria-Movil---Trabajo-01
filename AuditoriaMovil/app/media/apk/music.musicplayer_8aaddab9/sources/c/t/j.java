package c.t;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;
/* loaded from: classes.dex */
public class j {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public long f2552b = 0;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f2553c = null;

    /* renamed from: d  reason: collision with root package name */
    public SharedPreferences.Editor f2554d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2555e;

    /* renamed from: f  reason: collision with root package name */
    public String f2556f;

    /* renamed from: g  reason: collision with root package name */
    public PreferenceScreen f2557g;

    /* renamed from: h  reason: collision with root package name */
    public c f2558h;

    /* renamed from: i  reason: collision with root package name */
    public a f2559i;

    /* renamed from: j  reason: collision with root package name */
    public b f2560j;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public j(Context context) {
        this.a = context;
        this.f2556f = context.getPackageName() + "_preferences";
    }

    public PreferenceScreen a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.q(this);
        return preferenceScreen;
    }

    public SharedPreferences.Editor b() {
        if (this.f2555e) {
            if (this.f2554d == null) {
                this.f2554d = c().edit();
            }
            return this.f2554d;
        }
        return c().edit();
    }

    public SharedPreferences c() {
        if (this.f2553c == null) {
            this.f2553c = this.a.getSharedPreferences(this.f2556f, 0);
        }
        return this.f2553c;
    }
}
