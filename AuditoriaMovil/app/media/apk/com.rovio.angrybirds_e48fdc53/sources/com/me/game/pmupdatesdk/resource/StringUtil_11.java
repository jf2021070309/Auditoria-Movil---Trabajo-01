package com.me.game.pmupdatesdk.resource;

import com.me.game.pmupdatesdk.PMUpdateSDK;
import com.me.game.pmupdatesdk.bean.ConfigBean;
import com.me.game.pmupdatesdk.bean.LanguageBean;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import com.me.game.pmupdatesdk.utils.StringAssist;
import java.util.Locale;
/* loaded from: classes7.dex */
public class StringUtil_11 {
    private static final String TAG = StringUtil_11.class.getSimpleName();
    private static volatile StringUtil_11 mIns = null;
    private String language = "";
    private ConfigBean mConfigBean;
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

    public ConfigBean getConfigBean() {
        if (this.mConfigBean == null) {
            try {
                String content = StringAssist.getString(PMUpdateSDK.mPMUpdateSDK.getResources().getAssets().open("pm_update_sdk/config.json"));
                LoggerUtils.i(TAG, content);
                this.mConfigBean = ConfigBean.parse(content);
            } catch (Exception e) {
                this.mConfigBean = new ConfigBean();
            }
        }
        return this.mConfigBean;
    }
}
