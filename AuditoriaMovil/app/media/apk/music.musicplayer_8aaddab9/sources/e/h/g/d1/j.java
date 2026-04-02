package e.h.g.d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import e.h.g.b1;
import e.h.g.j0;
import e.h.g.l0;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.x0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public abstract class j extends BroadcastReceiver {
    public static final d a = new d(null);

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f8269b;

    /* renamed from: c  reason: collision with root package name */
    public static long f8270c;

    /* renamed from: d  reason: collision with root package name */
    public static long f8271d;

    /* renamed from: e  reason: collision with root package name */
    public static int f8272e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8273f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f8274g;

    /* renamed from: h  reason: collision with root package name */
    public static r0 f8275h;

    /* renamed from: i  reason: collision with root package name */
    public static r0 f8276i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f8277j;

    /* renamed from: k  reason: collision with root package name */
    public static final ReentrantLock f8278k;

    /* renamed from: l  reason: collision with root package name */
    public static final f f8279l;

    /* renamed from: m  reason: collision with root package name */
    public static final f f8280m;

    /* renamed from: n  reason: collision with root package name */
    public static final Runnable f8281n;
    public static final r0 o;
    public static int p;
    public static final b q;
    public static final ReentrantLock r;
    public static final HandlerThread s;

    /* loaded from: classes2.dex */
    public static class b extends Handler {
        public j a;

        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (x0.f8405d == null) {
                t1.g("Context is null", false);
                return;
            }
            j jVar = this.a;
            if (jVar == null) {
                t1.g("receiver is null", false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                if (j.f8274g) {
                    return;
                }
                jVar.n();
                j.f8274g = true;
            } else if (i2 == 2) {
                b bVar = j.q;
                bVar.removeMessages(4);
                bVar.sendMessageDelayed(bVar.obtainMessage(4, x0.f8405d), 700L);
            } else if (i2 == 3) {
                t1.g("headset up!", false);
                b bVar2 = j.q;
                bVar2.removeMessages(4);
                bVar2.sendMessageDelayed(bVar2.obtainMessage(4, x0.f8405d), 700L);
                j.f8272e++;
            } else if (i2 != 4) {
            } else {
                boolean l2 = jVar.l();
                StringBuilder y = e.a.d.a.a.y("interpreting ");
                y.append(j.f8272e);
                y.append(" clicks");
                t1.g(y.toString(), false);
                int i3 = j.f8272e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        jVar.w();
                    } else if (i3 != 2) {
                        if (i3 == 4) {
                            jVar.p();
                            jVar.p();
                        } else if (l2) {
                            jVar.p();
                        } else {
                            jVar.u();
                        }
                    } else if (l2) {
                        jVar.u();
                    } else {
                        jVar.p();
                    }
                }
                j.f8272e = 0;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public Context a;

        /* renamed from: b  reason: collision with root package name */
        public Intent f8282b;

        /* renamed from: c  reason: collision with root package name */
        public j f8283c;

        public c() {
        }

        public c(a aVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends b1<c> {
        public d(a aVar) {
        }

        @Override // e.h.g.b1
        public void a(c cVar) {
            c cVar2 = cVar;
            if (cVar2 != null) {
                final j jVar = cVar2.f8283c;
                final Context context = cVar2.a;
                Intent intent = cVar2.f8282b;
                Objects.requireNonNull(jVar);
                boolean f2 = jVar.f(x0.f8405d);
                String action = intent.getAction();
                t1.g(action, true);
                if ("android.media.AUDIO_BECOMING_NOISY".equals(action)) {
                    t1.g("noisy", false);
                    t1.g("Clear hook up", false);
                    b bVar = j.q;
                    bVar.removeMessages(4);
                    bVar.removeMessages(3);
                    bVar.removeMessages(2);
                    j.f8272e = 0;
                    r0 r0Var = j.f8275h;
                    if (r0Var == null) {
                        j.f8275h = new r0();
                    } else {
                        r0Var.g();
                    }
                    j.f8275h.a(1000L);
                    if (jVar.v()) {
                        jVar.m();
                    }
                } else if (f2) {
                    if (!"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                        if ("android.intent.action.MEDIA_BUTTON".equals(action)) {
                            j.q(jVar, intent);
                            return;
                        } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                            t1.g("ACL Connected", true);
                            j.f8276i = new r0();
                            j0.d(new j0.b() { // from class: e.h.g.d1.f
                                @Override // e.h.g.j0.b
                                public final void a() {
                                    boolean z;
                                    boolean z2;
                                    j jVar2 = j.this;
                                    Context context2 = context;
                                    Objects.requireNonNull(jVar2);
                                    ReentrantLock reentrantLock = j.f8278k;
                                    reentrantLock.lock();
                                    try {
                                        if (!jVar2.j(context2) && !jVar2.g(context2)) {
                                            if (jVar2.j(context2)) {
                                                jVar2.t(context2, true);
                                                t1.g("A2DP isn't really on", true);
                                            } else {
                                                jVar2.t(context2, true);
                                                t1.g("Don't start playing music automatically, we don't have that setting enabled", true);
                                            }
                                            reentrantLock.unlock();
                                        }
                                        AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                                        if (audioManager != null) {
                                            int i2 = 0;
                                            z = false;
                                            do {
                                                try {
                                                    z = audioManager.isBluetoothA2dpOn();
                                                    if (!z) {
                                                        Thread.sleep(100L);
                                                        i2++;
                                                    }
                                                    if (i2 >= 150) {
                                                        break;
                                                    }
                                                } catch (Exception e2) {
                                                    s1.l(e2, true);
                                                }
                                            } while (!z);
                                        } else {
                                            z = false;
                                        }
                                        j.f8277j = z;
                                        if (z && (jVar2.g(context2) || jVar2.j(context2))) {
                                            try {
                                                z2 = l0.h(context2).d("jtmap", true);
                                            } catch (Exception e3) {
                                                s1.l(e3, true);
                                                z2 = false;
                                            }
                                            if (z2) {
                                                if (jVar2.g(context2)) {
                                                    jVar2.o();
                                                }
                                                if (jVar2.j(context2)) {
                                                    if (jVar2.k(context2) && j.f8269b.b() > TimeUnit.SECONDS.toMillis(30L)) {
                                                        float streamMaxVolume = audioManager.getStreamMaxVolume(3) * jVar2.d(context2);
                                                        int i3 = (int) streamMaxVolume;
                                                        t1.g("Setting volume during Bluetooth connect = " + streamMaxVolume, true);
                                                        boolean z3 = false;
                                                        while (audioManager.getStreamVolume(3) > i3) {
                                                            if (!z3) {
                                                                t1.g("Lowering volume", true);
                                                                z3 = true;
                                                            }
                                                            audioManager.adjustStreamVolume(3, -1, 1);
                                                        }
                                                        while (audioManager.getStreamVolume(3) < i3) {
                                                            if (!z3) {
                                                                t1.g("Raising volume", true);
                                                                z3 = true;
                                                            }
                                                            audioManager.adjustStreamVolume(3, 1, 1);
                                                        }
                                                    } else if (jVar2.k(context2)) {
                                                        t1.g("Not setting Bluetooth volume because a Bluetooth connection recently ended", true);
                                                    }
                                                    if (audioManager.isMusicActive()) {
                                                        t1.g("not starting Bluetooth, something is already playing", true);
                                                    } else {
                                                        jVar2.t(context2, false);
                                                        t1.g("playing some tunes!!", true);
                                                        jVar2.s(k.USER_PLAY_ON_BLUETOOTH);
                                                    }
                                                }
                                                reentrantLock.unlock();
                                            }
                                        }
                                        if (j.f8277j) {
                                            t1.g("not starting Bluetooth, not a new connection", true);
                                        } else {
                                            t1.g("not starting Bluetooth, not an a2dp connection", true);
                                            jVar2.t(context2, true);
                                        }
                                        reentrantLock.unlock();
                                    } catch (Throwable th) {
                                        try {
                                            reentrantLock.unlock();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            });
                            return;
                        } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                            j.f8269b.g();
                            j0.c(new j0.b() { // from class: e.h.g.d1.h
                                @Override // e.h.g.j0.b
                                public final void a() {
                                    j jVar2 = j.this;
                                    Context context2 = context;
                                    Objects.requireNonNull(jVar2);
                                    ReentrantLock reentrantLock = j.f8278k;
                                    reentrantLock.lock();
                                    try {
                                        if (jVar2.g(context2)) {
                                            AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                                            int i2 = 0;
                                            do {
                                                try {
                                                    Thread.sleep(1000L);
                                                    i2++;
                                                    if (i2 >= 15 || audioManager == null) {
                                                        break;
                                                    }
                                                } catch (InterruptedException e2) {
                                                    s1.l(e2, true);
                                                }
                                            } while (audioManager.isBluetoothA2dpOn());
                                            boolean isBluetoothA2dpOn = audioManager.isBluetoothA2dpOn();
                                            j.f8277j = isBluetoothA2dpOn;
                                            if (isBluetoothA2dpOn) {
                                                s1.c("Bluetooth didn't really disconnect");
                                            } else {
                                                jVar2.t(context2, true);
                                                jVar2.a();
                                                jVar2.o();
                                            }
                                        }
                                        reentrantLock.unlock();
                                    } catch (Throwable th) {
                                        try {
                                            reentrantLock.unlock();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            });
                            return;
                        } else {
                            return;
                        }
                    }
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 11);
                    t1.g("A2DP detected " + intExtra, true);
                    if (intExtra == 2) {
                        j.f8276i = new r0();
                        j0.d(new j0.b() { // from class: e.h.g.d1.f
                            @Override // e.h.g.j0.b
                            public final void a() {
                                boolean z;
                                boolean z2;
                                j jVar2 = j.this;
                                Context context2 = context;
                                Objects.requireNonNull(jVar2);
                                ReentrantLock reentrantLock = j.f8278k;
                                reentrantLock.lock();
                                try {
                                    if (!jVar2.j(context2) && !jVar2.g(context2)) {
                                        if (jVar2.j(context2)) {
                                            jVar2.t(context2, true);
                                            t1.g("A2DP isn't really on", true);
                                        } else {
                                            jVar2.t(context2, true);
                                            t1.g("Don't start playing music automatically, we don't have that setting enabled", true);
                                        }
                                        reentrantLock.unlock();
                                    }
                                    AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                                    if (audioManager != null) {
                                        int i2 = 0;
                                        z = false;
                                        do {
                                            try {
                                                z = audioManager.isBluetoothA2dpOn();
                                                if (!z) {
                                                    Thread.sleep(100L);
                                                    i2++;
                                                }
                                                if (i2 >= 150) {
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                s1.l(e2, true);
                                            }
                                        } while (!z);
                                    } else {
                                        z = false;
                                    }
                                    j.f8277j = z;
                                    if (z && (jVar2.g(context2) || jVar2.j(context2))) {
                                        try {
                                            z2 = l0.h(context2).d("jtmap", true);
                                        } catch (Exception e3) {
                                            s1.l(e3, true);
                                            z2 = false;
                                        }
                                        if (z2) {
                                            if (jVar2.g(context2)) {
                                                jVar2.o();
                                            }
                                            if (jVar2.j(context2)) {
                                                if (jVar2.k(context2) && j.f8269b.b() > TimeUnit.SECONDS.toMillis(30L)) {
                                                    float streamMaxVolume = audioManager.getStreamMaxVolume(3) * jVar2.d(context2);
                                                    int i3 = (int) streamMaxVolume;
                                                    t1.g("Setting volume during Bluetooth connect = " + streamMaxVolume, true);
                                                    boolean z3 = false;
                                                    while (audioManager.getStreamVolume(3) > i3) {
                                                        if (!z3) {
                                                            t1.g("Lowering volume", true);
                                                            z3 = true;
                                                        }
                                                        audioManager.adjustStreamVolume(3, -1, 1);
                                                    }
                                                    while (audioManager.getStreamVolume(3) < i3) {
                                                        if (!z3) {
                                                            t1.g("Raising volume", true);
                                                            z3 = true;
                                                        }
                                                        audioManager.adjustStreamVolume(3, 1, 1);
                                                    }
                                                } else if (jVar2.k(context2)) {
                                                    t1.g("Not setting Bluetooth volume because a Bluetooth connection recently ended", true);
                                                }
                                                if (audioManager.isMusicActive()) {
                                                    t1.g("not starting Bluetooth, something is already playing", true);
                                                } else {
                                                    jVar2.t(context2, false);
                                                    t1.g("playing some tunes!!", true);
                                                    jVar2.s(k.USER_PLAY_ON_BLUETOOTH);
                                                }
                                            }
                                            reentrantLock.unlock();
                                        }
                                    }
                                    if (j.f8277j) {
                                        t1.g("not starting Bluetooth, not a new connection", true);
                                    } else {
                                        t1.g("not starting Bluetooth, not an a2dp connection", true);
                                        jVar2.t(context2, true);
                                    }
                                    reentrantLock.unlock();
                                } catch (Throwable th) {
                                    try {
                                        reentrantLock.unlock();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        });
                    } else if (intExtra == 0) {
                        if (jVar.j(context)) {
                            j0.c(new j0.b() { // from class: e.h.g.d1.b
                                @Override // e.h.g.j0.b
                                public final void a() {
                                    j jVar2 = j.this;
                                    Context context2 = context;
                                    Objects.requireNonNull(jVar2);
                                    ReentrantLock reentrantLock = j.f8278k;
                                    reentrantLock.lock();
                                    try {
                                        AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                                        int i2 = 0;
                                        do {
                                            try {
                                                Thread.sleep(1000L);
                                                i2++;
                                                if (i2 >= 15 || audioManager == null) {
                                                    break;
                                                }
                                            } catch (InterruptedException e2) {
                                                s1.l(e2, true);
                                            }
                                        } while (audioManager.isBluetoothA2dpOn());
                                        boolean isBluetoothA2dpOn = audioManager.isBluetoothA2dpOn();
                                        j.f8277j = isBluetoothA2dpOn;
                                        if (isBluetoothA2dpOn) {
                                            t1.g("Bluetooth didn't really disconnect", true);
                                        } else {
                                            jVar2.t(context2, true);
                                            jVar2.a();
                                            jVar2.o();
                                        }
                                        reentrantLock.unlock();
                                    } catch (Throwable th) {
                                        try {
                                            reentrantLock.unlock();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            });
                        } else {
                            jVar.a();
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(long j2, int i2);
    }

    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: b  reason: collision with root package name */
        public boolean f8284b;

        /* renamed from: c  reason: collision with root package name */
        public e f8285c;

        /* renamed from: d  reason: collision with root package name */
        public int f8286d;

        /* renamed from: e  reason: collision with root package name */
        public long f8287e;
        public long a = 500;

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f8288f = new a();

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a(false);
                f fVar = f.this;
                if (fVar.f8284b) {
                    x0.a.postDelayed(fVar.f8288f, fVar.a);
                }
            }
        }

        public final void a(boolean z) {
            int i2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            e eVar = this.f8285c;
            if (eVar != null) {
                long j2 = elapsedRealtime - this.f8287e;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = this.f8286d;
                    this.f8286d = i2 + 1;
                }
                eVar.a(j2, i2);
            }
        }

        public void b() {
            boolean z = !this.f8284b;
            this.f8284b = true;
            if (z) {
                this.f8287e = SystemClock.elapsedRealtime();
                this.f8286d = 0;
                x0.a.post(this.f8288f);
            }
        }

        public void c() {
            this.f8284b = false;
            x0.a.removeCallbacks(this.f8288f);
            if (this.f8287e != 0) {
                a(true);
                this.f8287e = 0L;
            }
        }
    }

    static {
        r0 r0Var = new r0();
        r0Var.h();
        f8269b = r0Var;
        f8271d = 0L;
        f8272e = 0;
        f8273f = false;
        f8274g = false;
        f8275h = null;
        f8276i = null;
        f8277j = false;
        f8278k = new ReentrantLock(true);
        f8279l = new f();
        f8280m = new f();
        f8281n = new Runnable() { // from class: e.h.g.d1.e
            @Override // java.lang.Runnable
            public final void run() {
                j.f8279l.c();
                j.f8280m.c();
            }
        };
        r0 r0Var2 = new r0();
        r0Var2.h();
        o = r0Var2;
        r = new ReentrantLock(true);
        HandlerThread handlerThread = new HandlerThread("JTMediaButtonHandler");
        s = handlerThread;
        handlerThread.start();
        q = new b(handlerThread.getLooper());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q(final e.h.g.d1.j r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.d1.j.q(e.h.g.d1.j, android.content.Intent):boolean");
    }

    public final void a() {
        t1.g("Bluetooth ended", true);
        s(k.BLUETOOTH_ENDED);
    }

    public abstract long b();

    public abstract boolean c(x0 x0Var);

    public abstract float d(Context context);

    public abstract boolean e(x0 x0Var);

    public abstract boolean f(x0 x0Var);

    public abstract boolean g(Context context);

    public abstract boolean h(x0 x0Var);

    public abstract long i();

    public abstract boolean j(Context context);

    public abstract boolean k(Context context);

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c cVar = new c(null);
        cVar.f8283c = this;
        cVar.a = context;
        cVar.f8282b = intent;
        a.b(cVar);
    }

    public abstract void p();

    public abstract void r(long j2);

    public abstract void s(k kVar);

    public final void t(Context context, boolean z) {
        try {
            l0.h(context).m("jtmap", z);
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }

    public abstract void u();

    public abstract boolean v();

    public abstract void w();
}
