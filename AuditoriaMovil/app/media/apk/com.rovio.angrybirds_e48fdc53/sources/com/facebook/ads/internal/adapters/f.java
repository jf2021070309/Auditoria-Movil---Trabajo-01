package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class f {
    private static final Set<h> a = new HashSet();
    private static final Map<AdPlacementType, String> b = new ConcurrentHashMap();

    static {
        Class cls;
        for (h hVar : h.a()) {
            switch (hVar.l) {
                case BANNER:
                    cls = BannerAdapter.class;
                    break;
                case INTERSTITIAL:
                    cls = InterstitialAdapter.class;
                    break;
                case NATIVE:
                    cls = ab.class;
                    break;
                case INSTREAM:
                    cls = u.class;
                    break;
                case REWARDED_VIDEO:
                    cls = ae.class;
                    break;
                default:
                    cls = null;
                    break;
            }
            if (cls != null) {
                Class<?> cls2 = hVar.i;
                if (cls2 == null) {
                    try {
                        cls2 = Class.forName(hVar.j);
                    } catch (ClassNotFoundException e) {
                    }
                }
                if (cls2 != null && cls.isAssignableFrom(cls2)) {
                    a.add(hVar);
                }
            }
        }
    }

    public static AdAdapter a(g gVar, AdPlacementType adPlacementType) {
        try {
            h b2 = b(gVar, adPlacementType);
            if (b2 != null && a.contains(b2)) {
                Class<?> cls = b2.i;
                if (cls == null) {
                    cls = Class.forName(b2.j);
                }
                return (AdAdapter) cls.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static AdAdapter a(String str, AdPlacementType adPlacementType) {
        return a(g.a(str), adPlacementType);
    }

    public static String a(AdPlacementType adPlacementType) {
        if (b.containsKey(adPlacementType)) {
            return b.get(adPlacementType);
        }
        HashSet hashSet = new HashSet();
        for (h hVar : a) {
            if (hVar.l == adPlacementType) {
                hashSet.add(hVar.k.toString());
            }
        }
        String a2 = com.facebook.ads.internal.q.a.t.a(hashSet, ",");
        b.put(adPlacementType, a2);
        return a2;
    }

    private static h b(g gVar, AdPlacementType adPlacementType) {
        for (h hVar : a) {
            if (hVar.k == gVar && hVar.l == adPlacementType) {
                return hVar;
            }
        }
        return null;
    }
}
