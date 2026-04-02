package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class a extends ArrayAdapter<CharSequence> {
    public final /* synthetic */ AlertController.RecycleListView b;
    public final /* synthetic */ AlertController.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AlertController.b bVar, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.c = bVar;
        this.b = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.c.E;
        if (zArr != null && zArr[i]) {
            this.b.setItemChecked(i, true);
        }
        return view2;
    }
}
