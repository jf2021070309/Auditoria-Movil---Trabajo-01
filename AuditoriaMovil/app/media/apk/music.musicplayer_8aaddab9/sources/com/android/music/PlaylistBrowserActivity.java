package com.android.music;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c.b.h.i.i;
import c.b.i.p0;
import c.i.g.h;
import ch.qos.logback.core.joran.action.Action;
import com.android.music.PlaylistBrowserActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.jrt.recyclerview.views.FastScrollRecyclerView;
import e.a.c.e4;
import e.a.c.g7;
import e.a.c.h7.p;
import e.a.c.l6;
import e.a.c.s4;
import e.a.c.z6;
import e.g.a.c.f;
import e.g.a.e.b;
import e.h.b.n;
import e.h.b.o;
import e.h.e.g;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.q0;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.t1;
import e.j.d.c0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class PlaylistBrowserActivity extends l6 implements b.a<p> {
    public static e.a.c.w6.c o;
    public boolean p;
    public FrameLayout q;
    public ShimmerFrameLayout r;
    public z6.e v;
    public final f.a.e.a s = new f.a.e.a();
    public boolean t = false;
    public final BroadcastReceiver u = new a();
    public final BroadcastReceiver w = new b();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z6.W(PlaylistBrowserActivity.this);
            PlaylistBrowserActivity.this.F(null);
        }
    }

    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j0.h(new j0.c() { // from class: e.a.c.k4
                @Override // e.h.g.j0.c
                public final void a() {
                    PlaylistBrowserActivity.b bVar = PlaylistBrowserActivity.b.this;
                    Objects.requireNonNull(bVar);
                    int i2 = e.h.g.t1.a;
                    PlaylistBrowserActivity.this.Q();
                    z6.e0(PlaylistBrowserActivity.this);
                    PlaylistBrowserActivity.this.F(null);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class c implements ServiceConnection {
        public final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Intent f3007b;

        public c(String str, Intent intent) {
            this.a = str;
            this.f3007b = intent;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if ("android.intent.action.VIEW".equals(this.a)) {
                PlaylistBrowserActivity playlistBrowserActivity = PlaylistBrowserActivity.this;
                if (!playlistBrowserActivity.t) {
                    playlistBrowserActivity.t = true;
                    Bundle extras = this.f3007b.getExtras();
                    if (extras == null) {
                        s1.m("Unexpected:getExtras() returns null.");
                        PlaylistBrowserActivity.this.finish();
                        return;
                    }
                    try {
                        long parseLong = Long.parseLong(extras.getString("playlist"));
                        if (parseLong == -5) {
                            if (PlaylistBrowserActivity.this.O()) {
                                PlaylistBrowserActivity.this.finish();
                            }
                        } else if (parseLong == -7) {
                            if (PlaylistBrowserActivity.this.N()) {
                                PlaylistBrowserActivity.this.finish();
                            }
                        } else if (parseLong == -6) {
                            long[] k2 = z6.k();
                            if (k2 != null) {
                                z6.N(PlaylistBrowserActivity.this, k2, 0, false);
                                PlaylistBrowserActivity.this.finish();
                            }
                        } else if (z6.O(PlaylistBrowserActivity.this, parseLong)) {
                            PlaylistBrowserActivity.this.finish();
                        }
                        return;
                    } catch (NumberFormatException e2) {
                        s1.l(e2, true);
                        return;
                    }
                }
            }
            int i2 = t1.a;
            PlaylistBrowserActivity.this.Q();
            z6.e0(PlaylistBrowserActivity.this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes.dex */
    public class d implements p0.a {
        public d() {
        }

        @Override // c.b.i.p0.a
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 8) {
                Uri uri = z6.a;
                j0.f(e4.a);
                return false;
            } else if (itemId == 14) {
                QueryBrowserActivity.E(PlaylistBrowserActivity.this);
                return true;
            } else if (itemId == 17) {
                SettingsActivity.y(PlaylistBrowserActivity.this);
                return false;
            } else if (itemId == 19) {
                h.N(PlaylistBrowserActivity.this.getSupportFragmentManager());
                return false;
            } else if (itemId != 21) {
                return false;
            } else {
                b0.o(PlaylistBrowserActivity.this);
                return false;
            }
        }
    }

    @Override // e.g.a.d.j
    public int A() {
        return getResources().getColor(R.color.accent);
    }

    @Override // e.g.a.d.j
    public void C(Object obj) {
        ArrayList arrayList = new ArrayList();
        e.a.c.w6.c cVar = new e.a.c.w6.c();
        cVar.a(z6.E(R.string.recentlyadded_title));
        cVar.a = -5L;
        arrayList.add(cVar);
        e.a.c.w6.c cVar2 = new e.a.c.w6.c();
        cVar2.a(z6.E(R.string.favorites));
        cVar2.a = -4L;
        arrayList.add(cVar2);
        Cursor R = z6.R(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_podcast=1", null, null, 1);
        e.a.c.w6.c cVar3 = null;
        if (R != null) {
            try {
                if (R.moveToFirst()) {
                    cVar3 = new e.a.c.w6.c();
                    cVar3.a(z6.E(R.string.podcasts_title));
                    cVar3.a = -7L;
                }
            } finally {
                R.close();
            }
        }
        if (cVar3 != null) {
            arrayList.add(cVar3);
        }
        Iterator<e.h.b.p> it = n.q(true).iterator();
        while (it.hasNext()) {
            e.h.b.p next = it.next();
            if (next.f8083f.trim().length() > 0) {
                e.a.c.w6.c cVar4 = new e.a.c.w6.c();
                cVar4.a(next.f8083f);
                cVar4.a = next.f8081d;
                arrayList.add(cVar4);
            }
        }
        ArrayList<f> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new p((e.a.c.w6.c) it2.next(), this.f8006e, this));
        }
        G(arrayList2, false);
    }

    @Override // e.a.c.l6
    public boolean K() {
        return true;
    }

    public void L(p pVar) {
        long j2 = pVar.f5092d.a;
        if (this.p) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setComponent(new ComponentName("music.musicplayer", PlaylistBrowserActivity.class.getName()));
            intent.putExtra("playlist", String.valueOf(j2));
            intent.putExtra("widget", true);
            intent.putExtra("show_relaunch", false);
            intent.addFlags(268468224);
            Intent intent2 = new Intent();
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
            intent2.putExtra("android.intent.extra.shortcut.NAME", pVar.f5092d.f5209b);
            intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, R.drawable.ic_launcher_shortcut_music_playlist));
            setResult(-1, intent2);
            finish();
        } else if (j2 == -5) {
            TrackBrowserActivity.Q(this);
        } else if (j2 == -7) {
            Intent intent3 = new Intent("android.intent.action.PICK");
            intent3.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
            intent3.putExtra("playlist", "podcasts");
            startActivity(intent3);
        } else {
            Intent intent4 = new Intent("android.intent.action.EDIT");
            intent4.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
            intent4.putExtra("playlist", Long.valueOf(j2).toString());
            intent4.putExtra("aTitle", pVar.f5092d.f5209b);
            startActivity(intent4);
        }
    }

    public boolean M(View view, p pVar) {
        o = pVar.f5092d;
        registerForContextMenu(view);
        openContextMenu(view);
        unregisterForContextMenu(view);
        return true;
    }

    public final boolean N() {
        int count;
        long[] jArr;
        Cursor Q = z6.Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_podcast=1", null, "title_key");
        if (Q == null) {
            return false;
        }
        try {
            count = Q.getCount();
            jArr = new long[count];
            for (int i2 = 0; i2 < count; i2++) {
                Q.moveToNext();
                jArr[i2] = Q.getLong(0);
            }
        } catch (SQLiteException unused) {
        } catch (Throwable th) {
            Q.close();
            throw th;
        }
        if (count <= 0) {
            Q.close();
            return false;
        }
        z6.N(this, jArr, 0, false);
        Q.close();
        return true;
    }

    public final boolean O() {
        int count;
        long[] jArr;
        StringBuilder y = e.a.d.a.a.y("date_added>");
        y.append((System.currentTimeMillis() / 1000) - (g7.c(this, "numweeks", 2) * 604800));
        String sb = y.toString();
        Cursor Q = z6.Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, sb, null, "title_key");
        if (Q == null) {
            return false;
        }
        try {
            count = Q.getCount();
            jArr = new long[count];
            for (int i2 = 0; i2 < count; i2++) {
                Q.moveToNext();
                jArr[i2] = Q.getLong(0);
            }
        } catch (SQLiteException unused) {
        } catch (Throwable th) {
            Q.close();
            throw th;
        }
        if (count > 0) {
            z6.N(this, jArr, 0, false);
            Q.close();
            return true;
        }
        z6.Z(z6.E(R.string.emptyplaylist), 0);
        Q.close();
        return false;
    }

    public final void P() {
        p0 p0Var = new p0(this, findViewById(R.id.menu_button));
        if (!this.p) {
            p0Var.a.a(0, 17, 0, z6.E(R.string.settings));
            p0Var.a.a(0, 8, 0, z6.E(R.string.party_shuffle));
            ((i) p0Var.a.a(0, 14, 0, z6.E(R.string.search_title))).setIcon(R.drawable.ic_menu_search);
            p0Var.a.a(0, 19, 0, z6.E(R.string.rate_us));
            p0Var.a.a(0, 21, 0, z6.E(R.string.share_app));
        }
        z6.T(p0Var.a);
        p0Var.f1216d = new d();
        p0Var.a();
    }

    public void Q() {
        j0.h(new j0.c() { // from class: e.a.c.l4
            @Override // e.h.g.j0.c
            public final void a() {
                PlaylistBrowserActivity playlistBrowserActivity = PlaylistBrowserActivity.this;
                if (playlistBrowserActivity.isFinishing()) {
                    return;
                }
                z6.b0(playlistBrowserActivity, 0, (ImageView) playlistBrowserActivity.findViewById(R.id.blurred_bg_player_view), true, z6.f5234n);
            }
        });
    }

    @Override // e.g.a.e.b.a
    public void d(e.g.a.e.b<p> bVar) {
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ void g(View view, int i2, int i3, p pVar, e.g.a.e.b<p> bVar) {
        L(pVar);
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ boolean k(View view, int i2, int i3, p pVar, e.g.a.e.b<p> bVar) {
        return M(view, pVar);
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        boolean z;
        if (o.j(this, i2, i3, intent)) {
            return;
        }
        s4 s4Var = new q0.a() { // from class: e.a.c.s4
            @Override // e.h.g.q0.a
            public final void a(boolean z2) {
                e.a.c.w6.c cVar = PlaylistBrowserActivity.o;
            }
        };
        Object obj = j1.a;
        if (i2 == 42) {
            q0.s(this, i3, intent, s4Var);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        if (i2 == 11 && i3 == 0) {
            finish();
        }
        F(null);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        final e.a.c.w6.c cVar = o;
        if (cVar == null) {
            return super.onContextItemSelected(menuItem);
        }
        final long j2 = cVar.a;
        int itemId = menuItem.getItemId();
        if (itemId == 5) {
            j0.f(new j0.b() { // from class: e.a.c.r4
                @Override // e.h.g.j0.b
                public final void a() {
                    PlaylistBrowserActivity playlistBrowserActivity = PlaylistBrowserActivity.this;
                    long j3 = j2;
                    Objects.requireNonNull(playlistBrowserActivity);
                    if (j3 == -5) {
                        playlistBrowserActivity.O();
                    } else if (j3 == -7) {
                        playlistBrowserActivity.N();
                    } else {
                        z6.O(playlistBrowserActivity, j3);
                    }
                }
            });
        } else if (itemId == 22) {
            j0.f(new j0.b() { // from class: e.a.c.o4
                @Override // e.h.g.j0.b
                public final void a() {
                    PlaylistBrowserActivity playlistBrowserActivity = PlaylistBrowserActivity.this;
                    long j3 = j2;
                    e.a.c.w6.c cVar2 = cVar;
                    Objects.requireNonNull(playlistBrowserActivity);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.h.b.q> s = e.h.b.n.s(j3);
                    int size = s.size();
                    long[] jArr = new long[size];
                    Iterator<e.h.b.q> it = s.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        jArr[i2] = it.next().f8084b;
                        i2++;
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        StringBuilder y = e.a.d.a.a.y("_id IN (");
                        y.append(jArr[i3]);
                        y.append(")");
                        Cursor query = playlistBrowserActivity.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "album_id"}, y.toString(), null, null);
                        if (query == null) {
                            break;
                        }
                        try {
                            if (query.moveToFirst()) {
                                long j4 = query.getLong(0);
                                arrayList2.add(Uri.parse(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI + "/" + j4));
                                arrayList.add(query.getString(1).replaceFirst("file://", "").replaceAll("%20", " "));
                            }
                            query.close();
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    String str = cVar2.f5209b;
                    e.h.g.j1.a(playlistBrowserActivity, arrayList2, arrayList, null);
                }
            });
            return true;
        } else {
            switch (itemId) {
                case 27:
                    j0.g(new j0.b() { // from class: e.a.c.q4
                        @Override // e.h.g.j0.b
                        public final void a() {
                            final PlaylistBrowserActivity playlistBrowserActivity = PlaylistBrowserActivity.this;
                            final long j3 = j2;
                            Objects.requireNonNull(playlistBrowserActivity);
                            final o.a aVar = new o.a() { // from class: e.a.c.p4
                                @Override // e.h.b.o.a
                                public final void a(boolean z) {
                                    PlaylistBrowserActivity playlistBrowserActivity2 = PlaylistBrowserActivity.this;
                                    Objects.requireNonNull(playlistBrowserActivity2);
                                    if (z) {
                                        z6.Z(z6.E(R.string.playlist_deleted_message), 0);
                                    }
                                    playlistBrowserActivity2.F(null);
                                }
                            };
                            ReentrantLock reentrantLock = e.h.b.n.a;
                            Object obj = e.h.g.j1.a;
                            if (!e.h.b.n.f8068f) {
                                e.h.b.o.m(playlistBrowserActivity, j3, false, aVar);
                                e.h.b.n.x();
                                return;
                            }
                            ReentrantLock reentrantLock2 = e.h.b.n.a;
                            reentrantLock2.lock();
                            try {
                                if (e.h.b.n.f8064b != null) {
                                    final e.h.b.p o2 = e.h.b.n.o(j3);
                                    if (o2 != null) {
                                        e.h.b.o.m(playlistBrowserActivity, o2.f8080c, false, new o.a() { // from class: e.h.b.a
                                            @Override // e.h.b.o.a
                                            public final void a(boolean z) {
                                                long j4 = j3;
                                                p pVar = o2;
                                                o.a aVar2 = aVar;
                                                if (z) {
                                                    n.f8064b.delete("playlist", e.a.d.a.a.h("_dum = ", j4), null);
                                                } else {
                                                    pVar.f8082e = 1;
                                                    n.E("playlist", pVar.a(), e.a.d.a.a.h("_dum = ", j4), null);
                                                }
                                                n.f8064b.delete("playlistM", e.a.d.a.a.h("_pID = ", j4), null);
                                                n.x();
                                                if (aVar2 != null) {
                                                    aVar2.a(z);
                                                }
                                            }
                                        });
                                    } else {
                                        SQLiteDatabase sQLiteDatabase = e.h.b.n.f8064b;
                                        sQLiteDatabase.delete("playlistM", "_pID = " + j3, null);
                                        e.h.b.n.x();
                                        aVar.a(true);
                                    }
                                }
                                reentrantLock2.unlock();
                            } catch (Throwable th) {
                                try {
                                    reentrantLock2.unlock();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    });
                    F(null);
                    break;
                case 28:
                    if (j2 != -5) {
                        Log.e("PlaylistBrowserActivity", "should not be here");
                        break;
                    } else {
                        Intent intent = new Intent();
                        intent.setClass(this, WeekSelector.class);
                        startActivityForResult(intent, 30);
                        return true;
                    }
                case 29:
                    Intent intent2 = new Intent();
                    intent2.setClass(this, RenamePlaylist.class);
                    intent2.putExtra("rename", j2);
                    startActivityForResult(intent2, 29);
                    break;
            }
        }
        return true;
    }

    @Override // e.a.c.l6, e.g.a.d.j, e.g.a.d.i, c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
            h.y();
            this.p = true;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        e.a.c.w6.c cVar;
        if (this.p || (cVar = o) == null) {
            return;
        }
        long j2 = cVar.a;
        contextMenu.add(0, 5, 0, z6.E(R.string.play_selection));
        if (-5 != j2 && -7 != j2 && -6 != j2 && -4 != j2) {
            contextMenu.add(0, 27, 0, z6.E(R.string.delete_item));
        }
        if (j2 == -5) {
            contextMenu.add(0, 28, 0, z6.E(R.string.edit_playlist_menu));
        }
        if (j2 >= 0) {
            contextMenu.add(0, 29, 0, z6.E(R.string.rename_playlist_menu));
        }
        contextMenu.add(0, 22, 0, z6.E(R.string.share));
        contextMenu.setHeaderTitle(cVar.f5209b);
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        j1.q(this, this.u);
        this.s.dispose();
        super.onDestroy();
    }

    @Override // e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onPause() {
        super.onPause();
        j1.q(this, this.w);
    }

    @Override // e.a.c.l6, e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onResume() {
        super.onResume();
        if (h.x()) {
            e.d.b.d.a.I(this.q, this.r);
        }
        j0.f(new j0.b() { // from class: e.a.c.m4
            @Override // e.h.g.j0.b
            public final void a() {
                e.a.c.w6.c cVar = PlaylistBrowserActivity.o;
                e.h.b.n.D(true, true);
            }
        });
        r0 r0Var = g.a;
        j0.f(e.h.e.b.a);
        z6.M(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.jrtstudio.music.metaChanged");
        intentFilter.addAction("com.jrtstudio.music.queueChanged");
        registerReceiver(this.w, intentFilter);
        this.w.onReceive(null, null);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Q();
        z6.e0(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // e.a.c.l6, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStart() {
        super.onStart();
        Intent intent = getIntent();
        this.v = z6.e(this, new c(intent.getAction(), intent));
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        super.onStop();
        z6.a0(this.v);
        this.v = null;
    }

    @Override // c.b.c.l, android.app.Activity
    public void openOptionsMenu() {
        Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenLayout;
        if ((i2 & 15) <= 3) {
            super.openOptionsMenu();
            P();
            return;
        }
        configuration.screenLayout = 3;
        super.openOptionsMenu();
        P();
        configuration.screenLayout = i2;
    }

    @Override // e.g.a.d.i
    public void y(Bundle bundle) {
        j0.f(new j0.b() { // from class: e.a.c.n4
            @Override // e.h.g.j0.b
            public final void a() {
                e.a.c.w6.c cVar = PlaylistBrowserActivity.o;
                e.h.b.n.D(true, false);
            }
        });
        requestWindowFeature(5);
        requestWindowFeature(1);
        setVolumeControlStream(3);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("OUR_PLAYLISTS_UPDATED");
        intentFilter.addDataScheme(Action.FILE_ATTRIBUTE);
        registerReceiver(this.u, intentFilter);
        setContentView(R.layout.activity_playlist);
        this.q = (FrameLayout) findViewById(R.id.banner_layout);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer_layout);
        this.r = shimmerFrameLayout;
        e.d.b.d.a.f0(this, this.q, shimmerFrameLayout, findViewById(R.id.view), this.s);
        z6.c0(this, 0, (ImageView) findViewById(R.id.blurred_bg_player_view));
        z6.d0(this, R.id.playlisttab);
        J((FastScrollRecyclerView) findViewById(R.id.recyclerView));
        z6.g(this);
        c.i.g.b.k("PBA");
    }

    @Override // e.g.a.d.j
    public int z() {
        return 1;
    }
}
