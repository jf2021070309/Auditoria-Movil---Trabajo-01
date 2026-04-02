package e.d.b.d.m;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import e.d.b.d.m.d;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class q implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f6458b;

    public q(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6458b = rVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        p adapter2 = this.a.getAdapter2();
        if (i2 >= adapter2.b() && i2 <= adapter2.d()) {
            d.f fVar = this.f6458b.f6462g;
            long longValue = this.a.getAdapter2().getItem(i2).longValue();
            d.C0141d c0141d = (d.C0141d) fVar;
            if (d.this.f6421e.f4628c.z(longValue)) {
                d.this.f6420d.Q(longValue);
                Iterator it = d.this.a.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a(d.this.f6420d.K());
                }
                d.this.f6426j.getAdapter().a.b();
                RecyclerView recyclerView = d.this.f6425i;
                if (recyclerView != null) {
                    recyclerView.getAdapter().a.b();
                }
            }
        }
    }
}
