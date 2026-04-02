package j.i0.i;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class j extends j.i0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9433b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f9434c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f9435d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f9436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, String str, Object[] objArr, int i2, List list, boolean z) {
        super(str, objArr);
        this.f9436e = gVar;
        this.f9433b = i2;
        this.f9434c = list;
        this.f9435d = z;
    }

    @Override // j.i0.b
    public void a() {
        Objects.requireNonNull(this.f9436e.f9407k);
        try {
            this.f9436e.w.u(this.f9433b, b.CANCEL);
            synchronized (this.f9436e) {
                this.f9436e.y.remove(Integer.valueOf(this.f9433b));
            }
        } catch (IOException unused) {
        }
    }
}
