package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class v4 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    public v4(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = new e(context, "persistent.com.appboy.storage.sdk_enabled_cache");
    }

    public final boolean a() {
        return this.a.getBoolean("appboy_sdk_disabled", false);
    }
}
