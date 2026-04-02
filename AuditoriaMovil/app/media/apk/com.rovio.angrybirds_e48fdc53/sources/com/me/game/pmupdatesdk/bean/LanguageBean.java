package com.me.game.pmupdatesdk.bean;

import org.json.JSONObject;
/* loaded from: classes7.dex */
public class LanguageBean {
    public String text_new_version_find = "New version found";
    public String text_version = "Version";
    public String text_update_content = "Update content:";
    public String text_update = "Update";
    public String text_policy = "Get the best and popular mod games in PlayMods";

    public static LanguageBean parse(String content) {
        LanguageBean languageBean = new LanguageBean();
        try {
            JSONObject jsonObject = new JSONObject(content);
            languageBean.text_new_version_find = jsonObject.optString("text_new_version_find", languageBean.text_new_version_find);
            languageBean.text_version = jsonObject.optString("text_version", languageBean.text_version);
            languageBean.text_update_content = jsonObject.optString("text_update_content", languageBean.text_update_content);
            languageBean.text_update = jsonObject.optString("text_update", languageBean.text_update);
            languageBean.text_policy = jsonObject.optString("text_policy", languageBean.text_policy);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return languageBean;
    }
}
