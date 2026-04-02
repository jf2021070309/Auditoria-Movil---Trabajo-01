package com.kwad.components.core.n.a.c.a;

import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {
    private static final Map<Integer, AdTemplate> Lv = new HashMap();

    public static void a(int i, AdTemplate adTemplate) {
        Lv.put(Integer.valueOf(i), adTemplate);
    }

    public static AdTemplate au(int i) {
        return Lv.get(Integer.valueOf(i));
    }

    public static void av(int i) {
        Lv.remove(Integer.valueOf(i));
    }
}
