package com.kwad.components.core.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.bytedance.msdk.api.reward.RewardItem;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g implements h, Comparable<g> {
    private final String IK;
    private final String IR;
    private final String IS;
    private final String IT;
    private final long IU;
    private final long createTime;
    private final int ecpm;

    private g(String str, String str2, String str3, int i, String str4, long j, long j2) {
        this.IR = str;
        this.IK = str2;
        this.IS = str3;
        this.ecpm = i;
        this.IT = str4;
        this.createTime = j;
        this.IU = j2;
    }

    public static List<g> a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                arrayList.add(c(cursor));
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        return arrayList;
    }

    public static List<g> a(e eVar, AdResultData adResultData) {
        List<AdTemplate> proceedTemplateList = adResultData.getProceedTemplateList();
        int size = proceedTemplateList.size();
        long currentTimeMillis = System.currentTimeMillis();
        long mw = (currentTimeMillis / 1000) + eVar.mw();
        ArrayList arrayList = new ArrayList();
        SceneImpl defaultAdScene = adResultData.getDefaultAdScene();
        Iterator<AdTemplate> it = proceedTemplateList.iterator();
        while (it.hasNext()) {
            AdTemplate next = it.next();
            arrayList.add(new g(String.valueOf(com.kwad.sdk.core.response.b.d.cu(next)), String.valueOf(adResultData.getPosId()), new AdResultData(adResultData, defaultAdScene, Collections.singletonList(next)).getResponseJson(), com.kwad.sdk.core.response.b.d.cz(next), adResultData.getDefaultAdScene().toJson().toString(), currentTimeMillis + size, mw));
            size--;
            it = it;
            defaultAdScene = defaultAdScene;
        }
        return arrayList;
    }

    private static synchronized g c(Cursor cursor) {
        g gVar;
        synchronized (g.class) {
            gVar = new g(cursor.getString(cursor.getColumnIndex("creativeId")), cursor.getString(cursor.getColumnIndex("posId")), cursor.getString(cursor.getColumnIndex("adJson")), cursor.getInt(cursor.getColumnIndex(RewardItem.KEY_ECPM)), cursor.getString(cursor.getColumnIndex("adSenseJson")), cursor.getLong(cursor.getColumnIndex("createTime")), cursor.getLong(cursor.getColumnIndex("expireTime")));
        }
        return gVar;
    }

    private static AdResultData c(g gVar) {
        if (gVar == null) {
            return null;
        }
        if (gVar.mA() == null || gVar.mE() == null) {
            com.kwad.sdk.core.e.c.w("CachedAd", "createAdResultData cachedAd data illegal");
            return null;
        }
        try {
            String mE = gVar.mE();
            SceneImpl sceneImpl = new SceneImpl();
            sceneImpl.parseJson(new JSONObject(mE));
            AdResultData createFromResponseJson = AdResultData.createFromResponseJson(gVar.mA(), sceneImpl);
            for (AdTemplate adTemplate : createFromResponseJson.getProceedTemplateList()) {
                adTemplate.fromCache = true;
            }
            return createFromResponseJson;
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(g gVar) {
        return gVar.mB() == mB() ? (int) (gVar.mC() - mC()) : gVar.mB() - mB();
    }

    public static AdResultData i(List<g> list) {
        ArrayList arrayList = new ArrayList();
        AdResultData adResultData = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        SceneImpl sceneImpl = null;
        for (g gVar : list) {
            adResultData = c(gVar);
            if (adResultData != null) {
                if (sceneImpl == null) {
                    sceneImpl = adResultData.getDefaultAdScene();
                }
                arrayList.addAll(adResultData.getProceedTemplateList());
            }
        }
        return new AdResultData(adResultData, sceneImpl, arrayList);
    }

    private String mA() {
        return this.IS;
    }

    private int mB() {
        return this.ecpm;
    }

    private long mC() {
        return this.createTime;
    }

    private String mE() {
        return this.IT;
    }

    public final long mD() {
        return this.IU;
    }

    public final String mF() {
        return this.IR;
    }

    @Override // com.kwad.components.core.c.h
    public final ContentValues mx() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("creativeId", this.IR);
        contentValues.put("posId", this.IK);
        contentValues.put("adJson", this.IS);
        contentValues.put(RewardItem.KEY_ECPM, Integer.valueOf(this.ecpm));
        contentValues.put("adSenseJson", this.IT);
        contentValues.put("createTime", Long.valueOf(this.createTime));
        contentValues.put("expireTime", Long.valueOf(this.IU));
        contentValues.put("playAgainJson", (String) null);
        return contentValues;
    }

    public final String mz() {
        return this.IK;
    }
}
