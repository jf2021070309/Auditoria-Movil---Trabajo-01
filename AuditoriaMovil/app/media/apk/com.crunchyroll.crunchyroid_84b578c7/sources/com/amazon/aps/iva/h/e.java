package com.amazon.aps.iva.h;

import java.util.HashMap;
/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public final class e extends c<Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ com.amazon.aps.iva.i.a b;
    public final /* synthetic */ androidx.activity.result.a c;

    public e(androidx.activity.result.a aVar, String str, com.amazon.aps.iva.i.a aVar2) {
        this.c = aVar;
        this.a = str;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.h.c
    public final void a(Object obj) {
        androidx.activity.result.a aVar = this.c;
        HashMap hashMap = aVar.b;
        String str = this.a;
        Integer num = (Integer) hashMap.get(str);
        com.amazon.aps.iva.i.a aVar2 = this.b;
        if (num != null) {
            aVar.d.add(str);
            try {
                aVar.b(num.intValue(), aVar2, obj);
                return;
            } catch (Exception e) {
                aVar.d.remove(str);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public final void b() {
        this.c.f(this.a);
    }
}
