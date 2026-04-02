package j.i0.i;

import j.i0.i.t;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes2.dex */
public class k extends j.i0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9437b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k.d f9438c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f9439d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f9440e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f9441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, String str, Object[] objArr, int i2, k.d dVar, int i3, boolean z) {
        super(str, objArr);
        this.f9441f = gVar;
        this.f9437b = i2;
        this.f9438c = dVar;
        this.f9439d = i3;
        this.f9440e = z;
    }

    @Override // j.i0.b
    public void a() {
        try {
            t tVar = this.f9441f.f9407k;
            k.d dVar = this.f9438c;
            int i2 = this.f9439d;
            Objects.requireNonNull((t.a) tVar);
            dVar.skip(i2);
            this.f9441f.w.u(this.f9437b, b.CANCEL);
            synchronized (this.f9441f) {
                this.f9441f.y.remove(Integer.valueOf(this.f9437b));
            }
        } catch (IOException unused) {
        }
    }
}
