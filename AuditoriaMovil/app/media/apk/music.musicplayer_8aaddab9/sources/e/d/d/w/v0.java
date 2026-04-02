package e.d.d.w;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class v0 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f7726b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c  reason: collision with root package name */
    public static WakeLock f7727c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f7726b) {
            if (f7727c == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f7727c = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f7727c.acquire(a);
            }
            return startService;
        }
    }
}
