package com.me.game.pmadsdk.cache;

import com.me.game.pmadsdk.PMAdSDK;
import com.me.game.pmadsdk.cache.BaseCacheBean;
import com.me.game.pmadsdk.utils.LoggerUtils;
import com.me.game.pmadsdk.utils.Observers;
import com.me.game.pmadsdk.utils.StringAssist;
import java.io.File;
import java.io.FileOutputStream;
/* loaded from: classes6.dex */
public abstract class BaseCache<Bean extends BaseCacheBean, L> extends Observers<L> {
    protected Bean baseBean;
    protected File mCacheFile;

    protected abstract Bean buildBaseBean(String str);

    protected abstract String getCachePath();

    public BaseCache() {
        File file = new File(PMAdSDK.mPmAdSDK.getFilesDir(), getCachePath());
        this.mCacheFile = file;
        File cacheParent = file.getParentFile();
        if (!cacheParent.exists()) {
            cacheParent.mkdirs();
        }
        String cacheContent = checkCacheContent(StringAssist.getFileString(this.mCacheFile));
        LoggerUtils.i("wxx", "cacheContent: " + cacheContent);
        this.baseBean = buildBaseBean(cacheContent);
        init();
    }

    protected String checkCacheContent(String content) {
        return content;
    }

    protected void init() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void saveInfo() {
        String content = this.baseBean.toString();
        try {
            FileOutputStream fos = new FileOutputStream(this.mCacheFile);
            fos.write(content.getBytes());
            fos.flush();
            fos.close();
        } catch (Exception e) {
        }
    }
}
