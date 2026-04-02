package e.d.b.d.r;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes2.dex */
public class a extends c.i.k.e {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f6509d;

    public a(CheckableImageButton checkableImageButton) {
        this.f6509d = checkableImageButton;
    }

    @Override // c.i.k.e
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f6509d.isChecked());
    }

    @Override // c.i.k.e
    public void d(View view, c.i.k.k0.b bVar) {
        this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
        bVar.f2193b.setCheckable(this.f6509d.f4661e);
        bVar.f2193b.setChecked(this.f6509d.isChecked());
    }
}
