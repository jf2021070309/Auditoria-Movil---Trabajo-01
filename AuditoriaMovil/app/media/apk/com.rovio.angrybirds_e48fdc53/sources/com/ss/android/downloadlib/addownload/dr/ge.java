package com.ss.android.downloadlib.addownload.dr;

import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes3.dex */
class ge {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.ge.dr> dr(String str, String str2) {
        CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.ge.dr> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String string = wb.getContext().getSharedPreferences(str, 0).getString(str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    com.ss.android.downloadlib.addownload.ge.dr dr = com.ss.android.downloadlib.addownload.ge.dr.dr(jSONObject.optJSONObject(keys.next()));
                    if (dr != null) {
                        copyOnWriteArrayList.add(dr);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dr(String str, String str2, CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.ge.dr> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<com.ss.android.downloadlib.addownload.ge.dr> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.ss.android.downloadlib.addownload.ge.dr next = it.next();
                if (next != null) {
                    jSONObject.put(String.valueOf(next.ge), next.dr());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        wb.getContext().getSharedPreferences(str, 0).edit().putString(str2, jSONObject.toString()).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ge(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        wb.getContext().getSharedPreferences(str, 0).edit().putString(str2, "").apply();
    }
}
