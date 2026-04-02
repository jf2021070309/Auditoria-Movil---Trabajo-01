package e.b.a.a;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class h implements Serializable {
    public volatile transient boolean a;

    /* renamed from: c  reason: collision with root package name */
    public transient int f5324c;

    /* renamed from: g  reason: collision with root package name */
    public transient String f5328g;

    /* renamed from: i  reason: collision with root package name */
    public transient boolean f5330i;

    /* renamed from: j  reason: collision with root package name */
    public transient Set<String> f5331j;

    /* renamed from: k  reason: collision with root package name */
    public volatile transient boolean f5332k;

    /* renamed from: h  reason: collision with root package name */
    public transient String f5329h = UUID.randomUUID().toString();

    /* renamed from: b  reason: collision with root package name */
    public transient int f5323b = 0;

    /* renamed from: f  reason: collision with root package name */
    public transient long f5327f = Math.max(0L, 0L);

    /* renamed from: e  reason: collision with root package name */
    public transient long f5326e = Math.max(0L, 0L);

    /* renamed from: d  reason: collision with root package name */
    public transient boolean f5325d = Boolean.TRUE.equals(null);

    public h(o oVar) {
        this.f5324c = oVar.a;
        this.f5330i = oVar.f5379c;
        this.f5328g = oVar.f5378b;
        HashSet<String> hashSet = oVar.f5380d;
        if (hashSet != null) {
            this.f5331j = Collections.unmodifiableSet(hashSet);
        }
        long j2 = this.f5326e;
        if (j2 <= 0 || j2 >= this.f5327f) {
            return;
        }
        StringBuilder y = e.a.d.a.a.y("deadline cannot be less than the delay. It does not make sense. deadline:");
        y.append(this.f5326e);
        y.append(",delay:");
        y.append(this.f5327f);
        throw new IllegalArgumentException(y.toString());
    }

    public final String a() {
        Set<String> set = this.f5331j;
        if (set != null) {
            for (String str : set) {
                if (str != null && str.startsWith("job-single-id:")) {
                    return str;
                }
            }
            return null;
        }
        return null;
    }

    public abstract void b();

    public abstract void f(int i2, Throwable th);

    public abstract void h() throws Throwable;

    public abstract q i(Throwable th, int i2, int i3);
}
