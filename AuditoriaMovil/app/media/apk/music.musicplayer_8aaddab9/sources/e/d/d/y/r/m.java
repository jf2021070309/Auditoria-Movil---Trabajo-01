package e.d.d.y.r;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;
/* loaded from: classes2.dex */
public class m {
    public static final Pattern a;

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f7790b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<BiConsumer<String, k>> f7791c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final Executor f7792d;

    /* renamed from: e  reason: collision with root package name */
    public final j f7793e;

    /* renamed from: f  reason: collision with root package name */
    public final j f7794f;

    static {
        Charset.forName("UTF-8");
        a = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f7790b = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public m(Executor executor, j jVar, j jVar2) {
        this.f7792d = executor;
        this.f7793e = jVar;
        this.f7794f = jVar2;
    }

    public static k b(j jVar) {
        synchronized (jVar) {
            Task<k> task = jVar.f7772e;
            if (task == null || !task.isSuccessful()) {
                try {
                    return (k) j.a(jVar.b(), 5L, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            }
            return jVar.f7772e.getResult();
        }
    }

    public static Double c(j jVar, String str) {
        k b2 = b(jVar);
        if (b2 == null) {
            return null;
        }
        try {
            return Double.valueOf(b2.f7774c.getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Set<String> d(j jVar) {
        HashSet hashSet = new HashSet();
        k b2 = b(jVar);
        if (b2 == null) {
            return hashSet;
        }
        Iterator<String> keys = b2.f7774c.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static Long e(j jVar, String str) {
        k b2 = b(jVar);
        if (b2 == null) {
            return null;
        }
        try {
            return Long.valueOf(b2.f7774c.getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String f(j jVar, String str) {
        k b2 = b(jVar);
        if (b2 == null) {
            return null;
        }
        try {
            return b2.f7774c.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void h(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public final void a(final String str, final k kVar) {
        if (kVar == null) {
            return;
        }
        synchronized (this.f7791c) {
            for (final BiConsumer<String, k> biConsumer : this.f7791c) {
                this.f7792d.execute(new Runnable() { // from class: e.d.d.y.r.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        BiConsumer.this.accept(str, kVar);
                    }
                });
            }
        }
    }

    public e.d.d.y.p g(String str) {
        String f2 = f(this.f7793e, str);
        if (f2 != null) {
            a(str, b(this.f7793e));
            return new p(f2, 2);
        }
        String f3 = f(this.f7794f, str);
        if (f3 != null) {
            return new p(f3, 1);
        }
        h(str, "FirebaseRemoteConfigValue");
        return new p("", 0);
    }
}
