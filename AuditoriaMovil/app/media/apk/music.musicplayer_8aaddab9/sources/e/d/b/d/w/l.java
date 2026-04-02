package e.d.b.d.w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import e.d.b.d.w.m;
import java.util.List;
/* loaded from: classes2.dex */
public class l extends m.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f6649b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f6650c;

    public l(m mVar, List list, Matrix matrix) {
        this.f6649b = list;
        this.f6650c = matrix;
    }

    @Override // e.d.b.d.w.m.f
    public void a(Matrix matrix, e.d.b.d.v.a aVar, int i2, Canvas canvas) {
        for (m.f fVar : this.f6649b) {
            fVar.a(this.f6650c, aVar, i2, canvas);
        }
    }
}
