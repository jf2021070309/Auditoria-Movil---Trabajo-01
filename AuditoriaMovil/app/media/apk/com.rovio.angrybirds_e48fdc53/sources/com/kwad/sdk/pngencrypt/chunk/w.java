package com.kwad.sdk.pngencrypt.chunk;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class w {
    private final e aGq;
    private final boolean aGr;

    public w(e eVar) {
        this.aGq = eVar;
        this.aGr = !(eVar instanceof f);
    }

    private List<? extends t> fk(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.aGq.ag("tEXt", str));
        arrayList.addAll(this.aGq.ag("zTXt", str));
        arrayList.addAll(this.aGq.ag("iTXt", str));
        return arrayList;
    }

    public final String fl(String str) {
        List<? extends t> fk = fk(str);
        if (fk.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (t tVar : fk) {
            sb.append(tVar.Hh());
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
