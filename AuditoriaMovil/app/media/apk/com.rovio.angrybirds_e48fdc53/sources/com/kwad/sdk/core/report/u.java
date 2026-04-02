package com.kwad.sdk.core.report;

import android.content.Context;
import android.database.Cursor;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class u extends e {
    private static volatile u asI;
    private final List<s> asJ;

    private u(Context context) {
        super(new t(context, t.Im));
        ArrayList arrayList = new ArrayList();
        this.asJ = arrayList;
        arrayList.add(new l());
    }

    public static u bf(Context context) {
        if (asI == null) {
            synchronized (u.class) {
                if (asI == null) {
                    asI = new u(context);
                }
            }
        }
        return asI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.report.e
    /* renamed from: h */
    public synchronized r g(Cursor cursor) {
        String string = cursor.getString(0);
        if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xL()) {
            String string2 = cursor.getString(1);
            r rVar = new r(string, false);
            rVar.actionId = string2;
            return rVar;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            int size = this.asJ.size() - 1;
            if (size >= 0) {
                return this.asJ.get(size).i(jSONObject);
            }
            return new r(jSONObject);
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return new r("");
        }
    }

    @Override // com.kwad.sdk.core.report.e
    protected final String BU() {
        return "ksad_actions";
    }

    @Override // com.kwad.sdk.core.report.e
    protected final String BV() {
        return "select aLog, actionId from " + BU();
    }

    @Override // com.kwad.sdk.core.report.e
    protected final String getTag() {
        return "ReportActionDBManager";
    }
}
