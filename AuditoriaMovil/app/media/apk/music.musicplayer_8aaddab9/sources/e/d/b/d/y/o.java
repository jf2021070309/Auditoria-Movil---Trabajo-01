package e.d.b.d.y;

import android.view.View;
import android.widget.AdapterView;
import c.b.i.k0;
/* loaded from: classes2.dex */
public class o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        Object item;
        if (i2 < 0) {
            k0 k0Var = this.a.f6723d;
            item = !k0Var.a() ? null : k0Var.f1197f.getSelectedItem();
        } else {
            item = this.a.getAdapter().getItem(i2);
        }
        p.a(this.a, item);
        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i2 < 0) {
                k0 k0Var2 = this.a.f6723d;
                view = k0Var2.a() ? k0Var2.f1197f.getSelectedView() : null;
                k0 k0Var3 = this.a.f6723d;
                i2 = !k0Var3.a() ? -1 : k0Var3.f1197f.getSelectedItemPosition();
                k0 k0Var4 = this.a.f6723d;
                j2 = !k0Var4.a() ? Long.MIN_VALUE : k0Var4.f1197f.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.a.f6723d.f1197f, view, i2, j2);
        }
        this.a.f6723d.dismiss();
    }
}
