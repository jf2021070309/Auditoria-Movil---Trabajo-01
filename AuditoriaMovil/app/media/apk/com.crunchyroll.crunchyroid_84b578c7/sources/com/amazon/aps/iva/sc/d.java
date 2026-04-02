package com.amazon.aps.iva.sc;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes.dex */
public final class d<DataT> implements o<Uri, DataT> {
    public final Context a;
    public final o<File, DataT> b;
    public final o<Uri, DataT> c;
    public final Class<DataT> d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: com.amazon.aps.iva.sc.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0702d<DataT> implements com.amazon.aps.iva.lc.d<DataT> {
        public static final String[] l = {"_data"};
        public final Context b;
        public final o<File, DataT> c;
        public final o<Uri, DataT> d;
        public final Uri e;
        public final int f;
        public final int g;
        public final h h;
        public final Class<DataT> i;
        public volatile boolean j;
        public volatile com.amazon.aps.iva.lc.d<DataT> k;

        public C0702d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i, int i2, h hVar, Class<DataT> cls) {
            this.b = context.getApplicationContext();
            this.c = oVar;
            this.d = oVar2;
            this.e = uri;
            this.f = i;
            this.g = i2;
            this.h = hVar;
            this.i = cls;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<DataT> a() {
            return this.i;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
            com.amazon.aps.iva.lc.d<DataT> dVar = this.k;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final com.amazon.aps.iva.lc.d<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            boolean z;
            o.a<DataT> buildLoadData;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.b;
            h hVar = this.h;
            int i = this.g;
            int i2 = this.f;
            if (isExternalStorageLegacy) {
                Uri uri = this.e;
                try {
                    Cursor query = context.getContentResolver().query(uri, l, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    buildLoadData = this.c.buildLoadData(file, i2, i, hVar);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
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
                Uri uri2 = this.e;
                boolean z2 = true;
                if (com.amazon.aps.iva.cq.b.X(uri2) && uri2.getPathSegments().contains("picker")) {
                    z = true;
                } else {
                    z = false;
                }
                o<Uri, DataT> oVar = this.d;
                if (z) {
                    buildLoadData = oVar.buildLoadData(uri2, i2, i, hVar);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        uri2 = MediaStore.setRequireOriginal(uri2);
                    }
                    buildLoadData = oVar.buildLoadData(uri2, i2, i, hVar);
                }
            }
            if (buildLoadData == null) {
                return null;
            }
            return buildLoadData.c;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void cancel() {
            this.j = true;
            com.amazon.aps.iva.lc.d<DataT> dVar = this.k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super DataT> aVar) {
            try {
                com.amazon.aps.iva.lc.d<DataT> c = c();
                if (c == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.e));
                    return;
                }
                this.k = c;
                if (this.j) {
                    cancel();
                } else {
                    c.d(cVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // com.amazon.aps.iva.lc.d
        public final com.amazon.aps.iva.kc.a e() {
            return com.amazon.aps.iva.kc.a.LOCAL;
        }
    }

    public d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = oVar;
        this.c = oVar2;
        this.d = cls;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(Uri uri, int i, int i2, h hVar) {
        Uri uri2 = uri;
        return new o.a(new com.amazon.aps.iva.gd.b(uri2), new C0702d(this.a, this.b, this.c, uri2, i, i2, hVar, this.d));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Uri uri) {
        Uri uri2 = uri;
        if (Build.VERSION.SDK_INT >= 29 && com.amazon.aps.iva.cq.b.X(uri2)) {
            return true;
        }
        return false;
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements p<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, DataT> build(s sVar) {
            Class<DataT> cls = this.b;
            return new d(this.a, sVar.b(File.class, cls), sVar.b(Uri.class, cls), cls);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
