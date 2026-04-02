package com.amazon.aps.iva.o60;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o60.j;
import com.amazon.aps.iva.oe0.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: TranslationsParser.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ j h;
    public final /* synthetic */ Map<String, String> i;
    public final /* synthetic */ XmlPullParser j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, LinkedHashMap linkedHashMap, XmlPullParser xmlPullParser) {
        super(0);
        this.h = jVar;
        this.i = linkedHashMap;
        this.j = xmlPullParser;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.getClass();
        j.a.C0557a d = j.d(this.j, FirebaseAnalytics.Param.QUANTITY);
        String str = d.a;
        if (!m.b0(str)) {
            this.i.put(str, d.c);
        }
        return q.a;
    }
}
