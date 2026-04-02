package e.h.d;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.android.music.MusicApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.a.c.j6;
import e.a.c.z6;
import e.h.d.m0;
import e.h.d.u;
import e.h.g.g1;
import e.h.g.h1;
import e.h.g.q1;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.v1;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class s0 extends v1 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f8192c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8193d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8194e;

    /* renamed from: f  reason: collision with root package name */
    public u.b f8195f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8196g;

    /* renamed from: h  reason: collision with root package name */
    public MediaSessionCompat f8197h;

    /* renamed from: i  reason: collision with root package name */
    public m0 f8198i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8199j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8200k;

    /* renamed from: l  reason: collision with root package name */
    public int f8201l;

    /* loaded from: classes2.dex */
    public enum a {
        FOREGROUND,
        LONG_RUNNING
    }

    public s0(m0 m0Var) {
        super("nh");
        this.f8193d = false;
        this.f8195f = null;
        this.f8200k = false;
        this.f8201l = 200000;
        this.f8198i = m0Var;
        Objects.requireNonNull(c.i.g.b.f2069b);
        this.f8194e = false;
    }

    public static void i() {
        try {
            int i2 = t1.a;
            if (e.h.g.v0.g()) {
                Objects.requireNonNull(c.i.g.b.f2069b);
            } else {
                e.d.b.d.a.x();
                h1 h1Var = new h1(null);
                h1Var.a = 0;
                h1Var.f8303d = 2201;
                e.d.b.d.a.f6311c.b(h1Var);
            }
            Objects.requireNonNull(c.i.g.b.f2069b);
        } catch (Exception unused) {
        }
    }

    @Override // e.h.g.v1
    public void b(Message message) {
        try {
            m0 m0Var = this.f8198i;
            if (m0Var == null || message == null) {
                int i2 = t1.a;
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                int i4 = t1.a;
                h(m0Var, true);
                return;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    int i5 = t1.a;
                    this.f8200k = true;
                    return;
                } else if (i3 != 4) {
                    return;
                }
            }
            Object obj = message.obj;
            if (obj instanceof u.b) {
                int i6 = t1.a;
                u.b bVar = (u.b) obj;
                if (!bVar.f8207d || bVar.f8206c == m0.l.Playing) {
                    a aVar = a.FOREGROUND;
                    if (bVar.f8210g != w0.NOT_SHUTTING_DOWN) {
                        aVar = a.LONG_RUNNING;
                    }
                    s(m0Var, bVar, aVar, null);
                }
                k(m0Var, bVar);
            }
        } catch (NoSuchFieldError unused) {
        }
    }

    public final void h(m0 m0Var, boolean z) {
        int i2 = t1.a;
        this.f8195f = null;
        this.f8199j = false;
        s1.n("_removeNotif called");
        m0.l lVar = m0.l.Playing;
        m0Var.j(Integer.valueOf(m0.x));
        e.d.b.d.a.x();
        h1 h1Var = new h1(null);
        h1Var.a = 3;
        h1Var.f8305f = m0Var;
        h1Var.f8304e = true;
        h1Var.f8306g = "MS";
        e.d.b.d.a.f6311c.b(h1Var);
        if (z) {
            i();
        }
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void j(w0 w0Var, u.b bVar) {
        boolean removeNotification = w0.removeNotification(w0Var);
        Objects.requireNonNull(c.i.g.b.f2069b);
        if (!e.h.g.v0.e() || removeNotification) {
            int i2 = t1.a;
            n(true);
        } else {
            Objects.requireNonNull(c.i.g.b.f2069b);
            int i3 = t1.a;
            n(false);
            m0 m0Var = this.f8198i;
            if (m0Var != null) {
                s(m0Var, bVar, a.LONG_RUNNING, null);
            }
        }
        this.f8197h = null;
        this.f8196g = true;
        Objects.requireNonNull((j6) c.i.g.b.f());
        z6.f();
        this.f8198i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01bd A[Catch: Exception -> 0x01d4, TRY_LEAVE, TryCatch #2 {Exception -> 0x01d4, blocks: (B:42:0x010c, B:44:0x0112, B:46:0x011a, B:47:0x011d, B:49:0x012b, B:50:0x0133, B:52:0x0139, B:53:0x0162, B:61:0x01b1, B:63:0x01b5, B:65:0x01bd, B:69:0x01d0, B:66:0x01c2), top: B:79:0x010c, inners: #1 }] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(e.h.d.m0 r28, e.h.d.u.b r29) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.d.s0.k(e.h.d.m0, e.h.d.u$b):void");
    }

    public void l() {
        this.f8196g = true;
        int i2 = t1.a;
        m();
        e(c(1, null), ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    }

    public final void m() {
        a(1);
        a(4);
        a(2);
    }

    public void n(boolean z) {
        int i2 = t1.a;
        this.f8193d = true;
        m0 m0Var = this.f8198i;
        if (m0Var != null) {
            m();
            h(m0Var, z);
        }
    }

    public void o(u.b bVar) {
        this.f8196g = false;
        int i2 = t1.a;
        m();
        Message c2 = c(2, bVar);
        if (bVar.f8206c != m0.l.Playing) {
            Objects.requireNonNull(c.i.g.b.f2069b);
        }
        e(c2, 0);
    }

    public void p(u.b bVar) {
        this.f8196g = false;
        int i2 = t1.a;
        m();
        Message c2 = c(4, bVar);
        if (bVar.f8206c != m0.l.Playing) {
            Objects.requireNonNull(c.i.g.b.f2069b);
        }
        e(c2, 0);
    }

    public void q(int i2, final g1 g1Var) {
        m0 m0Var = this.f8198i;
        t1.l("No notification yet..");
        if (m0Var == null || this.f8192c || !e.h.g.v0.j()) {
            if (this.f8192c) {
                t1.l("Already started");
                if (g1Var != null) {
                    g1Var.a();
                    return;
                }
                return;
            }
            return;
        }
        Objects.requireNonNull((j6) c.i.g.b.f());
        ((NotificationManager) e.h.g.x0.f8405d.getSystemService("notification")).createNotificationChannel(new NotificationChannel("NowPlaying", z6.E(R.string.musicbrowserlabel), 2));
        String a2 = ((MusicApp.a) c.i.g.b.f2071d).a();
        String e2 = q1.e(R.string.loading);
        Notification.Builder builder = new Notification.Builder(m0Var, "NowPlaying");
        Objects.requireNonNull(c.i.g.b.f2071d);
        Notification.Builder contentText = builder.setSmallIcon(R.drawable.stat_notify_musicplayer).setContentTitle(a2).setContentText(e2);
        contentText.setOngoing(false);
        PackageManager packageManager = m0Var.getPackageManager();
        c.i.g.b.c();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("music.musicplayer");
        if (launchIntentForPackage != null) {
            Intent intent = new Intent(launchIntentForPackage.getAction());
            intent.setComponent(launchIntentForPackage.getComponent());
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            contentText.setContentIntent(PendingIntent.getActivity(this.f8198i, 0, intent, 67108864));
        }
        t1.l("Starting loading notification");
        e.d.b.d.a.g0(this.f8198i, "MS", 1911, contentText.build(), i2, new g1() { // from class: e.h.d.r
            @Override // e.h.g.g1
            public final void a() {
                s0 s0Var = s0.this;
                g1 g1Var2 = g1Var;
                s0Var.f8199j = true;
                s0Var.f8192c = true;
                if (g1Var2 != null) {
                    g1Var2.a();
                }
            }
        });
    }

    public void r(u.b bVar) {
        m0 m0Var = this.f8198i;
        if (m0Var != null) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            if (e.h.g.v0.e()) {
                Objects.requireNonNull(c.i.g.b.f2069b);
                int i2 = t1.a;
                h(m0Var, false);
                m0 m0Var2 = this.f8198i;
                if (m0Var2 != null) {
                    s(m0Var2, bVar, a.LONG_RUNNING, null);
                }
            } else {
                int i3 = t1.a;
                h(m0Var, true);
            }
            this.f8196g = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
        if (r13 != e.h.d.m0.l.PausedByTransientLossOfFocus) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049 A[Catch: all -> 0x018f, TryCatch #2 {, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0015, B:13:0x001b, B:29:0x0049, B:16:0x0020, B:18:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:31:0x005c, B:34:0x0061, B:36:0x0073, B:38:0x007b, B:59:0x00c0, B:61:0x00dc, B:64:0x00fa, B:65:0x00fd, B:66:0x0108, B:68:0x010f, B:70:0x013d, B:72:0x0152, B:73:0x0160, B:75:0x016c, B:79:0x0175, B:80:0x0182, B:81:0x0186, B:46:0x00a7, B:48:0x00ab, B:51:0x00b0, B:54:0x00b7, B:42:0x0090), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[Catch: all -> 0x018f, TryCatch #2 {, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0015, B:13:0x001b, B:29:0x0049, B:16:0x0020, B:18:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:31:0x005c, B:34:0x0061, B:36:0x0073, B:38:0x007b, B:59:0x00c0, B:61:0x00dc, B:64:0x00fa, B:65:0x00fd, B:66:0x0108, B:68:0x010f, B:70:0x013d, B:72:0x0152, B:73:0x0160, B:75:0x016c, B:79:0x0175, B:80:0x0182, B:81:0x0186, B:46:0x00a7, B:48:0x00ab, B:51:0x00b0, B:54:0x00b7, B:42:0x0090), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[Catch: all -> 0x018f, TryCatch #2 {, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0015, B:13:0x001b, B:29:0x0049, B:16:0x0020, B:18:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:31:0x005c, B:34:0x0061, B:36:0x0073, B:38:0x007b, B:59:0x00c0, B:61:0x00dc, B:64:0x00fa, B:65:0x00fd, B:66:0x0108, B:68:0x010f, B:70:0x013d, B:72:0x0152, B:73:0x0160, B:75:0x016c, B:79:0x0175, B:80:0x0182, B:81:0x0186, B:46:0x00a7, B:48:0x00ab, B:51:0x00b0, B:54:0x00b7, B:42:0x0090), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x000a, B:8:0x000e, B:11:0x0015, B:13:0x001b, B:29:0x0049, B:16:0x0020, B:18:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:31:0x005c, B:34:0x0061, B:36:0x0073, B:38:0x007b, B:59:0x00c0, B:61:0x00dc, B:64:0x00fa, B:65:0x00fd, B:66:0x0108, B:68:0x010f, B:70:0x013d, B:72:0x0152, B:73:0x0160, B:75:0x016c, B:79:0x0175, B:80:0x0182, B:81:0x0186, B:46:0x00a7, B:48:0x00ab, B:51:0x00b0, B:54:0x00b7, B:42:0x0090), top: B:91:0x0002 }] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(e.h.d.m0 r10, e.h.d.u.b r11, e.h.d.s0.a r12, e.h.g.g1 r13) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.d.s0.s(e.h.d.m0, e.h.d.u$b, e.h.d.s0$a, e.h.g.g1):void");
    }
}
