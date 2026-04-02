package androidx.work;

import android.net.Network;
import android.net.Uri;
import c.c0.c0;
import c.c0.f;
import c.c0.j;
import c.c0.w;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;

    /* renamed from: b  reason: collision with root package name */
    public f f642b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f643c;

    /* renamed from: d  reason: collision with root package name */
    public a f644d;

    /* renamed from: e  reason: collision with root package name */
    public int f645e;

    /* renamed from: f  reason: collision with root package name */
    public Executor f646f;

    /* renamed from: g  reason: collision with root package name */
    public c.c0.d0.t.t.a f647g;

    /* renamed from: h  reason: collision with root package name */
    public c0 f648h;

    /* renamed from: i  reason: collision with root package name */
    public w f649i;

    /* renamed from: j  reason: collision with root package name */
    public j f650j;

    /* loaded from: classes.dex */
    public static class a {
        public List<String> a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f651b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f652c;
    }

    public WorkerParameters(UUID uuid, f fVar, Collection<String> collection, a aVar, int i2, Executor executor, c.c0.d0.t.t.a aVar2, c0 c0Var, w wVar, j jVar) {
        this.a = uuid;
        this.f642b = fVar;
        this.f643c = new HashSet(collection);
        this.f644d = aVar;
        this.f645e = i2;
        this.f646f = executor;
        this.f647g = aVar2;
        this.f648h = c0Var;
        this.f649i = wVar;
        this.f650j = jVar;
    }
}
