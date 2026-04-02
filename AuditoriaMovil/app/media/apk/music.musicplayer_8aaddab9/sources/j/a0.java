package j;

import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class a0 extends c0 {
    public final /* synthetic */ u a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.h f9191b;

    public a0(u uVar, k.h hVar) {
        this.a = uVar;
        this.f9191b = hVar;
    }

    @Override // j.c0
    public long a() throws IOException {
        return this.f9191b.i();
    }

    @Override // j.c0
    @Nullable
    public u b() {
        return this.a;
    }

    @Override // j.c0
    public void c(k.f fVar) throws IOException {
        fVar.P(this.f9191b);
    }
}
