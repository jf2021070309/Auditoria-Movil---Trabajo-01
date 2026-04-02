package e.h.b;

import android.app.Activity;
import android.app.RecoverableSecurityException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import e.h.b.o;
import e.h.g.j0;
import e.h.g.q0;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.v0;
import e.h.g.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
public class o {
    public static b a;

    /* renamed from: b  reason: collision with root package name */
    public static c f8072b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    /* loaded from: classes2.dex */
    public static class b {
        public a a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f8073b;

        /* renamed from: c  reason: collision with root package name */
        public Collection<Uri> f8074c;

        /* renamed from: d  reason: collision with root package name */
        public String f8075d;

        public b(Activity activity, Uri uri, String str, a aVar) {
            new WeakReference(activity);
            this.f8073b = uri;
            this.f8075d = str;
            this.a = aVar;
        }

        public b(Activity activity, Collection<Uri> collection, a aVar) {
            new WeakReference(activity);
            this.f8074c = collection;
            this.a = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public Collection<Uri> a;

        /* renamed from: b  reason: collision with root package name */
        public long f8076b;

        /* renamed from: c  reason: collision with root package name */
        public a f8077c;

        /* renamed from: d  reason: collision with root package name */
        public int f8078d;

        public c(int i2) {
            this.f8078d = i2;
        }
    }

    static {
        Float.valueOf(Build.VERSION.SDK);
        e.h.g.o0.a aVar = e.h.g.o0.a.ArtistForAll;
        new HashMap();
        new HashMap();
    }

