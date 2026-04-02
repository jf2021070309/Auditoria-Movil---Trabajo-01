package com.amazon.aps.iva.v1;
/* compiled from: ClipboardManager.kt */
/* loaded from: classes.dex */
public interface b1 {
    void a(com.amazon.aps.iva.c2.b bVar);

    default boolean b() {
        boolean z;
        com.amazon.aps.iva.c2.b text = getText();
        if (text == null) {
            return false;
        }
        if (text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    com.amazon.aps.iva.c2.b getText();
}
