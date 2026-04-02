package e.c.a.m.t.y;

import android.content.Context;
import android.net.Uri;
import c.t.m;
import e.c.a.m.r.p.b;
import e.c.a.m.t.n;
import e.c.a.m.t.o;
import e.c.a.m.t.r;
import java.io.InputStream;
/* loaded from: classes.dex */
public class c implements n<Uri, InputStream> {
    public final Context a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // e.c.a.m.t.o
        public n<Uri, InputStream> b(r rVar) {
            return new c(this.a);
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // e.c.a.m.t.n
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return m.u(uri2) && !uri2.getPathSegments().contains("video");
    }

    @Override // e.c.a.m.t.n
    public n.a<InputStream> b(Uri uri, int i2, int i3, e.c.a.m.m mVar) {
        Uri uri2 = uri;
        if (m.v(i2, i3)) {
            e.c.a.r.b bVar = new e.c.a.r.b(uri2);
            Context context = this.a;
            return new n.a<>(bVar, e.c.a.m.r.p.b.c(context, uri2, new b.a(context.getContentResolver())));
        }
        return null;
    }
}
