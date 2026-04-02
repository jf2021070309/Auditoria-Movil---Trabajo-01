package e.d.b.d.y;

import android.widget.AutoCompleteTextView;
/* loaded from: classes2.dex */
public class k implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ h a;

    public k(h hVar) {
        this.a = hVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        h hVar = this.a;
        hVar.f6695k = true;
        hVar.f6697m = System.currentTimeMillis();
        h.f(this.a, false);
    }
}
