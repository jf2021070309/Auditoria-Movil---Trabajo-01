package com.me.game.pmadsdk.bean;

import com.me.game.pmadsdk.cache.BaseCacheBean;
import com.me.game.pmadsdk.utils.LoggerUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class LocalAdListBean extends BaseCacheBean {
    public List<GameAdBean> adList;

    public String toString() {
        LoggerUtils.i("wxx", "adList size=" + this.adList.size());
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < this.adList.size(); i++) {
            LoggerUtils.i("wxx", "index=" + i + ", " + this.adList.get(i).toString());
            JSONObject jsonGameAdBean = this.adList.get(i).toJson();
            jsonArray.put(jsonGameAdBean);
        }
        String jsonString = jsonArray.toString();
        LoggerUtils.i("wxx", "jsonString=" + jsonString);
        return jsonString;
    }
}
