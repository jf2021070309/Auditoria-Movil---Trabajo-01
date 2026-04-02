package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import c.c0.d0.l;
import c.c0.d0.r.c;
import c.c0.d0.t.t.b;
import c.c0.r;
import c.p.t;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public class SystemForegroundService extends t implements c.a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f666b = r.e("SystemFgService");

    /* renamed from: c  reason: collision with root package name */
    public Handler f667c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f668d;

    /* renamed from: e  reason: collision with root package name */
    public c f669e;

    /* renamed from: f  reason: collision with root package name */
    public NotificationManager f670f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Notification f671b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f672c;

        public a(int i2, Notification notification, int i3) {
            this.a = i2;
            this.f671b = notification;
            this.f672c = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.a, this.f671b, this.f672c);
            } else {
                SystemForegroundService.this.startForeground(this.a, this.f671b);
            }
        }
    }

    public final void a() {
        this.f667c = new Handler(Looper.getMainLooper());
        this.f670f = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f669e = cVar;
        if (cVar.f1490k != null) {
            r.c().b(c.a, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.f1490k = this;
        }
    }

    public void b(int i2, int i3, Notification notification) {
        this.f667c.post(new a(i2, notification, i3));
    }

    @Override // c.p.t, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // c.p.t, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f669e.g();
    }

    @Override // c.p.t, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f668d) {
            r.c().d(f666b, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f669e.g();
            a();
            this.f668d = false;
        }
        if (intent != null) {
            c cVar = this.f669e;
            Objects.requireNonNull(cVar);
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                r.c().d(c.a, String.format("Started foreground service %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                WorkDatabase workDatabase = cVar.f1482c.f1372f;
                ((b) cVar.f1483d).a.execute(new c.c0.d0.r.b(cVar, workDatabase, stringExtra));
                cVar.e(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                cVar.e(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                r.c().d(c.a, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                    return 3;
                }
                l lVar = cVar.f1482c;
                UUID fromString = UUID.fromString(stringExtra2);
                Objects.requireNonNull(lVar);
                ((b) lVar.f1373g).a.execute(new c.c0.d0.t.a(lVar, fromString));
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                r.c().d(c.a, "Stopping foreground service", new Throwable[0]);
                c.a aVar = cVar.f1490k;
                if (aVar != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) aVar;
                    systemForegroundService.f668d = true;
                    r.c().a(f666b, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }
}
