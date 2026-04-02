package c.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class h implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController.RecycleListView a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController f814b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f815c;

    public h(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f815c = bVar;
        this.a = recycleListView;
        this.f814b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        boolean[] zArr = this.f815c.p;
        if (zArr != null) {
            zArr[i2] = this.a.isItemChecked(i2);
        }
        this.f815c.t.onClick(this.f814b.f112b, i2, this.a.isItemChecked(i2));
    }
}
