package c.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class g implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f813b;

    public g(AlertController.b bVar, AlertController alertController) {
        this.f813b = bVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f813b.f138n.onClick(this.a.f112b, i2);
        if (this.f813b.r) {
            return;
        }
        this.a.f112b.dismiss();
    }
}
