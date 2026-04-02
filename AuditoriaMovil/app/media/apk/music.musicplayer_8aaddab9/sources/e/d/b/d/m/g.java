package e.d.b.d.m;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
/* loaded from: classes2.dex */
public class g extends RecyclerView.r {
    public final /* synthetic */ r a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f6433b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f6434c;

    public g(d dVar, r rVar, MaterialButton materialButton) {
        this.f6434c = dVar;
        this.a = rVar;
        this.f6433b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f6433b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(RecyclerView recyclerView, int i2, int i3) {
        int m1 = i2 < 0 ? this.f6434c.c().m1() : this.f6434c.c().n1();
        this.f6434c.f6422f = this.a.j(m1);
        MaterialButton materialButton = this.f6433b;
        r rVar = this.a;
        materialButton.setText(rVar.f6460e.a.h(m1).g(rVar.f6459d));
    }
}
