package j.i0.i;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class i extends j.i0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9430b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f9431c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f9432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, Object[] objArr, int i2, List list) {
        super(str, objArr);
        this.f9432d = gVar;
        this.f9430b = i2;
        this.f9431c = list;
    }

    @Override // j.i0.b
    public void a() {
        Objects.requireNonNull(this.f9432d.f9407k);
        try {
            this.f9432d.w.u(this.f9430b, b.CANCEL);
            synchronized (this.f9432d) {
                this.f9432d.y.remove(Integer.valueOf(this.f9430b));
            }
        } catch (IOException unused) {
        }
    }
}
