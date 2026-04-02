package j;

import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class b0 extends c0 {
    public final /* synthetic */ u a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9192b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f9193c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f9194d;

    public b0(u uVar, int i2, byte[] bArr, int i3) {
        this.a = uVar;
        this.f9192b = i2;
        this.f9193c = bArr;
        this.f9194d = i3;
    }

    @Override // j.c0
    public long a() {
        return this.f9192b;
    }

    @Override // j.c0
    @Nullable
    public u b() {
        return this.a;
    }

    @Override // j.c0
    public void c(k.f fVar) throws IOException {
        fVar.D(this.f9193c, this.f9194d, this.f9192b);
    }
}
