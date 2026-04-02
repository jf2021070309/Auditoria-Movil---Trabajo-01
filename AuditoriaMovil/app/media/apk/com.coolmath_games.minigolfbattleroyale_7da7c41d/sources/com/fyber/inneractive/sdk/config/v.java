package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.b.c;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.ae;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class v implements w, ae.a {
    Orientation e;
    TapAction i;
    public UnitDisplayType j;
    Boolean a = true;
    public Integer b = 5000;
    public Integer c = 0;
    Boolean d = true;
    Integer f = 0;
    public Integer g = 2048;
    Skip h = Skip.fromValue(0);
    public List<Integer> k = new ArrayList();

    @Override // com.fyber.inneractive.sdk.config.w
    public final Boolean a() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.config.w
    public final Boolean b() {
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.config.w
    public final Orientation d() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.config.w
    public final Integer e() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.config.w
    public final Skip f() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.config.w
    public final TapAction g() {
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.config.w
    public final UnitDisplayType h() {
        return this.j;
    }

    @Override // com.fyber.inneractive.sdk.config.w
    public final boolean i() {
        return com.fyber.inneractive.sdk.util.v.a(this.j);
    }

    public final void a(List<Integer> list, c.b... bVarArr) {
        int i = 0;
        while (true) {
            if (i <= 0) {
                com.fyber.inneractive.sdk.config.b.i a = bVarArr[0].a();
                if (a != null && a.k != null && a.k.size() > 0) {
                    list = a.k;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        this.k = list;
    }

    @Override // com.fyber.inneractive.sdk.util.ae.a
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        ae.a(jSONObject, "autoPlay", this.a);
        ae.a(jSONObject, "maxBitrate", this.b);
        ae.a(jSONObject, "minBitrate", this.c);
        ae.a(jSONObject, "muted", this.d);
        ae.a(jSONObject, AdUnitActivity.EXTRA_ORIENTATION, this.e);
        ae.a(jSONObject, "padding", this.f);
        ae.a(jSONObject, "pivotBitrate", this.g);
        ae.a(jSONObject, "skip", this.h);
        ae.a(jSONObject, "tapAction", this.i);
        ae.a(jSONObject, "unitDisplayType", this.j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        ae.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
