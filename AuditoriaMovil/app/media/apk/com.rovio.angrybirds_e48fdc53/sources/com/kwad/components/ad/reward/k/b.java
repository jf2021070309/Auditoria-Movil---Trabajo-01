package com.kwad.components.ad.reward.k;

import com.kwad.sdk.utils.t;
import java.util.Observable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class b extends Observable implements c, com.kwad.sdk.core.b {
    private boolean xW = false;
    protected String xX;
    protected String xY;

    private boolean jE() {
        return this.xW;
    }

    private void jF() {
        setChanged();
        notifyObservers(Boolean.valueOf(this.xW));
    }

    public boolean isCompleted() {
        return jE();
    }

    public final void jA() {
        if (this.xW) {
            return;
        }
        this.xW = true;
        jF();
    }

    public final void jB() {
        if (this.xW) {
            this.xW = false;
            jF();
        }
    }

    @Override // com.kwad.components.ad.reward.k.c
    public final String jC() {
        return this.xX;
    }

    @Override // com.kwad.components.ad.reward.k.c
    public final String jD() {
        return this.xY;
    }

    public void parseJson(JSONObject jSONObject) {
        try {
            this.xW = jSONObject.optBoolean("selfCompleted");
        } catch (Throwable th) {
        }
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "selfCompleted", this.xW);
        return jSONObject;
    }
}
