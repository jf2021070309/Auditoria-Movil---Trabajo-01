package com.fyber.inneractive.sdk.j;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.x;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class h {
    boolean a;
    public String b;

    public h(String str) throws Exception {
        this.a = false;
        try {
            a(str);
            this.a = true;
            IAlog.b("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.e("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    private void a(String str) throws XmlPullParserException, IOException {
        String str2;
        IAlog.b("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                if (!newPullParser.getName().equals("tns:Ad")) {
                    a(newPullParser);
                } else {
                    newPullParser.require(2, null, "tns:Ad");
                    IAlog.b("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.d("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.a("Ad content: %s", trim);
                    this.b = trim == null ? null : x.c.a(trim);
                }
            }
        }
    }

    private static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
