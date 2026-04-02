package e.j.d.c0;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import i.a.o0;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class g {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e.j.d.i f8640b;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.AppInstanceId$get$2", f = "AppInstanceId.kt", l = {43}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super String>, Object> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f8641b;

        /* renamed from: e.j.d.c0.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0188a<TResult> implements OnCompleteListener {
            public final /* synthetic */ g a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ i.a.j<String> f8643b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0188a(g gVar, i.a.j<? super String> jVar) {
                this.a = gVar;
                this.f8643b = jVar;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<String> task) {
                String uuid;
                h.o.c.j.e(task, "it");
                if (task.isSuccessful()) {
                    uuid = task.getResult();
                    if (uuid == null) {
                        uuid = UUID.randomUUID().toString();
                        h.o.c.j.d(uuid, "randomUUID().toString()");
                    }
                } else {
                    uuid = UUID.randomUUID().toString();
                    h.o.c.j.d(uuid, "{\n                      …                        }");
                }
                n.a.a.b("PremiumHelper").g(h.o.c.j.i("APPLICATION_INSTANCE_ID = ", uuid), new Object[0]);
                e.j.d.i iVar = this.a.f8640b;
                Objects.requireNonNull(iVar);
                h.o.c.j.e(uuid, "value");
                SharedPreferences.Editor edit = iVar.a.edit();
                edit.putString("app_instance_id", uuid);
                edit.apply();
                if (this.f8643b.a()) {
                    this.f8643b.resumeWith(uuid);
                }
            }
        }

        public a(h.m.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super String> dVar) {
            return new a(dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            Task forException;
            ExecutorService executorService;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.f8641b;
            if (i2 == 0) {
                e.j.d.w.E0(obj);
                String string = g.this.f8640b.a.getString("app_instance_id", null);
                if (!(string == null || string.length() == 0)) {
                    return string;
                }
                g gVar = g.this;
                this.a = gVar;
                this.f8641b = 1;
                i.a.k kVar = new i.a.k(e.j.d.w.P(this), 1);
                kVar.p();
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(gVar.a);
                Objects.requireNonNull(firebaseAnalytics);
                try {
                    synchronized (FirebaseAnalytics.class) {
                        if (firebaseAnalytics.f4730c == null) {
                            firebaseAnalytics.f4730c = new e.d.d.k.b(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                        }
                        executorService = firebaseAnalytics.f4730c;
                    }
                    forException = Tasks.call(executorService, new e.d.d.k.c(firebaseAnalytics));
                } catch (RuntimeException e2) {
                    firebaseAnalytics.f4729b.zzA(5, "Failed to schedule task for getAppInstanceId", null, null, null);
                    forException = Tasks.forException(e2);
                }
                forException.addOnCompleteListener(new C0188a(gVar, kVar));
                obj = kVar.o();
                if (obj == h.m.h.a.COROUTINE_SUSPENDED) {
                    h.o.c.j.e(this, "frame");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                g gVar2 = (g) this.a;
                e.j.d.w.E0(obj);
            }
            return (String) obj;
        }
    }

    public g(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
        this.f8640b = new e.j.d.i(context);
    }

    public final Object a(h.m.d<? super String> dVar) {
        return e.j.d.w.J0(o0.f9155b, new a(null), dVar);
    }
}
