package e.c.a.m.r.p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import e.c.a.f;
import e.c.a.m.r.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class b implements e.c.a.m.r.d<InputStream> {
    public final Uri a;

    /* renamed from: b  reason: collision with root package name */
    public final d f5578b;

    /* renamed from: c  reason: collision with root package name */
    public InputStream f5579c;

    /* loaded from: classes.dex */
    public static class a implements c {
        public static final String[] a = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        public final ContentResolver f5580b;

        public a(ContentResolver contentResolver) {
            this.f5580b = contentResolver;
        }

        @Override // e.c.a.m.r.p.c
        public Cursor a(Uri uri) {
            return this.f5580b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: e.c.a.m.r.p.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0112b implements c {
        public static final String[] a = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        public final ContentResolver f5581b;

        public C0112b(ContentResolver contentResolver) {
            this.f5581b = contentResolver;
        }

        @Override // e.c.a.m.r.p.c
        public Cursor a(Uri uri) {
            return this.f5581b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public b(Uri uri, d dVar) {
        this.a = uri;
        this.f5578b = dVar;
    }

    public static b c(Context context, Uri uri, c cVar) {
        return new b(uri, new d(e.c.a.b.b(context).f5440f.e(), cVar, e.c.a.b.b(context).f5441g, context.getContentResolver()));
    }

    @Override // e.c.a.m.r.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // e.c.a.m.r.d
    public void b() {
        InputStream inputStream = this.f5579c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // e.c.a.m.r.d
    public void cancel() {
    }

    @Override // e.c.a.m.r.d
    public e.c.a.m.a d() {
        return e.c.a.m.a.LOCAL;
    }

    @Override // e.c.a.m.r.d
    public void e(f fVar, d.a<? super InputStream> aVar) {
        try {
            InputStream f2 = f();
            this.f5579c = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        r7 = null;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0023: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x0023 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream f() throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.m.r.p.b.f():java.io.InputStream");
    }
}
