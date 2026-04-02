package com.fyber.inneractive.sdk.j;

import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.g.a.p;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
/* loaded from: classes.dex */
public final class d extends b {
    g c;
    t d;
    com.fyber.inneractive.sdk.g.a.c e;
    List<com.fyber.inneractive.sdk.g.a.c> f = new ArrayList();
    int g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.j.b
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.j.b
    public final e a() {
        this.a = new g();
        this.c = (g) this.a;
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a3, code lost:
        com.fyber.inneractive.sdk.util.IAlog.b("Vast response parser: no ads found in model. aborting", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b3, code lost:
        throw new com.fyber.inneractive.sdk.d.a.e("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
     */
    @Override // com.fyber.inneractive.sdk.j.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r9, com.fyber.inneractive.sdk.config.t r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.j.d.a(java.lang.String, com.fyber.inneractive.sdk.config.t):void");
    }

    private static p b(String str) throws com.fyber.inneractive.sdk.d.a.e {
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse != null) {
                Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    return p.a(firstChild);
                }
                IAlog.b("XML does not contain a VAST tag as its first child!", new Object[0]);
                throw new Exception("XML does not contain a VAST tag as its first child!");
            }
            return null;
        } catch (Exception e) {
            IAlog.b("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new com.fyber.inneractive.sdk.d.a.e("VastErrorInvalidFile", e.getMessage());
        }
    }
}
