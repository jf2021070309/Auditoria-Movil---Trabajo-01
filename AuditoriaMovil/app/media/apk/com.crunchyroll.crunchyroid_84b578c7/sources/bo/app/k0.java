package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class k0 implements w1 {
    public static final a b = new a(null);
    public final SharedPreferences a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final String a() {
            return String.valueOf(722989291);
        }

        private a() {
        }
    }

    public k0(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.device", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    private final void a(String str) {
        this.a.edit().putString("device_id", str).putString("persistent_device_id", b.a()).apply();
    }

    @Override // bo.app.w1
    public String getDeviceId() {
        String str = null;
        String string = this.a.getString("device_id", null);
        if (!a()) {
            str = string;
        }
        if (str == null) {
            String d = com.amazon.aps.iva.j0.j0.d("randomUUID().toString()");
            a(d);
            return d;
        } else if (!this.a.contains("persistent_device_id")) {
            a(str);
            return str;
        } else {
            return str;
        }
    }

    private final boolean a() {
        if (this.a.contains("persistent_device_id")) {
            if (!com.amazon.aps.iva.yb0.j.a(b.a(), this.a.getString("persistent_device_id", ""))) {
                return true;
            }
        }
        return false;
    }
}