    public static int a(ArrayList<Long> arrayList, long j2) {
        int i2;
        int i3 = 0;
        if (j2 == -1) {
            return 0;
        }
        try {
            int size = arrayList.size();
            ContentResolver contentResolver = x0.f8405d.getContentResolver();
            Uri contentUri = MediaStore.Audio.Playlists.Members.getContentUri("external", j2);
            Cursor n2 = n(contentUri, new String[]{"max(play_order)"}, null, null, null);
            if (n2 != null) {
                i2 = n2.moveToFirst() ? n2.getInt(0) + 1 : 0;
                n2.close();
            } else {
                i2 = 0;
            }
            int i4 = 0;
            while (i3 < size) {
                try {
                    i4 += contentResolver.bulkInsert(contentUri, g(arrayList, i3, 1000, i2));
                    i3 += 1000;
                } catch (Throwable th) {
                    th = th;
                    i3 = i4;
                    try {
                        x0.f8405d.A(th);
                        s1.l(th, true);
                        return i3;
                    } catch (Throwable th2) {
                        x0.f8405d.A(th2);
                        s1.l(th2, true);
                        return i3;
                    }
                }
            }
            return i4;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static long b(String str) {
        long j2 = -1;
        try {
            ContentResolver contentResolver = x0.f8405d.getContentResolver();
            Cursor n2 = n(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"name"}, "name = '" + str + "'", null, null);
            if (n2 != null) {
                if (n2.getCount() <= 0) {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("name", str);
                    Uri insert = contentResolver.insert(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues);
                    if (insert != null) {
                        j2 = Long.parseLong(insert.getLastPathSegment());
                    }
                }
                n2.close();
            }
        } catch (Throwable th) {
            x0.f8405d.A(th);
            s1.l(th, true);
        }
        return j2;
    }

    public static void c(p pVar, ArrayList<q> arrayList) {
        long j2 = pVar.f8081d;
        if (j2 != -1) {
            try {
                x0.f8405d.getContentResolver().delete(MediaStore.Audio.Playlists.Members.getContentUri("external", j2), null, null);
            } catch (Throwable th) {
                x0.f8405d.A(th);
                s1.l(th, true);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<q> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(it.next().f8084b));
        }
        a(arrayList2, pVar.f8080c);
    }

    public static p d(long j2) {
        Cursor n2 = n(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id", "name", "date_modified"}, "_id=?", new String[]{Long.valueOf(j2).toString()}, "name");
        if (n2 != null) {
            try {
                if (n2.moveToFirst()) {
                    String string = n2.getString(1);
                    long j3 = n2.getLong(0);
                    long j4 = n2.getLong(2);
                    p pVar = new p();
                    pVar.f8081d = j3;
                    pVar.f8080c = j3;
                    pVar.b(string);
                    pVar.a = j4;
                    return pVar;
                }
                return null;
            } finally {
                n2.close();
            }
        }
        return null;
    }

    public static void e(ArrayList<p> arrayList) {
        int i2;
        try {
            long nanoTime = System.nanoTime();
            Cursor n2 = n(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id", "name", "date_modified"}, null, null, "name");
            if (n2 != null) {
                if (n2.moveToFirst()) {
                    do {
                        String string = n2.getString(1);
                        long j2 = n2.getLong(0);
                        long j3 = n2.getLong(2);
                        p pVar = new p();
                        pVar.f8081d = j2;
                        pVar.f8080c = j2;
                        pVar.b(string);
                        pVar.a = j3;
                        arrayList.add(pVar);
                    } while (n2.moveToNext());
                    n2.close();
                } else {
                    n2.close();
                }
            }
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                p next = it.next();
                Cursor n3 = n(MediaStore.Audio.Playlists.Members.getContentUri("external", next.f8080c), new String[]{"audio_id"}, "title != ''", null, "play_order");
                if (n3 != null) {
                    i2 = n3.getCount();
                    n3.close();
                } else {
                    i2 = 0;
                }
                next.f8079b = i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Got playlists from media store in ");
            sb.append(((System.nanoTime() - nanoTime) / 1000000) + "ms");
            t1.i(sb.toString());
        } catch (Throwable th) {
            x0.f8405d.A(th);
            s1.l(th, true);
        }
    }

    public static ArrayList<q> f(long j2) {
        ArrayList<q> arrayList = new ArrayList<>(100);
        try {
            Cursor h2 = h(Long.valueOf(j2));
            if (h2 != null) {
                if (h2.moveToFirst()) {
                    do {
                        q qVar = new q();
                        long j3 = h2.getLong(0);
                        String string = h2.getString(1);
                        String string2 = h2.getString(2);
                        String string3 = h2.getString(3);
                        int i2 = h2.getInt(4);
                        if (v0.d()) {
                            String string4 = h2.getString(6);
                            String string5 = h2.getString(7);
                            if (string4 != null && string5 != null) {
                                qVar.f(string4 + string5);
                            }
                        } else {
                            qVar.f(h2.getString(6));
                        }
                        qVar.f8084b = j3;
                        qVar.e(string);
                        qVar.d(string2);
                        qVar.c(string3);
                        qVar.a = i2;
                        qVar.f8085c = j3;
                        arrayList.add(qVar);
                    } while (h2.moveToNext());
                    h2.close();
                } else {
                    h2.close();
                }
            }
        } catch (Throwable th) {
            x0.f8405d.A(th);
            s1.l(th, true);
        }
        return arrayList;
    }

    public static ContentValues[] g(ArrayList<Long> arrayList, int i2, int i3, int i4) {
        if (i2 + i3 > arrayList.size()) {
            i3 = arrayList.size() - i2;
        }
        ContentValues[] contentValuesArr = new ContentValues[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            if (contentValuesArr[i5] == null) {
                contentValuesArr[i5] = new ContentValues();
            }
            contentValuesArr[i5].put("play_order", Integer.valueOf(i4 + i2 + i5));
            contentValuesArr[i5].put("audio_id", arrayList.get(i2 + i5));
        }
        return contentValuesArr;
    }

    public static Cursor h(Long l2) {
        try {
            return n(MediaStore.Audio.Playlists.Members.getContentUri("external", l2.longValue()), v0.d() ? new String[]{"audio_id", "title", "artist", "album", "duration", "play_order", "relative_path", "_display_name"} : new String[]{"audio_id", "title", "artist", "album", "duration", "play_order", "_data"}, "title != ''", null, "play_order");
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void i(long j2, long j3, int i2, long j4, int i3) {
        int abs;
        int abs2;
        try {
            if (j3 == -1 || j4 == -1) {
                ArrayList<q> f2 = f(j2);
                if (i2 >= f2.size() || i3 >= f2.size()) {
                    return;
                }
                if (i2 > i3) {
                    f2.add(i3, f2.remove(i2));
                } else {
                    f2.add(i3 + 1, f2.get(i2));
                    f2.remove(i2);
                }
                c(d(j2), f2);
                return;
            }
            ArrayList<q> f3 = f(j2);
            int i4 = 0;
            int i5 = 100000;
            int i6 = -1;
            int i7 = 0;
            int i8 = 100000;
            int i9 = -1;
            while (true) {
                if (i7 >= f3.size()) {
                    i7 = i9;
                    break;
                }
                if (f3.get(i7).f8085c == j3 && (abs2 = Math.abs(i2 - i7)) < i8) {
                    if (abs2 == 0) {
                        break;
                    }
                    i9 = i7;
                    i8 = abs2;
                }
                i7++;
            }
            while (true) {
                if (i4 >= f3.size()) {
                    i4 = i6;
                    break;
                }
                if (f3.get(i4).f8085c == j4 && (abs = Math.abs(i3 - i4)) < i5) {
                    if (abs == 0) {
                        break;
                    }
                    i5 = abs;
                    i6 = i4;
                }
                i4++;
            }
            q qVar = new q();
            qVar.f8085c = j3;
            qVar.f8084b = j3;
            if (i7 < 0 || i4 < 0) {
                return;
            }
            if (i7 > i4) {
                f3.remove(i7);
                f3.add(i4, qVar);
            } else {
                f3.add(i4 + 1, qVar);
                f3.remove(i7);
            }
            c(d(j2), f3);
        } catch (Throwable th) {
            x0.f8405d.A(th);
            s1.l(th, true);
        }
    }

    public static boolean j(final Activity activity, int i2, int i3, Intent intent) {
        a aVar;
        final a aVar2;
        if (i2 == 2200) {
            b bVar = a;
            if (bVar == null || (aVar2 = bVar.a) == null) {
                return true;
            }
            if (i3 != -1) {
                aVar2.a(false);
                return true;
            }
            final Uri uri = bVar.f8073b;
            final String str = bVar.f8075d;
            j0.f(new j0.b() { // from class: e.h.b.i
                @Override // e.h.g.j0.b
                public final void a() {
                    Activity activity2 = activity;
                    Uri uri2 = uri;
                    String str2 = str;
                    o.a aVar3 = aVar2;
                    if (activity2 != null) {
                        try {
                            if (!activity2.isFinishing()) {
                                int delete = activity2.getContentResolver().delete(uri2, str2, null);
                                if (aVar3 != null) {
                                    aVar3.a(delete > 0);
                                    return;
                                }
                                return;
                            }
                        } catch (SecurityException e2) {
                            if (!v0.d()) {
                                o.a = null;
                            } else if (e2 instanceof RecoverableSecurityException) {
                                try {
                                    o.a = new o.b(activity2, uri2, str2, aVar3);
                                    activity2.startIntentSenderForResult(((RecoverableSecurityException) e2).getUserAction().getActionIntent().getIntentSender(), 2200, null, 0, 0, 0, null);
                                } catch (Throwable th) {
                                    s1.l(th, true);
                                    if (aVar3 != null) {
                                        aVar3.a(false);
                                    }
                                }
                            } else {
                                o.a = null;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (o.a != null || aVar3 == null) {
                        return;
                    }
                    aVar3.a(false);
                }
            });
            return true;
        } else if (i2 == 2201) {
            b bVar2 = a;
            if (bVar2 == null || (aVar = bVar2.a) == null) {
                return true;
            }
            if (i3 == -1) {
                aVar.a(true);
                return true;
            }
            aVar.a(false);
            return true;
        } else if (i2 == 2202) {
            q0.s(activity, i3, intent, new q0.a() { // from class: e.h.b.l
                @Override // e.h.g.q0.a
                public final void a(boolean z) {
                    final Activity activity2 = activity;
                    if (z) {
                        final o.c cVar = o.f8072b;
                        o.f8072b = null;
                        if (activity2 == null || cVar == null) {
                            return;
                        }
                        j0.f(new j0.b() { // from class: e.h.b.m
                            @Override // e.h.g.j0.b
                            public final void a() {
                                o.c cVar2 = o.c.this;
                                Activity activity3 = activity2;
                                try {
                                    int i4 = cVar2.f8078d;
                                    if (i4 == 0) {
                                        j0.d(new k(activity3, cVar2.a, cVar2.f8077c));
                                    } else if (i4 == 2) {
                                        o.m(activity3, cVar2.f8076b, false, cVar2.f8077c);
                                    }
                                } catch (Throwable th) {
                                    s1.l(th, true);
                                }
                            }
                        });
                    }
                }
            });
            return true;
        } else if (i2 == 2203) {
            return true;
        } else {
            if (i2 == 2204) {
                final c cVar = f8072b;
                if (cVar != null) {
                    if (i3 == -1) {
                        q0.s(activity, i3, intent, new q0.a() { // from class: e.h.b.h
                            @Override // e.h.g.q0.a
                            public final void a(boolean z) {
                                final o.c cVar2 = o.c.this;
                                final Activity activity2 = activity;
                                if (!z) {
                                    cVar2.f8077c.a(false);
                                } else if (cVar2.f8077c != null) {
                                    j0.g(new j0.b() { // from class: e.h.b.j
                                        @Override // e.h.g.j0.b
                                        public final void a() {
                                            o.c cVar3 = o.c.this;
                                            try {
                                                Objects.requireNonNull(cVar3);
                                                throw null;
                                            } catch (Exception e2) {
                                                s1.l(e2, true);
                                                cVar3.f8077c.a(false);
                                            }
                                        }
                                    });
                                }
                            }
                        });
                        return true;
                    }
                    cVar.f8077c.a(false);
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    public static boolean k(long j2, long j3) {
        if (j2 != -1) {
            try {
                return x0.f8405d.getContentResolver().delete(MediaStore.Audio.Playlists.Members.getContentUri("external", j2), "audio_id = ? ", new String[]{Long.toString(j3)}) > 0;
            } catch (Throwable th) {
                x0.f8405d.A(th);
                s1.l(th, true);
                return false;
            }
        }
        return false;
    }

    public static boolean l(long j2, String str) {
        try {
            ContentResolver contentResolver = x0.f8405d.getContentResolver();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("name", str);
            return contentResolver.update(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues, "_id=?", new String[]{Long.valueOf(j2).toString()}) > 0;
        } catch (Throwable th) {
            x0.f8405d.A(th);
            s1.l(th, true);
            return false;
        }
    }

    public static void m(final Activity activity, final long j2, final boolean z, final a aVar) {
        if (j2 != -1) {
            j0.d(new j0.b() { // from class: e.h.b.g
                /* JADX WARN: Can't wrap try/catch for region: R(14:9|10|(4:12|(3:14|(1:16)(1:18)|17)|19|(1:(2:22|23)(4:24|25|26|(2:28|(2:30|31)(1:32))(1:(2:34|35)(1:36)))))|39|(3:41|(1:85)(1:47)|48)(1:86)|(4:69|70|(4:72|(1:74)|75|(1:77))|(6:57|58|59|(2:63|64)|65|66)(2:55|56))|50|(0)|57|58|59|(2:63|64)|65|66) */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0147, code lost:
                    r3 = 1;
                 */
                @Override // e.h.g.j0.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a() {
                    /*
                        Method dump skipped, instructions count: 368
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e.h.b.g.a():void");
                }
            });
        } else if (aVar != null) {
            aVar.a(true);
        }
    }

    public static Cursor n(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (v0.l()) {
            try {
                ContentResolver contentResolver = x0.f8405d.getContentResolver();
                if (contentResolver != null) {
                    return contentResolver.query(uri, strArr, str, strArr2, str2);
                }
            } catch (Throwable th) {
                s1.l(th, true);
            }
        }
        return null;
    }
}
