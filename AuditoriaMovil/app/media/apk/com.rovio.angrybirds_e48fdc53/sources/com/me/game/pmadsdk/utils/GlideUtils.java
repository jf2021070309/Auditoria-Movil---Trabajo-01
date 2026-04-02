package com.me.game.pmadsdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.me.game.pmadsdk.PMAdSDK;
import com.me.game.pmadsdk.resource.IDUtils;
import java.io.File;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public class GlideUtils {
    private static volatile GlideUtils mIns = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface OnClearListener {
        void onClearFail();

        void onClearStart();

        void onClearSuccess();
    }

    private GlideUtils() {
    }

    public static GlideUtils getIns() {
        if (mIns == null) {
            synchronized (GlideUtils.class) {
                if (mIns == null) {
                    mIns = new GlideUtils();
                }
            }
        }
        return mIns;
    }

    public void clearImageDiskCache(final OnClearListener onClearListener) {
        try {
            Runnable runnable = new Runnable() { // from class: com.me.game.pmadsdk.utils.GlideUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    Glide.get(PMAdSDK.mPmAdSDK).clearDiskCache();
                    String ImageExternalCatchDir = PMAdSDK.mPmAdSDK.getExternalCacheDir() + DiskCache.Factory.DEFAULT_DISK_CACHE_DIR;
                    GlideUtils.this.deleteFolderFile(ImageExternalCatchDir, true);
                    onClearListener.onClearSuccess();
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(runnable).start();
            } else {
                runnable.run();
            }
        } catch (Exception e) {
            e.printStackTrace();
            onClearListener.onClearFail();
        }
    }

    public void clearImageMemoryCache() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Glide.get(PMAdSDK.mPmAdSDK).clearMemory();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearImageAllCache(OnClearListener onClearListener) {
        onClearListener.onClearStart();
        clearImageMemoryCache();
        clearImageDiskCache(onClearListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteFolderFile(String filePath, Boolean deleteThisPath) {
        if (!TextUtils.isEmpty(filePath)) {
            try {
                File file = new File(filePath);
                if (file.isDirectory()) {
                    File[] files = file.listFiles();
                    for (File subFile : files) {
                        deleteFolderFile(subFile.getAbsolutePath(), true);
                    }
                }
                if (deleteThisPath.booleanValue()) {
                    if (!file.isDirectory()) {
                        file.delete();
                    } else if (file.listFiles().length == 0) {
                        file.delete();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public long getFolderSize(File file) {
        long size = 0;
        try {
            File[] fileList = file.listFiles();
            for (File aFileList : fileList) {
                if (aFileList.isDirectory()) {
                    size += getFolderSize(aFileList);
                } else {
                    size += aFileList.length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RequestManager getRequestManager(Context o) {
        return Glide.with(o);
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        private static CircleCrop mCircleCrop = null;
        private int defaultId;
        private ImageView mImageView;
        private Object mModel;
        private SimpleTarget mSimpleTarget;
        private boolean mSkipMemoryCache = false;
        private Transformation mTransformation;
        private Context o;
        private int overrideHeight;
        private int overrideWidth;

        public Builder setModel(Object model) {
            if (model == null) {
                model = "";
            }
            this.mModel = model;
            return this;
        }

        public Builder setObject(Context o) {
            this.o = o;
            return this;
        }

        public Builder setDefaultId(int defaultId) {
            this.defaultId = defaultId;
            return this;
        }

        public Builder setImageView(ImageView imageView) {
            this.mImageView = imageView;
            return this;
        }

        public Builder setSimpleTarget(SimpleTarget simpleTarget) {
            this.mSimpleTarget = simpleTarget;
            return this;
        }

        public Builder setRoundedCorners(float dp) {
            this.mTransformation = new RoundedCorners(DisplayUtils.getIns().dip2px(dp));
            return this;
        }

        public Builder setCircleCrop() {
            if (mCircleCrop == null) {
                mCircleCrop = new CircleCrop();
            }
            this.mTransformation = mCircleCrop;
            return this;
        }

        public Builder setSkipMemoryCache(boolean skipMemoryCache) {
            this.mSkipMemoryCache = skipMemoryCache;
            return this;
        }

        public Builder override(int width, int height) {
            this.overrideWidth = width;
            this.overrideHeight = height;
            return this;
        }

        public Builder override(int size) {
            return override(size, size);
        }

        public Builder setTransformation(Transformation transformation) {
            this.mTransformation = transformation;
            return this;
        }

        public void build() {
            int i;
            try {
                Object obj = this.mModel;
                if (!(obj instanceof Integer) && (obj instanceof String)) {
                    if (TextUtils.isEmpty(obj.toString())) {
                        this.mModel = "";
                    }
                    this.mModel = ((String) this.mModel).trim();
                }
                if (this.mImageView != null) {
                    String tag = String.valueOf(this.mModel);
                    this.mImageView.setTag(IDUtils.tag_key_start, tag);
                    String tagEnd = String.valueOf(this.mImageView.getTag(IDUtils.tag_key_end));
                    if (tag.equals(tagEnd)) {
                        return;
                    }
                }
                RequestManager requestManager = GlideUtils.getRequestManager(this.o);
                RequestOptions options = new RequestOptions().priority(Priority.HIGH).diskCacheStrategy(DiskCacheStrategy.RESOURCE);
                int i2 = this.defaultId;
                if (i2 > 0) {
                    options.placeholder(i2).error(this.defaultId);
                }
                Transformation<Bitmap> transformation = this.mTransformation;
                if (transformation != null) {
                    options.transform(transformation);
                }
                boolean z = this.mSkipMemoryCache;
                if (z) {
                    options.skipMemoryCache(z);
                }
                int i3 = this.overrideWidth;
                if (i3 != 0 && (i = this.overrideHeight) != 0) {
                    options.override(i3, i);
                }
                RequestBuilder<Drawable> drawableTypeRequest = requestManager.load(this.mModel).transition(DrawableTransitionOptions.withCrossFade(300)).apply((BaseRequestOptions<?>) options);
                drawableTypeRequest.into((RequestBuilder<Drawable>) new MySimpleTarget(this.mImageView, String.valueOf(this.mModel), this.mSimpleTarget));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes6.dex */
    private static class MySimpleTarget extends SimpleTarget<Drawable> {
        private WeakReference<ImageView> mImageView;
        private String mModel;
        private SimpleTarget mSimpleTarget;

        private MySimpleTarget(ImageView imageView, String model, SimpleTarget simpleTarget) {
            this.mModel = TextUtils.isEmpty(model) ? "" : model;
            this.mImageView = new WeakReference<>(imageView);
            this.mSimpleTarget = simpleTarget;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Drawable resource, Transition transition) {
            setImageDrawable(resource);
            SimpleTarget simpleTarget = this.mSimpleTarget;
            if (simpleTarget != null) {
                simpleTarget.onResourceReady(resource, transition);
            }
        }

        @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
        public final void onLoadCleared(Drawable placeholder) {
            setImageDrawable(placeholder);
            SimpleTarget simpleTarget = this.mSimpleTarget;
            if (simpleTarget != null) {
                simpleTarget.onLoadCleared(placeholder);
            }
        }

        @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable errorDrawable) {
            setImageDrawable(errorDrawable);
            SimpleTarget simpleTarget = this.mSimpleTarget;
            if (simpleTarget != null) {
                simpleTarget.onLoadFailed(errorDrawable);
            }
        }

        @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
        public final void onLoadStarted(Drawable placeholder) {
            setImageDrawable(placeholder);
            SimpleTarget simpleTarget = this.mSimpleTarget;
            if (simpleTarget != null) {
                simpleTarget.onLoadStarted(placeholder);
            }
        }

        private final void setImageDrawable(Drawable resource) {
            ImageView imageView;
            WeakReference<ImageView> weakReference = this.mImageView;
            if (weakReference != null && (imageView = weakReference.get()) != null) {
                Object tag_key_start = imageView.getTag(IDUtils.tag_key_start);
                if (this.mModel.equals(tag_key_start)) {
                    imageView.setTag(IDUtils.tag_key_end, this.mModel);
                    imageView.setImageDrawable(resource);
                }
            }
        }
    }
}
