package e.d.d.m.j.k;

import ch.qos.logback.core.rolling.helper.Compressor;
import e.d.d.m.j.j.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class h {
    public final a a = new a(this, false);

    /* renamed from: b  reason: collision with root package name */
    public final a f7255b = new a(this, true);

    /* renamed from: c  reason: collision with root package name */
    public final AtomicMarkableReference<String> f7256c = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes2.dex */
    public class a {
        public final AtomicMarkableReference<b> a;

        public a(h hVar, boolean z) {
            new AtomicReference(null);
            this.a = new AtomicMarkableReference<>(new b(64, z ? Compressor.BUFFER_SIZE : 1024), false);
        }

        public Map<String, String> a() {
            Map<String, String> unmodifiableMap;
            b reference = this.a.getReference();
            synchronized (reference) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
            }
            return unmodifiableMap;
        }
    }

    public h(String str, e.d.d.m.j.n.f fVar, m mVar) {
    }
}
