package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c.c0.d;
import c.c0.d0.l;
import c.c0.d0.s.p;
import c.c0.f;
import c.c0.h;
import c.c0.s;
import c.c0.t;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import e.c.a.l.e;
import e.d.d.g;
import e.d.d.s.a.a;
import e.d.d.w.o0;
import e.j.d.i;
import e.j.d.w;
import e.j.d.z.c;
import e.j.d.z.d;
import h.o.c.j;
import h.o.c.n;
import h.o.c.r;
import h.r.f;
import i.a.k;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class TotoRegisterWorker extends CoroutineWorker {
    public static final /* synthetic */ f<Object>[] $$delegatedProperties;
    public static final Companion Companion;
    private static final String TAG = "RegisterWorker";
    private final d log$delegate;
    private final i preferences;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.o.c.f fVar) {
            this();
        }

        public static /* synthetic */ void schedule$default(Companion companion, Context context, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            companion.schedule(context, str);
        }

        public final void schedule(Context context) {
            j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            schedule$default(this, context, null, 2, null);
        }

        public final void schedule(Context context, String str) {
            j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j.e(str, "fcmToken");
            h.f fVar = new h.f("fcm_token", str);
            int i2 = 0;
            h.f[] fVarArr = {fVar};
            f.a aVar = new f.a();
            while (i2 < 1) {
                h.f fVar2 = fVarArr[i2];
                i2++;
                aVar.b((String) fVar2.a, fVar2.f8925b);
            }
            c.c0.f a = aVar.a();
            j.d(a, "dataBuilder.build()");
            d.a aVar2 = new d.a();
            aVar2.a = s.CONNECTED;
            c.c0.d dVar = new c.c0.d(aVar2);
            j.d(dVar, "Builder()\n              …\n                .build()");
            t.a aVar3 = new t.a(TotoRegisterWorker.class);
            p pVar = aVar3.f1314b;
            pVar.f1515j = dVar;
            pVar.f1510e = a;
            t a2 = aVar3.a();
            j.d(a2, "OneTimeWorkRequestBuilde…\n                .build()");
            l.c(context).b(TotoRegisterWorker.TAG, h.KEEP, a2);
        }
    }

    static {
        n nVar = new n(TotoRegisterWorker.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(r.a);
        $$delegatedProperties = new h.r.f[]{nVar};
        Companion = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoRegisterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(workerParameters, "params");
        this.log$delegate = new e.j.d.z.d(TAG);
        this.preferences = new i(context);
    }

    public final Object getFcmToken(h.m.d<? super String> dVar) {
        final FirebaseMessaging firebaseMessaging;
        Task<String> task;
        String b2 = getInputData().b("fcm_token");
        if (!(b2 == null || b2.length() == 0)) {
            getLog().g(j.i("New FCM token: ", b2), new Object[0]);
            return b2;
        }
        final k kVar = new k(w.P(dVar), 1);
        kVar.p();
        try {
            getLog().k(4, null, "Requesting FCM token", new Object[0]);
            o0 o0Var = FirebaseMessaging.f4731b;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(g.b());
            }
            a aVar = firebaseMessaging.f4735f;
            if (aVar != null) {
                task = aVar.a();
            } else {
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.f4741l.execute(new Runnable() { // from class: e.d.d.w.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        FirebaseMessaging firebaseMessaging2 = FirebaseMessaging.this;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        Objects.requireNonNull(firebaseMessaging2);
                        try {
                            taskCompletionSource2.setResult(firebaseMessaging2.a());
                        } catch (Exception e2) {
                            taskCompletionSource2.setException(e2);
                        }
                    }
                });
                task = taskCompletionSource.getTask();
            }
            task.addOnCompleteListener(new OnCompleteListener() { // from class: com.zipoapps.premiumhelper.toto.TotoRegisterWorker$getFcmToken$2$1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task<String> task2) {
                    j.e(task2, "it");
                    boolean z = false;
                    if (task2.isSuccessful()) {
                        TotoRegisterWorker.this.getLog().g(j.i("Got FCM token: ", task2.getResult()), new Object[0]);
                        if (kVar.a()) {
                            kVar.resumeWith(task2.getResult());
                            return;
                        }
                        return;
                    }
                    Exception exception = task2.getException();
                    if (exception != null) {
                        j.e(exception, e.a);
                        n.a.a.b("PremiumHelper").c(exception);
                        try {
                            Class.forName("e.d.d.m.i");
                            z = true;
                        } catch (ClassNotFoundException unused) {
                        }
                        if (z) {
                            e.d.d.m.i.a().b(exception);
                        }
                    }
                    if (kVar.a()) {
                        kVar.resumeWith(null);
                    }
                }
            });
        } catch (Throwable th) {
            getLog().k(6, th, "Failed to retrieve FCM token", new Object[0]);
            if (kVar.a()) {
                kVar.resumeWith(null);
            }
        }
        Object o = kVar.o();
        if (o == h.m.h.a.COROUTINE_SUSPENDED) {
            j.e(dVar, "frame");
        }
        return o;
    }

    public final c getLog() {
        return this.log$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0043  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(h.m.d<? super androidx.work.ListenableWorker.a> r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoRegisterWorker.doWork(h.m.d):java.lang.Object");
    }
}
