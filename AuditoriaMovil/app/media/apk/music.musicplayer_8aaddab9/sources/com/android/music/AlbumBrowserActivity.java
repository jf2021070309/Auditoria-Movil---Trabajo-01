package com.android.music;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.MediaStore;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c.b.i.p0;
import c.i.g.h;
import ch.qos.logback.core.joran.action.Action;
import com.android.music.AlbumBrowserActivity;
import com.android.music.DeleteItems;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.jrt.recyclerview.views.FastScrollRecyclerView;
import e.a.c.e4;
import e.a.c.e7;
import e.a.c.h7.n;
import e.a.c.j;
import e.a.c.l6;
import e.a.c.n6;
import e.a.c.w6.d;
import e.a.c.z6;
import e.c.a.i;
import e.g.a.c.f;
import e.g.a.e.b;
import e.h.b.o;
import e.h.e.g;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.k1;
import e.h.g.r0;
import e.h.g.t1;
import e.h.g.v0;
import e.j.d.c0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class AlbumBrowserActivity extends l6 implements b.a<n>, e7 {
    public static e.a.c.w6.a o;
    public FrameLayout p;
    public ShimmerFrameLayout q;
    public z6.e t;
    public final f.a.e.a r = new f.a.e.a();
    public final BroadcastReceiver s = new a();
    public final BroadcastReceiver u = new b();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z6.W(AlbumBrowserActivity.this);
            AlbumBrowserActivity.this.F(null);
            if (intent.getAction().equals("android.intent.action.MEDIA_UNMOUNTED")) {
                z6.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i2 = t1.a;
            AlbumBrowserActivity albumBrowserActivity = AlbumBrowserActivity.this;
            Objects.requireNonNull(albumBrowserActivity);
            j0.h(new j(albumBrowserActivity));
            z6.e0(AlbumBrowserActivity.this);
            AlbumBrowserActivity.this.F(null);
        }
    }

    /* loaded from: classes.dex */
    public class c implements p0.a {
        public c() {
        }

        @Override // c.b.i.p0.a
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 8) {
                Uri uri = z6.a;
                j0.f(e4.a);
                return false;
            } else if (itemId == 9) {
                Cursor Q = z6.Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_music=1", null, "title_key");
                if (Q != null) {
                    try {
                        z6.Y(AlbumBrowserActivity.this, Q);
                    } finally {
                        Q.close();
                    }
                }
                return true;
            } else if (itemId == 14) {
                QueryBrowserActivity.E(AlbumBrowserActivity.this);
                return true;
            } else if (itemId == 17) {
                SettingsActivity.y(AlbumBrowserActivity.this);
                return false;
            } else if (itemId == 19) {
                h.N(AlbumBrowserActivity.this.getSupportFragmentManager());
                return false;
            } else if (itemId != 21) {
                return false;
            } else {
                b0.o(AlbumBrowserActivity.this);
                return false;
            }
        }
    }

    static {
        new r0().h();
    }

    @Override // e.g.a.d.j
    public int A() {
        return getResources().getColor(R.color.accent);
    }

    @Override // e.g.a.d.j
    public void C(Object obj) {
        i d2 = e.c.a.b.d(this);
        ArrayList arrayList = new ArrayList();
        Cursor Q = z6.Q(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist", "album", "album_art"}, null, null, "album_key");
        if (Q != null) {
            try {
                if (Q.moveToFirst()) {
                    do {
                        e.a.c.w6.a aVar = new e.a.c.w6.a();
                        aVar.f5200c = Q.getLong(0);
                        aVar.a(Q.getString(1));
                        aVar.b(Q.getString(2));
                        if (v0.d()) {
                            aVar.a = z6.j(aVar.f5200c).toString();
                        } else {
                            aVar.a = Q.getString(3);
                        }
                        arrayList.add(aVar);
                    } while (Q.moveToNext());
                }
            } finally {
                Q.close();
            }
        }
        ArrayList<f> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new n(this, (e.a.c.w6.a) it.next(), false, d2, this.f8006e, this));
        }
        G(arrayList2, false);
    }

    @Override // e.a.c.l6
    public boolean K() {
        return true;
    }

    public void L(n nVar) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
        intent.putExtra("album", Long.valueOf(nVar.f5085f.f5200c));
        intent.putExtra("aTitle", nVar.f5085f.f5204g);
        startActivity(intent);
    }

    public boolean M(View view, n nVar) {
        o = nVar.f5085f;
        registerForContextMenu(view);
        openContextMenu(view);
        unregisterForContextMenu(view);
        return true;
    }

    public final void N() {
        p0 p0Var = new p0(this, findViewById(R.id.menu_button));
        p0Var.a.a(0, 17, 0, z6.E(R.string.settings));
        p0Var.a.a(0, 8, 0, z6.E(R.string.party_shuffle));
        ((c.b.h.i.i) p0Var.a.a(0, 9, 0, z6.E(R.string.shuffle_all))).setIcon(R.drawable.ic_menu_shuffle);
        ((c.b.h.i.i) p0Var.a.a(0, 14, 0, z6.E(R.string.search_title))).setIcon(R.drawable.ic_menu_search);
        p0Var.a.a(0, 19, 0, z6.E(R.string.rate_us));
        p0Var.a.a(0, 21, 0, z6.E(R.string.share_app));
        z6.T(p0Var.a);
        p0Var.f1216d = new c();
        p0Var.a();
    }

    @Override // e.g.a.e.b.a
    public void d(e.g.a.e.b<n> bVar) {
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ void g(View view, int i2, int i3, n nVar, e.g.a.e.b<n> bVar) {
        L(nVar);
    }

    @Override // e.a.c.e7
    public boolean h(e.a.c.w6.b bVar) {
        return false;
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ boolean k(View view, int i2, int i3, n nVar, e.g.a.e.b<n> bVar) {
        return M(view, nVar);
    }

    @Override // e.a.c.e7
    public int l() {
        Uri uri = z6.a;
        return -1;
    }

    @Override // e.a.c.e7
    public boolean n(d dVar) {
        return false;
    }

    @Override // e.a.c.e7
    public char[] o() {
        return new char[0];
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, final Intent intent) {
        if (o.j(this, i2, i3, intent)) {
            return;
        }
        if (i2 != 4) {
            if (i2 == 11 && i3 == 0) {
                finish();
            }
        } else if (i3 == -1) {
            j0.f(new j0.b() { // from class: e.a.c.m
                @Override // e.h.g.j0.b
                public final void a() {
                    Uri data;
                    AlbumBrowserActivity albumBrowserActivity = AlbumBrowserActivity.this;
                    Intent intent2 = intent;
                    Objects.requireNonNull(albumBrowserActivity);
                    try {
                        e.a.c.w6.a aVar = AlbumBrowserActivity.o;
                        if (aVar == null || (data = intent2.getData()) == null) {
                            return;
                        }
                        z6.c(albumBrowserActivity, z6.A(aVar), Long.parseLong(data.getLastPathSegment()));
                    } catch (NumberFormatException unused) {
                    }
                }
            });
        }
        F(null);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(final MenuItem menuItem) {
        String str;
        final e.a.c.w6.a aVar = o;
        if (aVar == null) {
            return super.onContextItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == 3) {
            j0.f(new j0.b() { // from class: e.a.c.p
                @Override // e.h.g.j0.b
                public final void a() {
                    AlbumBrowserActivity albumBrowserActivity = AlbumBrowserActivity.this;
                    e.a.c.w6.a aVar2 = aVar;
                    MenuItem menuItem2 = menuItem;
                    Objects.requireNonNull(albumBrowserActivity);
                    try {
                        z6.c(albumBrowserActivity, z6.A(aVar2), menuItem2.getIntent().getLongExtra("playlist", 0L));
                    } catch (NumberFormatException unused) {
                    }
                }
            });
            return true;
        } else if (itemId == 4) {
            Intent intent = new Intent();
            intent.setClass(this, CreatePlaylist.class);
            startActivityForResult(intent, 4);
            return true;
        } else if (itemId == 5) {
            j0.f(new j0.b() { // from class: e.a.c.i
                @Override // e.h.g.j0.b
                public final void a() {
                    AlbumBrowserActivity albumBrowserActivity = AlbumBrowserActivity.this;
                    e.a.c.w6.a aVar2 = aVar;
                    Objects.requireNonNull(albumBrowserActivity);
                    try {
                        z6.N(albumBrowserActivity, z6.A(aVar2), 0, false);
                    } catch (NumberFormatException unused) {
                    }
                }
            });
            return true;
        } else if (itemId == 10) {
            j0.f(new j0.b() { // from class: e.a.c.l
                @Override // e.h.g.j0.b
                public final void a() {
                    final AlbumBrowserActivity albumBrowserActivity = AlbumBrowserActivity.this;
                    final e.a.c.w6.a aVar2 = aVar;
                    Objects.requireNonNull(albumBrowserActivity);
                    final long[] A = z6.A(aVar2);
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.n
                        @Override // e.h.g.j0.c
                        public final void a() {
                            AlbumBrowserActivity albumBrowserActivity2 = AlbumBrowserActivity.this;
                            e.a.c.w6.a aVar3 = aVar2;
                            long[] jArr = A;
                            Objects.requireNonNull(albumBrowserActivity2);
                            try {
                                DeleteItems.a(albumBrowserActivity2, jArr, String.format(z6.E(R.string.delete_album_desc_nosdcard), aVar3.f5204g), 4048);
                            } catch (NumberFormatException unused) {
                            }
                        }
                    });
                }
            });
            return true;
        } else if (itemId == 12) {
            j0.f(new j0.b() { // from class: e.a.c.o
                @Override // e.h.g.j0.b
                public final void a() {
                    e.a.c.w6.a aVar2 = e.a.c.w6.a.this;
                    e.a.c.w6.a aVar3 = AlbumBrowserActivity.o;
                    try {
                        z6.b(z6.A(aVar2));
                    } catch (NumberFormatException unused) {
                    }
                }
            });
            return true;
        } else if (itemId == 22) {
            j0.f(new j0.b() { // from class: e.a.c.k
                @Override // e.h.g.j0.b
                public final void a() {
                    AlbumBrowserActivity albumBrowserActivity = AlbumBrowserActivity.this;
                    e.a.c.w6.a aVar2 = aVar;
                    Objects.requireNonNull(albumBrowserActivity);
                    long[] A = z6.A(aVar2);
                    ArrayList arrayList = new ArrayList(A.length);
                    ArrayList arrayList2 = new ArrayList(A.length);
                    for (long j2 : A) {
                        StringBuilder y = e.a.d.a.a.y("_id IN (");
                        y.append(j2);
                        y.append(")");
                        Cursor query = albumBrowserActivity.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "album_id"}, y.toString(), null, null);
                        if (query == null) {
                            break;
                        }
                        try {
                            if (query.moveToFirst()) {
                                arrayList2.add(Uri.parse(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI + "/" + query.getLong(0)));
                                arrayList.add(query.getString(1).replaceFirst("file://", "").replaceAll("%20", " "));
                            }
                            query.close();
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    String str2 = AlbumBrowserActivity.o.f5204g;
                    e.h.g.j1.a(albumBrowserActivity, arrayList2, arrayList, null);
                }
            });
            return true;
        } else if (itemId != 26) {
            return super.onContextItemSelected(menuItem);
        } else {
            e.a.c.w6.a aVar2 = o;
            if (aVar2 != null) {
                StringBuilder sb = new StringBuilder();
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.MEDIA_SEARCH");
                intent2.setFlags(268435456);
                if (aVar2.f5204g.equals(z6.E(R.string.unknown_album_name))) {
                    str = "";
                } else {
                    sb.append(aVar2.f5204g);
                    intent2.putExtra("android.intent.extra.album", aVar2.f5204g);
                    str = aVar2.f5204g;
                }
                if (!aVar2.f5203f.equals(z6.E(R.string.unknown_artist_name))) {
                    sb.append(" ");
                    sb.append(aVar2.f5203f);
                    intent2.putExtra("android.intent.extra.artist", aVar2.f5203f);
                    str = ((Object) str) + " " + aVar2.f5203f;
                }
                intent2.putExtra("android.intent.extra.focus", "vnd.android.cursor.item/album");
                String F = z6.F(R.string.mediasearch, str);
                intent2.putExtra("query", sb.toString());
                n6.a();
                h.y();
                startActivity(Intent.createChooser(intent2, F));
            }
            return true;
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        e.a.c.w6.a aVar = o;
        if (aVar != null) {
            contextMenu.add(0, 5, 0, z6.E(R.string.play_selection));
            z6.K(this, contextMenu.addSubMenu(0, 1, 0, z6.E(R.string.add_to_playlist)));
            contextMenu.add(0, 10, 0, z6.E(R.string.delete_item));
            contextMenu.setHeaderTitle(aVar.f5204g);
            contextMenu.add(0, 26, 0, z6.E(R.string.search_title));
            contextMenu.add(0, 22, 0, z6.E(R.string.share));
        }
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        j1.q(this, this.s);
        this.r.dispose();
        super.onDestroy();
    }

    @Override // e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onPause() {
        j1.q(this, this.u);
        super.onPause();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        z6.T(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // e.a.c.l6, e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onResume() {
        if (h.x()) {
            e.d.b.d.a.I(this.p, this.q);
        }
        super.onResume();
        r0 r0Var = g.a;
        j0.f(e.h.e.b.a);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.jrtstudio.music.metaChanged");
        intentFilter.addAction("com.jrtstudio.music.queueChanged");
        registerReceiver(this.u, intentFilter);
        this.u.onReceive(null, null);
        z6.M(this);
    }

    @Override // androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2 = t1.a;
        j0.h(new j(this));
        z6.e0(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // e.a.c.l6, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStart() {
        super.onStart();
        this.t = z6.e(this, this);
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        super.onStop();
        z6.a0(this.t);
        this.t = null;
    }

    @Override // c.b.c.l, android.app.Activity
    public void openOptionsMenu() {
        Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenLayout;
        if ((i2 & 15) <= 3) {
            super.openOptionsMenu();
            N();
            return;
        }
        configuration.screenLayout = 3;
        super.openOptionsMenu();
        N();
        configuration.screenLayout = i2;
    }

    @Override // e.a.c.e7
    public k1 p() {
        return null;
    }

    @Override // e.g.a.d.i
    public void y(Bundle bundle) {
        requestWindowFeature(5);
        requestWindowFeature(1);
        setVolumeControlStream(3);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme(Action.FILE_ATTRIBUTE);
        registerReceiver(this.s, intentFilter);
        setContentView(R.layout.activity_album);
        this.p = (FrameLayout) findViewById(R.id.banner_layout);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer_layout);
        this.q = shimmerFrameLayout;
        e.d.b.d.a.f0(this, this.p, shimmerFrameLayout, findViewById(R.id.view), this.r);
        z6.c0(this, 0, (ImageView) findViewById(R.id.blurred_bg_player_view));
        J((FastScrollRecyclerView) findViewById(R.id.recyclerView));
        z6.d0(this, R.id.albumtab);
        z6.g(this);
        c.i.g.b.k("ABA");
    }

    @Override // e.g.a.d.j
    public int z() {
        return 1;
    }
}
