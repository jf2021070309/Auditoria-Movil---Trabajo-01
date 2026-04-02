package bo.app;

import android.app.Activity;
import bo.app.o3;
import com.braze.models.IBrazeLocation;
/* loaded from: classes.dex */
public interface r1 {
    static /* synthetic */ void a(r1 r1Var, long j, long j2, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestContentCardsSync");
        }
        r1Var.a(j, j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    String a();

    void a(long j);

    void a(long j, long j2, int i, boolean z);

    void a(l2 l2Var);

    void a(o3.a aVar);

    void a(q5 q5Var, l2 l2Var);

    void a(s1 s1Var);

    void a(IBrazeLocation iBrazeLocation);

    void a(String str);

    void a(Throwable th);

    void a(boolean z);

    boolean a(p1 p1Var);

    void b(String str);

    void b(Throwable th);

    void b(boolean z);

    boolean b();

    void c();

    void closeSession(Activity activity);

    void d();

    void e();

    void f();

    void openSession(Activity activity);

    void refreshFeatureFlags();

    static /* synthetic */ void a(r1 r1Var, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performPushDeliveryFlush");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        r1Var.a(j);
    }
}
