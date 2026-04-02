package e.d.b.d.y;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
/* loaded from: classes2.dex */
public class j implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f6702b;

    public j(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f6702b = hVar;
        this.a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f6702b.i()) {
                this.f6702b.f6695k = false;
            }
            h.g(this.f6702b, this.a);
        }
        return false;
    }
}
