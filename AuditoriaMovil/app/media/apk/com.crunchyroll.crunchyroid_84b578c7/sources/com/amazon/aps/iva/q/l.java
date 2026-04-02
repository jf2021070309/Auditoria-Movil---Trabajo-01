package com.amazon.aps.iva.q;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.amazon.aps.iva.k4.a;
import com.amazon.aps.iva.k4.g;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class l {
    public final EditText a;
    public final com.amazon.aps.iva.k4.a b;

    public l(EditText editText) {
        this.a = editText;
        this.b = new com.amazon.aps.iva.k4.a(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            this.b.a.getClass();
            if (!(keyListener instanceof com.amazon.aps.iva.k4.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new com.amazon.aps.iva.k4.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        com.amazon.aps.iva.k4.a aVar = this.b;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0431a c0431a = aVar.a;
        c0431a.getClass();
        if (!(inputConnection instanceof com.amazon.aps.iva.k4.c)) {
            return new com.amazon.aps.iva.k4.c(c0431a.a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void d(boolean z) {
        com.amazon.aps.iva.k4.g gVar = this.b.a.b;
        if (gVar.e != z) {
            if (gVar.d != null) {
                androidx.emoji2.text.d a = androidx.emoji2.text.d.a();
                g.a aVar = gVar.d;
                a.getClass();
                com.amazon.aps.iva.cq.b.A(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.e = z;
            if (z) {
                com.amazon.aps.iva.k4.g.a(gVar.b, androidx.emoji2.text.d.a().b());
            }
        }
    }
}
