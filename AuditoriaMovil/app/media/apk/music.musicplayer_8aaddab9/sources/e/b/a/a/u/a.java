package e.b.a.a.u;

import e.b.a.a.e;
import e.b.a.a.i;
import e.b.a.a.m;
import java.util.Set;
/* loaded from: classes.dex */
public class a implements m {
    public Integer a;

    /* renamed from: b  reason: collision with root package name */
    public m f5386b;

    public a(m mVar) {
        this.f5386b = mVar;
    }

    @Override // e.b.a.a.m
    public Set<i> a(e eVar) {
        return this.f5386b.a(eVar);
    }

    @Override // e.b.a.a.m
    public int b(e eVar) {
        Integer num = this.a;
        if (num != null && num.intValue() == 0) {
            return 0;
        }
        return this.f5386b.b(eVar);
    }

    @Override // e.b.a.a.m
    public void c(i iVar) {
        this.a = null;
        this.f5386b.c(iVar);
    }

    @Override // e.b.a.a.m
    public void clear() {
        this.a = null;
        this.f5386b.clear();
    }

    @Override // e.b.a.a.m
    public void d(i iVar, i iVar2) {
        this.a = null;
        this.f5386b.d(iVar, iVar2);
    }

    @Override // e.b.a.a.m
    public i e(e eVar) {
        Integer num;
        Integer num2 = this.a;
        if (num2 != null && num2.intValue() == 0) {
            return null;
        }
        i e2 = this.f5386b.e(eVar);
        if (e2 != null && (num = this.a) != null) {
            this.a = Integer.valueOf(num.intValue() - 1);
        }
        return e2;
    }

    @Override // e.b.a.a.m
    public i f(String str) {
        return this.f5386b.f(str);
    }

    @Override // e.b.a.a.m
    public boolean g(i iVar) {
        this.a = null;
        return this.f5386b.g(iVar);
    }

    @Override // e.b.a.a.m
    public Long h(e eVar) {
        return this.f5386b.h(eVar);
    }

    @Override // e.b.a.a.m
    public boolean i(i iVar) {
        this.a = null;
        return this.f5386b.i(iVar);
    }

    @Override // e.b.a.a.m
    public void j(i iVar) {
        this.a = null;
        this.f5386b.j(iVar);
    }

    @Override // e.b.a.a.m
    public int k() {
        if (this.a == null) {
            this.a = Integer.valueOf(this.f5386b.k());
        }
        return this.a.intValue();
    }
}
