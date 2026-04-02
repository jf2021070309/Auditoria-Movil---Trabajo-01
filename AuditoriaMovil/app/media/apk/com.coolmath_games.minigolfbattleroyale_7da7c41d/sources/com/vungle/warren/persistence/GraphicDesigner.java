package com.vungle.warren.persistence;

import android.util.Log;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.IOException;
/* loaded from: classes2.dex */
public class GraphicDesigner implements Designer, CacheManager.Listener {
    private static final String FOLDER_NAME = "vungle";
    private static final String TAG = GraphicDesigner.class.getSimpleName();
    private CacheManager cacheManager;

    public GraphicDesigner(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
        cacheManager.addListener(this);
        FileUtility.printDirectoryTree(getCacheDirectory());
    }

    @Override // com.vungle.warren.persistence.Designer
    public File getAssetDirectory(String str) throws IllegalStateException {
        File file = new File(getCacheDirectory().getPath() + File.separator + str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // com.vungle.warren.persistence.Designer
    public void deleteAssets(String str) throws IOException, IllegalStateException {
        File[] listFiles = getCacheDirectory().listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.isDirectory() && file.getName().equals(str)) {
                FileUtility.delete(file);
            }
        }
    }

    @Override // com.vungle.warren.persistence.Designer
    public File getCacheDirectory() throws IllegalStateException {
        if (this.cacheManager == null) {
            throw new IllegalStateException("Context has expired, cannot continue.");
        }
        File file = new File(this.cacheManager.getCache() + File.separator + FOLDER_NAME);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // com.vungle.warren.persistence.Designer
    public void clearCache() {
        CacheManager cacheManager = this.cacheManager;
        if (cacheManager == null || cacheManager.getCache() == null) {
            return;
        }
        File file = new File(this.cacheManager.getCache().getPath() + File.separator + FOLDER_NAME);
        if (file.exists()) {
            try {
                FileUtility.delete(file);
            } catch (IOException e) {
                String str = TAG;
                Log.e(str, "Failed to delete cached files. Reason: " + e.getLocalizedMessage());
            }
        }
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    @Override // com.vungle.warren.persistence.CacheManager.Listener
    public void onCacheChanged() {
        CacheManager cacheManager = this.cacheManager;
        if (cacheManager == null) {
            return;
        }
        for (File file : cacheManager.getOldCaches()) {
            try {
                FileUtility.delete(new File(file.getPath() + File.separator + FOLDER_NAME));
            } catch (IOException e) {
                String str = TAG;
                Log.e(str, "Failed to delete cached files. Reason: " + e.getLocalizedMessage());
            }
        }
    }
}
