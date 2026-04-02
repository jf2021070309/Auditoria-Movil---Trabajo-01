package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import com.amazon.aps.iva.f5.z;
/* loaded from: classes.dex */
public class SearchEditText extends z {
    public a i;

    /* loaded from: classes.dex */
    public interface a {
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            a aVar = this.i;
            if (aVar != null) {
                SearchBar.this.getClass();
                return false;
            }
            return false;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // com.amazon.aps.iva.f5.z, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // com.amazon.aps.iva.f5.z
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(a aVar) {
        this.i = aVar;
    }
}
