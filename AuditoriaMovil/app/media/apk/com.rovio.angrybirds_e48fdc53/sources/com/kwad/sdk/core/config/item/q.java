package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q extends b<List<String>> {
    public q(String str, List<String> list) {
        super(str, list);
    }

    @Override // com.kwad.sdk.core.config.item.b
    /* renamed from: Ag */
    public final List<String> getValue() {
        List<String> list = (List) super.getValue();
        return list == null ? new ArrayList() : list;
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        List fw = t.fw(cw(sharedPreferences.getString(getKey(), "")));
        if (ah.J(fw)) {
            setValue(fw);
        } else {
            setValue(zY());
        }
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        if (ah.J(getValue())) {
            editor.putString(getKey(), cv(t.toJsonArray(getValue()).toString()));
        }
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(getKey())) != null && optJSONArray.length() > 0) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (optString != null && !optString.isEmpty()) {
                    copyOnWriteArrayList.add(optString);
                }
            }
            if (copyOnWriteArrayList.size() > 0) {
                setValue(copyOnWriteArrayList);
                return;
            }
        }
        setValue(zY());
    }
}
