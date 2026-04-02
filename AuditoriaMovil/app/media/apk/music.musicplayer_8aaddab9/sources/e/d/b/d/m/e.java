package e.d.b.d.m;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
/* loaded from: classes2.dex */
public class e extends RecyclerView.l {
    public final Calendar a = w.e();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f6430b = w.e();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f6431c;

    public e(d dVar) {
        this.f6431c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            y yVar = (y) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (c.i.j.b<Long, Long> bVar : this.f6431c.f6420d.f()) {
                Long l2 = bVar.a;
                if (l2 != null && bVar.f2126b != null) {
                    this.a.setTimeInMillis(l2.longValue());
                    this.f6430b.setTimeInMillis(bVar.f2126b.longValue());
                    int j2 = yVar.j(this.a.get(1));
                    int j3 = yVar.j(this.f6430b.get(1));
                    View v = gridLayoutManager.v(j2);
                    View v2 = gridLayoutManager.v(j3);
                    int i2 = gridLayoutManager.H;
                    int i3 = j2 / i2;
                    int i4 = j3 / i2;
                    for (int i5 = i3; i5 <= i4; i5++) {
                        View v3 = gridLayoutManager.v(gridLayoutManager.H * i5);
                        if (v3 != null) {
                            int top = v3.getTop() + this.f6431c.f6424h.f6410d.a.top;
                            int bottom = v3.getBottom() - this.f6431c.f6424h.f6410d.a.bottom;
                            canvas.drawRect(i5 == i3 ? (v.getWidth() / 2) + v.getLeft() : 0, top, i5 == i4 ? (v2.getWidth() / 2) + v2.getLeft() : recyclerView.getWidth(), bottom, this.f6431c.f6424h.f6414h);
                        }
                    }
                }
            }
        }
    }
}
