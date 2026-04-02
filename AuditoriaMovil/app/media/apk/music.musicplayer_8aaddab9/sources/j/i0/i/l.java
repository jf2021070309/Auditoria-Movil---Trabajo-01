package j.i0.i;

import j.i0.i.t;
import java.util.Objects;
/* loaded from: classes2.dex */
public class l extends j.i0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9442b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f9443c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f9444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String str, Object[] objArr, int i2, b bVar) {
        super(str, objArr);
        this.f9444d = gVar;
        this.f9442b = i2;
        this.f9443c = bVar;
    }

    @Override // j.i0.b
    public void a() {
        Objects.requireNonNull((t.a) this.f9444d.f9407k);
        synchronized (this.f9444d) {
            this.f9444d.y.remove(Integer.valueOf(this.f9442b));
        }
    }
}
