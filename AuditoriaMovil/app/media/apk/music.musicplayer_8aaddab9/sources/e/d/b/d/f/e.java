package e.d.b.d.f;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
/* loaded from: classes2.dex */
public class e implements Runnable {
    public final /* synthetic */ ActionMenuView a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6370b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f6371c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f6372d;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        this.f6372d = bottomAppBar;
        this.a = actionMenuView;
        this.f6370b = i2;
        this.f6371c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActionMenuView actionMenuView = this.a;
        actionMenuView.setTranslationX(this.f6372d.z(actionMenuView, this.f6370b, this.f6371c));
    }
}
