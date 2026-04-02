package e.b.a.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public boolean f5297c;

    /* renamed from: d  reason: collision with root package name */
    public int f5298d;

    /* renamed from: e  reason: collision with root package name */
    public long f5299e;

    /* renamed from: f  reason: collision with root package name */
    public s f5300f;

    /* renamed from: h  reason: collision with root package name */
    public Long f5302h;
    public final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f5296b = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f5301g = new HashSet();

    public void a() {
        this.f5298d = 2;
        this.f5300f = null;
        this.f5301g.clear();
        this.a.clear();
        this.f5296b.clear();
        this.f5297c = false;
        this.f5302h = null;
        this.f5299e = Long.MIN_VALUE;
    }

    public void b(Collection<String> collection) {
        this.a.clear();
        if (collection != null) {
            this.a.addAll(collection);
        }
    }
}
