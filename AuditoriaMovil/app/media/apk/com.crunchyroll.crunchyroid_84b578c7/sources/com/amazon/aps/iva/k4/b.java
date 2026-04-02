package com.amazon.aps.iva.k4;

import android.annotation.SuppressLint;
import android.text.Editable;
import com.amazon.aps.iva.i4.i;
/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile b b;
    public static Class<?> c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        if (cls != null) {
            return new i(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
