package com.me.game.pmupdatesdk.bean;

import android.text.TextUtils;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class ConfigBean {
    public boolean cancelable = true;
    public String text = "";
    public String YouTube = "https://www.youtube.com/channel/UCyXOJ8wYoL-4u2Obz6u-VAw";
    public String tiktok = "https://www.tiktok.com/@playmods.net?lang=zh-Hant-TW";
    public String Telegram = "https://t.me/playmodsapp";
    public String Discord = "https://discord.gg/8Rq4UcEydn";
    public String twitter = "https://twitter.com/PLAYMODS1";

    public static ConfigBean parse(String content) {
        ConfigBean configBean = new ConfigBean();
        try {
            JSONObject jsonObject = new JSONObject(content);
            configBean.cancelable = jsonObject.optBoolean("cancelable", configBean.cancelable);
            String optString = jsonObject.optString("text", configBean.text);
            configBean.text = optString;
            if (TextUtils.isEmpty(optString)) {
                configBean.text = "PlayMods";
            }
            configBean.twitter = jsonObject.optString("twitter", configBean.twitter);
            configBean.YouTube = jsonObject.optString("YouTube", configBean.YouTube);
            configBean.tiktok = jsonObject.optString("tiktok", configBean.tiktok);
            configBean.Discord = jsonObject.optString("Discord", configBean.Discord);
            configBean.Telegram = jsonObject.optString("Telegram", configBean.Telegram);
            LoggerUtils.i("configBean.cancelable", Boolean.valueOf(configBean.cancelable));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return configBean;
    }
}
