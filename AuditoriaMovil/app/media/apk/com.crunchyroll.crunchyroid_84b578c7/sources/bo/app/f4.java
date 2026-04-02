package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class f4 implements c2 {
    public static final a c = new a(null);
    private final BrazeConfigurationProvider a;
    public final SharedPreferences b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Stored push registration ID version code ");
            sb.append(this.b);
            sb.append(" does not match live version code ");
            return defpackage.e.f(sb, this.c, ". Not returning saved registration ID.");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Device identifier differs from saved device identifier. Returning null token.";
        }
    }

    public f4(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        this.a = brazeConfigurationProvider;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.push_registration", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
    }

    private final boolean b() {
        if (!this.a.isFirebaseCloudMessagingRegistrationEnabled() && !this.a.isAdmMessagingRegistrationEnabled()) {
            return false;
        }
        return true;
    }

    @Override // bo.app.c2
    public synchronized String a() {
        int versionCode;
        int i;
        if (b() && this.b.contains("version_code") && (versionCode = this.a.getVersionCode()) != (i = this.b.getInt("version_code", Integer.MIN_VALUE))) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(i, versionCode), 2, (Object) null);
            return null;
        }
        if (this.b.contains("device_identifier")) {
            if (!com.amazon.aps.iva.yb0.j.a(k0.b.a(), this.b.getString("device_identifier", ""))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
                return null;
            }
        }
        return this.b.getString("registration_id", null);
    }

    @Override // bo.app.c2
    public synchronized void a(String str) {
        if (str != null) {
            this.b.edit().putString("registration_id", str).putInt("version_code", this.a.getVersionCode()).putString("device_identifier", k0.b.a()).apply();
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
