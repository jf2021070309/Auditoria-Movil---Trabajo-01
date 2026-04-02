package e.a.c;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.NetworkOnMainThreadException;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;
import com.android.music.AlbumBrowserActivity;
import com.android.music.ArtistAlbumBrowserActivity;
import com.android.music.MediaPlaybackActivityInternal;
import com.android.music.MediaPlaybackService;
import com.android.music.MusicApp;
import com.android.music.PlaylistBrowserActivity;
import com.android.music.TrackBrowserActivity;
import e.a.c.z6;
import e.h.b.o;
import e.h.f.a;
import e.h.g.j0;
import e.i.a.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class z6 {
    public static final Uri a = Uri.parse("content://media/external/audio/albumart");

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<s6> f5222b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static final long[] f5223c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f5224d = new Object[5];

    /* renamed from: e  reason: collision with root package name */
    public static final BitmapFactory.Options f5225e;

    /* renamed from: f  reason: collision with root package name */
    public static final BitmapFactory.Options f5226f;

    /* renamed from: g  reason: collision with root package name */
    public static final LruCache<Long, BitmapDrawable> f5227g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<String, Uri> f5228h;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f5229i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<Context, d> f5230j;

    /* renamed from: k  reason: collision with root package name */
    public static final StringBuilder f5231k;

    /* renamed from: l  reason: collision with root package name */
    public static final Formatter f5232l;

    /* renamed from: m  reason: collision with root package name */
    public static final int f5233m;

    /* renamed from: n  reason: collision with root package name */
    public static int f5234n;
    public static int o;
    public static int p;
    public static ReentrantLock q;
    public static int r;
    public static int s;
    public static int t;
    public static Bitmap u;
    public static Bitmap v;
    public static long w;
    public static long x;
    public static long y;
    public static long z;

    /* loaded from: classes.dex */
    public class a extends LruCache<Long, BitmapDrawable> {
        public a(int i2) {
            super(i2);
        }

        @Override // android.util.LruCache
        public int sizeOf(Long l2, BitmapDrawable bitmapDrawable) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends DialogFragment {
        public long a;

        @Override // android.app.DialogFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setStyle(1, 0);
        }

        @Override // android.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(R.layout.dialog_get_ringtone, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.positive);
            ((TextView) inflate.findViewById(R.id.negative)).setOnClickListener(new View.OnClickListener() { // from class: e.a.c.i3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z6.b bVar = z6.b.this;
                    z6.V(bVar.getActivity(), bVar.a);
                    bVar.dismiss();
                }
            });
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            Object obj = n6.a;
            e.h.e.g.g("RingtonePlayerAd_show");
            textView.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.j3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z6.b bVar = z6.b.this;
                    if (bVar.getActivity() != null) {
                        z6.I("ringtone.maker");
                    }
                    g7.j("bg", true);
                    Object obj2 = n6.a;
                    e.h.e.g.g("RingtonePlayerAd_clicked");
                    try {
                        bVar.dismiss();
                    } catch (Exception unused) {
                    }
                }
            });
            return inflate;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public long[] a;

        /* renamed from: b  reason: collision with root package name */
        public int f5235b;
    }

    /* loaded from: classes.dex */
    public static class d implements ServiceConnection {
        public ServiceConnection a;

        /* renamed from: b  reason: collision with root package name */
        public s6 f5236b;

        public d(ServiceConnection serviceConnection) {
            this.a = serviceConnection;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
            this.f5236b = new s6(a.AbstractBinderC0175a.R0(iBinder));
            ArrayList<s6> arrayList = z6.f5222b;
            synchronized (arrayList) {
                arrayList.add(this.f5236b);
            }
            e.h.g.j0.c(new j0.b() { // from class: e.a.c.p3
                @Override // e.h.g.j0.b
                public final void a() {
                    z6.d dVar = z6.d.this;
                    ComponentName componentName2 = componentName;
                    IBinder iBinder2 = iBinder;
                    Objects.requireNonNull(dVar);
                    Uri uri = z6.a;
                    try {
                        s6 y = z6.y();
                        if (y != null) {
                            z6.i();
                            int Q = y.f5177b.Q();
                            if (Q != z6.t) {
                                z6.f();
                                z6.t = Q;
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    ServiceConnection serviceConnection = dVar.a;
                    if (serviceConnection != null) {
                        serviceConnection.onServiceConnected(componentName2, iBinder2);
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ServiceConnection serviceConnection = this.a;
            if (serviceConnection != null) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            ArrayList<s6> arrayList = z6.f5222b;
            synchronized (arrayList) {
                s6 s6Var = this.f5236b;
                if (s6Var != null) {
                    arrayList.remove(s6Var);
                }
                this.f5236b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public ContextWrapper a;

        public e(ContextWrapper contextWrapper) {
            this.a = contextWrapper;
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        f5225e = options;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        f5226f = options2;
        f5227g = new a(4194304);
        f5228h = new HashMap<>();
        f5229i = new Object();
        new e.h.g.r0().h();
        f5230j = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        f5231k = sb;
        f5232l = new Formatter(sb, Locale.getDefault());
        f5233m = Color.parseColor("#808080");
        f5234n = 1;
        o = 3;
        p = -1;
        q = new ReentrantLock(true);
        r = -1;
        s = -1;
        t = -1;
        w = -1L;
        x = -1L;
        y = -1L;
        z = -1L;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        options.inDither = false;
        options2.inPreferredConfig = config;
        options2.inDither = false;
    }

    public static long[] A(e.a.c.w6.a aVar) {
        String[] strArr = {"_id", "track"};
        StringBuilder y2 = e.a.d.a.a.y("album_id=");
        y2.append(aVar.f5200c);
        y2.append(" AND ");
        y2.append("is_music");
        y2.append("=1");
        try {
            Cursor Q = Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, y2.toString(), null, "track");
            if (Q != null) {
                if (e.h.g.v0.d()) {
                    long[] jArr = D(Q, 0).a;
                    Q.close();
                    return jArr;
                }
                long[] jArr2 = C(Q, 0).a;
                Q.close();
                return jArr2;
            }
        } catch (IllegalStateException unused) {
        }
        return f5223c;
    }

    public static long[] B(e.a.c.w6.b bVar) {
        String[] strArr = {"_id"};
        StringBuilder y2 = e.a.d.a.a.y("artist_id=");
        y2.append(bVar.a);
        y2.append(" AND ");
        y2.append("is_music");
        y2.append("=1");
        try {
            Cursor Q = Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, y2.toString(), null, "album_key,track");
            if (Q != null) {
                long[] jArr = C(Q, 0).a;
                Q.close();
                return jArr;
            }
        } catch (IllegalStateException unused) {
        }
        return f5223c;
    }

    public static c C(Cursor cursor, int i2) {
        int columnIndexOrThrow;
        c cVar = new c();
        cVar.a = f5223c;
        int i3 = 0;
        cVar.f5235b = 0;
        if (cursor == null) {
            return cVar;
        }
        ArrayList arrayList = new ArrayList();
        int count = cursor.getCount();
        cursor.moveToFirst();
        try {
            columnIndexOrThrow = cursor.getColumnIndexOrThrow("audio_id");
        } catch (IllegalArgumentException unused) {
            columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        }
        int i4 = i2;
        for (int i5 = 0; i5 < count; i5++) {
            long j2 = cursor.getLong(columnIndexOrThrow);
            if (j2 >= 0) {
                arrayList.add(Long.valueOf(j2));
            } else if (i5 < i2) {
                i4--;
            }
            cursor.moveToNext();
        }
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        cVar.a = jArr;
        cVar.f5235b = i4;
        return cVar;
    }

    public static c D(Cursor cursor, int i2) {
        int columnIndexOrThrow;
        c cVar = new c();
        cVar.a = f5223c;
        int i3 = 0;
        cVar.f5235b = 0;
        ArrayList arrayList = new ArrayList();
        int count = cursor.getCount();
        cursor.moveToFirst();
        try {
            columnIndexOrThrow = cursor.getColumnIndexOrThrow("audio_id");
        } catch (IllegalArgumentException unused) {
            columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        }
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("track");
        TreeMap treeMap = new TreeMap();
        int i4 = i2;
        for (int i5 = 0; i5 < count; i5++) {
            long j2 = cursor.getLong(columnIndexOrThrow);
            int i6 = cursor.getInt(columnIndexOrThrow2);
            if (j2 >= 0) {
                treeMap.put(Integer.valueOf(i6), Long.valueOf(j2));
            } else if (i5 < i2) {
                i4--;
            }
            cursor.moveToNext();
        }
        for (Long l2 : treeMap.values()) {
            arrayList.add(l2);
        }
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        cVar.a = jArr;
        cVar.f5235b = i4;
        return cVar;
    }

    public static String E(int i2) {
        Handler handler = e.h.g.x0.a;
        return e.h.g.q1.e(i2);
    }

    public static String F(int i2, Object... objArr) {
        Handler handler = e.h.g.x0.a;
        return e.h.g.q1.f(i2, objArr);
    }

    public static boolean G() {
        s6 z2 = z(0L);
        if (z2 == null) {
            return false;
        }
        try {
            return z2.j();
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
            return false;
        }
    }

    public static boolean H(Context context) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        return !(i2 != i3 && configuration.smallestScreenWidthDp < 600) || i2 < i3;
    }

    public static void I(String str) {
        final String k2 = e.a.d.a.a.k(str, "&referrer=utm_source%3Daudio_player");
        final e.h.g.x0 x0Var = e.h.g.x0.f8405d;
        Object obj = e.h.g.j1.a;
        e.h.g.j0.g(new j0.b() { // from class: e.h.g.z
            @Override // e.h.g.j0.b
            public final void a() {
                j1.g(x0Var, k2);
            }
        });
    }

    public static String J(int i2, int i3, boolean z2) {
        StringBuilder sb = new StringBuilder();
        e.h.g.x0.f8405d.getResources();
        if (z2) {
            String c2 = e.h.g.q1.c(R.plurals.nnnsongs, i3);
            StringBuilder sb2 = f5231k;
            sb2.setLength(0);
            f5232l.format(c2, Integer.valueOf(i3));
            sb.append((CharSequence) sb2);
        } else {
            String c3 = e.h.g.q1.c(R.plurals.nnnalbums, i2);
            StringBuilder sb3 = f5231k;
            sb3.setLength(0);
            f5232l.format(c3, Integer.valueOf(i2));
            sb.append((CharSequence) sb3);
            sb.append(E(R.string.albumsongseparator));
        }
        return sb.toString();
    }

    public static void K(Context context, final SubMenu subMenu) {
        if (context.getContentResolver() == null) {
            return;
        }
        e.h.g.j0.i(new j0.c() { // from class: e.a.c.y3
            @Override // e.h.g.j0.c
            public final void a() {
                final SubMenu subMenu2 = subMenu;
                subMenu2.clear();
                subMenu2.add(1, 12, 0, z6.E(R.string.queue));
                subMenu2.add(1, 4, 0, z6.E(R.string.new_playlist));
                e.h.g.j0.f(new j0.b() { // from class: e.a.c.a4
                    @Override // e.h.g.j0.b
                    public final void a() {
                        final SubMenu subMenu3 = subMenu2;
                        ArrayList<e.h.b.p> q2 = e.h.b.n.q(true);
                        final Intent intent = new Intent();
                        intent.putExtra("playlist", -4L);
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.n3
                            @Override // e.h.g.j0.c
                            public final void a() {
                                SubMenu subMenu4 = subMenu3;
                                subMenu4.add(1, 3, 0, R.string.favorites).setIntent(intent);
                            }
                        });
                        Iterator<e.h.b.p> it = q2.iterator();
                        while (it.hasNext()) {
                            final e.h.b.p next = it.next();
                            final Intent intent2 = new Intent();
                            intent2.putExtra("playlist", next.f8081d);
                            e.h.g.j0.h(new j0.c() { // from class: e.a.c.c4
                                @Override // e.h.g.j0.c
                                public final void a() {
                                    SubMenu subMenu4 = subMenu3;
                                    e.h.b.p pVar = next;
                                    subMenu4.add(1, 3, 0, pVar.f8083f).setIntent(intent2);
                                }
                            });
                        }
                    }
                });
            }
        });
    }

    public static String L(long j2) {
        String E = j2 < 3600 ? E(R.string.durationformatshort) : E(R.string.durationformatlong);
        f5231k.setLength(0);
        Object[] objArr = f5224d;
        objArr[0] = Long.valueOf(j2 / 3600);
        long j3 = j2 / 60;
        objArr[1] = Long.valueOf(j3);
        objArr[2] = Long.valueOf(j3 % 60);
        objArr[3] = Long.valueOf(j2);
        objArr[4] = Long.valueOf(j2 % 60);
        return f5232l.format(E, objArr).toString();
    }

    public static void M(final Activity activity) {
        W(activity);
        a7.e();
        int i2 = e.h.g.t1.a;
        b0(activity, 0, (ImageView) activity.findViewById(R.id.blurred_bg_player_view), true, f5234n);
        e.h.g.j0.g(new j0.b() { // from class: e.a.c.d3
            @Override // e.h.g.j0.b
            public final void a() {
                if (u6.c() || u6.b()) {
                    e.h.e.g.g("lang_bilingual");
                }
            }
        });
        e0(activity);
    }

    public static void N(final Activity activity, final long[] jArr, final int i2, final boolean z2) {
        if (activity == null || activity.isFinishing() || i2 > jArr.length) {
            return;
        }
        e.h.g.r0 r0Var = e.h.e.g.a;
        e.h.g.j0.f(e.h.e.c.a);
        e.h.g.j0.f(new j0.b() { // from class: e.a.c.b4
            @Override // e.h.g.j0.b
            public final void a() {
                Intent flags;
                long e2;
                int I0;
                int i3;
                long[] jArr2 = jArr;
                boolean z3 = z2;
                int i4 = i2;
                Activity activity2 = activity;
                s6 y2 = z6.y();
                if (y2 == null) {
                    e.h.g.t1.j("attempt to play song list, but service is null");
                }
                if (jArr2.length == 0 || y2 == null) {
                    e.h.g.t1.j("attempt to play empty song list");
                    z6.Z(z6.E(R.string.emptyplaylist), 0);
                    return;
                }
                try {
                    try {
                        if (z3) {
                            y2.u(1);
                        } else if (y2.h() == 2) {
                            y2.u(1);
                        }
                        e2 = y2.e();
                        I0 = y2.f5177b.I0();
                        i3 = -1;
                    } catch (Exception e3) {
                        e.h.g.s1.l(e3, true);
                        return;
                    }
                } catch (Exception unused) {
                    flags = new Intent("com.jrtstudio.music.PLAYBACK_VIEWER").setComponent(new ComponentName("music.musicplayer", MediaPlaybackActivityInternal.class.getName())).setFlags(67108864);
                } catch (Throwable th) {
                    try {
                        activity2.startActivity(new Intent("com.jrtstudio.music.PLAYBACK_VIEWER").setComponent(new ComponentName("music.musicplayer", MediaPlaybackActivityInternal.class.getName())).setFlags(67108864));
                    } catch (Exception e4) {
                        e.h.g.s1.l(e4, true);
                    }
                    throw th;
                }
                if (i4 != -1 && I0 == i4 && e2 == jArr2[i4] && Arrays.equals(jArr2, y2.f())) {
                    y2.o();
                    activity2.startActivity(new Intent("com.jrtstudio.music.PLAYBACK_VIEWER").setComponent(new ComponentName("music.musicplayer", MediaPlaybackActivityInternal.class.getName())).setFlags(67108864));
                    return;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                e.h.g.t1.j("sending open playlist to service");
                if (!z3) {
                    i3 = i4;
                }
                y2.l(jArr2, i3);
                e.h.g.t1.j("sent open playlist to service");
                y2.o();
                e.h.g.l0 l2 = c.t.m.l(e.h.g.x0.f8405d);
                if (l2 != null) {
                    e.h.g.l0 l3 = c.t.m.l(e.h.g.x0.f8405d);
                    l2.n("pc", (l3 != null ? l3.e("pc", 0) : 0) + 1);
                }
                Object obj = n6.a;
                if (e.h.g.j1.e()) {
                    e.h.g.j0.g(q.a);
                }
                flags = new Intent("com.jrtstudio.music.PLAYBACK_VIEWER").setComponent(new ComponentName("music.musicplayer", MediaPlaybackActivityInternal.class.getName())).setFlags(67108864);
                activity2.startActivity(flags);
            }
        });
    }

    public static boolean O(Activity activity, long j2) {
        ArrayList<e.h.b.q> s2 = e.h.b.n.s(j2);
        int size = s2.size();
        long[] jArr = new long[size];
        Iterator<e.h.b.q> it = s2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().f8084b;
            i2++;
        }
        if (size > 0) {
            N(activity, jArr, -1, false);
            return true;
        }
        Z(E(R.string.emptyplaylist), 0);
        return false;
    }

    public static void P(Activity activity, View view, int i2) {
        int id = view.getId();
        if (id == i2) {
            return;
        }
        TabWidget tabWidget = (TabWidget) activity.findViewById(R.id.buttonbar);
        a(activity, id);
        if (id != R.id.nowplayingtab) {
            tabWidget.setCurrentTab(((Integer) view.getTag()).intValue());
            g7.l(activity, "activetab", id);
        }
    }

    public static Cursor Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (e.h.g.v0.l()) {
            return R(uri, strArr, str, strArr2, str2, 0);
        }
        return null;
    }

    public static Cursor R(Uri uri, String[] strArr, String str, String[] strArr2, String str2, int i2) {
        try {
            ContentResolver contentResolver = e.h.g.x0.f8405d.getContentResolver();
            if (contentResolver == null) {
                return null;
            }
            if (i2 > 0) {
                Uri.Builder buildUpon = uri.buildUpon();
                uri = buildUpon.appendQueryParameter("limit", "" + i2).build();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (SQLiteException | IllegalStateException | SecurityException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static void S(final ImageView imageView, View view, final Bitmap bitmap) {
        e.h.g.j0.h(new j0.c() { // from class: e.a.c.q3
            @Override // e.h.g.j0.c
            public final void a() {
                ImageView imageView2 = imageView;
                View view2 = r2;
                Bitmap bitmap2 = bitmap;
                int i2 = e.h.g.t1.a;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap2);
                bitmapDrawable.setColorFilter(Color.rgb(0, 0, 0), PorterDuff.Mode.DST_ATOP);
                bitmapDrawable.setAlpha(175);
                if (imageView2 != null) {
                    imageView2.setImageDrawable(bitmapDrawable);
                } else if (view2 != null) {
                    view2.setBackground(bitmapDrawable);
                }
            }
        });
    }

    public static void T(final Menu menu) {
        e.h.g.j0.f(new j0.b() { // from class: e.a.c.z3
            @Override // e.h.g.j0.b
            public final void a() {
                final Menu menu2 = menu;
                try {
                    final int u2 = z6.u();
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.l3
                        @Override // e.h.g.j0.c
                        public final void a() {
                            Menu menu3 = menu2;
                            int i2 = u2;
                            MenuItem findItem = menu3.findItem(8);
                            if (findItem != null) {
                                if (i2 == 2) {
                                    findItem.setIcon(R.drawable.ic_menu_party_shuffle);
                                    findItem.setTitle(z6.E(R.string.party_shuffle_off));
                                    return;
                                }
                                findItem.setIcon(R.drawable.ic_menu_party_shuffle);
                                findItem.setTitle(z6.E(R.string.party_shuffle));
                            }
                        }
                    });
                } catch (Exception e2) {
                    e.h.g.s1.l(e2, true);
                }
            }
        });
    }

    public static void U(final Activity activity, final long j2) {
        s6 y2;
        if (Thread.currentThread().getId() == MusicApp.o) {
            e.h.g.j0.f(new j0.b() { // from class: e.a.c.m3
                @Override // e.h.g.j0.b
                public final void a() {
                    z6.U(activity, j2);
                }
            });
        } else if (activity == null || activity.isFinishing()) {
            V(activity, j2);
        } else {
            final String w2 = w(j2);
            if (!e.h.g.n1.b(activity)) {
                MusicApp.p.post(new Runnable() { // from class: e.a.c.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Activity activity2 = activity;
                        long j3 = j2;
                        try {
                            if (activity2.isFinishing()) {
                                z6.U(activity2, j3);
                            } else {
                                z6.b bVar = new z6.b();
                                bVar.a = j3;
                                bVar.show(activity2.getFragmentManager(), "dialog");
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                });
                return;
            }
            try {
                y2 = y();
            } catch (Throwable unused) {
            }
            if (y2 == null) {
                return;
            }
            y2.n();
            final Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j2);
            e.h.g.j0.f(new j0.b() { // from class: e.h.g.f0
                @Override // e.h.g.j0.b
                public final void a() {
                    String str = w2;
                    Uri uri = withAppendedId;
                    Uri uri2 = r3;
                    String str2 = r4;
                    String str3 = r5;
                    String str4 = r6;
                    String str5 = r7;
                    Activity activity2 = activity;
                    try {
                        e.j.d.j.b();
                        Intent intent = new Intent("android.intent.action.EDIT", Uri.parse(str));
                        intent.setClassName("ringtone.maker", "com.jrtstudio.ringtone.ActivityRingtoneEditMusic");
                        if (uri != null) {
                            intent.putExtra("uri", uri.toString());
                        }
                        if (uri2 != null) {
                            x0.f8405d.grantUriPermission("ringtone.maker", uri2, 3);
                            intent.putExtra("furi", uri2.toString());
                        }
                        intent.putExtra("title", str2);
                        intent.putExtra("artist", str3);
                        intent.putExtra("mime", str4);
                        intent.putExtra("fileName", str5);
                        activity2.startActivity(intent);
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
            });
        }
    }

    public static void V(Activity activity, long j2) {
        boolean z2;
        o.b bVar = e.h.b.o.a;
        Object obj = e.h.g.j1.a;
        if (!e.h.g.v0.h() || Settings.System.canWrite(activity)) {
            z2 = true;
        } else {
            try {
                e.j.d.j.b();
                Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                intent.setData(Uri.parse("package:" + e.h.g.x0.f8405d.getPackageName()));
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
            z2 = false;
        }
        String str = null;
        if (z2) {
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            ContentResolver contentResolver = activity.getContentResolver();
            Uri withAppendedId = ContentUris.withAppendedId(uri, j2);
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("is_ringtone", "1");
                contentValues.put("is_alarm", "1");
                contentResolver.update(withAppendedId, contentValues, null, null);
            } catch (UnsupportedOperationException unused2) {
                e.h.g.s1.c("couldn't set ringtone flag for id " + j2);
            } catch (Exception e2) {
                e.h.g.s1.l(e2, true);
            }
            Cursor n2 = e.h.b.o.n(uri, new String[]{"_id", "_data", "title"}, e.a.d.a.a.h("_id=", j2), null, null);
            if (n2 != null) {
                try {
                    if (n2.moveToFirst()) {
                        RingtoneManager.setActualDefaultRingtoneUri(activity, 1, withAppendedId);
                        str = n2.getString(2);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        Z(F(R.string.ringtone_set, str), 0);
    }

    public static void W(final Activity activity) {
        e.h.g.j0.f(new j0.b() { // from class: e.a.c.s3
            @Override // e.h.g.j0.b
            public final void a() {
                final Activity activity2 = activity;
                try {
                    Cursor Q = z6.Q(MediaStore.getMediaScannerUri(), new String[]{"volume"}, null, null, null);
                    boolean z2 = false;
                    if (Q != null) {
                        if (Q.getCount() == 1) {
                            Q.moveToFirst();
                            z2 = "external".equals(Q.getString(0));
                        }
                        Q.close();
                    }
                    if (z2) {
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.g3
                            @Override // e.h.g.j0.c
                            public final void a() {
                                Activity activity3 = activity2;
                                try {
                                    activity3.getWindow().setFeatureInt(5, -3);
                                    activity3.getWindow().setFeatureInt(5, -1);
                                } catch (Exception e2) {
                                    e.h.g.s1.l(e2, true);
                                }
                            }
                        });
                    } else {
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.r3
                            @Override // e.h.g.j0.c
                            public final void a() {
                                try {
                                    activity2.getWindow().setFeatureInt(5, -2);
                                } catch (Exception e2) {
                                    e.h.g.s1.l(e2, true);
                                }
                            }
                        });
                    }
                } catch (Exception e2) {
                    e.h.g.s1.l(e2, true);
                }
            }
        });
    }

    public static void X(TextView textView) {
        if (textView != null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setSelected(true);
        }
    }

    public static void Y(Activity activity, Cursor cursor) {
        e.h.g.t1.j("Starting playlist building");
        c C = C(cursor, 0);
        e.h.g.t1.j("Built playlist ids");
        N(activity, C.a, C.f5235b, true);
    }

    public static void Z(final String str, final int i2) {
        e.h.g.j0.h(new j0.c() { // from class: e.a.c.h4
            @Override // e.h.g.j0.c
            public final void a() {
                Toast.makeText(e.h.g.x0.f8405d, str, i2).show();
            }
        });
    }

    public static void a(Activity activity, int i2) {
        Intent intent = new Intent("android.intent.action.PICK");
        switch (i2) {
            case R.id.albumtab /* 2131296347 */:
                intent.setComponent(new ComponentName("music.musicplayer", AlbumBrowserActivity.class.getName()));
                break;
            case R.id.artisttab /* 2131296365 */:
                intent.setComponent(new ComponentName("music.musicplayer", ArtistAlbumBrowserActivity.class.getName()));
                break;
            case R.id.nowplayingtab /* 2131296718 */:
                activity.startActivity(new Intent(activity, MediaPlaybackActivityInternal.class));
                return;
            case R.id.playlisttab /* 2131296753 */:
                intent.setComponent(new ComponentName("music.musicplayer", PlaylistBrowserActivity.class.getName()));
                break;
            case R.id.songtab /* 2131296856 */:
                intent.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
                break;
            default:
                return;
        }
        intent.putExtra("withtabs", true);
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
        try {
            Class cls = Integer.TYPE;
            Activity.class.getMethod("overridePendingTransition", cls, cls).invoke(activity, 0, 0);
        } catch (Throwable unused) {
        }
    }

    public static void a0(e eVar) {
        if (eVar == null) {
            e.h.g.t1.c("Trying to unbind with null token");
            return;
        }
        e.h.g.t1.c("Unbind from service");
        ContextWrapper contextWrapper = eVar.a;
        HashMap<Context, d> hashMap = f5230j;
        d remove = hashMap.remove(contextWrapper);
        if (remove == null) {
            e.h.g.t1.c("Trying to unbind for unknown Context");
            return;
        }
        contextWrapper.unbindService(remove);
        if (hashMap.isEmpty()) {
            ArrayList<s6> arrayList = f5222b;
            synchronized (arrayList) {
                e.h.g.t1.c("clear binding list");
                s6 x2 = x();
                arrayList.clear();
                if (x2 != null) {
                    arrayList.add(x2);
                }
            }
        }
    }

    public static void b(long[] jArr) {
        s6 y2 = y();
        if (y2 == null) {
            return;
        }
        try {
            y2.b(jArr, 3);
            Z(e.h.g.q1.c(R.plurals.nnntrackstoplaylist, jArr.length), 0);
        } catch (Exception unused) {
        }
    }

    public static void b0(final Activity activity, final int i2, final ImageView imageView, boolean z2, final int i3) {
        if (activity == null || activity.isFinishing() || imageView == null) {
            return;
        }
        e.h.g.j0.f(new j0.b() { // from class: e.a.c.e3
            @Override // e.h.g.j0.b
            public final void a() {
                s6 z3;
                Bitmap bitmap;
                int i4 = i3;
                Activity activity2 = activity;
                int i5 = i2;
                ImageView imageView2 = imageView;
                boolean z4 = r5;
                ReentrantLock reentrantLock = z6.q;
                reentrantLock.lock();
                try {
                    int i6 = e.h.g.t1.a;
                    if (i4 == 0) {
                        z3 = null;
                    } else if (i4 == z6.f5234n) {
                        z3 = z6.z(0L);
                        if (z3 == null) {
                            z6.b0(activity2, i5, imageView2, z4, z6.o);
                        }
                    } else {
                        z3 = z6.z(TimeUnit.SECONDS.toMillis(5L));
                    }
                    if (z3 != null) {
                        try {
                            long e2 = z3.e();
                            if (e2 != -1) {
                                z6.y = e2;
                            }
                            long c2 = z3.c();
                            if (c2 != -1) {
                                z6.z = c2;
                            }
                        } catch (Exception e3) {
                            e.h.g.s1.l(e3, true);
                        }
                    }
                    if (z6.y != -1) {
                        synchronized (z6.f5229i) {
                            bitmap = z6.v;
                            if (bitmap != null) {
                                long j2 = z6.x;
                                if (j2 == -1 || z6.z != j2) {
                                    long j3 = z6.w;
                                    if (j3 != -1 && z6.y == j3) {
                                    }
                                }
                            }
                            bitmap = null;
                        }
                    } else {
                        synchronized (z6.f5229i) {
                            bitmap = z6.u;
                            if (bitmap == null) {
                                bitmap = null;
                            }
                        }
                    }
                    if (bitmap != null) {
                        z6.S(imageView2, null, bitmap);
                    } else {
                        try {
                            long j4 = z6.y;
                            long j5 = z6.z;
                            if (j4 == -1 && j5 == -1) {
                                Bitmap v2 = z6.v(activity2);
                                if (v2 != null) {
                                    z6.u = z6.q(v2);
                                }
                                Bitmap bitmap2 = z6.u;
                                if (bitmap2 != null) {
                                    z6.S(imageView2, null, bitmap2);
                                }
                            }
                            Bitmap m2 = z6.m(activity2, j4, j5, false);
                            if (m2 == null) {
                                m2 = z6.m(activity2, z6.y, -1L, false);
                            }
                            if (m2 == null && z3 != null && z3.c() != -1) {
                                m2 = z6.o(z6.z, z6.r(), z6.r());
                            }
                            if (m2 == null) {
                                Bitmap bitmap3 = z6.u;
                                if (bitmap3 != null) {
                                    z6.S(imageView2, null, bitmap3);
                                } else {
                                    Bitmap q2 = z6.q(z6.v(activity2));
                                    z6.u = q2;
                                    if (q2 != null) {
                                        z6.S(imageView2, null, q2);
                                    }
                                }
                            } else {
                                Bitmap q3 = z6.q(m2);
                                synchronized (z6.f5229i) {
                                    z6.v = q3;
                                    z6.x = z6.z;
                                    z6.w = z6.y;
                                }
                                if (q3 != null) {
                                    z6.S(imageView2, null, q3);
                                }
                            }
                        } catch (Exception e4) {
                            e.h.g.s1.l(e4, true);
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
    }

    public static void c(c.b.c.l lVar, long[] jArr, long j2) {
        if (jArr == null) {
            e.h.g.s1.c("ListSelection null");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(jArr.length);
            for (long j3 : jArr) {
                arrayList.add(Long.valueOf(j3));
            }
            if (e.h.b.n.b(e.h.g.v0.d(), arrayList, j2)) {
                Z(e.h.g.q1.c(R.plurals.nnntrackstoplaylist, jArr.length), 0);
                c.i.g.h.A(lVar);
            }
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public static void c0(Activity activity, int i2, ImageView imageView) {
        Bitmap bitmap;
        if (activity.isFinishing() || imageView == null || (bitmap = v) == null) {
            return;
        }
        S(imageView, null, bitmap);
    }

    public static long[] d(ArrayList<e.a.c.w6.d> arrayList) {
        long[] jArr = new long[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr[i2] = arrayList.get(i2).f5210b;
        }
        return jArr;
    }

    public static boolean d0(Activity activity, int i2) {
        final TabWidget tabWidget = (TabWidget) activity.findViewById(R.id.buttonbar);
        Intent intent = activity.getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("withtabs", false) : false;
        h(tabWidget, R.id.artistTabTxt, R.string.artists_title, true);
        h(tabWidget, R.id.songTabTxt, R.string.tracks_title, true);
        h(tabWidget, R.id.albumTabTxt, R.string.albums_title, true);
        h(tabWidget, R.id.playlistTabTxt, R.string.playlists_title, true);
        h(tabWidget, R.id.nowplayingTabTxt, R.string.nowplaying_title, true);
        if (i2 == 0 || !booleanExtra) {
            tabWidget.setVisibility(8);
            return booleanExtra;
        }
        if (booleanExtra) {
            tabWidget.setVisibility(0);
        }
        for (int childCount = tabWidget.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = tabWidget.getChildAt(childCount);
            if (childAt.getId() == i2) {
                tabWidget.setCurrentTab(childCount);
                p = childCount;
            }
            childAt.setTag(Integer.valueOf(childCount));
            childAt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: e.a.c.v3
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) {
                    TabWidget tabWidget2 = tabWidget;
                    if (z2) {
                        for (int i3 = 0; i3 < tabWidget2.getTabCount(); i3++) {
                            if (tabWidget2.getChildTabViewAt(i3) == view) {
                                tabWidget2.setCurrentTab(i3);
                                z6.P((Activity) tabWidget2.getContext(), view, tabWidget2.getChildAt(z6.p).getId());
                                return;
                            }
                        }
                    }
                }
            });
            childAt.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.d4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TabWidget tabWidget2 = tabWidget;
                    z6.P((Activity) tabWidget2.getContext(), view, tabWidget2.getChildAt(z6.p).getId());
                }
            });
        }
        return booleanExtra;
    }

    public static e e(Activity activity, ServiceConnection serviceConnection) {
        ContextWrapper contextWrapper;
        d dVar;
        try {
            e.h.g.t1.c("attempting to bind to service with " + serviceConnection);
            Activity parent = activity.getParent();
            if (parent != null) {
                activity = parent;
            }
            contextWrapper = new ContextWrapper(activity);
            contextWrapper.startService(new Intent(contextWrapper, MediaPlaybackService.class));
            dVar = new d(serviceConnection);
        } catch (IllegalStateException e2) {
            e.h.g.s1.l(e2, true);
        }
        if (contextWrapper.bindService(new Intent().setClass(contextWrapper, MediaPlaybackService.class), dVar, 0)) {
            f5230j.put(contextWrapper, dVar);
            e.h.g.t1.c("bound and put in connection map");
            return new e(contextWrapper);
        }
        e.h.g.t1.c("failed to bind2");
        e.h.g.t1.c("Failed to bind to service");
        return null;
    }

    public static void e0(final Activity activity) {
        e.h.g.j0.h(new j0.c() { // from class: e.a.c.u3
            @Override // e.h.g.j0.c
            public final void a() {
                final Activity activity2 = activity;
                final View findViewById = activity2.findViewById(R.id.nowplaying);
                if (findViewById == null) {
                    return;
                }
                if ((activity2 instanceof TrackBrowserActivity) && ((TrackBrowserActivity) activity2).r) {
                    findViewById.setVisibility(8);
                    return;
                }
                final boolean[] zArr = {false};
                try {
                    View findViewById2 = findViewById.findViewById(R.id.menu_button);
                    if (findViewById2 != null) {
                        if (activity2 instanceof TrackBrowserActivity) {
                            TrackBrowserActivity trackBrowserActivity = (TrackBrowserActivity) activity2;
                            if (trackBrowserActivity.s == 0 && trackBrowserActivity.u == null && trackBrowserActivity.t == null && trackBrowserActivity.v == null) {
                                zArr[0] = true;
                                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.w3
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        activity2.openOptionsMenu();
                                    }
                                });
                            }
                            findViewById2.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((ImageView) findViewById.findViewById(R.id.icon)).getLayoutParams();
                            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, (int) (e.h.g.v0.c(e.h.g.x0.f8405d) * 8.0f), layoutParams.bottomMargin);
                        } else {
                            if (!(activity2 instanceof ArtistAlbumBrowserActivity) && !(activity2 instanceof AlbumBrowserActivity) && !(activity2 instanceof PlaylistBrowserActivity)) {
                                findViewById2.setVisibility(8);
                            }
                            zArr[0] = true;
                            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.g4
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    activity2.openOptionsMenu();
                                }
                            });
                        }
                    }
                    final s6 y2 = z6.y();
                    if (y2 != null) {
                        e.h.g.j0.f(new j0.b() { // from class: e.a.c.f3
                            @Override // e.h.g.j0.b
                            public final void a() {
                                s6 s6Var = s6.this;
                                final View view = findViewById;
                                final boolean[] zArr2 = zArr;
                                try {
                                    if (s6Var.e() != -1) {
                                        final String i2 = s6Var.i();
                                        final String d2 = s6Var.d();
                                        e.h.g.s1.c("TITLE_ARTIST = " + i2 + " - " + d2);
                                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.o3
                                            @Override // e.h.g.j0.c
                                            public final void a() {
                                                View view2 = view;
                                                String str = i2;
                                                String str2 = d2;
                                                boolean[] zArr3 = zArr2;
                                                TextView textView = (TextView) view2.findViewById(R.id.artist);
                                                ((TextView) view2.findViewById(R.id.title)).setText(str);
                                                if ("".equals(str2)) {
                                                    str2 = z6.E(R.string.unknown_artist_name);
                                                }
                                                textView.setText(str2);
                                                view2.setVisibility(0);
                                                zArr3[0] = true;
                                                view2.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.k3
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view3) {
                                                        Uri uri = z6.a;
                                                        Context context = view3.getContext();
                                                        context.startActivity(new Intent(context, MediaPlaybackActivityInternal.class));
                                                    }
                                                });
                                            }
                                        });
                                    }
                                } catch (RemoteException e2) {
                                    e.h.g.s1.l(e2, true);
                                } catch (NullPointerException e3) {
                                    e.h.g.s1.l(e3, true);
                                }
                            }
                        });
                    }
                } catch (Exception e2) {
                    e.h.g.s1.l(e2, true);
                }
                if (zArr[0]) {
                    findViewById.setVisibility(0);
                } else {
                    findViewById.setVisibility(8);
                }
            }
        });
    }

    public static void f() {
        LruCache<Long, BitmapDrawable> lruCache = f5227g;
        synchronized (lruCache) {
            lruCache.evictAll();
            f5228h.clear();
        }
    }

    public static void g(Activity activity) {
        if (!e.h.g.v0.i()) {
            View findViewById = activity.findViewById(R.id.nav_padding);
            if (findViewById != null) {
                a.b bVar = new e.i.a.a(activity).f8422b;
                int i2 = bVar.f8428c;
                if (i2 > 0 && e.h.g.v0.o(activity) && !H(activity)) {
                    i2 = 0;
                }
                if (i2 > 0) {
                    findViewById.setMinimumHeight(i2);
                    findViewById.setVisibility(0);
                } else {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = activity.findViewById(R.id.stat_padding);
                if (findViewById2 != null) {
                    findViewById2.setMinimumHeight(bVar.a);
                    return;
                }
                return;
            }
            return;
        }
        boolean isInMultiWindowMode = activity.isInMultiWindowMode();
        e.h.g.v0.a(activity, false);
        e.h.g.v0.b(activity, false);
        if (isInMultiWindowMode) {
            View findViewById3 = activity.findViewById(R.id.nav_padding);
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            View findViewById4 = activity.findViewById(R.id.stat_padding);
            if (findViewById4 != null) {
                findViewById4.setVisibility(8);
                return;
            }
            return;
        }
        View findViewById5 = activity.findViewById(R.id.nav_padding);
        if (findViewById5 != null) {
            a.b bVar2 = new e.i.a.a(activity).f8422b;
            int i3 = bVar2.f8428c;
            if (i3 > 0 && e.h.g.v0.o(activity) && !H(activity)) {
                i3 = 0;
            }
            if (i3 > 0) {
                findViewById5.setMinimumHeight(i3);
                findViewById5.setVisibility(0);
            } else {
                findViewById5.setVisibility(8);
            }
            View findViewById6 = activity.findViewById(R.id.stat_padding);
            if (findViewById6 != null) {
                findViewById6.setMinimumHeight(bVar2.a);
            }
        }
    }

    public static void h(TabWidget tabWidget, int i2, int i3, boolean z2) {
        TextView textView = (TextView) tabWidget.findViewById(i2);
        if (textView != null) {
            String E = E(i3);
            if (z2) {
                E = E.toUpperCase(Locale.US);
            }
            textView.setText(E);
            if (Build.VERSION.SDK_INT >= 27) {
                textView.setAutoSizeTextTypeUniformWithConfiguration(8, 14, 1, 2);
            } else if (textView instanceof c.i.l.b) {
                ((c.i.l.b) textView).setAutoSizeTextTypeUniformWithConfiguration(8, 14, 1, 2);
            }
        }
    }

    public static void i() {
        if (Thread.currentThread().getId() == MusicApp.o) {
            NetworkOnMainThreadException networkOnMainThreadException = new NetworkOnMainThreadException();
            c.i.g.b.l(networkOnMainThreadException);
            e.h.g.s1.l(networkOnMainThreadException, true);
        }
    }

    public static Uri j(long j2) {
        return ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[] k() {
        /*
            r0 = 0
            android.net.Uri r1 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.IllegalStateException -> L3c
            java.lang.String r2 = "_id"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.IllegalStateException -> L3c
            java.lang.String r3 = "is_music=1"
            android.database.Cursor r1 = Q(r1, r2, r3, r0, r0)     // Catch: java.lang.IllegalStateException -> L3c
            if (r1 == 0) goto L37
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L18
            goto L37
        L18:
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L32
            long[] r3 = new long[r2]     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r5 = 0
        L20:
            if (r5 >= r2) goto L2e
            r1.moveToNext()     // Catch: java.lang.Throwable -> L32
            long r6 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L32
            r3[r5] = r6     // Catch: java.lang.Throwable -> L32
            int r5 = r5 + 1
            goto L20
        L2e:
            r1.close()     // Catch: java.lang.IllegalStateException -> L3c
            return r3
        L32:
            r2 = move-exception
            r1.close()     // Catch: java.lang.IllegalStateException -> L3c
            throw r2     // Catch: java.lang.IllegalStateException -> L3c
        L37:
            if (r1 == 0) goto L3c
            r1.close()     // Catch: java.lang.IllegalStateException -> L3c
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.c.z6.k():long[]");
    }

    public static Bitmap l(Context context, long j2, long j3) {
        return m(context, j2, j3, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static Bitmap m(Context context, long j2, long j3, boolean z2) {
        InputStream inputStream;
        Bitmap n2;
        if (j3 < 0) {
            if (j2 < 0 || (n2 = n(context, j2, -1L)) == null) {
                if (z2) {
                    return v(context);
                }
                return null;
            }
            return n2;
        }
        ?? contentResolver = context.getContentResolver();
        Uri j4 = j(j3);
        try {
            if (j4 != null) {
                try {
                    inputStream = contentResolver.openInputStream(j4);
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, f5226f);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        return decodeStream;
                    } catch (FileNotFoundException unused2) {
                        Bitmap n3 = n(context, j2, j3);
                        if (n3 != null) {
                            if (n3.getConfig() == null && (n3 = n3.copy(Bitmap.Config.RGB_565, false)) == null && z2) {
                                Bitmap v2 = v(context);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                return v2;
                            }
                        } else if (z2) {
                            n3 = v(context);
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        return n3;
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused5) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        f5228h.put("song" + j2, Uri.EMPTY);
                        return null;
                    }
                } catch (FileNotFoundException unused7) {
                    inputStream = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException unused8) {
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    contentResolver = 0;
                    if (contentResolver != 0) {
                        try {
                            contentResolver.close();
                        } catch (IOException unused9) {
                        }
                    }
                    throw th;
                }
            }
            f5228h.put("song" + j2, Uri.EMPTY);
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap n(Context context, long j2, long j3) {
        if (j3 >= 0 || j2 >= 0) {
            Bitmap bitmap = null;
            try {
                if (j3 < 0) {
                    Uri parse = Uri.parse("content://media/external/audio/media/" + j2 + "/albumart");
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(parse, "r");
                    if (openFileDescriptor != null) {
                        bitmap = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                        HashMap<String, Uri> hashMap = f5228h;
                        hashMap.put("song" + j2, parse);
                    }
                } else {
                    Uri withAppendedId = ContentUris.withAppendedId(a, j3);
                    ParcelFileDescriptor openFileDescriptor2 = context.getContentResolver().openFileDescriptor(withAppendedId, "r");
                    if (openFileDescriptor2 != null) {
                        bitmap = BitmapFactory.decodeFileDescriptor(openFileDescriptor2.getFileDescriptor());
                        HashMap<String, Uri> hashMap2 = f5228h;
                        hashMap2.put("song" + j2, withAppendedId);
                    }
                }
            } catch (Throwable unused) {
            }
            return bitmap;
        }
        throw new IllegalArgumentException("Must specify an album or a song id");
    }

    public static Bitmap o(long j2, int i2, int i3) {
        ParcelFileDescriptor parcelFileDescriptor;
        int i4 = i2 - 1;
        try {
            ContentResolver contentResolver = e.h.g.x0.f8405d.getContentResolver();
            Uri withAppendedId = ContentUris.withAppendedId(a, j2);
            if (withAppendedId != null) {
                try {
                    parcelFileDescriptor = contentResolver.openFileDescriptor(withAppendedId, "r");
                } catch (Throwable unused) {
                    parcelFileDescriptor = null;
                }
                try {
                    BitmapFactory.Options options = f5225e;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
                    int i5 = options.outWidth >> 1;
                    int i6 = 1;
                    for (int i7 = options.outHeight >> 1; i5 > i4 && i7 > i3; i7 >>= 1) {
                        i6 <<= 1;
                        i5 >>= 1;
                    }
                    BitmapFactory.Options options2 = f5225e;
                    options2.inSampleSize = i6;
                    options2.inJustDecodeBounds = false;
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options2);
                    if (decodeFileDescriptor != null && (options2.outWidth != i4 || options2.outHeight != i3)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFileDescriptor, i4, i3, true);
                        if (createScaledBitmap != decodeFileDescriptor) {
                            decodeFileDescriptor.recycle();
                        }
                        decodeFileDescriptor = createScaledBitmap;
                    }
                    f5228h.put("album" + j2, withAppendedId);
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused2) {
                    }
                    return decodeFileDescriptor;
                } catch (Throwable unused3) {
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    return null;
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    public static Uri p(long j2, long j3) {
        Uri uri;
        if (j3 > -1) {
            HashMap<String, Uri> hashMap = f5228h;
            uri = hashMap.get("album" + j3);
        } else {
            uri = null;
        }
        if (uri != null || j2 <= -1) {
            return uri;
        }
        HashMap<String, Uri> hashMap2 = f5228h;
        return hashMap2.get("song" + j2);
    }

    public static Bitmap q(Bitmap bitmap) {
        boolean z2;
        Bitmap bitmap2;
        int i2;
        int[] iArr;
        Bitmap bitmap3 = bitmap;
        if (bitmap3 != null) {
            if (s == -1) {
                int max = Math.max(20, e.h.g.v0.b(e.h.g.x0.f8405d, true) / 100);
                s = max;
                s = Math.min(max, 25);
            }
            if (bitmap.getWidth() > r() && bitmap.getHeight() > r()) {
                bitmap3 = Bitmap.createScaledBitmap(bitmap3, r(), r(), false);
            }
            e.h.g.x0 x0Var = e.h.g.x0.f8405d;
            int i3 = s;
            if (bitmap3 != null) {
                try {
                    try {
                        Bitmap.Config config = bitmap3.getConfig();
                        if (config != null) {
                            if (config == Bitmap.Config.RGB_565) {
                                bitmap3 = e.d.b.d.a.s(bitmap3, Bitmap.Config.ARGB_8888);
                                config = bitmap3.getConfig();
                            }
                            Bitmap copy = bitmap3.copy(config, true);
                            try {
                            } catch (Throwable th) {
                                e.h.g.s1.l(th, true);
                            }
                            if (e.h.g.v0.g() && config != Bitmap.Config.RGB_565) {
                                WeakReference<RenderScript> weakReference = e.d.b.d.a.f6310b;
                                RenderScript renderScript = weakReference != null ? weakReference.get() : null;
                                if (renderScript == null) {
                                    renderScript = RenderScript.create(x0Var.getApplicationContext());
                                    e.d.b.d.a.f6310b = new WeakReference<>(renderScript);
                                }
                                Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap3);
                                Allocation createFromBitmap2 = Allocation.createFromBitmap(renderScript, copy);
                                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                                i3 /= 2;
                                create.setRadius(i3);
                                create.setInput(createFromBitmap);
                                create.forEach(createFromBitmap2);
                                createFromBitmap2.copyTo(copy);
                                bitmap2 = copy;
                                return bitmap2;
                            }
                            if (i3 >= 1) {
                                int width = copy.getWidth();
                                int height = copy.getHeight();
                                int i4 = width * height;
                                int[] iArr2 = new int[i4];
                                copy.getPixels(iArr2, 0, width, 0, 0, width, height);
                                int i5 = width - 1;
                                int i6 = height - 1;
                                int i7 = i3 + i3 + 1;
                                int[] iArr3 = new int[i4];
                                int[] iArr4 = new int[i4];
                                int[] iArr5 = new int[i4];
                                int[] iArr6 = new int[Math.max(width, height)];
                                int i8 = (i7 + 1) >> 1;
                                int i9 = i8 * i8;
                                int i10 = i9 * 256;
                                int[] iArr7 = new int[i10];
                                for (int i11 = 0; i11 < i10; i11++) {
                                    iArr7[i11] = i11 / i9;
                                }
                                int[][] iArr8 = (int[][]) Array.newInstance(int.class, i7, 3);
                                int i12 = i3 + 1;
                                int i13 = 0;
                                int i14 = 0;
                                int i15 = 0;
                                while (i13 < height) {
                                    int i16 = -i3;
                                    int i17 = 0;
                                    int i18 = 0;
                                    int i19 = 0;
                                    int i20 = 0;
                                    int i21 = 0;
                                    int i22 = 0;
                                    int i23 = 0;
                                    int i24 = 0;
                                    int i25 = 0;
                                    while (i16 <= i3) {
                                        int i26 = height;
                                        Bitmap bitmap4 = copy;
                                        int i27 = iArr2[i14 + Math.min(i5, Math.max(i16, 0))];
                                        int[] iArr9 = iArr8[i16 + i3];
                                        iArr9[0] = (i27 & 16711680) >> 16;
                                        iArr9[1] = (i27 & 65280) >> 8;
                                        iArr9[2] = i27 & 255;
                                        int abs = i12 - Math.abs(i16);
                                        i17 = (iArr9[0] * abs) + i17;
                                        i18 = (iArr9[1] * abs) + i18;
                                        i19 = (iArr9[2] * abs) + i19;
                                        if (i16 > 0) {
                                            i21 += iArr9[0];
                                            i23 += iArr9[1];
                                            i25 += iArr9[2];
                                        } else {
                                            i20 += iArr9[0];
                                            i22 += iArr9[1];
                                            i24 += iArr9[2];
                                        }
                                        i16++;
                                        copy = bitmap4;
                                        height = i26;
                                    }
                                    int i28 = height;
                                    Bitmap bitmap5 = copy;
                                    int i29 = i3;
                                    int i30 = 0;
                                    while (i30 < width) {
                                        iArr3[i14] = iArr7[i17];
                                        iArr4[i14] = iArr7[i18];
                                        iArr5[i14] = iArr7[i19];
                                        int i31 = i17 - i20;
                                        int i32 = i18 - i22;
                                        int i33 = i19 - i24;
                                        int[] iArr10 = iArr8[((i29 - i3) + i7) % i7];
                                        int i34 = i20 - iArr10[0];
                                        int i35 = i22 - iArr10[1];
                                        int i36 = i24 - iArr10[2];
                                        if (i13 == 0) {
                                            iArr = iArr7;
                                            iArr6[i30] = Math.min(i30 + i3 + 1, i5);
                                        } else {
                                            iArr = iArr7;
                                        }
                                        int i37 = iArr2[i15 + iArr6[i30]];
                                        iArr10[0] = (i37 & 16711680) >> 16;
                                        iArr10[1] = (i37 & 65280) >> 8;
                                        iArr10[2] = i37 & 255;
                                        int i38 = i21 + iArr10[0];
                                        z2 = true;
                                        try {
                                            int i39 = i23 + iArr10[1];
                                            int i40 = i25 + iArr10[2];
                                            i17 = i31 + i38;
                                            i18 = i32 + i39;
                                            i19 = i33 + i40;
                                            i29 = (i29 + 1) % i7;
                                            int[] iArr11 = iArr8[i29 % i7];
                                            i20 = i34 + iArr11[0];
                                            i22 = i35 + iArr11[1];
                                            i24 = i36 + iArr11[2];
                                            i21 = i38 - iArr11[0];
                                            i23 = i39 - iArr11[1];
                                            i25 = i40 - iArr11[2];
                                            i14++;
                                            i30++;
                                            iArr7 = iArr;
                                        } catch (OutOfMemoryError e2) {
                                            e = e2;
                                            e.h.g.s1.l(e, z2);
                                            return null;
                                        }
                                    }
                                    i15 += width;
                                    i13++;
                                    copy = bitmap5;
                                    height = i28;
                                }
                                int[] iArr12 = iArr7;
                                int i41 = height;
                                bitmap2 = copy;
                                int i42 = 0;
                                while (i42 < width) {
                                    int i43 = -i3;
                                    int i44 = i43 * width;
                                    int i45 = 0;
                                    int i46 = 0;
                                    int i47 = 0;
                                    int i48 = 0;
                                    int i49 = 0;
                                    int i50 = 0;
                                    int i51 = 0;
                                    int i52 = 0;
                                    int i53 = 0;
                                    while (i43 <= i3) {
                                        int[] iArr13 = iArr6;
                                        int max2 = Math.max(0, i44) + i42;
                                        int[] iArr14 = iArr8[i43 + i3];
                                        iArr14[0] = iArr3[max2];
                                        iArr14[1] = iArr4[max2];
                                        iArr14[2] = iArr5[max2];
                                        int abs2 = i12 - Math.abs(i43);
                                        i45 = (iArr3[max2] * abs2) + i45;
                                        i46 = (iArr4[max2] * abs2) + i46;
                                        i47 = (iArr5[max2] * abs2) + i47;
                                        if (i43 > 0) {
                                            i49 += iArr14[0];
                                            i51 += iArr14[1];
                                            i53 += iArr14[2];
                                        } else {
                                            i48 += iArr14[0];
                                            i50 += iArr14[1];
                                            i52 += iArr14[2];
                                        }
                                        if (i43 < i6) {
                                            i44 += width;
                                        }
                                        i43++;
                                        iArr6 = iArr13;
                                    }
                                    int[] iArr15 = iArr6;
                                    int i54 = i42;
                                    int i55 = i3;
                                    int i56 = i41;
                                    int i57 = 0;
                                    while (i57 < i56) {
                                        iArr2[i54] = (iArr2[i54] & (-16777216)) | (iArr12[i45] << 16) | (iArr12[i46] << 8) | iArr12[i47];
                                        int i58 = i45 - i48;
                                        int i59 = i46 - i50;
                                        int i60 = i47 - i52;
                                        int[] iArr16 = iArr8[((i55 - i3) + i7) % i7];
                                        int i61 = i48 - iArr16[0];
                                        int i62 = i50 - iArr16[1];
                                        int i63 = i52 - iArr16[2];
                                        if (i42 == 0) {
                                            i2 = i3;
                                            iArr15[i57] = Math.min(i57 + i12, i6) * width;
                                        } else {
                                            i2 = i3;
                                        }
                                        int i64 = iArr15[i57] + i42;
                                        iArr16[0] = iArr3[i64];
                                        iArr16[1] = iArr4[i64];
                                        iArr16[2] = iArr5[i64];
                                        int i65 = i49 + iArr16[0];
                                        int i66 = i51 + iArr16[1];
                                        int i67 = i53 + iArr16[2];
                                        i45 = i58 + i65;
                                        i46 = i59 + i66;
                                        i47 = i60 + i67;
                                        i55 = (i55 + 1) % i7;
                                        int[] iArr17 = iArr8[i55];
                                        i48 = i61 + iArr17[0];
                                        i50 = i62 + iArr17[1];
                                        i52 = i63 + iArr17[2];
                                        i49 = i65 - iArr17[0];
                                        i51 = i66 - iArr17[1];
                                        i53 = i67 - iArr17[2];
                                        i54 += width;
                                        i57++;
                                        i3 = i2;
                                    }
                                    i42++;
                                    i41 = i56;
                                    iArr6 = iArr15;
                                }
                                bitmap2.setPixels(iArr2, 0, width, 0, 0, width, i41);
                                return bitmap2;
                            }
                        }
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        z2 = true;
                    }
                } catch (Exception e4) {
                    e.h.g.s1.l(e4, true);
                }
            }
            return null;
        }
        return null;
    }

    public static int r() {
        if (r == -1) {
            e.h.g.x0 x0Var = e.h.g.x0.f8405d;
            float c2 = e.h.g.v0.c(x0Var);
            e.h.g.x0 x0Var2 = e.h.g.x0.f8405d;
            r = Math.min((int) (c2 * e.h.g.v0.b(x0Var, true)), (int) (e.h.g.v0.c(x0Var2) * e.h.g.v0.a(x0Var2.getApplicationContext(), true))) / 4;
        }
        return r;
    }

    public static Drawable s(long j2, long j3, BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2;
        LruCache<Long, BitmapDrawable> lruCache = f5227g;
        synchronized (lruCache) {
            bitmapDrawable2 = lruCache.get(Long.valueOf(j3));
        }
        if (bitmapDrawable2 == null) {
            boolean z2 = true;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Bitmap o2 = o(j3, bitmap.getWidth(), bitmap.getHeight());
            if (o2 == null) {
                z2 = false;
                o2 = m(e.h.g.x0.f8405d, j2, j3, false);
                if (o2 == null) {
                    o2 = l(e.h.g.x0.f8405d, j2, -1L);
                }
            }
            if (o2 != null) {
                BitmapDrawable bitmapDrawable3 = new BitmapDrawable(o2);
                if (z2) {
                    synchronized (lruCache) {
                        BitmapDrawable bitmapDrawable4 = lruCache.get(Long.valueOf(j3));
                        if (bitmapDrawable4 == null) {
                            lruCache.put(Long.valueOf(j3), bitmapDrawable3);
                        } else {
                            bitmapDrawable3 = bitmapDrawable4;
                        }
                    }
                    return bitmapDrawable3;
                }
                return bitmapDrawable3;
            }
            return bitmapDrawable;
        }
        return bitmapDrawable2;
    }

    public static long t() {
        s6 y2 = y();
        if (y2 != null) {
            try {
                return y2.e();
            } catch (Exception unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static int u() {
        s6 y2 = y();
        if (y2 != null) {
            try {
                return y2.h();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static Bitmap v(Context context) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeStream(context.getResources().openRawResource(R.drawable.albumart_mp_unknown), null, options);
    }

    public static String w(long j2) {
        String str;
        Cursor Q = Q(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_data"}, e.a.d.a.a.h("_id=", j2), null, null);
        str = "";
        if (Q != null) {
            try {
                str = Q.moveToFirst() ? Q.getString(0) : "";
            } finally {
                Q.close();
            }
        }
        return str;
    }

    public static s6 x() {
        ArrayList<s6> arrayList = f5222b;
        synchronized (arrayList) {
            if (arrayList.size() > 0) {
                return arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
    }

    public static s6 y() {
        return z(TimeUnit.SECONDS.toMillis(2L));
    }

    public static s6 z(long j2) {
        s6 x2;
        if (e.h.g.j1.f()) {
            return x();
        }
        s6 x3 = x();
        if (x3 == null) {
            long nanoTime = System.nanoTime();
            e.h.g.r0 r0Var = new e.h.g.r0();
            do {
                e.h.g.j1.n(1, r0Var);
                x2 = x();
                if ((System.nanoTime() - nanoTime) / 1000000 >= j2) {
                    break;
                }
            } while (x2 == null);
            return x2;
        }
        return x3;
    }
}
