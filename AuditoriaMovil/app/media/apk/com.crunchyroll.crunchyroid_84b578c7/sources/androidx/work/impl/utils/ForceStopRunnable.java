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
import com.amazon.aps.iva.k3.a;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.j;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.u9.i;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public static final long e;
    public final Context b;
    public final k c;
    public int d = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            m.e("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                int i = ((m.a) m.c()).b;
                ForceStopRunnable.c(context);
            }
        }
    }

    static {
        m.e("ForceStopRunnable");
        e = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(Context context, k kVar) {
        this.b = context.getApplicationContext();
        this.c = kVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (a.b()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        androidx.work.a aVar = this.c.b;
        aVar.getClass();
        if (TextUtils.isEmpty(null)) {
            m.c().a(new Throwable[0]);
            return true;
        }
        boolean a = i.a(this.b, aVar);
        m c = m.c();
        String.format("Is default app process = %s", Boolean.valueOf(a));
        c.a(new Throwable[0]);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.c;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                j.a(this.b);
                m.c().a(new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    int i = this.d + 1;
                    this.d = i;
                    if (i < 3) {
                        m c = m.c();
                        String.format("Retrying after %s", Long.valueOf(i * 300));
                        c.a(e2);
                        try {
                            Thread.sleep(this.d * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        m.c().b(e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        kVar.b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            kVar.e();
        }
    }
}
