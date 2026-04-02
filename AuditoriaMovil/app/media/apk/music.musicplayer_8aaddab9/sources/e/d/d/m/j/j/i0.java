package e.d.d.m.j.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class i0 implements j0 {
    public static final Pattern a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: b  reason: collision with root package name */
    public static final String f7176b = Pattern.quote("/");

    /* renamed from: c  reason: collision with root package name */
    public final k0 f7177c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f7178d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7179e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.u.h f7180f;

    /* renamed from: g  reason: collision with root package name */
    public final e0 f7181g;

    /* renamed from: h  reason: collision with root package name */
    public String f7182h;

    public i0(Context context, String str, e.d.d.u.h hVar, e0 e0Var) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f7178d = context;
        this.f7179e = str;
        this.f7180f = hVar;
        this.f7181g = e0Var;
        this.f7177c = new k0();
    }

    public static String b() {
        StringBuilder y = e.a.d.a.a.y("SYN_");
        y.append(UUID.randomUUID().toString());
        return y.toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : a.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        e.d.d.m.j.f.a.a(2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public synchronized String c() {
        String str;
        String str2 = this.f7182h;
        if (str2 != null) {
            return str2;
        }
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        fVar.a(2);
        SharedPreferences h2 = l.h(this.f7178d);
        String string = h2.getString("firebase.installation.id", null);
        fVar.a(2);
        if (this.f7181g.b()) {
            try {
                str = (String) n0.a(this.f7180f.getId());
            } catch (Exception e2) {
                if (e.d.d.m.j.f.a.a(5)) {
                    Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e2);
                }
                str = null;
            }
            e.d.d.m.j.f.a.a(2);
            if (str == null) {
                str = string == null ? b() : string;
            }
            if (str.equals(string)) {
                this.f7182h = h2.getString("crashlytics.installation.id", null);
            } else {
                this.f7182h = a(str, h2);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                this.f7182h = h2.getString("crashlytics.installation.id", null);
            } else {
                this.f7182h = a(b(), h2);
            }
        }
        if (this.f7182h == null) {
            e.d.d.m.j.f.a.d("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f7182h = a(b(), h2);
        }
        e.d.d.m.j.f.a.a(2);
        return this.f7182h;
    }

    public String d() {
        String str;
        k0 k0Var = this.f7177c;
        Context context = this.f7178d;
        synchronized (k0Var) {
            if (k0Var.a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                k0Var.a = installerPackageName;
            }
            str = "".equals(k0Var.a) ? null : k0Var.a;
        }
        return str;
    }

    public final String e(String str) {
        return str.replaceAll(f7176b, "");
    }
}
