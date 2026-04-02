package c.b.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class f extends ArrayAdapter<CharSequence> {
    public final /* synthetic */ AlertController.RecycleListView a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AlertController.b bVar, Context context, int i2, int i3, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i2, i3, charSequenceArr);
        this.f812b = bVar;
        this.a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        boolean[] zArr = this.f812b.p;
        if (zArr != null && zArr[i2]) {
            this.a.setItemChecked(i2, true);
        }
        return view2;
    }
}
