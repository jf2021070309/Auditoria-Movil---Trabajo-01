package com.amazon.aps.iva.k4;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
/* compiled from: EmojiKeyListener.java */
/* loaded from: classes.dex */
public final class e implements KeyListener {
    public final KeyListener a;
    public final a b;

    /* compiled from: EmojiKeyListener.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.a = keyListener;
        this.b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean a2;
        boolean z;
        this.b.getClass();
        Object obj = androidx.emoji2.text.d.j;
        if (i != 67) {
            if (i != 112) {
                a2 = false;
            } else {
                a2 = androidx.emoji2.text.f.a(editable, keyEvent, true);
            }
        } else {
            a2 = androidx.emoji2.text.f.a(editable, keyEvent, false);
        }
        if (a2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
