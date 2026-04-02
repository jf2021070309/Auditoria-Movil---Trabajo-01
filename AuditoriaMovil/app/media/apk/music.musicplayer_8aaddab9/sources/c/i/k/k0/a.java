package c.i.k.k0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2191b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2192c;

    public a(int i2, b bVar, int i3) {
        this.a = i2;
        this.f2191b = bVar;
        this.f2192c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        b bVar = this.f2191b;
        bVar.f2193b.performAction(this.f2192c, bundle);
    }
}
