package com.me.game.pmadsdk.resource;

import com.me.game.pmadsdk.base.BaseUtils;
import com.me.game.pmadsdk.utils.FileUtils;
import com.me.game.pmadsdk.utils.StringAssist;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
/* loaded from: classes6.dex */
public class ResourceHelper extends BaseUtils {
    private static volatile ResourceHelper mIns = null;

    protected ResourceHelper() {
    }

    public static ResourceHelper getIns() {
        if (mIns == null) {
            synchronized (ResourceHelper.class) {
                if (mIns == null) {
                    mIns = new ResourceHelper();
                }
            }
        }
        return mIns;
    }

    public String getLanguageResource(String language) {
        String fileName = String.format(this.mAssetsLanguage, language);
        try {
            return StringAssist.getString(mApplication.getResources().getAssets().open(fileName));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] getBitmapData(String bitmapName) {
        if (!bitmapName.endsWith(".png")) {
            bitmapName = bitmapName + ".png";
        }
        try {
            String fileName = String.format(this.mAssetsDrawable, bitmapName);
            InputStream inputStream = mApplication.getResources().getAssets().open(fileName);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileUtils.copyFile(inputStream, baos);
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
