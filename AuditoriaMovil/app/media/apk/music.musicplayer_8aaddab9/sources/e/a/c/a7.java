package e.a.c;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.android.music.NotifReceiver;
import java.util.concurrent.TimeUnit;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class a7 {
    public static final e.h.g.r0 a;

    static {
        e.h.g.r0 r0Var = new e.h.g.r0();
        r0Var.h();
        a = r0Var;
    }

    public static void a(int i2) {
        NotificationManager notificationManager = (NotificationManager) e.h.g.x0.f8405d.getSystemService("notification");
        if (e.h.g.v0.j()) {
            notificationManager.createNotificationChannel(new NotificationChannel("NewMusic", z6.E(R.string.new_music_title), 2));
        }
        String E = z6.E(R.string.new_music);
        e.h.g.q1.c(R.plurals.nnnnewsongs, i2);
        StringBuilder sb = new StringBuilder();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        StringBuilder A = e.a.d.a.a.A("title != ''", " AND date_added>");
        A.append((System.currentTimeMillis() / 1000) - (g7.c(e.h.g.x0.f8405d, "numweeks", 2) * 604800));
        try {
            Cursor Q = z6.Q(uri, new String[]{"title"}, A.toString(), null, "date_added DESC");
            if (Q != null) {
                if (Q.moveToFirst()) {
                    do {
                        String string = Q.getString(0);
                        if (string != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(string);
                        }
                        if (sb.length() > 50) {
                            break;
                        }
                    } while (Q.moveToNext());
                }
                Q.close();
            }
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
        String sb2 = sb.toString();
        c.i.c.m mVar = new c.i.c.m(e.h.g.x0.f8405d, "NewMusic");
        mVar.i(E);
        mVar.h(sb2);
        mVar.j(2, false);
        mVar.j(16, true);
        Intent intent = new Intent("com.jrtstudio.shutup");
        intent.setComponent(new ComponentName(e.h.g.x0.f8405d, NotifReceiver.class));
        mVar.a(R.drawable.ic_notif_off, z6.E(R.string.turn_off), PendingIntent.getBroadcast(e.h.g.x0.f8405d, 0, intent, 67108864));
        PackageManager packageManager = e.h.g.x0.f8405d.getPackageManager();
        c.i.g.b.c();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("music.musicplayer");
        if (launchIntentForPackage != null) {
            Intent intent2 = new Intent("newmusic");
            intent2.setComponent(launchIntentForPackage.getComponent());
            intent2.putExtra("newmusic", "newmusic");
            intent2.setFlags(872448000);
            mVar.f1978g = PendingIntent.getActivity(e.h.g.x0.f8405d, 1, intent2, 67108864);
            notificationManager.notify(R.id.banner_layout, mVar.c());
            e.h.e.g.g("NewMusicNotification");
        }
    }

    public static long b() {
        try {
            Cursor e2 = e.h.e.g.e(e.h.g.x0.f8405d, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"date_added", "title"}, "date_added > " + (g7.d() / 1000) + " AND is_music=1", null, "date_added DESC", 1);
            if (e2 == null) {
                int i2 = e.h.g.t1.a;
            } else if (e2.moveToFirst()) {
                long j2 = e2.getLong(0) * 1000;
                e2.close();
                return j2;
            } else {
                int i3 = e.h.g.t1.a;
                e2.close();
            }
        } catch (IllegalStateException e3) {
            e.h.g.s1.l(e3, true);
        }
        return g7.d();
    }

    public static int c(long j2) {
        try {
            Cursor f2 = e.h.e.g.f(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"date_added"}, "date_added > " + (j2 / 1000) + " AND is_music=1", null, null);
            if (f2 != null) {
                if (!f2.moveToFirst()) {
                    f2.close();
                    return 0;
                }
                int count = f2.getCount();
                f2.close();
                return count;
            }
            return 0;
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    public static void d() {
        int c2;
        try {
            int i2 = e.h.g.t1.a;
            if (!g7.a("be", true)) {
                f(false);
            } else if (g7.e("bf", e.h.g.x0.n()) + TimeUnit.HOURS.toMillis(6L) < System.currentTimeMillis()) {
                long d2 = g7.d();
                long b2 = b();
                if (d2 < b2 && (c2 = c(d2)) > 1) {
                    a(c2);
                }
                g7.k("bd", b2);
            }
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public static void e() {
        try {
            NotificationManager notificationManager = (NotificationManager) e.h.g.x0.f8405d.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(R.id.banner_layout);
            }
        } catch (NullPointerException e2) {
            e.h.g.s1.l(e2, true);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void f(boolean z) {
        if (z) {
            e.h.e.g.g("NewMusicNotifTurnedOff");
            g7.j("be", false);
        }
        e();
    }
}
