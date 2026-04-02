package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import c.c0.c;
import c.c0.d0.k;
import c.c0.d0.l;
import c.c0.d0.t.i;
import c.c0.r;
import c.i.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String a = r.e("ForceStopRunnable");

    /* renamed from: b  reason: collision with root package name */
    public static final long f674b = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: c  reason: collision with root package name */
    public final Context f675c;

    /* renamed from: d  reason: collision with root package name */
    public final l f676d;

    /* renamed from: e  reason: collision with root package name */
    public int f677e = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = r.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            int i2 = ((r.a) r.c()).f1605b;
            ForceStopRunnable.d(context);
        }
    }

    public ForceStopRunnable(Context context, l lVar) {
        this.f675c = context.getApplicationContext();
        this.f676d = lVar;
    }

    public static PendingIntent b(Context context, int i2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i2);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b2 = b(context, a.L() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f674b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public boolean c() {
        c cVar = this.f676d.f1371e;
        Objects.requireNonNull(cVar);
        if (TextUtils.isEmpty(null)) {
            r.c().a(a, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a2 = i.a(this.f675c, cVar);
        r.c().a(a, String.format("Is default app process = %s", Boolean.valueOf(a2)), new Throwable[0]);
        return a2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!c()) {
                return;
            }
            while (true) {
                k.a(this.f675c);
                r.c().a(a, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    int i2 = this.f677e + 1;
                    this.f677e = i2;
                    if (i2 >= 3) {
                        r.c().b(a, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        Objects.requireNonNull(this.f676d.f1371e);
                        throw illegalStateException;
                    }
                    r.c().a(a, String.format("Retrying after %s", Long.valueOf(i2 * 300)), e2);
                    try {
                        Thread.sleep(this.f677e * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            this.f676d.e();
        }
    }
}
