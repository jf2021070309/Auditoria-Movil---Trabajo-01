package e.c.a.m.t;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import e.c.a.m.r.d;
import e.c.a.m.t.n;
import java.io.File;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public final class k implements n<Uri, File> {
    public final Context a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // e.c.a.m.t.o
        public n<Uri, File> b(r rVar) {
            return new k(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e.c.a.m.r.d<File> {
        public static final String[] a = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        public final Context f5800b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f5801c;

        public b(Context context, Uri uri) {
            this.f5800b = context;
            this.f5801c = uri;
        }

        @Override // e.c.a.m.r.d
        public Class<File> a() {
            return File.class;
        }

        @Override // e.c.a.m.r.d
        public void b() {
        }

        @Override // e.c.a.m.r.d
        public void cancel() {
        }

        @Override // e.c.a.m.r.d
        public e.c.a.m.a d() {
            return e.c.a.m.a.LOCAL;
        }

        @Override // e.c.a.m.r.d
        public void e(e.c.a.f fVar, d.a<? super File> aVar) {
            Cursor query = this.f5800b.getContentResolver().query(this.f5801c, a, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            StringBuilder y = e.a.d.a.a.y("Failed to find file path for: ");
            y.append(this.f5801c);
            aVar.c(new FileNotFoundException(y.toString()));
        }
    }

    public k(Context context) {
        this.a = context;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Uri uri) {
        return c.t.m.u(uri);
    }

    @Override // e.c.a.m.t.n
    public n.a<File> b(Uri uri, int i2, int i3, e.c.a.m.m mVar) {
        Uri uri2 = uri;
        return new n.a<>(new e.c.a.r.b(uri2), new b(this.a, uri2));
    }
}
