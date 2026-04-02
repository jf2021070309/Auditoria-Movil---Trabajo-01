package c.b.c;

import android.view.View;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class e implements Runnable {
    public final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f810b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController f811c;

    public e(AlertController alertController, View view, View view2) {
        this.f811c = alertController;
        this.a = view;
        this.f810b = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.c(this.f811c.f117g, this.a, this.f810b);
    }
}
