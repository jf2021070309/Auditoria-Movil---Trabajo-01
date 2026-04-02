package e.j.b;

import android.app.Application;
import android.os.Bundle;
/* loaded from: classes2.dex */
public abstract class a {
    public Bundle a(Bundle bundle, int i2) {
        String string;
        for (String str : bundle.keySet()) {
            if ((bundle.get(str) instanceof String) && (string = bundle.getString(str)) != null && string.length() > i2) {
                bundle.putString(str, string.substring(0, i2));
            }
        }
        return bundle;
    }

    public void b(Application application, boolean z) {
    }

    public abstract boolean c(Application application);

    public abstract void d(e.j.b.i.d dVar);

    public abstract void e(e.j.b.i.d dVar);

    public abstract void f(String str);

    public abstract void g(String str, String str2);

    public abstract void h(String str, Bundle bundle);
}
