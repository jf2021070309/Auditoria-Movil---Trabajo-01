package e.c.a.m.t.y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import e.c.a.m.m;
import e.c.a.m.r.d;
import e.c.a.m.t.n;
import e.c.a.m.t.o;
import e.c.a.m.t.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class e<DataT> implements n<Uri, DataT> {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f5827b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f5828c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f5829d;

    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f5830b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.f5830b = cls;
        }

        @Override // e.c.a.m.t.o
        public final n<Uri, DataT> b(r rVar) {
            return new e(this.a, rVar.b(File.class, this.f5830b), rVar.b(Uri.class, this.f5830b), this.f5830b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<DataT> implements e.c.a.m.r.d<DataT> {
        public static final String[] a = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        public final Context f5831b;

        /* renamed from: c  reason: collision with root package name */
        public final n<File, DataT> f5832c;

        /* renamed from: d  reason: collision with root package name */
        public final n<Uri, DataT> f5833d;

        /* renamed from: e  reason: collision with root package name */
        public final Uri f5834e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5835f;

        /* renamed from: g  reason: collision with root package name */
        public final int f5836g;

        /* renamed from: h  reason: collision with root package name */
        public final m f5837h;

        /* renamed from: i  reason: collision with root package name */
        public final Class<DataT> f5838i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f5839j;

        /* renamed from: k  reason: collision with root package name */
        public volatile e.c.a.m.r.d<DataT> f5840k;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, m mVar, Class<DataT> cls) {
            this.f5831b = context.getApplicationContext();
            this.f5832c = nVar;
            this.f5833d = nVar2;
            this.f5834e = uri;
            this.f5835f = i2;
            this.f5836g = i3;
            this.f5837h = mVar;
            this.f5838i = cls;
        }

        @Override // e.c.a.m.r.d
        public Class<DataT> a() {
            return this.f5838i;
        }

        @Override // e.c.a.m.r.d
        public void b() {
            e.c.a.m.r.d<DataT> dVar = this.f5840k;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final e.c.a.m.r.d<DataT> c() throws FileNotFoundException {
            n.a<DataT> b2;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                n<File, DataT> nVar = this.f5832c;
                Uri uri = this.f5834e;
                try {
                    Cursor query = this.f5831b.getContentResolver().query(uri, a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                query.close();
                                b2 = nVar.b(file, this.f5835f, this.f5836g, this.f5837h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                b2 = this.f5833d.b(this.f5831b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f5834e) : this.f5834e, this.f5835f, this.f5836g, this.f5837h);
            }
            if (b2 != null) {
                return b2.f5806c;
            }
            return null;
        }

        @Override // e.c.a.m.r.d
        public void cancel() {
            this.f5839j = true;
            e.c.a.m.r.d<DataT> dVar = this.f5840k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // e.c.a.m.r.d
        public e.c.a.m.a d() {
            return e.c.a.m.a.LOCAL;
        }

        @Override // e.c.a.m.r.d
        public void e(e.c.a.f fVar, d.a<? super DataT> aVar) {
            try {
                e.c.a.m.r.d<DataT> c2 = c();
                if (c2 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f5834e));
                    return;
                }
                this.f5840k = c2;
                if (this.f5839j) {
                    cancel();
                } else {
                    c2.e(fVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    public e(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.f5827b = nVar;
        this.f5828c = nVar2;
        this.f5829d = cls;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && c.t.m.u(uri);
    }

    @Override // e.c.a.m.t.n
    public n.a b(Uri uri, int i2, int i3, m mVar) {
        Uri uri2 = uri;
        return new n.a(new e.c.a.r.b(uri2), new d(this.a, this.f5827b, this.f5828c, uri2, i2, i3, mVar, this.f5829d));
    }
}
