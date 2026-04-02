package c.b.c;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class d implements AbsListView.OnScrollListener {
    public final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f809b;

    public d(AlertController alertController, View view, View view2) {
        this.a = view;
        this.f809b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        AlertController.c(absListView, this.a, this.f809b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
