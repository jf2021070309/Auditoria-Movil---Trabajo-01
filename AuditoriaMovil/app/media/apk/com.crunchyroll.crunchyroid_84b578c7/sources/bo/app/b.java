package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class b {
    public static final a c = new a(null);
    private final Context a;
    private final c2 b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0066a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final C0066a b = new C0066a();

            public C0066a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "com.amazon.device.messaging.ADM not found";
            }
        }

        /* renamed from: bo.app.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0067b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ Exception b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0067b(Exception exc) {
                super(0);
                this.b = exc;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Manifest not authored properly to support ADM. ADM manifest exception: " + this.b;
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private final boolean b(Context context) {
            try {
                ADMManifest.checkManifestAuthoredProperly(context);
                return true;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new C0067b(e), 2, (Object) null);
                return false;
            }
        }

        public final boolean a(Context context) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            return a() && b(context);
        }

        private a() {
        }

        private final boolean a() {
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                return true;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, C0066a.b, 2, (Object) null);
                return false;
            }
        }
    }

    /* renamed from: bo.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public C0068b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: " + b.this.b.a();
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
            return "Registering with ADM server...";
        }
    }

    public b(Context context, c2 c2Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(c2Var, "admRegistrationDataProvider");
        this.a = context;
        this.b = c2Var;
    }

    public final void a() {
        if (this.b.a() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new C0068b(), 2, (Object) null);
            c2 c2Var = this.b;
            c2Var.a(c2Var.a());
            return;
        }
        ADM adm = new ADM(this.a);
        if (adm.isSupported()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
            adm.startRegister();
        }
    }
}
