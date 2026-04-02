package com.amazon.aps.iva.o0;

import java.util.ArrayList;
import java.util.regex.Matcher;
/* compiled from: Stack.kt */
/* loaded from: classes.dex */
public final class o3 {
    public Object a;

    public o3(Object obj) {
        this.a = obj;
    }

    public final boolean a(CharSequence charSequence, com.amazon.aps.iva.ab0.g gVar) {
        String str = gVar.c;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((com.amazon.aps.iva.bb0.b) this.a).a(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }

    public final Object b() {
        Object obj = this.a;
        return ((ArrayList) obj).remove(((ArrayList) obj).size() - 1);
    }

    public final void c(Object obj) {
        ((ArrayList) this.a).add(obj);
    }

    public o3(int i) {
        if (i != 2) {
            this.a = new ArrayList();
        } else {
            this.a = new com.amazon.aps.iva.bb0.b();
        }
    }
}
