package com.android.music;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.m;
import ch.qos.logback.core.joran.action.Action;
import com.android.music.AlbumBrowserActivity;
import com.android.music.QueryBrowserActivity;
import com.android.music.TrackBrowserActivity;
import com.jrt.recyclerview.views.FastScrollRecyclerView;
import e.a.c.e7;
import e.a.c.h7.n;
import e.a.c.h7.o;
import e.a.c.h7.q;
import e.a.c.n6;
import e.a.c.u4;
import e.a.c.z6;
import e.c.a.i;
import e.g.a.a.k;
import e.g.a.c.f;
import e.g.a.d.l;
import e.g.a.e.b;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.k1;
import e.h.g.q1;
import e.h.g.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class QueryBrowserActivity extends l implements ServiceConnection, SearchView.l, b.a<q>, e7 {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f3009j = {"_id", "title", "_data", "album", "artist", "artist_id", "duration"};

    /* renamed from: k  reason: collision with root package name */
    public static String f3010k = "";

    /* renamed from: l  reason: collision with root package name */
    public k1 f3011l;
    public String p;
    public InputMethodManager s;
    public SearchView u;
    public String v;
    public String w;
    public z6.e x;
    public boolean y;

    /* renamed from: m  reason: collision with root package name */
    public final b.a<n> f3012m = new a();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<e.a.c.w6.b> f3013n = new ArrayList<>();
    public final b.a<o> o = new b();
    public final Object[] q = new Object[1];
    public final Object[] r = new Object[3];
    public final BroadcastReceiver t = new c();
    public final ArrayList<f> z = new ArrayList<>();

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
            intent.putExtra("aTitle", nVar2.f5085f.f5204g);
            QueryBrowserActivity.this.startActivity(intent);
        }

        @Override // e.g.a.e.b.a
        public /* bridge */ /* synthetic */ boolean k(View view, int i2, int i3, n nVar, e.g.a.e.b<n> bVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.a<o> {
        public b() {
        }

        @Override // e.g.a.e.b.a
        public void d(e.g.a.e.b<o> bVar) {
        }

        @Override // e.g.a.e.b.a
        public void g(View view, int i2, final int i3, o oVar, e.g.a.e.b<o> bVar) {
            o oVar2 = oVar;
            synchronized (QueryBrowserActivity.this.f3013n) {
                if (QueryBrowserActivity.this.f3013n.contains(oVar2.f5090e)) {
                    QueryBrowserActivity.this.f3013n.remove(oVar2.f5090e);
                } else {
                    QueryBrowserActivity.this.f3013n.add(oVar2.f5090e);
                }
            }
            final QueryBrowserActivity queryBrowserActivity = QueryBrowserActivity.this;
            Objects.requireNonNull(queryBrowserActivity);
            j0.i(new j0.c() { // from class: e.g.a.d.f
                @Override // e.h.g.j0.c
                public final void a() {
                    l lVar = l.this;
                    int i4 = i3;
                    e.g.a.a.k kVar = lVar.f8020d;
                    if (kVar != null) {
                        Object obj = j1.a;
                        if (kVar.b() > i4) {
                            kVar.a.d(i4, 1, new Object());
                        }
                    }
                }
            });
            QueryBrowserActivity.this.B();
        }

        @Override // e.g.a.e.b.a
        public /* bridge */ /* synthetic */ boolean k(View view, int i2, int i3, o oVar, e.g.a.e.b<o> bVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z6.W(QueryBrowserActivity.this);
            QueryBrowserActivity.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class d implements m {
        public d() {
        }
    }

    public static void E(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        n6.a();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(activity, QueryBrowserActivity.class));
        activity.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r3v26, types: [android.database.Cursor] */
    @Override // e.g.a.d.l
    public void A(Object obj) {
        String[] strArr;
        int columnIndexOrThrow;
        int i2;
        String[] strArr2;
        String[] strArr3;
        ArrayList<f> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        String str = f3010k;
        this.v = "title_key";
        StringBuilder A = e.a.d.a.a.A("title != ''", " AND is_music=1");
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        ?? r11 = 1;
        if (TextUtils.isEmpty(str)) {
            strArr = null;
        } else {
            e.a.d.a.a.L(A, " AND ", "title", " LIKE ?");
            strArr = new String[]{e.a.d.a.a.l("%", str, "%")};
        }
        Cursor Q = z6.Q(uri, f3009j, A.toString(), strArr, this.v);
        if (Q != null) {
            try {
                if (Q.moveToFirst()) {
                    int columnIndexOrThrow2 = Q.getColumnIndexOrThrow("title");
                    int columnIndexOrThrow3 = Q.getColumnIndexOrThrow("artist");
                    int columnIndexOrThrow4 = Q.getColumnIndexOrThrow("duration");
                    try {
                        columnIndexOrThrow = Q.getColumnIndexOrThrow("audio_id");
                    } catch (IllegalArgumentException unused) {
                        columnIndexOrThrow = Q.getColumnIndexOrThrow("_id");
                    }
                    do {
                        e.a.c.w6.d dVar = new e.a.c.w6.d();
                        dVar.f5210b = Q.getLong(columnIndexOrThrow);
                        dVar.f5212d = Q.getString(columnIndexOrThrow2);
                        dVar.a(Q.getString(columnIndexOrThrow3));
                        try {
                            i2 = Q.getInt(columnIndexOrThrow4) / 1000;
                        } catch (CursorIndexOutOfBoundsException unused2) {
                            i2 = 0;
                        }
                        if (i2 == 0) {
                            dVar.a = "";
                        } else {
                            dVar.a = z6.L(i2);
                        }
                        arrayList2.add(dVar);
                    } while (Q.moveToNext());
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new q(this, (e.a.c.w6.d) it.next(), false, this.f8020d, this));
        }
        ArrayList arrayList3 = new ArrayList();
        String str2 = f3010k;
        String[] strArr4 = {"_id", "artist", "album", "album_art"};
        Uri uri2 = MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            strArr2 = null;
        } else {
            sb.append("album");
            sb.append(" LIKE ?");
            strArr2 = new String[]{e.a.d.a.a.l("%", str2, "%")};
        }
        Q = z6.Q(uri2, strArr4, sb.toString(), strArr2, "album_key");
        int i3 = 2;
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
                        arrayList3.add(aVar);
                    } while (Q.moveToNext());
                }
            } finally {
            }
        }
        i d2 = e.c.a.b.d(this);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList.add(new n(this, (e.a.c.w6.a) it2.next(), false, d2, this.f8020d, this.f3012m));
        }
        ArrayList arrayList4 = new ArrayList();
        String str3 = f3010k;
        String[] strArr5 = {"_id", "artist", "number_of_albums", "number_of_tracks"};
        Uri uri3 = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI;
        StringBuilder sb2 = new StringBuilder();
        if (TextUtils.isEmpty(str3)) {
            strArr3 = null;
        } else {
            sb2.append("artist");
            sb2.append(" LIKE ?");
            strArr3 = new String[]{e.a.d.a.a.l("%", str3, "%")};
        }
        Q = z6.Q(uri3, strArr5, sb2.toString(), strArr3, "artist_key");
        if (Q != null) {
            try {
                if (Q.moveToFirst()) {
                    do {
                        e.a.c.w6.b bVar = new e.a.c.w6.b();
                        bVar.a = Q.getLong(0);
                        bVar.a(Q.getString(1));
                        bVar.f5205b = z6.J(Q.getInt(2), Q.getInt(3), bVar.f5208e.equals(z6.E(R.string.unknown_artist_name)));
                        arrayList4.add(bVar);
                    } while (Q.moveToNext());
                }
            } finally {
            }
        }
        ArrayList arrayList5 = new ArrayList(this.f3013n.size());
        synchronized (this.f3013n) {
            arrayList5.addAll(this.f3013n);
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            e.a.c.w6.b bVar2 = (e.a.c.w6.b) it3.next();
            arrayList.add(new o(this, bVar2, this.f8020d, this.o));
            if (arrayList5.contains(bVar2)) {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr6 = {"_id", "album", "numsongs", "numsongs_by_artist", "album_art"};
                if (v0.d()) {
                    strArr6 = new String[]{"album_id", "album", "numsongs", "numsongs_by_artist", "album_art"};
                }
                Q = z6.Q(MediaStore.Audio.Artists.Albums.getContentUri("external", bVar2.a), strArr6, null, null, "album_key");
                if (Q != 0) {
                    try {
                        if (Q.moveToFirst()) {
                            StringBuilder sb3 = new StringBuilder();
                            while (true) {
                                sb3.setLength(0);
                                e.a.c.w6.a aVar2 = new e.a.c.w6.a();
                                aVar2.f5199b = bVar2;
                                aVar2.f5200c = Q.getLong(0);
                                aVar2.b(Q.getString(r11));
                                if (v0.d()) {
                                    aVar2.a = z6.j(aVar2.f5200c).toString();
                                } else {
                                    aVar2.a = Q.getString(4);
                                }
                                boolean equals = aVar2.f5204g.equals(z6.E(R.string.unknown_album_name));
                                int i4 = Q.getInt(i3);
                                int i5 = Q.getInt(3);
                                if (equals) {
                                    i4 = i5;
                                }
                                if (i4 == i5) {
                                    Object[] objArr = this.q;
                                    objArr[0] = Integer.valueOf(i4);
                                    sb3.append(q1.d(R.plurals.nnnsongs, i4, objArr));
                                } else {
                                    Object[] objArr2 = this.r;
                                    objArr2[0] = Integer.valueOf(i4);
                                    objArr2[r11] = Integer.valueOf(i5);
                                    objArr2[2] = bVar2.f5208e;
                                    sb3.append(q1.d(R.plurals.nnnsongscomp, i4, objArr2));
                                }
                                aVar2.f5202e = sb3.toString();
                                arrayList6.add(aVar2);
                                if (!Q.moveToNext()) {
                                    break;
                                }
                                i3 = 2;
                            }
                        }
                    } finally {
                    }
                }
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    arrayList.add(new n(this, (e.a.c.w6.a) it4.next(), true, d2, this.f8020d, this.f3012m));
                }
            }
            r11 = 1;
            i3 = 2;
        }
        synchronized (this.z) {
            this.z.clear();
            this.z.addAll(arrayList);
        }
        if (!this.y) {
            C(arrayList, false, -1, -1, null);
            return;
        }
        C(arrayList, false, -1, 0, new ArrayList<>());
        this.y = false;
    }

    public int D() {
        return getResources().getColor(R.color.accent);
    }

    public void F(final int i2, final q qVar) {
        j0.c(new j0.b() { // from class: e.a.c.t4
            @Override // e.h.g.j0.b
            public final void a() {
                QueryBrowserActivity queryBrowserActivity = QueryBrowserActivity.this;
                int i3 = i2;
                e.a.c.h7.q qVar2 = qVar;
                Objects.requireNonNull(queryBrowserActivity);
                ArrayList arrayList = new ArrayList(queryBrowserActivity.z.size());
                synchronized (queryBrowserActivity.z) {
                    Iterator<e.g.a.c.f> it = queryBrowserActivity.z.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        e.g.a.c.f next = it.next();
                        if (next.equals(qVar2)) {
                            i3 = i4;
                        }
                        if (next instanceof e.a.c.h7.q) {
                            arrayList.add(Long.valueOf(((e.a.c.h7.q) next).f5093d.f5210b));
                        } else {
                            String str = QueryBrowserActivity.f3010k;
                            if (str != null && str.length() > 1) {
                                arrayList.size();
                            }
                        }
                        i4++;
                    }
                }
                long[] jArr = new long[arrayList.size()];
                Iterator it2 = arrayList.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    jArr[i5] = ((Long) it2.next()).longValue();
                    i5++;
                }
                z6.N(queryBrowserActivity, jArr, i3, false);
            }
        });
    }

    public boolean G() {
        return false;
    }

    @Override // e.g.a.e.b.a
    public void d(e.g.a.e.b<q> bVar) {
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ void g(View view, int i2, int i3, q qVar, e.g.a.e.b<q> bVar) {
        F(i3, qVar);
    }

    @Override // e.a.c.e7
    public boolean h(e.a.c.w6.b bVar) {
        return this.f3013n.contains(bVar);
    }

    @Override // e.g.a.e.b.a
    public /* bridge */ /* synthetic */ boolean k(View view, int i2, int i3, q qVar, e.g.a.e.b<q> bVar) {
        return G();
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
        String str = f3010k;
        if (str == null) {
            return null;
        }
        return str.toUpperCase().toCharArray();
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 11 && i3 == 0) {
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        this.u = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        String str = f3010k;
        if (str != null && str.length() > 0) {
            this.u.B(f3010k, false);
        }
        this.u.setOnQueryTextListener(this);
        this.u.setQueryHint(z6.E(R.string.search_hint));
        this.u.setIconifiedByDefault(false);
        this.u.setIconified(false);
        menu.findItem(R.id.menu_search).setOnActionExpandListener(new c.i.k.l(new d()));
        menu.findItem(R.id.menu_search).expandActionView();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // e.g.a.d.l, c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        z6.a0(this.x);
        j1.q(this, this.t);
        this.s = null;
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override // e.g.a.d.l, c.m.b.o, android.app.Activity
    public void onResume() {
        super.onResume();
        j0.h(new u4(this));
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j0.h(new j0.c() { // from class: e.a.c.v4
            @Override // e.h.g.j0.c
            public final void a() {
                String str;
                QueryBrowserActivity queryBrowserActivity = QueryBrowserActivity.this;
                Objects.requireNonNull(queryBrowserActivity);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
                intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
                intentFilter.addDataScheme(Action.FILE_ATTRIBUTE);
                queryBrowserActivity.registerReceiver(queryBrowserActivity.t, intentFilter);
                Intent intent = queryBrowserActivity.getIntent();
                String action = intent != null ? intent.getAction() : null;
                if ("android.intent.action.VIEW".equals(action)) {
                    Uri data = intent.getData();
                    String uri = data.toString();
                    if (uri.startsWith("content://media/external/audio/media/")) {
                        z6.N(queryBrowserActivity, new long[]{Long.valueOf(data.getLastPathSegment()).longValue()}, 0, false);
                        queryBrowserActivity.finish();
                        return;
                    } else if (uri.startsWith("content://media/external/audio/albums/")) {
                        Intent intent2 = new Intent("android.intent.action.PICK");
                        intent2.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
                        intent2.putExtra("album", Long.valueOf(data.getLastPathSegment()));
                        queryBrowserActivity.startActivity(intent2);
                        queryBrowserActivity.finish();
                        return;
                    } else if (uri.startsWith("content://media/external/audio/artists/")) {
                        Intent intent3 = new Intent("android.intent.action.PICK");
                        intent3.setComponent(new ComponentName("music.musicplayer", AlbumBrowserActivity.class.getName()));
                        intent3.putExtra("artist", data.getLastPathSegment());
                        queryBrowserActivity.startActivity(intent3);
                        queryBrowserActivity.finish();
                        return;
                    }
                }
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("query");
                    if ("android.intent.action.MEDIA_SEARCH".equals(action)) {
                        String stringExtra2 = intent.getStringExtra("android.intent.extra.focus");
                        intent.getStringExtra("android.intent.extra.artist");
                        queryBrowserActivity.p = intent.getStringExtra("android.intent.extra.album");
                        queryBrowserActivity.w = intent.getStringExtra("android.intent.extra.title");
                        if (stringExtra2 != null && ((stringExtra2.startsWith("audio/") && (str = queryBrowserActivity.w) != null) || (!stringExtra2.equals("vnd.android.cursor.item/album") ? !(!stringExtra2.equals("vnd.android.cursor.item/artist") || (str = queryBrowserActivity.p) == null) : (str = queryBrowserActivity.p) != null))) {
                            stringExtra = str;
                        }
                    }
                    if (stringExtra != null && stringExtra.length() > 0) {
                        QueryBrowserActivity.f3010k = stringExtra;
                        SearchView searchView = queryBrowserActivity.u;
                        if (searchView != null) {
                            searchView.B(stringExtra, false);
                        }
                    }
                }
                if (new e.i.a.a(queryBrowserActivity).f8422b.f8428c > 0 && e.h.g.v0.o(queryBrowserActivity)) {
                    z6.H(queryBrowserActivity);
                }
                e.h.g.j0.h(new u4(queryBrowserActivity));
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // e.a.c.e7
    public k1 p() {
        if (this.f3011l == null) {
            this.f3011l = new k1(getResources().getColor(R.color.accent));
        }
        return this.f3011l;
    }

    @Override // e.g.a.d.k
    public void y(Bundle bundle) {
        setVolumeControlStream(3);
        setContentView(R.layout.activity_search);
        this.x = z6.e(this, this);
        this.s = (InputMethodManager) getSystemService("input_method");
        t().y((Toolbar) findViewById(R.id.toolbar));
        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) findViewById(R.id.recyclerview);
        this.f8023g = fastScrollRecyclerView;
        fastScrollRecyclerView.setHasFixedSize(true);
        fastScrollRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        fastScrollRecyclerView.setRecyclerListener(new e.g.a.e.d());
        RecyclerView.e adapter = fastScrollRecyclerView.getAdapter();
        k kVar = this.f8020d;
        if (adapter != kVar) {
            fastScrollRecyclerView.setAdapter(kVar);
        }
        fastScrollRecyclerView.setItemAnimator(new e.g.a.d.m());
        int D = D();
        if (D != -1) {
            fastScrollRecyclerView.setPopupBgColor(D);
            fastScrollRecyclerView.setThumbColor(D);
            fastScrollRecyclerView.setThumbInactiveColor(D);
        }
        c.i.g.b.k("QBA");
    }

    @Override // e.g.a.d.l
    public int z() {
        return 1;
    }
}
