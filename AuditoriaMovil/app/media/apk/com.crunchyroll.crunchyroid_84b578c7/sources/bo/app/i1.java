package bo.app;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class i1 {
    public static final a e = new a(null);
    private final Context a;
    private final c2 b;
    private final boolean c;
    private final boolean d;

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
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Task b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Task task) {
            super(0);
            this.b = task;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception " + this.b.getException();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Automatically obtained Firebase Cloud Messaging token: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to register for Firebase Cloud Messaging";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Registering for Firebase Cloud Messaging token using sender id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i b = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Automatically obtained Firebase Cloud Messaging token: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get push token via instance id";
        }
    }

    public i1(Context context, c2 c2Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(c2Var, "registrationDataProvider");
        this.a = context;
        this.b = c2Var;
        this.c = ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
        this.d = ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public static /* synthetic */ void b(i1 i1Var, Task task) {
        a(i1Var, task);
    }

    public final void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "firebaseSenderId");
        try {
            if (this.d) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new com.amazon.aps.iva.g1.m(this));
            } else if (this.c) {
                b(str);
            }
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
        }
    }

    private final void b(String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new f(str), 2, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, g.b, 3, (Object) null);
                return;
            }
            Object invokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (invokeMethodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(invokeMethodQuietly.getClass(), "getToken", String.class, String.class);
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
                return;
            }
            Object invokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(invokeMethodQuietly, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (invokeMethodQuietly2 instanceof String) {
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new j(invokeMethodQuietly2), 2, (Object) null);
                this.b.a((String) invokeMethodQuietly2);
            }
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, k.b);
        }
    }

    public static final void a(i1 i1Var, Task task) {
        com.amazon.aps.iva.yb0.j.f(i1Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(task, "task");
        if (!task.isSuccessful()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i1Var, BrazeLogger.Priority.W, (Throwable) null, new c(task), 2, (Object) null);
            return;
        }
        String str = (String) task.getResult();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i1Var, BrazeLogger.Priority.V, (Throwable) null, new d(str), 2, (Object) null);
        i1Var.b.a(str);
    }

    public final boolean a() {
        if (com.braze.support.f.b(this.a)) {
            return this.c || this.d;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        return false;
    }
}
