package com.me.game.pmadsdk.bean;

import org.json.JSONObject;
/* loaded from: classes6.dex */
public class LanguageBean {
    public String text_click_continue_game = "Click to view the ad to continue playing the game";

    public static LanguageBean parse(String content) {
        LanguageBean languageBean = new LanguageBean();
        try {
            JSONObject jsonObject = new JSONObject(content);
            languageBean.text_click_continue_game = jsonObject.optString("text_click_continue_game", languageBean.text_click_continue_game);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return languageBean;
    }
}
