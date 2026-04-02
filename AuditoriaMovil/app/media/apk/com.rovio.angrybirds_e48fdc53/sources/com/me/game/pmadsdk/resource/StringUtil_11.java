package com.me.game.pmadsdk.resource;

import com.me.game.pmadsdk.bean.LanguageBean;
import java.util.Locale;
/* loaded from: classes6.dex */
public class StringUtil_11 {
    private static final String TAG = StringUtil_11.class.getSimpleName();
    private static volatile StringUtil_11 mIns = null;
    private String language = "";
    private LanguageBean mLanguageBean;

    protected StringUtil_11() {
        checkLanguage();
    }

    public static StringUtil_11 getIns() {
        if (mIns == null) {
            synchronized (StringUtil_11.class) {
                if (mIns == null) {
                    mIns = new StringUtil_11();
                }
            }
        }
        return mIns;
    }

    public void checkLanguage() {
        try {
            String curLang = Locale.getDefault().getLanguage();
            if (this.language.equals(curLang)) {
                return;
            }
            this.language = curLang;
            String content = ResourceHelper.getIns().getLanguageResource(this.language);
            this.mLanguageBean = LanguageBean.parse(content);
        } catch (Exception e) {
            this.mLanguageBean = new LanguageBean();
        }
    }

    public LanguageBean getLanguageBean() {
        return this.mLanguageBean;
    }
}
