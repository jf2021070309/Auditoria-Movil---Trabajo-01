package com.amazon.aps.iva.m3;

import com.amazon.aps.iva.m3.j;
import java.util.ArrayList;
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class i implements com.amazon.aps.iva.o3.a<j.a> {
    public final /* synthetic */ String a;

    public i(String str) {
        this.a = str;
    }

    @Override // com.amazon.aps.iva.o3.a
    public final void a(j.a aVar) {
        j.a aVar2 = aVar;
        synchronized (j.c) {
            com.amazon.aps.iva.x.h<String, ArrayList<com.amazon.aps.iva.o3.a<j.a>>> hVar = j.d;
            ArrayList<com.amazon.aps.iva.o3.a<j.a>> orDefault = hVar.getOrDefault(this.a, null);
            if (orDefault != null) {
                hVar.remove(this.a);
                for (int i = 0; i < orDefault.size(); i++) {
                    orDefault.get(i).a(aVar2);
                }
            }
        }
    }
}
