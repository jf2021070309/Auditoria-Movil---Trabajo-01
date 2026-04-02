package e.d.d.p.k;

import java.io.IOException;
/* loaded from: classes2.dex */
public class i implements e.d.d.p.h {
    public boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7564b = false;

    /* renamed from: c  reason: collision with root package name */
    public e.d.d.p.d f7565c;

    /* renamed from: d  reason: collision with root package name */
    public final g f7566d;

    public i(g gVar) {
        this.f7566d = gVar;
    }

    @Override // e.d.d.p.h
    public e.d.d.p.h add(String str) throws IOException {
        if (this.a) {
            throw new e.d.d.p.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.f7566d.a(this.f7565c, str, this.f7564b);
        return this;
    }

    @Override // e.d.d.p.h
    public e.d.d.p.h add(boolean z) throws IOException {
        if (this.a) {
            throw new e.d.d.p.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.f7566d.b(this.f7565c, z ? 1 : 0, this.f7564b);
        return this;
    }
}
