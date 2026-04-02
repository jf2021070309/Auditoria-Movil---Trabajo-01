package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController.RecycleListView b;
    public final /* synthetic */ AlertController c;
    public final /* synthetic */ AlertController.b d;

    public d(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.d = bVar;
        this.b = recycleListView;
        this.c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.b bVar = this.d;
        boolean[] zArr = bVar.E;
        AlertController.RecycleListView recycleListView = this.b;
        if (zArr != null) {
            zArr[i] = recycleListView.isItemChecked(i);
        }
        bVar.I.onClick(this.c.b, i, recycleListView.isItemChecked(i));
    }
}
