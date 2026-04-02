package c.b.c;

import android.view.View;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class c implements Runnable {
    public final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f807b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController f808c;

    public c(AlertController alertController, View view, View view2) {
        this.f808c = alertController;
        this.a = view;
        this.f807b = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.c(this.f808c.A, this.a, this.f807b);
    }
}
