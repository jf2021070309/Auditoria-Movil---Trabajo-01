package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.t;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends com.fyber.inneractive.sdk.j.b {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.j.b
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.j.b
    public final boolean c() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.j.b
    public final void a(String str, t tVar) {
        try {
            ((f) this.a).a = new JSONObject(str).getString("adm");
        } catch (JSONException e) {
            com.fyber.inneractive.sdk.dv.c.b.a(tVar != null ? tVar.b : null, com.fyber.inneractive.sdk.dv.b.a.Parse, null, null, e.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.j.b
    public final com.fyber.inneractive.sdk.j.e a() {
        return new f();
    }
}
