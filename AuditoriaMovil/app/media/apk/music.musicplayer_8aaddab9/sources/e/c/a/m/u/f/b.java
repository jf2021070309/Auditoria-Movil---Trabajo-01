package e.c.a.m.u.f;

import e.c.a.m.s.w;
import java.io.File;
import java.util.Objects;
/* loaded from: classes.dex */
public class b implements w {
    public final T a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.a = file;
    }

    @Override // e.c.a.m.s.w
    public void a() {
    }

    @Override // e.c.a.m.s.w
    public Class c() {
        return this.a.getClass();
    }

    @Override // e.c.a.m.s.w
    public final Object get() {
        return this.a;
    }

    @Override // e.c.a.m.s.w
    public final /* bridge */ /* synthetic */ int getSize() {
        return 1;
    }
}
