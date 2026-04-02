package com.android.music;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c.b.h.i.i;
import c.b.i.p0;
import c.i.g.h;
import c.u.b.o;
import ch.qos.logback.core.joran.action.Action;
import com.android.music.TrackBrowserActivity;
import com.android.support.v4.main.aa;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.jrt.recyclerview.views.FastScrollRecyclerView;
import e.a.c.e4;
import e.a.c.e7;
import e.a.c.h7.q;
import e.a.c.l6;
import e.a.c.n6;
import e.a.c.s6;
import e.a.c.z6;
import e.g.a.e.b;
import e.h.g.c1;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.k1;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.v0;
import e.j.d.c0.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class TrackBrowserActivity extends l6 implements b.a<q>, e7 {
    public static final String[] o;
    public static e.a.c.w6.d p;
    public static int q;
    public boolean B;
    public boolean C;
    public FrameLayout D;
    public ShimmerFrameLayout E;
    public String I;
    public z6.e J;
    public g K;
    public boolean M;
    public boolean N;
    public boolean r;
    public long s;
    public String t;
    public String u;
    public String v;
    public long w = -1;
    public int x = -1;
    public final e y = new e(null);
    public boolean z = false;
    public ExecutorService A = Executors.newSingleThreadExecutor();
    public final f.a.e.a F = new f.a.e.a();
    public final BroadcastReceiver G = new a();
    public final BroadcastReceiver H = new b();
    public final BroadcastReceiver L = new c();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.jrtstudio.music.metaChanged")) {
                if (intent.hasExtra("track")) {
                    s1.c(intent.getStringExtra("track"));
                }
            } else if (intent.getAction().equals("com.jrtstudio.music.queueChanged")) {
                if (z6.y() == null) {
                    TrackBrowserActivity.this.finish();
                    return;
                }
                TrackBrowserActivity.this.F(null);
            }
            int i2 = t1.a;
            TrackBrowserActivity.this.R();
            TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
            trackBrowserActivity.y.a(trackBrowserActivity);
        }
    }

    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.MEDIA_SCANNER_STARTED".equals(action) || "android.intent.action.MEDIA_SCANNER_FINISHED".equals(action)) {
                z6.W(TrackBrowserActivity.this);
            }
            TrackBrowserActivity.this.F(null);
        }
    }

    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j0.h(new j0.c() { // from class: e.a.c.m5
                @Override // e.h.g.j0.c
                public final void a() {
                    TrackBrowserActivity.c cVar = TrackBrowserActivity.c.this;
                    TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                    trackBrowserActivity.y.a(trackBrowserActivity);
                    int i2 = e.h.g.t1.a;
                    TrackBrowserActivity.this.R();
                    TrackBrowserActivity trackBrowserActivity2 = TrackBrowserActivity.this;
                    if (trackBrowserActivity2.z) {
                        return;
                    }
                    z6.e0(trackBrowserActivity2);
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
                j0.g(new j0.b() { // from class: e.a.c.q5
                    @Override // e.h.g.j0.b
                    public final void a() {
                        TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                        String[] strArr = TrackBrowserActivity.o;
                        z6.N(trackBrowserActivity, z6.d(trackBrowserActivity.L()), 0, true);
                    }
                });
                return true;
            } else if (itemId == 14) {
                QueryBrowserActivity.E(TrackBrowserActivity.this);
                return true;
            } else if (itemId == 17) {
                SettingsActivity.y(TrackBrowserActivity.this);
                return false;
            } else if (itemId == 21) {
                b0.o(TrackBrowserActivity.this);
                return false;
            } else if (itemId == 34) {
                h.N(TrackBrowserActivity.this.getSupportFragmentManager());
                return false;
            } else {
                switch (itemId) {
                    case 28:
                        Intent intent = new Intent();
                        intent.setClass(TrackBrowserActivity.this, CreatePlaylist.class);
                        TrackBrowserActivity.this.startActivityForResult(intent, 28);
                        return true;
                    case 29:
                        j0.g(new j0.b() { // from class: e.a.c.o5
                            @Override // e.h.g.j0.b
                            public final void a() {
                                TrackBrowserActivity.d dVar = TrackBrowserActivity.d.this;
                                TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                                String[] strArr = TrackBrowserActivity.o;
                                ArrayList<e.a.c.w6.d> L = trackBrowserActivity.L();
                                if (L.size() > 0) {
                                    int nextInt = new Random().nextInt(L.size());
                                    TrackBrowserActivity trackBrowserActivity2 = TrackBrowserActivity.this;
                                    z6.N(trackBrowserActivity2, z6.d(trackBrowserActivity2.L()), nextInt, false);
                                }
                            }
                        });
                        return true;
                    case 30:
                        j0.f(new j0.b() { // from class: e.a.c.p5
                            @Override // e.h.g.j0.b
                            public final void a() {
                                Uri uri2 = z6.a;
                                e.h.g.j0.f(x3.a);
                            }
                        });
                        return true;
                    default:
                        return false;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public long a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f3023b = -1;

        public e(a aVar) {
        }

        public void a(final l6 l6Var) {
            j0.f(new j0.b() { // from class: e.a.c.s5
                @Override // e.h.g.j0.b
                public final void a() {
                    TrackBrowserActivity.e eVar = TrackBrowserActivity.e.this;
                    l6 l6Var2 = l6Var;
                    long j2 = eVar.a;
                    int i2 = eVar.f3023b;
                    eVar.a = -1L;
                    s6 y = z6.y();
                    if (y != null) {
                        try {
                            eVar.a = y.e();
                            eVar.f3023b = y.f5177b.I0();
                        } catch (Exception unused) {
                        }
                    }
                    if (j2 == eVar.a && i2 == eVar.f3023b) {
                        return;
                    }
                    Objects.requireNonNull(l6Var2);
                    e.h.g.j0.i(new e.g.a.d.d(l6Var2));
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class f extends AbstractCursor {
        public final String[] a;

        /* renamed from: b  reason: collision with root package name */
        public Cursor f3024b;

        /* renamed from: c  reason: collision with root package name */
        public long[] f3025c;

        /* renamed from: d  reason: collision with root package name */
        public long[] f3026d;

        /* renamed from: e  reason: collision with root package name */
        public final s6 f3027e;

        /* renamed from: f  reason: collision with root package name */
        public int f3028f;

        public f(s6 s6Var, String[] strArr) {
            this.a = strArr;
            this.f3027e = s6Var;
            a();
        }

        public final void a() {
            this.f3024b = null;
            try {
                this.f3026d = this.f3027e.f();
            } catch (Exception unused) {
                this.f3026d = new long[0];
            }
            int length = this.f3026d.length;
            this.f3028f = length;
            if (length == 0) {
                return;
            }
            StringBuilder y = e.a.d.a.a.y("_id IN (");
            for (int i2 = 0; i2 < this.f3028f; i2++) {
                y.append(this.f3026d[i2]);
                if (i2 < this.f3028f - 1) {
                    y.append(",");
                }
            }
            y.append(")");
            Cursor Q = z6.Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, this.a, y.toString(), null, "_id");
            this.f3024b = Q;
            if (Q == null) {
                this.f3028f = 0;
                return;
            }
            int count = Q.getCount();
            this.f3025c = new long[count];
            this.f3024b.moveToFirst();
            int columnIndexOrThrow = this.f3024b.getColumnIndexOrThrow("_id");
            for (int i3 = 0; i3 < count; i3++) {
                this.f3025c[i3] = this.f3024b.getLong(columnIndexOrThrow);
                this.f3024b.moveToNext();
            }
            this.f3024b.moveToFirst();
            try {
                int length2 = this.f3026d.length;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    long j2 = this.f3026d[length2];
                    if (Arrays.binarySearch(this.f3025c, j2) < 0) {
                        s1.c("item no longer exists in db: " + j2);
                        this.f3027e.f5177b.A(j2);
                    }
                }
                this.f3026d = this.f3027e.f();
                s1.c("refetch queue");
                int length3 = this.f3026d.length;
                this.f3028f = length3;
                if (length3 == 0) {
                    this.f3025c = null;
                }
            } catch (Exception unused2) {
                this.f3026d = new long[0];
            }
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public void deactivate() {
            Cursor cursor = this.f3024b;
            if (cursor != null) {
                cursor.deactivate();
            }
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return this.a;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return this.f3028f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i2) {
            return this.f3024b.getDouble(i2);
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i2) {
            return this.f3024b.getFloat(i2);
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i2) {
            try {
                return this.f3024b.getInt(i2);
            } catch (Exception unused) {
                onChange(true);
                return 0;
            }
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i2) {
            try {
                return this.f3024b.getLong(i2);
            } catch (Exception unused) {
                onChange(true);
                return 0L;
            }
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i2) {
            return this.f3024b.getShort(i2);
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i2) {
            try {
                return this.f3024b.getString(i2);
            } catch (Exception unused) {
                onChange(true);
                return "";
            }
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i2) {
            return this.f3024b.isNull(i2);
        }

        @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
        public boolean onMove(int i2, int i3) {
            long[] jArr;
            if (i2 == i3) {
                return true;
            }
            long[] jArr2 = this.f3026d;
            if (jArr2 == null || (jArr = this.f3025c) == null || i3 >= jArr2.length) {
                return false;
            }
            this.f3024b.moveToPosition(Arrays.binarySearch(jArr, jArr2[i3]));
            return true;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean requery() {
            a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class g extends c1 {

        /* loaded from: classes.dex */
        public class a {
            public a(g gVar, a aVar) {
            }
        }

        public g() {
            super("track_jsync", TrackBrowserActivity.this, false, true, 0);
        }

        @Override // e.h.g.c1
        public Object i(Object obj) {
            boolean z = obj instanceof a;
            return null;
        }

        @Override // e.h.g.c1
        public void j(Object obj, Object obj2) {
            RecyclerView recyclerView;
            if ((obj instanceof a) && (obj2 instanceof Bitmap) && (recyclerView = TrackBrowserActivity.this.f8009h) != null) {
                Bitmap bitmap = (Bitmap) obj2;
                Uri uri = z6.a;
                try {
                    if (bitmap == null) {
                        recyclerView.setBackgroundResource(0);
                    } else {
                        int width = recyclerView.getWidth();
                        int height = recyclerView.getHeight();
                        int width2 = bitmap.getWidth();
                        int height2 = bitmap.getHeight();
                        float max = Math.max(width / width2, height / height2) * 1.3f;
                        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(0.0f);
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        colorMatrix2.setScale(0.3f, 0.3f, 0.3f, 1.0f);
                        colorMatrix.postConcat(colorMatrix2);
                        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-width2) / 2, (-height2) / 2);
                        matrix.postRotate(10.0f);
                        matrix.postScale(max, max);
                        matrix.postTranslate(width / 2, height / 2);
                        canvas.drawBitmap(bitmap, matrix, paint);
                        recyclerView.setBackgroundDrawable(new BitmapDrawable(createBitmap));
                    }
                } catch (Throwable th) {
                    s1.l(th, true);
                }
            }
        }

        @Override // e.h.g.c1
        public void k(Object obj) {
        }
    }

    static {
        new r0().h();
        if (v0.d()) {
            o = new String[]{"_id", "title", "_data", "album", "artist", "artist_id", "duration", "track"};
        } else {
            o = new String[]{"_id", "title", "_data", "album", "artist", "artist_id", "duration"};
        }
    }

    public static void Q(Activity activity) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
        intent.putExtra("playlist", "recentlyadded");
        activity.startActivity(intent);
    }

    @Override // e.g.a.d.j
    public int A() {
        return getResources().getColor(R.color.accent);
    }

    @Override // e.g.a.d.j
    public void B(final e.g.a.c.f fVar, final int i2, final e.g.a.c.f fVar2, final int i3) {
        j0.f(new j0.b() { // from class: e.a.c.z5
            @Override // e.h.g.j0.b
            public final void a() {
                TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                int i4 = i2;
                int i5 = i3;
                e.g.a.c.f fVar3 = fVar;
                e.g.a.c.f fVar4 = fVar2;
                Objects.requireNonNull(trackBrowserActivity);
                try {
                    if (trackBrowserActivity.r) {
                        s6 y = z6.y();
                        if (y != null) {
                            y.f5177b.k0(i4, i5);
                        }
                    } else {
                        if ((fVar3 instanceof e.a.c.h7.q) && (fVar4 instanceof e.a.c.h7.q)) {
                            e.h.b.n.w(trackBrowserActivity.w, ((e.a.c.h7.q) fVar3).f5093d.f5210b, i4, ((e.a.c.h7.q) fVar4).f5093d.f5210b, i5);
                        }
                        trackBrowserActivity.F(null);
                    }
                    trackBrowserActivity.F(null);
                } catch (Throwable th) {
                    e.h.g.s1.l(th, true);
                }
            }
        });
    }

    @Override // e.g.a.d.j
    public void C(Object obj) {
        int i2;
        this.y.a(this);
        ArrayList<e.a.c.w6.d> L = L();
        ArrayList<e.g.a.c.f> arrayList = new ArrayList<>();
        Iterator<e.a.c.w6.d> it = L.iterator();
        while (it.hasNext()) {
            arrayList.add(new q(this, it.next(), this.z, this.f8006e, this));
        }
        s6 y = z6.y();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        String str = this.v;
        if (str == null || str.length() <= 0 || y == null) {
            G(arrayList, false);
        } else {
            int i3 = this.y.f3023b;
            int i4 = this.x;
            this.x = i3;
            arrayList2.add(Integer.valueOf(i4));
            arrayList2.add(Integer.valueOf(this.x));
            if (this.M) {
                i2 = -1;
            } else {
                int i5 = this.x;
                this.M = true;
                i2 = i5;
            }
            H(arrayList, false, -1, i2, arrayList2);
        }
        j0.i(new j0.c() { // from class: e.a.c.b6
            @Override // e.h.g.j0.c
            public final void a() {
                TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                String[] strArr = TrackBrowserActivity.o;
                trackBrowserActivity.O();
            }
        });
    }

    @Override // e.g.a.d.j
    public boolean D() {
        return this.N;
    }

    @Override // e.g.a.d.j
    public boolean E() {
        return this.z;
    }

    @Override // e.a.c.l6
    public boolean K() {
        if (this.u == null && this.v == null) {
            if (this.s == 0) {
                return this.t == null;
            }
            StringBuilder y = e.a.d.a.a.y("track, ");
            y.append(this.I);
            this.I = y.toString();
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<e.a.c.w6.d> L() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.music.TrackBrowserActivity.L():java.util.ArrayList");
    }

    public void M(final int i2) {
        j0.g(new j0.b() { // from class: e.a.c.u5
            @Override // e.h.g.j0.b
            public final void a() {
                TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                int i3 = i2;
                if (!trackBrowserActivity.r) {
                    z6.N(trackBrowserActivity, z6.d(trackBrowserActivity.L()), i3, false);
                    return;
                }
                s6 y = z6.y();
                if (y != null) {
                    try {
                        y.s(i3);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    public boolean N(View view, int i2, q qVar) {
        p = qVar.f5093d;
        q = i2;
        registerForContextMenu(view);
        openContextMenu(view);
        unregisterForContextMenu(view);
        return true;
    }

    public final void O() {
        Intent intent = getIntent();
        String E = (intent == null || !intent.hasExtra("aTitle")) ? z6.E(R.string.unknown_album_name) : intent.getStringExtra("aTitle");
        if (this.v != null) {
            if (this.r) {
                E = z6.u() == 2 ? z6.E(R.string.party_shuffle) : z6.E(R.string.nowplaying_title);
            } else if (this.B) {
                E = z6.E(R.string.podcasts_title);
            } else if (this.C) {
                E = z6.E(R.string.recentlyadded_title);
            }
        }
        if (u() != null) {
            if (E != null) {
                u().q(E);
            } else {
                u().q(z6.E(R.string.tracks_title));
            }
        }
    }

    public final void P() {
        p0 p0Var = new p0(this, findViewById(R.id.menu_button));
        p0Var.a.a(0, 17, 0, z6.E(R.string.settings));
        if (this.v == null) {
            ((i) p0Var.a.a(0, 29, 0, z6.E(R.string.play_all))).setIcon(R.drawable.ic_menu_play_clip);
        }
        p0Var.a.a(0, 8, 0, z6.E(R.string.party_shuffle));
        ((i) p0Var.a.a(0, 9, 0, z6.E(R.string.shuffle_all))).setIcon(R.drawable.ic_menu_shuffle);
        if (this.v != null) {
            ((i) p0Var.a.a(0, 28, 0, z6.E(R.string.save_as_playlist))).setIcon(17301582);
            if (this.r) {
                ((i) p0Var.a.a(0, 30, 0, z6.E(R.string.clear_playlist))).setIcon(R.drawable.ic_menu_clear_playlist);
            }
        }
        ((i) p0Var.a.a(0, 14, 0, z6.E(R.string.search_title))).setIcon(R.drawable.ic_menu_search);
        p0Var.a.a(0, 34, 0, z6.E(R.string.rate_us));
        p0Var.a.a(0, 21, 0, z6.E(R.string.share_app));
        z6.T(p0Var.a);
        p0Var.f1216d = new d();
        p0Var.a();
    }

    public void R() {
        j0.h(new j0.c() { // from class: e.a.c.g6
            @Override // e.h.g.j0.c
            public final void a() {
                TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                if (trackBrowserActivity.isFinishing()) {
                    return;
                }
                z6.b0(trackBrowserActivity, 0, (ImageView) trackBrowserActivity.findViewById(R.id.blurred_bg_player_view), !(trackBrowserActivity.s > 0), z6.f5234n);
            }
        });
    }

    @Override // e.g.a.e.b.a
    public void d(e.g.a.e.b<q> bVar) {
        o oVar = this.f8004c;
        if (!((oVar.f2700m.d(oVar.r, bVar) & 16711680) != 0)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (bVar.f527b.getParent() != oVar.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            VelocityTracker velocityTracker = oVar.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            oVar.t = VelocityTracker.obtain();
            oVar.f2696i = 0.0f;
            oVar.f2695h = 0.0f;
            oVar.r(bVar, 2);
        }
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ void g(View view, int i2, int i3, q qVar, e.g.a.e.b<q> bVar) {
        M(i2);
    }

    @Override // e.a.c.e7
    public boolean h(e.a.c.w6.b bVar) {
        return false;
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ boolean k(View view, int i2, int i3, q qVar, e.g.a.e.b<q> bVar) {
        return N(view, i2, qVar);
    }

    @Override // e.a.c.e7
    public int l() {
        Uri uri = z6.a;
        return -1;
    }

    @Override // e.a.c.e7
    public boolean n(e.a.c.w6.d dVar) {
        long j2 = dVar.f5210b;
        return j2 != -1 && this.y.a == j2;
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
            if (i2 != 11) {
                if (i2 != 28) {
                    if (i2 != 33) {
                        super.onActivityResult(i2, i3, intent);
                    } else {
                        F(null);
                    }
                } else if (i3 == -1) {
                    j0.g(new j0.b() { // from class: e.a.c.v5
                        @Override // e.h.g.j0.b
                        public final void a() {
                            TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                            Intent intent2 = intent;
                            Objects.requireNonNull(trackBrowserActivity);
                            Uri data = intent2.getData();
                            if (data != null) {
                                ArrayList<e.a.c.w6.d> L = trackBrowserActivity.L();
                                z6.c(trackBrowserActivity, z6.d(L), Integer.parseInt(data.getLastPathSegment()));
                            }
                        }
                    });
                }
            } else if (i3 == 0) {
                finish();
            }
        } else if (i3 == -1) {
            j0.f(new j0.b() { // from class: e.a.c.c6
                @Override // e.h.g.j0.b
                public final void a() {
                    TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                    Intent intent2 = intent;
                    Objects.requireNonNull(trackBrowserActivity);
                    Uri data = intent2.getData();
                    e.a.c.w6.d dVar = TrackBrowserActivity.p;
                    if (data == null || dVar == null) {
                        return;
                    }
                    z6.c(trackBrowserActivity, new long[]{dVar.f5210b}, Integer.valueOf(data.getLastPathSegment()).intValue());
                }
            });
        }
        F(null);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(final MenuItem menuItem) {
        String str;
        final e.a.c.w6.d dVar = p;
        if (dVar == null) {
            return super.onContextItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == 2) {
            z6.U(this, dVar.f5210b);
            return true;
        } else if (itemId == 3) {
            j0.f(new j0.b() { // from class: e.a.c.t5
                @Override // e.h.g.j0.b
                public final void a() {
                    TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                    e.a.c.w6.d dVar2 = dVar;
                    MenuItem menuItem2 = menuItem;
                    Objects.requireNonNull(trackBrowserActivity);
                    z6.c(trackBrowserActivity, new long[]{dVar2.f5210b}, menuItem2.getIntent().getLongExtra("playlist", 0L));
                }
            });
            return true;
        } else if (itemId == 4) {
            Intent intent = new Intent();
            intent.setClass(this, CreatePlaylist.class);
            startActivityForResult(intent, 4);
            return true;
        } else if (itemId == 5) {
            j0.g(new j0.b() { // from class: e.a.c.f6
                @Override // e.h.g.j0.b
                public final void a() {
                    TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                    ArrayList<e.a.c.w6.d> L = trackBrowserActivity.L();
                    z6.N(trackBrowserActivity, z6.d(L), TrackBrowserActivity.q, false);
                }
            });
            return true;
        } else if (itemId == 10) {
            long[] jArr = {dVar.f5210b};
            new Bundle();
            DeleteItems.a(this, jArr, String.format(z6.E(R.string.delete_song_desc_nosdcard), dVar.f5212d), 33);
            return true;
        } else if (itemId == 12) {
            j0.f(new j0.b() { // from class: e.a.c.a6
                @Override // e.h.g.j0.b
                public final void a() {
                    e.a.c.w6.d dVar2 = e.a.c.w6.d.this;
                    String[] strArr = TrackBrowserActivity.o;
                    z6.b(new long[]{dVar2.f5210b});
                }
            });
            return true;
        } else if (itemId == 22) {
            j0.f(new j0.b() { // from class: e.a.c.d6
                @Override // e.h.g.j0.b
                public final void a() {
                    TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                    e.a.c.w6.d dVar2 = dVar;
                    Objects.requireNonNull(trackBrowserActivity);
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(dVar2);
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            Cursor query = trackBrowserActivity.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "album_id"}, "_id IN (" + ((e.a.c.w6.d) arrayList3.get(i2)).f5210b + ")", null, null);
                            if (query == null) {
                                break;
                            }
                            if (query.moveToFirst()) {
                                long j2 = query.getLong(0);
                                arrayList2.add(Uri.parse(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI + "/" + j2));
                                arrayList.add(query.getString(1).replaceFirst("file://", "").replaceAll("%20", " "));
                            }
                            query.close();
                        }
                        z6.E(R.string.unknown_artist_name).equals(dVar2.f5212d);
                        e.h.g.j1.a(trackBrowserActivity, arrayList2, arrayList, null);
                    } catch (Throwable unused) {
                    }
                }
            });
            return true;
        } else if (itemId == 31) {
            j0.f(new j0.b() { // from class: e.a.c.w5
                @Override // e.h.g.j0.b
                public final void a() {
                    TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                    e.a.c.w6.d dVar2 = dVar;
                    Objects.requireNonNull(trackBrowserActivity);
                    int i2 = TrackBrowserActivity.q;
                    try {
                        if (trackBrowserActivity.r) {
                            s6 y = z6.y();
                            if (y != null) {
                                z6.i();
                                y.f5177b.F(i2);
                            }
                        } else {
                            e.h.b.n.y(true, trackBrowserActivity.w, dVar2.f5210b, i2);
                        }
                    } catch (Exception e2) {
                        e.h.g.s1.l(e2, true);
                    }
                    trackBrowserActivity.F(null);
                }
            });
            return true;
        } else if (itemId != 32) {
            return super.onContextItemSelected(menuItem);
        } else {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.MEDIA_SEARCH");
            intent2.setFlags(268435456);
            String str2 = dVar.f5212d;
            intent2.putExtra("android.intent.extra.title", (CharSequence) str2);
            if (dVar.f5211c.equals(z6.E(R.string.unknown_artist_name))) {
                str = dVar.f5212d;
            } else {
                intent2.putExtra("android.intent.extra.artist", dVar.f5211c);
                str = dVar.f5211c + " " + dVar.f5212d;
            }
            intent2.putExtra("android.intent.extra.focus", "audio/*");
            String F = z6.F(R.string.mediasearch, str2);
            intent2.putExtra("query", str);
            n6.a();
            h.y();
            startActivity(Intent.createChooser(intent2, F));
            return true;
        }
    }

    @Override // e.a.c.l6, e.g.a.d.j, e.g.a.d.i, c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null && !intent.getBooleanExtra("withtabs", false)) {
            setTheme(2131886735);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        e.a.c.w6.d dVar = p;
        if (dVar != null) {
            contextMenu.add(0, 5, 0, z6.E(R.string.play_selection));
            z6.K(this, contextMenu.addSubMenu(0, 1, 0, z6.E(R.string.add_to_playlist)));
            if (this.z) {
                contextMenu.add(0, 31, 0, z6.E(R.string.remove_from_playlist));
            }
            if (v0.n(this)) {
                contextMenu.add(0, 2, 0, z6.E(R.string.ringtone_menu_short));
            }
            contextMenu.add(0, 10, 0, z6.E(R.string.delete_item));
            contextMenu.add(0, 32, 0, z6.E(R.string.search_title));
            contextMenu.add(0, 22, 0, z6.E(R.string.share));
            contextMenu.setHeaderTitle(dVar.f5212d);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 17, 0, z6.E(R.string.settings));
        if (this.v == null) {
            menu.add(0, 29, 0, z6.E(R.string.play_all)).setIcon(R.drawable.ic_menu_play_clip);
        }
        menu.add(0, 8, 0, z6.E(R.string.party_shuffle));
        menu.add(0, 9, 0, z6.E(R.string.shuffle_all)).setIcon(R.drawable.ic_menu_shuffle);
        if (this.v != null) {
            menu.add(0, 28, 0, z6.E(R.string.save_as_playlist)).setIcon(17301582);
            if (this.r) {
                menu.add(0, 30, 0, z6.E(R.string.clear_playlist)).setIcon(R.drawable.ic_menu_clear_playlist);
            }
        }
        menu.add(0, 14, 0, z6.E(R.string.search_title)).setIcon(R.drawable.ic_menu_search);
        menu.add(0, 34, 0, z6.E(R.string.rate_us));
        menu.add(0, 21, 0, z6.E(R.string.share_app));
        return true;
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        g gVar = this.K;
        if (gVar != null) {
            gVar.d();
        }
        this.K = null;
        try {
            if (this.r) {
                j1.q(this, this.G);
            } else {
                j1.q(this, this.L);
            }
        } catch (IllegalArgumentException unused) {
        }
        j1.q(this, this.H);
        this.A.shutdown();
        this.A = null;
        this.F.dispose();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 8) {
            Uri uri = z6.a;
            j0.f(e4.a);
        } else if (itemId == 9) {
            j0.g(new j0.b() { // from class: e.a.c.r5
                @Override // e.h.g.j0.b
                public final void a() {
                    TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                    z6.N(trackBrowserActivity, z6.d(trackBrowserActivity.L()), 0, true);
                }
            });
            return true;
        } else if (itemId == 14) {
            QueryBrowserActivity.E(this);
            return true;
        } else if (itemId == 17) {
            SettingsActivity.y(this);
        } else if (itemId == 21) {
            b0.o(this);
        } else if (itemId != 34) {
            switch (itemId) {
                case 28:
                    Intent intent = new Intent();
                    intent.setClass(this, CreatePlaylist.class);
                    startActivityForResult(intent, 28);
                    return true;
                case 29:
                    j0.g(new j0.b() { // from class: e.a.c.n5
                        @Override // e.h.g.j0.b
                        public final void a() {
                            TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                            ArrayList<e.a.c.w6.d> L = trackBrowserActivity.L();
                            if (L.size() > 0) {
                                z6.N(trackBrowserActivity, z6.d(trackBrowserActivity.L()), new Random().nextInt(L.size()), false);
                            }
                        }
                    });
                    return true;
                case 30:
                    j0.f(new j0.b() { // from class: e.a.c.e6
                        @Override // e.h.g.j0.b
                        public final void a() {
                            String[] strArr = TrackBrowserActivity.o;
                            Uri uri2 = z6.a;
                            e.h.g.j0.f(x3.a);
                        }
                    });
                    return true;
            }
        } else {
            h.N(getSupportFragmentManager());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        z6.T(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // e.a.c.l6, e.g.a.d.j, c.m.b.o, android.app.Activity
    public void onResume() {
        aa.a(this);
        super.onResume();
        if (h.x()) {
            e.d.b.d.a.I(this.D, this.E);
        }
        r0 r0Var = e.h.e.g.a;
        j0.f(e.h.e.b.a);
        z6.M(this);
        g gVar = this.K;
        if (gVar != null) {
            gVar.h(new g.a(gVar, null));
        }
        R();
    }

    @Override // androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("artist", this.t);
        bundle.putLong("album", this.s);
        bundle.putString("playlist", this.v);
        bundle.putString("genre", this.u);
        bundle.putBoolean("editmode", this.z);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2 = t1.a;
        j0.h(new j0.c() { // from class: e.a.c.y5
            @Override // e.h.g.j0.c
            public final void a() {
                TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                Objects.requireNonNull(trackBrowserActivity);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
                intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
                intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
                intentFilter.addDataScheme(Action.FILE_ATTRIBUTE);
                trackBrowserActivity.registerReceiver(trackBrowserActivity.H, intentFilter);
                if (!trackBrowserActivity.z) {
                    z6.e0(trackBrowserActivity);
                }
                int i3 = e.h.g.t1.a;
                trackBrowserActivity.R();
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // e.a.c.l6, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStart() {
        super.onStart();
        this.J = z6.e(this, this);
    }

    @Override // e.g.a.d.j, c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        super.onStop();
        z6.a0(this.J);
        this.J = null;
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

    @Override // e.a.c.e7
    public k1 p() {
        return null;
    }

    @Override // e.g.a.d.i
    public void y(Bundle bundle) {
        View findViewById;
        this.K = new g();
        Intent intent = getIntent();
        boolean z = intent == null || intent.getBooleanExtra("withtabs", false);
        requestWindowFeature(5);
        if (z) {
            requestWindowFeature(1);
            this.N = true;
        } else {
            this.N = false;
        }
        setVolumeControlStream(3);
        if (bundle != null) {
            this.s = bundle.getLong("album");
            this.t = bundle.getString("artist");
            this.v = bundle.getString("playlist");
            this.u = bundle.getString("genre");
            this.z = bundle.getBoolean("editmode", false);
        } else {
            this.s = intent.getLongExtra("album", 0L);
            this.t = intent.getStringExtra("artist");
            this.v = intent.getStringExtra("playlist");
            this.u = intent.getStringExtra("genre");
            if (intent.getAction() != null) {
                this.z = intent.getAction().equals("android.intent.action.EDIT");
            }
        }
        try {
            String str = this.v;
            if (str != null) {
                this.w = Long.parseLong(str);
            }
        } catch (Throwable th) {
            s1.l(th, true);
        }
        this.r = "nowplaying".equals(this.v);
        this.B = "podcasts".equals(this.v);
        this.C = "recentlyadded".equals(this.v);
        setContentView(R.layout.activity_track);
        this.D = (FrameLayout) findViewById(R.id.banner_layout);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.shimmer_layout);
        this.E = shimmerFrameLayout;
        e.d.b.d.a.f0(this, this.D, shimmerFrameLayout, findViewById(R.id.view), this.F);
        z6.c0(this, 0, (ImageView) findViewById(R.id.blurred_bg_player_view));
        J((FastScrollRecyclerView) findViewById(R.id.recyclerView));
        z6.d0(this, R.id.songtab);
        if (v0.g()) {
            e.i.a.a aVar = new e.i.a.a(this);
            if (aVar.f8423c) {
                aVar.f8425e.setVisibility(0);
            }
            if (aVar.f8424d) {
                aVar.f8426f.setVisibility(0);
            }
            int parseColor = Color.parseColor("#20000000");
            if (aVar.f8423c) {
                aVar.f8425e.setBackgroundColor(parseColor);
            }
            if (aVar.f8424d) {
                aVar.f8426f.setBackgroundColor(parseColor);
            }
        }
        z6.g(this);
        j0.h(new j0.c() { // from class: e.a.c.x5
            @Override // e.h.g.j0.c
            public final void a() {
                TrackBrowserActivity trackBrowserActivity = TrackBrowserActivity.this;
                Objects.requireNonNull(trackBrowserActivity);
                Uri uri = z6.a;
                View findViewById2 = trackBrowserActivity.findViewById(16908298);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                z6.d0(trackBrowserActivity, R.id.songtab);
                trackBrowserActivity.O();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.jrtstudio.music.metaChanged");
                intentFilter.addAction("com.jrtstudio.music.queueChanged");
                if (!trackBrowserActivity.r) {
                    trackBrowserActivity.registerReceiver(trackBrowserActivity.L, new IntentFilter(intentFilter));
                    trackBrowserActivity.L.onReceive(trackBrowserActivity, new Intent("com.jrtstudio.music.metaChanged"));
                    return;
                }
                try {
                    trackBrowserActivity.registerReceiver(trackBrowserActivity.G, new IntentFilter(intentFilter));
                    trackBrowserActivity.G.onReceive(trackBrowserActivity, new Intent("com.jrtstudio.music.metaChanged"));
                } catch (Exception unused) {
                }
            }
        });
        if (this.r && (findViewById = findViewById(R.id.nowplaying)) != null) {
            findViewById.setVisibility(8);
        }
        c.i.g.b.k("TBA");
    }

    @Override // e.g.a.d.j
    public int z() {
        return 1;
    }
}
