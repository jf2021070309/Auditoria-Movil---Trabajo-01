package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.foreground.a;
import com.amazon.aps.iva.i5.q;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.d;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.w9.b;
import java.util.UUID;
/* loaded from: classes.dex */
public class SystemForegroundService extends q implements a.InterfaceC0064a {
    public Handler c;
    public boolean d;
    public a e;
    public NotificationManager f;

    static {
        m.e("SystemFgService");
    }

    public final void g() {
        this.c = new Handler(Looper.getMainLooper());
        this.f = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.e = aVar;
        if (aVar.j != null) {
            m.c().b(new Throwable[0]);
        } else {
            aVar.j = this;
        }
    }

    @Override // com.amazon.aps.iva.i5.q, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g();
    }

    @Override // com.amazon.aps.iva.i5.q, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.e;
        aVar.j = null;
        synchronized (aVar.d) {
            aVar.i.c();
        }
        d dVar = aVar.b.f;
        synchronized (dVar.l) {
            dVar.k.remove(aVar);
        }
    }

    @Override // com.amazon.aps.iva.i5.q, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            m.c().d(new Throwable[0]);
            a aVar = this.e;
            aVar.j = null;
            synchronized (aVar.d) {
                aVar.i.c();
            }
            d dVar = aVar.b.f;
            synchronized (dVar.l) {
                dVar.k.remove(aVar);
            }
            g();
            this.d = false;
        }
        if (intent != null) {
            a aVar2 = this.e;
            aVar2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            int i3 = a.k;
            k kVar = aVar2.b;
            if (equals) {
                m c = m.c();
                String.format("Started foreground service %s", intent);
                c.d(new Throwable[0]);
                ((b) aVar2.c).a(new com.amazon.aps.iva.s9.b(aVar2, kVar.c, intent.getStringExtra("KEY_WORKSPEC_ID")));
                aVar2.d(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                aVar2.d(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                m c2 = m.c();
                String.format("Stopping foreground work for %s", intent);
                c2.d(new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    kVar.getClass();
                    ((b) kVar.d).a(new com.amazon.aps.iva.u9.a(kVar, fromString));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                m.c().d(new Throwable[0]);
                a.InterfaceC0064a interfaceC0064a = aVar2.j;
                if (interfaceC0064a != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0064a;
                    systemForegroundService.d = true;
                    m.c().a(new Throwable[0]);
                    systemForegroundService.stopForeground(true);
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
