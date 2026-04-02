package com.zipoapps.premiumhelper.util;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.zipoapps.premiumhelper.toto.TotoRegisterWorker;
import e.j.d.z.d;
import h.o.c.j;
import h.o.c.n;
import h.o.c.r;
import h.r.f;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class PHMessagingService extends FirebaseMessagingService {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ f<Object>[] f4941g;

    /* renamed from: h  reason: collision with root package name */
    public final d f4942h = new d(null);

    /* loaded from: classes2.dex */
    public interface a {
        void a(RemoteMessage remoteMessage);

        void b(RemoteMessage remoteMessage);
    }

    static {
        n nVar = new n(PHMessagingService.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(r.a);
        f4941g = new f[]{nVar};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|(9:14|(2:16|(2:18|(1:22))(2:37|(1:39)))(2:40|(1:42))|23|(1:25)|26|27|28|29|(1:33)(2:31|32))|43|23|(0)|26|27|28|29|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0116, code lost:
        r1.c().k(6, r3, null, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(com.google.firebase.messaging.RemoteMessage r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.util.PHMessagingService.f(com.google.firebase.messaging.RemoteMessage):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void h(String str) {
        j.e(str, "token");
        Context applicationContext = getApplicationContext();
        j.d(applicationContext, "applicationContext");
        j.e(applicationContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (applicationContext.getSharedPreferences("premium_helper_data", 0).getBoolean("has_active_purchase", false)) {
            TotoRegisterWorker.Companion companion = TotoRegisterWorker.Companion;
            Context applicationContext2 = getApplicationContext();
            j.d(applicationContext2, "applicationContext");
            companion.schedule(applicationContext2, str);
        }
    }
}
