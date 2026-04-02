package com.amazon.aps.iva.k4;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;
/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
public final class g implements TextWatcher {
    public final EditText b;
    public a d;
    public final boolean c = false;
    public boolean e = true;

    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: classes.dex */
    public static class a extends d.f implements Runnable {
        public final WeakReference b;

        public a(EditText editText) {
            this.b = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            Handler handler;
            EditText editText = (EditText) this.b.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.a((EditText) this.b.get(), 1);
        }
    }

    public g(EditText editText) {
        this.b = editText;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        EditText editText = this.b;
        if (!editText.isInEditMode()) {
            if (this.e && (this.c || androidx.emoji2.text.d.c())) {
                z = false;
            } else {
                z = true;
            }
            if (!z && i2 <= i3 && (charSequence instanceof Spannable)) {
                int b = androidx.emoji2.text.d.a().b();
                if (b != 0) {
                    if (b != 1) {
                        if (b != 3) {
                            return;
                        }
                    } else {
                        androidx.emoji2.text.d.a().g(i, i3 + i, (Spannable) charSequence);
                        return;
                    }
                }
                androidx.emoji2.text.d a2 = androidx.emoji2.text.d.a();
                if (this.d == null) {
                    this.d = new a(editText);
                }
                a2.i(this.d);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
