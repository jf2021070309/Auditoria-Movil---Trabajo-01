package com.fyber.inneractive.sdk.g.a;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.d.a.a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ap;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public final class f {
    public Integer a;
    public Integer b;
    public i c;
    public String d;
    public String e;
    public String f;
    public List<String> g;
    public a.C0040a h;
    public List<q> i;
    private String j;
    private String k;
    private Integer l;
    private Integer m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Node node) {
        i iVar;
        this.a = ap.d(node, ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        this.b = ap.d(node, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        this.j = ap.c(node, "id");
        this.k = ap.c(node, "apiFramework");
        this.l = ap.d(node, "expandedWidth");
        this.m = ap.d(node, "expandedHeight");
        Node a = ap.a(node, "StaticResource");
        if (a != null) {
            if (a == null) {
                iVar = null;
            } else {
                i iVar2 = new i();
                iVar2.a = ap.c(a, "creativeType");
                iVar2.b = ap.a(a);
                iVar = iVar2;
            }
            if (iVar != null) {
                this.c = iVar;
            }
        }
        Node a2 = ap.a(node, "HTMLResource");
        if (a2 != null) {
            this.e = ap.a(a2);
        }
        Node a3 = ap.a(node, "IFrameResource");
        if (a3 != null) {
            this.d = ap.a(a3);
        }
        Node a4 = ap.a(node, "CompanionClickThrough");
        if (a4 != null) {
            this.f = ap.a(a4);
        }
        List<Node> b = ap.b(node, "CompanionClickTracking");
        if (b.size() > 0) {
            this.g = new ArrayList();
            for (Node node2 : b) {
                String a5 = ap.a(node2);
                if (!TextUtils.isEmpty(a5)) {
                    this.g.add(a5);
                }
            }
        }
        Node a6 = ap.a(node, "TrackingEvents");
        if (a6 != null) {
            List<Node> b2 = ap.b(a6, "Tracking");
            if (b2.isEmpty()) {
                return;
            }
            this.i = new ArrayList();
            for (Node node3 : b2) {
                q a7 = q.a(node3);
                if (a7 != null) {
                    this.i.add(a7);
                }
            }
        }
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.a);
            jSONObject.put("h", this.b);
            jSONObject.put("ctr", this.f);
            jSONObject.put("clt", this.g);
            if (this.e != null) {
                jSONObject.put("content", this.e);
                str = "HTMLResource";
            } else {
                str = null;
            }
            if (this.c != null) {
                jSONObject.put("content", this.c.b);
                jSONObject.put("creativeType", this.c.a);
                str = "StaticResource";
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("content", this.d);
                str = "iFrameResource";
            }
            if (str != null) {
                jSONObject.put("type", str);
            }
            if (this.h != null) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, this.h.a);
            }
            return jSONObject;
        } catch (JSONException e) {
            IAlog.b("Failed creating Companion json object: %s", e.getMessage());
            return null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.a);
        sb.append(" h:");
        sb.append(this.b);
        sb.append(" ctr:");
        sb.append(this.f);
        sb.append(" clt:");
        sb.append(this.g);
        if (!TextUtils.isEmpty(this.e)) {
            sb.append(" html:");
            sb.append(this.e);
        }
        if (this.c != null) {
            sb.append(" static:");
            sb.append(this.c.b);
            sb.append("creative:");
            sb.append(this.c.a);
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(" iframe:");
            sb.append(this.d);
        }
        sb.append(" events:");
        sb.append(this.i);
        if (this.h != null) {
            sb.append(" reason:");
            sb.append(this.h.a);
        }
        return sb.toString();
    }
}
