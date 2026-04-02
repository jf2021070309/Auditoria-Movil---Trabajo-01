package com.amazon.aps.iva.k4;

import android.widget.EditText;
/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {
    public final C0431a a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: com.amazon.aps.iva.k4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0431a extends b {
        public final EditText a;
        public final g b;

        public C0431a(EditText editText) {
            this.a = editText;
            g gVar = new g(editText);
            this.b = gVar;
            editText.addTextChangedListener(gVar);
            if (com.amazon.aps.iva.k4.b.b == null) {
                synchronized (com.amazon.aps.iva.k4.b.a) {
                    if (com.amazon.aps.iva.k4.b.b == null) {
                        com.amazon.aps.iva.k4.b.b = new com.amazon.aps.iva.k4.b();
                    }
                }
            }
            editText.setEditableFactory(com.amazon.aps.iva.k4.b.b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.a = new C0431a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
