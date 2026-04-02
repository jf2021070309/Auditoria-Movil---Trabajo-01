package com.amazon.aps.iva.k4;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;
/* compiled from: EmojiInputFilter.java */
/* loaded from: classes.dex */
public final class d implements InputFilter {
    public final TextView a;
    public a b;

    /* compiled from: EmojiInputFilter.java */
    /* loaded from: classes.dex */
    public static class a extends d.f implements Runnable {
        public final WeakReference b;
        public final WeakReference c;

        public a(TextView textView, d dVar) {
            this.b = new WeakReference(textView);
            this.c = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            Handler handler;
            TextView textView = (TextView) this.b.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            CharSequence text;
            CharSequence h;
            InputFilter[] filters;
            TextView textView = (TextView) this.b.get();
            InputFilter inputFilter = (InputFilter) this.c.get();
            boolean z = false;
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i = 0;
                while (true) {
                    if (i >= filters.length) {
                        break;
                    } else if (filters[i] == inputFilter) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!z || !textView.isAttachedToWindow() || text == (h = androidx.emoji2.text.d.a().h((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(h);
            int selectionEnd = Selection.getSelectionEnd(h);
            textView.setText(h);
            if (h instanceof Spannable) {
                Spannable spannable = (Spannable) h;
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(spannable, selectionStart);
                } else if (selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionEnd);
                }
            }
        }
    }

    public d(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b = androidx.emoji2.text.d.a().b();
        if (b != 0) {
            boolean z = true;
            if (b != 1) {
                if (b != 3) {
                    return charSequence;
                }
            } else {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z = false;
                }
                if (z && charSequence != null) {
                    if (i != 0 || i2 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i, i2);
                    }
                    return androidx.emoji2.text.d.a().g(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.d a2 = androidx.emoji2.text.d.a();
        if (this.b == null) {
            this.b = new a(textView, this);
        }
        a2.i(this.b);
        return charSequence;
    }
}
