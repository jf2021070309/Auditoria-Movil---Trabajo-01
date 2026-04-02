package com.fyber.inneractive.sdk.j;

import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.g.a.m;
import com.fyber.inneractive.sdk.h.l;
import com.fyber.inneractive.sdk.h.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class g extends e {
    com.fyber.inneractive.sdk.d.a.e D;
    public com.fyber.inneractive.sdk.g.a.a E;
    String H;
    public long a;
    public Map<m, com.fyber.inneractive.sdk.d.a.c> F = new LinkedHashMap();
    public List<com.fyber.inneractive.sdk.g.a.f> G = new ArrayList();
    LinkedHashMap<String, String> I = new LinkedHashMap<>();

    @Override // com.fyber.inneractive.sdk.j.e
    public final InneractiveErrorCode a() {
        return a(null, null);
    }

    @Override // com.fyber.inneractive.sdk.j.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, s sVar) {
        InneractiveErrorCode inneractiveErrorCode;
        l lVar;
        n.b bVar;
        new com.fyber.inneractive.sdk.d.a.f();
        String str = this.l;
        if ("VastErrorInvalidFile".equals(str)) {
            inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            lVar = l.VAST_ERROR_INVALID_RESPONSE;
            if (this.m != null) {
                bVar = new n.b().a("exception", this.m);
            }
            bVar = null;
        } else if ("ErrorNoCompatibleMediaFile".equals(str)) {
            inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            lVar = l.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
            Map<m, com.fyber.inneractive.sdk.d.a.c> map = this.F;
            if (map != null) {
                bVar = com.fyber.inneractive.sdk.d.a.f.a(map);
            }
            bVar = null;
        } else if ("VastErrorTooManyWrappers".equals(str)) {
            inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            lVar = l.VAST_ERROR_TOO_MANY_WRAPPERS;
            bVar = new n.b().a("max", Integer.valueOf(com.fyber.inneractive.sdk.config.a.c()));
        } else {
            if ("ErrorNoMediaFiles".equals(str)) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                lVar = l.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str)) {
                inneractiveErrorCode = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                lVar = l.INTERNAL_CONFIG_MISMATCH;
            } else if ("VastErrorUnsecure".equals(str)) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                lVar = l.VAST_ERROR_UNSECURE_URL;
            } else {
                inneractiveErrorCode = null;
                lVar = null;
                bVar = null;
            }
            bVar = null;
        }
        if (lVar != null) {
            n.a aVar = new n.a(lVar, inneractiveAdRequest, this, sVar == null ? null : sVar.b());
            if (bVar != null) {
                aVar.a(bVar);
            }
            aVar.b(null);
        }
        List<com.fyber.inneractive.sdk.g.a.f> list = this.G;
        if (list != null && list.size() > 0) {
            n.a aVar2 = new n.a(com.fyber.inneractive.sdk.h.m.VAST_EVENT_COMPANION_FILTERED, inneractiveAdRequest, this, sVar == null ? null : sVar.b());
            n.b bVar2 = new n.b();
            JSONArray jSONArray = new JSONArray();
            for (com.fyber.inneractive.sdk.g.a.f fVar : list) {
                jSONArray.put(fVar.a());
            }
            bVar2.a("companion_data", jSONArray);
            aVar2.a(bVar2);
            aVar2.b(null);
        }
        com.fyber.inneractive.sdk.g.a.a aVar3 = this.E;
        int size = aVar3 != null ? aVar3.f.size() : 0;
        List<com.fyber.inneractive.sdk.g.a.f> list2 = this.G;
        int size2 = list2 != null ? list2.size() : 0;
        n.a aVar4 = new n.a(com.fyber.inneractive.sdk.h.m.NUMBER_OF_COMPANIONS, inneractiveAdRequest, this, sVar == null ? null : sVar.b());
        n.b bVar3 = new n.b();
        bVar3.a("number_of_endcards", Integer.valueOf(size + size2));
        aVar4.a(bVar3);
        aVar4.b(null);
        return inneractiveErrorCode;
    }
}
