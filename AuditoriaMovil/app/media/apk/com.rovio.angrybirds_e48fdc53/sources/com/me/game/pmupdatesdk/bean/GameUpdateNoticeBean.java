package com.me.game.pmupdatesdk.bean;

import com.bytedance.msdk.adapter.util.TTLogUtil;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class GameUpdateNoticeBean {
    public int gameId;
    public boolean show;
    public String updateLog;
    public String versionName;

    public GameUpdateNoticeBean(int gameId, boolean show, String updateLog, String versionName) {
        this.gameId = gameId;
        this.show = show;
        this.updateLog = updateLog;
        this.versionName = versionName;
    }

    public static GameUpdateNoticeBean parse(JSONObject data) {
        if (data == null) {
            return null;
        }
        try {
            int gameId = data.optInt("gameId");
            boolean show = data.optBoolean(TTLogUtil.TAG_EVENT_SHOW);
            String updateLog = data.optString("updateLog");
            String versionName = data.optString("versionName");
            GameUpdateNoticeBean gameUpdateNoticeBean = new GameUpdateNoticeBean(gameId, show, updateLog, versionName);
            return gameUpdateNoticeBean;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
