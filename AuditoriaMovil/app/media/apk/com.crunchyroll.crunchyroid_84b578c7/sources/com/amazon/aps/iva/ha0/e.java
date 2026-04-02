package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.fa0.t;
import java.util.HashSet;
/* loaded from: classes4.dex */
public final class e extends c {
    public final HashSet<String> d;

    public e(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        HashSet<String> hashSet = new HashSet<>();
        this.d = hashSet;
        hashSet.add("adbreakend");
        hashSet.add("adbreakstart");
        hashSet.add("adended");
        hashSet.add("aderror");
        hashSet.add("adfirstquartile");
        hashSet.add("admidpoint");
        hashSet.add("adpause");
        hashSet.add("adplay");
        hashSet.add("adplaying");
        hashSet.add("adrequest");
        hashSet.add("adresponse");
        hashSet.add("adthirdquartile");
        hashSet.add("ended");
        hashSet.add("error");
        hashSet.add("hb");
        hashSet.add("pageloadstart");
        hashSet.add("pause");
        hashSet.add("play");
        hashSet.add("playerready");
        hashSet.add("playing");
        hashSet.add("rebufferend");
        hashSet.add("rebufferstart");
        hashSet.add("sampling");
        hashSet.add("seeked");
        hashSet.add("seeking");
        hashSet.add("stalled");
        hashSet.add("videochange");
        hashSet.add("viewend");
        hashSet.add("viewstart");
        hashSet.add("waiting");
        hashSet.add("renditionchange");
        hashSet.add("orientationchange");
        hashSet.add("requestcompleted");
        hashSet.add("requestcanceled");
        hashSet.add("requestfailed");
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        if (this.d.contains(tVar.getType()) && !tVar.h) {
            com.amazon.aps.iva.da0.r rVar = new com.amazon.aps.iva.da0.r(tVar.getType());
            com.amazon.aps.iva.ga0.b bVar = tVar.g;
            if (bVar != null) {
                com.amazon.aps.iva.ga0.b bVar2 = new com.amazon.aps.iva.ga0.b();
                bVar2.e(bVar);
                rVar.B(bVar2);
                rVar.l = bVar2;
            }
            com.amazon.aps.iva.ga0.a aVar = tVar.c;
            if (aVar != null) {
                com.amazon.aps.iva.ga0.a aVar2 = new com.amazon.aps.iva.ga0.a();
                aVar2.e(aVar);
                rVar.B(aVar2);
                rVar.o = aVar2;
            }
            c(rVar);
        }
    }
}
