package e.d.d.w;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
@KeepForSdk
/* loaded from: classes2.dex */
public class l0 {
    public static l0 a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public String f7681b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f7682c = null;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f7683d = null;

    /* renamed from: e  reason: collision with root package name */
    public final Queue<Intent> f7684e = new ArrayDeque();

    public static synchronized l0 a() {
        l0 l0Var;
        synchronized (l0.class) {
            if (a == null) {
                a = new l0();
            }
            l0Var = a;
        }
        return l0Var;
    }

    public boolean b(Context context) {
        if (this.f7683d == null) {
            this.f7683d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f7682c.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f7683d.booleanValue();
    }

    public boolean c(Context context) {
        if (this.f7682c == null) {
            this.f7682c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f7682c.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f7682c.booleanValue();
    }
}
