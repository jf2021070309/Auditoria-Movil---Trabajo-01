package com.amazon.aps.iva.o60;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: TranslationsParser.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ XmlPullParser h;
    public final /* synthetic */ j i;
    public final /* synthetic */ List<String> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(XmlPullParser xmlPullParser, j jVar, ArrayList arrayList) {
        super(0);
        this.h = xmlPullParser;
        this.i = jVar;
        this.j = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        XmlPullParser xmlPullParser = this.h;
        if (xmlPullParser.getEventType() == 4) {
            String text = xmlPullParser.getText();
            com.amazon.aps.iva.yb0.j.e(text, "text");
            this.i.getClass();
            boolean z = false;
            if (com.amazon.aps.iva.oe0.q.i0(text, "\n", false) && m.b0(m.f0(text, "\n", ""))) {
                z = true;
            }
            if (!z) {
                String text2 = xmlPullParser.getText();
                com.amazon.aps.iva.yb0.j.e(text2, "text");
                this.j.add(text2);
            }
        }
        return q.a;
    }
}
