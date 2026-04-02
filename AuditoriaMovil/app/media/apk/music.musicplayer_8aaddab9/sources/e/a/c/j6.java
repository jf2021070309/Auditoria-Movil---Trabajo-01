package e.a.c;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.android.music.MediaPlaybackActivity;
import com.android.music.MediaPlaybackService;
import com.google.ads.mediation.facebook.FacebookAdapter;
import e.h.d.m0;
import e.h.d.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class j6 implements e.h.d.a0 {
    public static int a = 13802;

    /* renamed from: b  reason: collision with root package name */
    public BitmapDrawable f5102b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f5103c;

    public static long[] g(Cursor cursor) {
        int columnIndexOrThrow;
        ArrayList arrayList = new ArrayList();
        int count = cursor.getCount();
        cursor.moveToFirst();
        try {
            columnIndexOrThrow = cursor.getColumnIndexOrThrow("audio_id");
        } catch (IllegalArgumentException unused) {
            columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            long j2 = cursor.getLong(columnIndexOrThrow);
            if (j2 >= 0) {
                arrayList.add(Long.valueOf(j2));
            }
            cursor.moveToNext();
        }
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public final void a(c.i.c.m mVar, boolean z) {
        int i2;
        String str;
        ComponentName componentName = new ComponentName(e.h.g.x0.f8405d, MediaPlaybackService.class);
        e.h.g.x0 x0Var = e.h.g.x0.f8405d;
        int i3 = a;
        a = i3 + 1;
        PendingIntent service = PendingIntent.getService(x0Var, i3, new Intent("com.jrtstudio.audio.musicservicecommand.togglepause").setComponent(componentName), 201326592);
        if (z) {
            i2 = R.drawable.ic_appwidget_music_pause;
            str = "Pause";
        } else {
            i2 = R.drawable.ic_appwidget_music_play;
            str = "Play";
        }
        mVar.b(new c.i.c.j(i2, str, service));
    }

    public void b(u.b bVar, e.h.d.v vVar) {
        String str = "com.jrtstudio.music.queueChanged";
        if (vVar == e.h.d.v.QUEUE_CHANGED) {
            Intent intent = new Intent("com.jrtstudio.music.queueChanged");
            c.i.g.b.c();
            intent.setPackage("music.musicplayer");
            e.h.g.x0.f8405d.sendBroadcast(intent);
            return;
        }
        int ordinal = vVar.ordinal();
        if (ordinal == 0) {
            str = "com.jrtstudio.music.metaChanged";
        } else if (ordinal != 4) {
            str = ordinal != 6 ? null : "com.jrtstudio.music.playstateChanged";
        }
        if (str == null) {
            return;
        }
        e.h.d.t tVar = bVar.f8205b;
        if (tVar != null && (tVar instanceof o6)) {
            Intent intent2 = new Intent(str);
            e.h.d.t tVar2 = bVar.f8205b;
            o6 o6Var = (o6) tVar2;
            String title = tVar2.getTitle();
            String e2 = bVar.f8205b.e();
            if (title == null || e2 == null) {
                return;
            }
            intent2.putExtra(FacebookAdapter.KEY_ID, Long.valueOf(o6Var.f()));
            intent2.putExtra("artist", e2);
            intent2.putExtra("album", o6Var.d());
            intent2.putExtra("track", title);
            intent2.putExtra("length", o6Var.A());
            intent2.putExtra("albumID", o6Var.b());
            intent2.putExtra("position", bVar.a);
            intent2.putExtra("path", o6Var.getPath());
            intent2.putExtra("playing", bVar.f8206c == m0.l.Playing);
            e.h.g.x0.f8405d.sendStickyBroadcast(intent2);
            t6.t(intent2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e.h.d.z c() {
        /*
            r13 = this;
            java.lang.String r5 = "title_key"
            java.lang.String r6 = "_id"
            java.lang.String r7 = "title"
            java.lang.String r8 = "_data"
            java.lang.String r9 = "album"
            java.lang.String r10 = "artist"
            java.lang.String r11 = "artist_id"
            java.lang.String r12 = "duration"
            java.lang.String[] r2 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
            e.h.g.x0 r0 = e.h.g.x0.f8405d
            android.net.Uri r1 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            java.lang.String r3 = "title != '' AND is_music=1"
            boolean r4 = e.h.g.v0.m(r0)
            r6 = 0
            if (r4 == 0) goto L2e
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L28
            goto L2e
        L28:
            r4 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r0 = r6
        L2f:
            if (r0 == 0) goto L44
            long[] r1 = g(r0)     // Catch: java.lang.Throwable -> L3f
            e.a.c.k6 r2 = new e.a.c.k6     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L3f
            r0.close()
            return r2
        L3f:
            r1 = move-exception
            r0.close()
            throw r1
        L44:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.c.j6.c():e.h.d.z");
    }

    public final PendingIntent d() {
        Intent intent = new Intent(e.h.g.x0.f8405d, MediaPlaybackActivity.class);
        intent.setFlags(536870912);
        intent.putExtra("notification", true);
        intent.putExtra("show_relaunch", false);
        e.h.g.x0 x0Var = e.h.g.x0.f8405d;
        int i2 = a;
        a = i2 + 1;
        return PendingIntent.getActivity(x0Var, i2, intent, 67108864);
    }

    public e.h.d.z e(int i2, ArrayList<e.h.d.t> arrayList) {
        return new k6(arrayList, i2);
    }

    public Notification f(e.h.d.m0 m0Var, u.b bVar) {
        e.h.d.t tVar = bVar.f8205b;
        Drawable drawable = null;
        if (tVar == null) {
            return null;
        }
        String title = tVar.getTitle();
        CharSequence e2 = bVar.f8205b.e();
        if (title == null || title.length() == 0) {
            return null;
        }
        c.i.c.m mVar = new c.i.c.m(m0Var, "NowPlaying");
        ComponentName componentName = new ComponentName(e.h.g.x0.f8405d, MediaPlaybackService.class);
        int i2 = a;
        a = i2 + 1;
        mVar.a(R.drawable.ic_appwidget_music_previous, "Previous", PendingIntent.getService(m0Var, i2, new Intent("com.jrtstudio.audio.musicservicecommand.previous").setComponent(componentName), 67108864));
        boolean z = bVar.f8206c == m0.l.Playing;
        a(mVar, z);
        e.h.g.x0 x0Var = e.h.g.x0.f8405d;
        int i3 = a;
        a = i3 + 1;
        mVar.a(R.drawable.ic_appwidget_music_next, "Next", PendingIntent.getService(x0Var, i3, new Intent("com.jrtstudio.audio.musicservicecommand.next").setComponent(componentName), 67108864));
        MediaSessionCompat.Token n2 = m0Var.n();
        if (e.h.g.j1.f8319e == null && e.h.g.v0.g() && !e.h.g.v0.h() && Build.MANUFACTURER.toLowerCase(Locale.US).contains("huawei")) {
            e.h.g.j1.f8319e = Boolean.FALSE;
        }
        if (e.h.g.j1.f8319e == null) {
            e.h.g.j1.f8319e = Boolean.TRUE;
        }
        if (e.h.g.j1.f8319e.booleanValue()) {
            c.r.d.c cVar = new c.r.d.c();
            cVar.l(0, 1, 2);
            cVar.k(n2);
            mVar.p(cVar);
        }
        try {
            o6 o6Var = (o6) bVar.f8205b;
            BitmapDrawable bitmapDrawable = this.f5102b;
            if (bitmapDrawable != null) {
                drawable = z6.s(o6Var.f5145b, o6Var.b(), bitmapDrawable);
            }
        } catch (Throwable unused) {
        }
        Bitmap bitmap = this.f5103c;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        if (bitmap != null) {
            mVar.k(bitmap);
        }
        mVar.n(false);
        mVar.f(-16777216);
        Objects.requireNonNull(c.i.g.b.f());
        mVar.o(R.drawable.stat_notify_musicplayer);
        mVar.r(1);
        mVar.q(false);
        mVar.g(d());
        mVar.i(title);
        mVar.h(e2);
        if (z) {
            mVar.m(2);
        } else {
            mVar.m(0);
            mVar.l(false);
        }
        return mVar.c();
    }
}
