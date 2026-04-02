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
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c.b.h.i.i;
import c.b.i.p0;
import c.i.g.h;
import ch.qos.logback.core.joran.action.Action;
import com.android.music.ArtistAlbumBrowserActivity;
import com.android.music.DeleteItems;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.jrt.recyclerview.views.FastScrollRecyclerView;
import e.a.c.e4;
import e.a.c.e7;
import e.a.c.h7.n;
import e.a.c.h7.o;
import e.a.c.l6;
import e.a.c.n6;
import e.a.c.u;
import e.a.c.z6;
import e.g.a.e.b;
import e.h.e.g;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.k1;
import e.h.g.r0;
import e.h.g.t1;
import e.j.d.c0.b0;
import java.util.ArrayList;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ArtistAlbumBrowserActivity extends l6 implements View.OnCreateContextMenuListener, b.a<o>, e7 {
    public static Object o;
    public FrameLayout t;
    public ShimmerFrameLayout u;
    public z6.e x;
    public b.a<n> p = new a();
    public final ArrayList<e.a.c.w6.b> q = new ArrayList<>();
    public final Object[] r = new Object[1];
    public final Object[] s = new Object[3];
    public final f.a.e.a v = new f.a.e.a();
    public final BroadcastReceiver w = new b();
    public final BroadcastReceiver y = new c();

    /* loaded from: classes.dex */
    public class a implements b.a<n> {
        public a() {
        }

        @Override // e.g.a.e.b.a
        public void d(e.g.a.e.b<n> bVar) {
        }

        @Override // e.g.a.e.b.a
        public void g(View view, int i2, int i3, n nVar, e.g.a.e.b<n> bVar) {
            n nVar2 = nVar;
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
            intent.putExtra("album", Long.valueOf(nVar2.f5085f.f5200c));
            intent.putExtra("artist", String.valueOf(nVar2.f5085f.f5199b.a));
            intent.putExtra("aTitle", nVar2.f5085f.f5204g);
            ArtistAlbumBrowserActivity.this.startActivity(intent);
        }

        @Override // e.g.a.e.b.a
        public boolean k(View view, int i2, int i3, n nVar, e.g.a.e.b<n> bVar) {
            ArtistAlbumBrowserActivity.o = nVar.f5085f;
            ArtistAlbumBrowserActivity.this.registerForContextMenu(view);
            ArtistAlbumBrowserActivity.this.openContextMenu(view);
            ArtistAlbumBrowserActivity.this.unregisterForContextMenu(view);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z6.W(ArtistAlbumBrowserActivity.this);
            ArtistAlbumBrowserActivity.this.F(null);
            if (intent.getAction().equals("android.intent.action.MEDIA_UNMOUNTED")) {
                z6.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j0.h(new j0.c() { // from class: e.a.c.s
                @Override // e.h.g.j0.c
                public final void a() {
                    ArtistAlbumBrowserActivity.c cVar = ArtistAlbumBrowserActivity.c.this;
                    Objects.requireNonNull(cVar);
                    int i2 = e.h.g.t1.a;
                    ArtistAlbumBrowserActivity artistAlbumBrowserActivity = ArtistAlbumBrowserActivity.this;
                    Objects.requireNonNull(artistAlbumBrowserActivity);
                    e.h.g.j0.h(new u(artistAlbumBrowserActivity));
                    z6.e0(ArtistAlbumBrowserActivity.this);
                    ArtistAlbumBrowserActivity artistAlbumBrowserActivity2 = ArtistAlbumBrowserActivity.this;
                    Objects.requireNonNull(artistAlbumBrowserActivity2);
                    e.h.g.j0.i(new e.g.a.d.d(artistAlbumBrowserActivity2));
                    ArtistAlbumBrowserActivity.this.F(null);
                }
            });
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
            } else if (itemId == 9) {
                Cursor Q = z6.Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_music=1", null, "title_key");
                if (Q != null) {
                    try {
                        z6.Y(ArtistAlbumBrowserActivity.this, Q);
                    } finally {
                        Q.close();
                    }
                }
                return true;
            } else if (itemId == 14) {
                QueryBrowserActivity.E(ArtistAlbumBrowserActivity.this);
                return true;
            } else if (itemId == 17) {
                SettingsActivity.y(ArtistAlbumBrowserActivity.this);
                return false;
            } else if (itemId == 19) {
                h.N(ArtistAlbumBrowserActivity.this.getSupportFragmentManager());
                return false;
            } else if (itemId == 21) {
                b0.o(ArtistAlbumBrowserActivity.this);
                return false;
            } else if (itemId != 25) {
                return false;
            } else {
                h.y();
                Intent intent = new Intent();
                intent.setType("audio/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                ArtistAlbumBrowserActivity.this.startActivityForResult(intent, 555);
                return false;
            }
        }
    }

    @Override // e.g.a.d.j
    public int A() {
        return getResources().getColor(R.color.accent);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0354 A[LOOP:2: B:114:0x034e->B:116:0x0354, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // e.g.a.d.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.music.ArtistAlbumBrowserActivity.C(java.lang.Object):void");
    }

    @Override // e.a.c.l6
    public boolean K() {
        return true;
    }

    public void L() {
        String str;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MEDIA_SEARCH");
        intent.setFlags(268435456);
        Object obj = o;
        String str2 = null;
        if (obj instanceof e.a.c.w6.b) {
            str2 = ((e.a.c.w6.b) obj).f5208e;
            String str3 = ((e.a.c.w6.b) obj).f5208e;
            intent.putExtra("android.intent.extra.artist", ((e.a.c.w6.b) obj).f5208e);
            intent.putExtra("android.intent.extra.focus", "vnd.android.cursor.item/artist");
            str = str3;
        } else if (obj instanceof e.a.c.w6.a) {
            str2 = ((e.a.c.w6.a) obj).f5204g;
            StringBuilder A = e.a.d.a.a.A(str2, " ");
            A.append(((e.a.c.w6.a) o).f5199b.f5208e);
            str = A.toString();
            intent.putExtra("android.intent.extra.artist", ((e.a.c.w6.a) o).f5199b.f5208e);
            intent.putExtra("android.intent.extra.album", ((e.a.c.w6.a) o).f5204g);
            intent.putExtra("android.intent.extra.focus", "vnd.android.cursor.item/album");
        } else {
            str = null;
        }
        String F = z6.F(R.string.mediasearch, str2);
        intent.putExtra("query", str);
        n6.a();
        h.y();
        startActivity(Intent.createChooser(intent, F));
    }

    public void M(final int i2, o oVar) {
        synchronized (this.q) {
            if (this.q.contains(oVar.f5090e)) {
                this.q.remove(oVar.f5090e);
            } else {
                this.q.add(oVar.f5090e);
            }
        }
        j0.i(new j0.c() { // from class: e.g.a.d.c
            @Override // e.h.g.j0.c
            public final void a() {
                j jVar = j.this;
                int i3 = i2;
                e.g.a.a.k kVar = jVar.f8006e;
                if (kVar != null) {
                    Object obj = j1.a;
                    if (kVar.b() > i3) {
                        kVar.a.d(i3, 1, new Object());
                    }
                }
            }
        });
        F(null);
    }

    public boolean N(View view, o oVar) {
        o = oVar.f5090e;
        registerForContextMenu(view);
        openContextMenu(view);
        unregisterForContextMenu(view);
        return true;
    }

    public final void O() {
        p0 p0Var = new p0(this, findViewById(R.id.menu_button));
        p0Var.a.a(0, 17, 0, z6.E(R.string.settings));
        p0Var.a.a(0, 8, 0, z6.E(R.string.party_shuffle));
        ((i) p0Var.a.a(0, 9, 0, z6.E(R.string.shuffle_all))).setIcon(R.drawable.ic_menu_shuffle);
        ((i) p0Var.a.a(0, 14, 0, z6.E(R.string.search_title))).setIcon(R.drawable.ic_menu_search);
        p0Var.a.a(0, 19, 0, z6.E(R.string.rate_us));
        p0Var.a.a(0, 21, 0, z6.E(R.string.share_app));
        z6.T(p0Var.a);
        p0Var.f1216d = new d();
        p0Var.a();
    }

    @Override // e.g.a.e.b.a
    public void d(e.g.a.e.b<o> bVar) {
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ void g(View view, int i2, int i3, o oVar, e.g.a.e.b<o> bVar) {
        M(i3, oVar);
    }

    @Override // e.a.c.e7
    public boolean h(e.a.c.w6.b bVar) {
        boolean contains;
        synchronized (this.q) {
            contains = this.q.contains(bVar);
        }
        return contains;
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ boolean k(View view, int i2, int i3, o oVar, e.g.a.e.b<o> bVar) {
        return N(view, oVar);
    }

    @Override // e.a.c.e7
    public int l() {
        Uri uri = z6.a;
        return -1;
    }

    @Override // e.a.c.e7
    public boolean n(e.a.c.w6.d dVar) {
        return false;
    }

    @Override // e.a.c.e7
    public char[] o() {
        return new char[0];
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, final Intent intent) {
        if (e.h.b.o.j(this, i2, i3, intent)) {
            return;
        }
        if (i2 != 4) {
            if (i2 == 11 && i3 == 0) {
                finish();
            }
        } else if (i3 == -1) {
            j0.c(new j0.b() { // from class: e.a.c.x
                @Override // e.h.g.j0.b
                public final void a() {
                    ArtistAlbumBrowserActivity artistAlbumBrowserActivity = ArtistAlbumBrowserActivity.this;
                    Intent intent2 = intent;
                    Objects.requireNonNull(artistAlbumBrowserActivity);
                    try {
                        Uri data = intent2.getData();
                        if (data != null) {
                            long[] jArr = null;
                            Object obj = ArtistAlbumBrowserActivity.o;
                            if (obj instanceof e.a.c.w6.b) {
                                jArr = z6.B((e.a.c.w6.b) obj);
                            } else if (obj instanceof e.a.c.w6.a) {
                                jArr = z6.A((e.a.c.w6.a) obj);
                            }
                            z6.c(artistAlbumBrowserActivity, jArr, Long.parseLong(data.getLastPathSegment()));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            });
        }
        F(null);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(final MenuItem menuItem) {
        int itemId;
        try {
            itemId = menuItem.getItemId();
        } catch (NumberFormatException unused) {
        }
        if (itemId == 3) {
            j0.c(new j0.b() { // from class: e.a.c.w
                @Override // e.h.g.j0.b
                public final void a() {
                    ArtistAlbumBrowserActivity artistAlbumBrowserActivity = ArtistAlbumBrowserActivity.this;
                    MenuItem menuItem2 = menuItem;
                    Objects.requireNonNull(artistAlbumBrowserActivity);
                    Object obj = ArtistAlbumBrowserActivity.o;
                    z6.c(artistAlbumBrowserActivity, obj instanceof e.a.c.w6.b ? z6.B((e.a.c.w6.b) obj) : obj instanceof e.a.c.w6.a ? z6.A((e.a.c.w6.a) obj) : new long[0], menuItem2.getIntent().getLongExtra("playlist", 0L));
                }
            });
            return true;
        } else if (itemId == 4) {
            Intent intent = new Intent();
            intent.setClass(this, CreatePlaylist.class);
            startActivityForResult(intent, 4);
            return true;
        } else if (itemId == 5) {
            j0.c(new j0.b() { // from class: e.a.c.z
                @Override // e.h.g.j0.b
                public final void a() {
                    ArtistAlbumBrowserActivity artistAlbumBrowserActivity = ArtistAlbumBrowserActivity.this;
                    Objects.requireNonNull(artistAlbumBrowserActivity);
                    Object obj = ArtistAlbumBrowserActivity.o;
                    z6.N(artistAlbumBrowserActivity, obj instanceof e.a.c.w6.b ? z6.B((e.a.c.w6.b) obj) : obj instanceof e.a.c.w6.a ? z6.A((e.a.c.w6.a) obj) : new long[0], 0, false);
                }
            });
            return true;
        } else if (itemId == 10) {
            j0.c(new j0.b() { // from class: e.a.c.v
                @Override // e.h.g.j0.b
                public final void a() {
                    final ArtistAlbumBrowserActivity artistAlbumBrowserActivity = ArtistAlbumBrowserActivity.this;
                    Objects.requireNonNull(artistAlbumBrowserActivity);
                    Object obj = ArtistAlbumBrowserActivity.o;
                    final long[] B = obj instanceof e.a.c.w6.b ? z6.B((e.a.c.w6.b) obj) : obj instanceof e.a.c.w6.a ? z6.A((e.a.c.w6.a) obj) : new long[0];
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.t
                        @Override // e.h.g.j0.c
                        public final void a() {
                            ArtistAlbumBrowserActivity artistAlbumBrowserActivity2 = ArtistAlbumBrowserActivity.this;
                            long[] jArr = B;
                            Objects.requireNonNull(artistAlbumBrowserActivity2);
                            try {
                                Object obj2 = ArtistAlbumBrowserActivity.o;
                                DeleteItems.a(artistAlbumBrowserActivity2, jArr, obj2 instanceof e.a.c.w6.b ? String.format(z6.E(R.string.delete_artist_desc_nosdcard), ((e.a.c.w6.b) ArtistAlbumBrowserActivity.o).f5208e) : obj2 instanceof e.a.c.w6.a ? String.format(z6.E(R.string.delete_album_desc_nosdcard), ((e.a.c.w6.a) ArtistAlbumBrowserActivity.o).f5204g) : "", 89083);
                            } catch (NumberFormatException unused2) {
                            }
                        }
                    });
                }
            });
            return true;
        } else if (itemId == 12) {
            j0.c(new j0.b() { // from class: e.a.c.y
                @Override // e.h.g.j0.b
                public final void a() {
                    Object obj = ArtistAlbumBrowserActivity.o;
                    z6.b(obj instanceof e.a.c.w6.b ? z6.B((e.a.c.w6.b) obj) : obj instanceof e.a.c.w6.a ? z6.A((e.a.c.w6.a) obj) : new long[0]);
                }
            });
            return true;
        } else if (itemId == 22) {
            j0.f(new j0.b() { // from class: e.a.c.r
                @Override // e.h.g.j0.b
                public final void a() {
                    ArtistAlbumBrowserActivity artistAlbumBrowserActivity = ArtistAlbumBrowserActivity.this;
                    Objects.requireNonNull(artistAlbumBrowserActivity);
                    Object obj = ArtistAlbumBrowserActivity.o;
                    long[] B = obj instanceof e.a.c.w6.b ? z6.B((e.a.c.w6.b) obj) : obj instanceof e.a.c.w6.a ? z6.A((e.a.c.w6.a) obj) : new long[0];
                    ArrayList arrayList = new ArrayList(B.length);
                    ArrayList arrayList2 = new ArrayList(B.length);
                    for (long j2 : B) {
                        StringBuilder y = e.a.d.a.a.y("_id IN (");
                        y.append(j2);
                        y.append(")");
                        Cursor query = artistAlbumBrowserActivity.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "album_id"}, y.toString(), null, null);
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
                    Object obj2 = ArtistAlbumBrowserActivity.o;
                    if (obj2 instanceof e.a.c.w6.b) {
                        String str = ((e.a.c.w6.b) obj2).f5208e;
                    } else if (obj2 instanceof e.a.c.w6.a) {
                        String str2 = ((e.a.c.w6.a) obj2).f5204g;
                    }
                    e.h.g.j1.a(artistAlbumBrowserActivity, arrayList2, arrayList, null);
                }
            });
            return true;
        } else if (itemId != 26) {
            return super.onContextItemSelected(menuItem);
        } else {
            L();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Object obj = o;
        if (obj instanceof e.a.c.w6.b) {
            contextMenu.add(0, 5, 0, z6.E(R.string.play_selection));
            z6.K(this, contextMenu.addSubMenu(0, 1, 0, z6.E(R.string.add_to_playlist)));
            contextMenu.add(0, 10, 0, z6.E(R.string.delete_item));
            contextMenu.setHeaderTitle(((e.a.c.w6.b) o).f5208e);
            contextMenu.add(0, 26, 0, z6.E(R.string.search_title));
            contextMenu.add(0, 22, 0, z6.E(R.string.share));
        } else if (obj instanceof e.a.c.w6.a) {
            contextMenu.add(0, 5, 0, z6.E(R.string.play_selection));
            z6.K(this, contextMenu.addSubMenu(0, 1, 0, z6.E(R.string.add_to_playlist)));
            contextMenu.add(0, 10, 0, z6.E(R.string.delete_item));
            contextMenu.setHeaderTitle(((e.a.c.w6.a) o).f5204g);
            contextMenu.add(0, 26, 0, z6.E(R.string.search_title));
            contextMenu.add(0, 22, 0, z6.E(R.string.share));
        }
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        j1.q(this, this.w);
        this.v.dispose();
        super.onDestroy();
    }

    @Override // e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onPause() {
        super.onPause();
        j1.q(this, this.y);
    }

    @Override // e.a.c.l6, e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onResume() {
        super.onResume();
        if (h.x()) {
            e.d.b.d.a.I(this.t, this.u);
        }
        r0 r0Var = g.a;
        j0.f(e.h.e.b.a);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.jrtstudio.music.metaChanged");
        intentFilter.addAction("com.jrtstudio.music.queueChanged");
        registerReceiver(this.y, intentFilter);
        this.y.onReceive(null, null);
        z6.M(this);
    }

    @Override // androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2 = t1.a;
        j0.h(new u(this));
        z6.e0(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // e.a.c.l6, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStart() {
        super.onStart();
        this.x = z6.e(this, this);
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        super.onStop();
        z6.a0(this.x);
        this.x = null;
    }

    @Override // c.b.c.l, android.app.Activity
    public void openOptionsMenu() {
        Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenLayout;
        if ((i2 & 15) <= 3) {
            super.openOptionsMenu();
            O();
            return;
        }
        configuration.screenLayout = 3;
        super.openOptionsMenu();
        O();
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
        registerReceiver(this.w, intentFilter);
        setContentView(R.layout.activity_playlist);
        this.t = (FrameLayout) findViewById(R.id.banner_layout);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer_layout);
        this.u = shimmerFrameLayout;
        e.d.b.d.a.f0(this, this.t, shimmerFrameLayout, findViewById(R.id.view), this.v);
        z6.c0(this, 0, (ImageView) findViewById(R.id.blurred_bg_player_view));
        J((FastScrollRecyclerView) findViewById(R.id.recyclerView));
        z6.d0(this, R.id.artisttab);
        z6.g(this);
        c.i.g.b.k("AABA");
    }

    @Override // e.g.a.d.j
    public int z() {
        return 1;
    }
}
