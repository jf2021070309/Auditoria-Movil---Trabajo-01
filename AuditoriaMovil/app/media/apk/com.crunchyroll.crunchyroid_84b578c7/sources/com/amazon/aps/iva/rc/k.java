package com.amazon.aps.iva.rc;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes.dex */
public final class k implements o<Uri, File> {
    public final Context a;

    public k(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<File> buildLoadData(Uri uri, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        Uri uri2 = uri;
        return new o.a<>(new com.amazon.aps.iva.gd.b(uri2), new b(this.a, uri2));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Uri uri) {
        return com.amazon.aps.iva.cq.b.X(uri);
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, File> build(s sVar) {
            return new k(this.a);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements com.amazon.aps.iva.lc.d<File> {
        public static final String[] d = {"_data"};
        public final Context b;
        public final Uri c;

        public b(Context context, Uri uri) {
            this.b = context;
            this.c = uri;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super File> aVar) {
            Cursor query = this.b.getContentResolver().query(this.c, d, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.c));
                return;
            }
            aVar.f(new File(str));
        }

        @Override // com.amazon.aps.iva.lc.d
        public final com.amazon.aps.iva.kc.a e() {
            return com.amazon.aps.iva.kc.a.LOCAL;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void cancel() {
        }
    }
}
