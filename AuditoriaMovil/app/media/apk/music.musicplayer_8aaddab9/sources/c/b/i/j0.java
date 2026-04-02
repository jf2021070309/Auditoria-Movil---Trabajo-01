package c.b.i;

import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes.dex */
public class j0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ k0 a;

    public j0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        f0 f0Var;
        if (i2 == -1 || (f0Var = this.a.f1197f) == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
