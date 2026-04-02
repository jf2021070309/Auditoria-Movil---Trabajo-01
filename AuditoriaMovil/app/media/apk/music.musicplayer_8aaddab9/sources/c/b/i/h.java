package c.b.i;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes.dex */
public class h extends CheckedTextView {
    public static final int[] a = {16843016};

    /* renamed from: b  reason: collision with root package name */
    public final y f1156b;

    public h(Context context, AttributeSet attributeSet) {
        super(x0.a(context), attributeSet, 16843720);
        v0.a(this, getContext());
        y yVar = new y(this);
        this.f1156b = yVar;
        yVar.e(attributeSet, 16843720);
        yVar.b();
        a1 q = a1.q(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(q.g(0));
        q.f1083b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f1156b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c.b.a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(c.b.d.a.a.b(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.i.a.r0(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1156b;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }
}
