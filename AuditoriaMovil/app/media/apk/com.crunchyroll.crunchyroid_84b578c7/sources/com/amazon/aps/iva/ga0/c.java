package com.amazon.aps.iva.ga0;

import java.util.ArrayList;
/* loaded from: classes4.dex */
public abstract class c {
    public static final ArrayList<String> b;
    public static final ArrayList<String> c;
    public com.amazon.aps.iva.if0.c a = new com.amazon.aps.iva.if0.c();

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        b = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        c = arrayList2;
        arrayList.add("qrphe");
        arrayList.add("qrfls");
        arrayList2.add("media");
    }

    public final String a(String str) {
        if (!this.a.has(str)) {
            return null;
        }
        String string = this.a.getString(str);
        if (string.isEmpty()) {
            return null;
        }
        return string;
    }

    public final void b(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void c(com.amazon.aps.iva.if0.c cVar) {
        this.a = new com.amazon.aps.iva.if0.c(cVar.toString());
        d();
    }

    public abstract void d();

    public final void e(c cVar) {
        com.amazon.aps.iva.if0.c cVar2;
        Object jSONArray;
        if (cVar != null) {
            synchronized (this) {
                synchronized (cVar) {
                    com.amazon.aps.iva.if0.c cVar3 = cVar.a;
                    com.amazon.aps.iva.if0.a names = cVar3.names();
                    if (names != null) {
                        for (int i = 0; i < names.e(); i++) {
                            String str = (String) names.get(i);
                            ArrayList<String> arrayList = b;
                            if (arrayList.contains(str)) {
                                cVar2 = this.a;
                                jSONArray = cVar3.getJSONObject(str);
                            } else if (arrayList.contains(str)) {
                                cVar2 = this.a;
                                jSONArray = cVar3.getJSONArray(str);
                            } else {
                                b(str, cVar3.getString(str));
                            }
                            cVar2.put(str, jSONArray);
                        }
                    }
                }
            }
        }
    }
}
