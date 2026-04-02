package com.amazon.aps.iva.ya;

import android.os.SystemClock;
import com.amazon.aps.iva.SimidCreativeParser;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.types.CreativeData;
import com.amazon.aps.iva.types.SimidCreative;
import com.amazon.aps.iva.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: SimidCreativeXmlParser.java */
/* loaded from: classes.dex */
public final class b implements SimidCreativeParser {
    public final Gson a;
    public final LinkedHashMap b = new LinkedHashMap();
    public XmlPullParser c;
    public final com.amazon.aps.iva.xa.b d;

    public b(com.amazon.aps.iva.xa.b bVar) {
        try {
            this.c = XmlPullParserFactory.newInstance().newPullParser();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        this.d = bVar;
        this.a = w.c().b();
    }

    public final String a(String str) {
        String str2;
        this.c.require(2, null, str);
        if (this.c.next() == 4) {
            str2 = this.c.getText().trim();
            this.c.nextTag();
        } else {
            str2 = null;
        }
        this.c.require(3, null, str);
        return str2;
    }

    public final void b() {
        int eventType = this.c.getEventType();
        do {
            XmlPullParser xmlPullParser = this.c;
            if (eventType == 0) {
                LogUtils.d("b", "Start document");
            } else if (eventType == 1) {
                LogUtils.d("b", "End document");
            } else if (eventType == 2) {
                LogUtils.d("b", "START_TAG: %s", xmlPullParser.getName());
                if ("ActionableAd".equals(this.c.getName())) {
                    return;
                }
            } else if (eventType == 3) {
                LogUtils.d("b", "END_TAG: %s", xmlPullParser.getName());
            } else if (eventType == 4) {
                LogUtils.d("b", "TEXT: %s", xmlPullParser.getName());
            }
            eventType = this.c.next();
        } while (eventType != 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r13.equals("Error") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ya.b.c(java.lang.String):void");
    }

    @Override // com.amazon.aps.iva.SimidCreativeParser
    public final Map<String, CreativeData> parse(List<SimidCreative> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = this.b;
        com.amazon.aps.iva.xa.b bVar = this.d;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    this.c.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    for (SimidCreative simidCreative : list) {
                        String pubProvidedAdId = simidCreative.getPubProvidedAdId();
                        if (!com.amazon.aps.iva.e.w.f(pubProvidedAdId) && !linkedHashMap.containsKey(pubProvidedAdId)) {
                            this.c.setInput(new StringReader(simidCreative.getSimidCreativeData()));
                            b();
                            c(pubProvidedAdId);
                        }
                        LogUtils.d("b", "Empty or repeated PubProvidedAdId");
                    }
                    bVar.a(new MetricEvent("apsIva-xmlListParserTimer", SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            } catch (JsonSyntaxException e) {
                LogUtils.e("b", String.format("Error Parsing Ad Extension Data Invalid Json: %s", e));
                bVar.a(new MetricEvent("apsIva-parserJsonSyntaxExceptionCounter", Severity.ERROR));
            } catch (IOException e2) {
                LogUtils.e("b", String.format("Error Reading Ad Extension Data: %s", e2));
                bVar.a(new MetricEvent("apsIva-parserIOExceptionCounter", Severity.ERROR));
            } catch (IllegalStateException e3) {
                LogUtils.e("b", String.format("Error Parsing Ad Extension Data: %s", e3));
                bVar.a(new MetricEvent(" apsIva-illegalStateExceptionCounter", Severity.ERROR));
            } catch (XmlPullParserException e4) {
                LogUtils.e("b", String.format("Error Parsing Ad Extension Data Invalid Xml: %s", e4));
                bVar.a(new MetricEvent("apsIva-xmlPullParserExceptionCounter: %s", Severity.ERROR));
            }
        }
        return linkedHashMap;
    }
}
