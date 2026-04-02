package e.c.a.m.t;

import android.net.Uri;
import e.c.a.m.t.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class x<Data> implements n<Uri, Data> {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b  reason: collision with root package name */
    public final n<g, Data> f5824b;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // e.c.a.m.t.o
        public n<Uri, InputStream> b(r rVar) {
            return new x(rVar.b(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f5824b = nVar;
    }

    @Override // e.c.a.m.t.n
    public boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }

    @Override // e.c.a.m.t.n
    public n.a b(Uri uri, int i2, int i3, e.c.a.m.m mVar) {
        return this.f5824b.b(new g(uri.toString()), i2, i3, mVar);
    }
}
