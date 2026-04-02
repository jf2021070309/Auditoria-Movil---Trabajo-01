package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public enum h {
    ANBANNER(k.class, g.AN, AdPlacementType.BANNER),
    ANINTERSTITIAL(m.class, g.AN, AdPlacementType.INTERSTITIAL),
    ADMOBNATIVE(e.class, g.ADMOB, AdPlacementType.NATIVE),
    ANNATIVE(o.class, g.AN, AdPlacementType.NATIVE),
    ANINSTREAMVIDEO(l.class, g.AN, AdPlacementType.INSTREAM),
    ANREWARDEDVIDEO(p.class, g.AN, AdPlacementType.REWARDED_VIDEO),
    INMOBINATIVE(t.class, g.INMOBI, AdPlacementType.NATIVE),
    YAHOONATIVE(q.class, g.YAHOO, AdPlacementType.NATIVE);
    
    private static List<h> m;
    public Class<?> i;
    public String j;
    public g k;
    public AdPlacementType l;

    h(Class cls, g gVar, AdPlacementType adPlacementType) {
        this.i = cls;
        this.k = gVar;
        this.l = adPlacementType;
    }

    public static List<h> a() {
        if (m == null) {
            synchronized (h.class) {
                m = new ArrayList();
                m.add(ANBANNER);
                m.add(ANINTERSTITIAL);
                m.add(ANNATIVE);
                m.add(ANINSTREAMVIDEO);
                m.add(ANREWARDEDVIDEO);
                if (z.a(g.YAHOO)) {
                    m.add(YAHOONATIVE);
                }
                if (z.a(g.INMOBI)) {
                    m.add(INMOBINATIVE);
                }
                if (z.a(g.ADMOB)) {
                    m.add(ADMOBNATIVE);
                }
            }
        }
        return m;
    }
}
