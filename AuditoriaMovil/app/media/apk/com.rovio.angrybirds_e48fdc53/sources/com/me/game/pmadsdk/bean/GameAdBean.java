package com.me.game.pmadsdk.bean;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class GameAdBean {
    public static final int AD_STATUS_BLOCKED = 3;
    public static final int AD_STATUS_CAN_SHOW = 0;
    public static final int AD_STATUS_SHOWN = 1;
    public static final int AD_TYPE_CAN_CLOSE = 1;
    public static final int AD_TYPE_NOT_CLOSE = 2;
    public static final int SHOW_TYPE_DIALOG = 1;
    public static final int SHOW_TYPE_FULLSCREEN = 2;
    public String horizontalImageUrl;
    public int id;
    public String linkUrl;
    public int localShowStatus;
    public String name;
    public String popupImageUrl;
    public String realPackageName;
    public int showLogic;
    public int styleType;
    public String verticalImageUrl;

    public GameAdBean(int id, String realPackageName, String name, String linkUrl, String horizontalImageUrl, String verticalImageUrl, int styleType, String popupImageUrl, int showLogic, int localShowStatus) {
        this.id = id;
        this.realPackageName = realPackageName;
        this.name = name;
        this.linkUrl = linkUrl;
        this.horizontalImageUrl = horizontalImageUrl;
        this.verticalImageUrl = verticalImageUrl;
        this.styleType = styleType;
        this.popupImageUrl = popupImageUrl;
        this.showLogic = showLogic;
        this.localShowStatus = localShowStatus;
    }

    public static GameAdBean parse(JSONObject data) {
        if (data == null) {
            return null;
        }
        try {
            int id = data.optInt("id");
            String realPackageName = data.optString("realPackageName");
            String name = data.optString("name");
            String linkUrl = data.optString("linkUrl");
            String horizontalImageUrl = data.optString("horizontalImageUrl");
            String verticalImageUrl = data.optString("verticalImageUrl");
            int styleType = data.optInt("styleType");
            String popupImageUrl = data.optString("popupImageUrl");
            int showLogic = data.optInt("showLogic");
            int localShowStatus = data.optInt("localShowStatus");
            GameAdBean gameAdBean = new GameAdBean(id, realPackageName, name, linkUrl, horizontalImageUrl, verticalImageUrl, styleType, popupImageUrl, showLogic, localShowStatus);
            return gameAdBean;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject toJson() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", this.id);
            jsonObject.put("realPackageName", this.realPackageName);
            jsonObject.put("name", this.name);
            jsonObject.put("linkUrl", this.linkUrl);
            jsonObject.put("horizontalImageUrl", this.horizontalImageUrl);
            jsonObject.put("verticalImageUrl", this.verticalImageUrl);
            jsonObject.put("styleType", this.styleType);
            jsonObject.put("popupImageUrl", this.popupImageUrl);
            jsonObject.put("showLogic", this.showLogic);
            jsonObject.put("localShowStatus", this.localShowStatus);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public String toString() {
        return toJson().toString();
    }
}
