package com.amazon.aps.iva.vr;
/* compiled from: AbstractDecorator.java */
/* loaded from: classes2.dex */
public abstract class a {
    public String a;
    public String b;

    public boolean a(com.amazon.aps.iva.ur.b bVar, String str, Object obj) {
        String str2 = this.b;
        if (str2 != null) {
            str = str2;
        }
        bVar.i(String.valueOf(obj), str);
        return false;
    }
}
