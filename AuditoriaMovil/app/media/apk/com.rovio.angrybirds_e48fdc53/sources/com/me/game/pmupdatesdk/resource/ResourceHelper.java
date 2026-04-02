package com.me.game.pmupdatesdk.resource;

import com.me.game.pmupdatesdk.PMUpdateSDK;
import com.me.game.pmupdatesdk.utils.FileUtils;
import com.me.game.pmupdatesdk.utils.StringAssist;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
/* loaded from: classes7.dex */
public class ResourceHelper {
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
        String fileName = String.format("pm_update_sdk/language/%s.json", language);
        try {
            return StringAssist.getString(PMUpdateSDK.mPMUpdateSDK.getResources().getAssets().open(fileName));
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
            String fileName = String.format("pm_update_sdk/drawable/%s", bitmapName);
            InputStream inputStream = PMUpdateSDK.mPMUpdateSDK.getResources().getAssets().open(fileName);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileUtils.copyFile(inputStream, baos);
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
