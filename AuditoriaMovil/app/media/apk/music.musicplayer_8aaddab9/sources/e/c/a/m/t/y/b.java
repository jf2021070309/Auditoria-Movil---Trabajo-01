package e.c.a.m.t.y;

import android.net.Uri;
import e.c.a.m.m;
import e.c.a.m.t.g;
import e.c.a.m.t.n;
import e.c.a.m.t.o;
import e.c.a.m.t.r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class b implements n<Uri, InputStream> {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b  reason: collision with root package name */
    public final n<g, InputStream> f5826b;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // e.c.a.m.t.o
        public n<Uri, InputStream> b(r rVar) {
            return new b(rVar.b(g.class, InputStream.class));
        }
    }

    public b(n<g, InputStream> nVar) {
        this.f5826b = nVar;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }

    @Override // e.c.a.m.t.n
    public n.a<InputStream> b(Uri uri, int i2, int i3, m mVar) {
        return this.f5826b.b(new g(uri.toString()), i2, i3, mVar);
    }
}
