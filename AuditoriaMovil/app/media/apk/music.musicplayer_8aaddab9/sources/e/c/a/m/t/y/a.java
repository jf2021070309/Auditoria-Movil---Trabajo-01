package e.c.a.m.t.y;

import e.c.a.m.l;
import e.c.a.m.r.j;
import e.c.a.m.t.g;
import e.c.a.m.t.m;
import e.c.a.m.t.n;
import e.c.a.m.t.o;
import e.c.a.m.t.r;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
/* loaded from: classes.dex */
public class a implements n<g, InputStream> {
    public static final l<Integer> a = l.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b  reason: collision with root package name */
    public final m<g, g> f5825b;

    /* renamed from: e.c.a.m.t.y.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124a implements o<g, InputStream> {
        public final m<g, g> a = new m<>(500);

        @Override // e.c.a.m.t.o
        public n<g, InputStream> b(r rVar) {
            return new a(this.a);
        }
    }

    public a(m<g, g> mVar) {
        this.f5825b = mVar;
    }

    @Override // e.c.a.m.t.n
    public /* bridge */ /* synthetic */ boolean a(g gVar) {
        return true;
    }

    @Override // e.c.a.m.t.n
    public n.a<InputStream> b(g gVar, int i2, int i3, e.c.a.m.m mVar) {
        g gVar2 = gVar;
        m<g, g> mVar2 = this.f5825b;
        if (mVar2 != null) {
            m.b<g> a2 = m.b.a(gVar2, 0, 0);
            g a3 = mVar2.a.a(a2);
            Queue<m.b<?>> queue = m.b.a;
            synchronized (queue) {
                queue.offer(a2);
            }
            g gVar3 = a3;
            if (gVar3 == null) {
                m<g, g> mVar3 = this.f5825b;
                Objects.requireNonNull(mVar3);
                mVar3.a.d(m.b.a(gVar2, 0, 0), gVar2);
            } else {
                gVar2 = gVar3;
            }
        }
        return new n.a<>(gVar2, new j(gVar2, ((Integer) mVar.c(a)).intValue()));
    }
}
