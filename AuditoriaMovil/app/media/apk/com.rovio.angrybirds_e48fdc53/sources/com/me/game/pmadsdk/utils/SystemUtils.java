package com.me.game.pmadsdk.utils;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes6.dex */
public class SystemUtils {
    private static WeakHashMap<Context, LayoutInflater> mInflater;

    private SystemUtils() {
    }

    public static void releaseArray(List list) {
        if (list != null) {
            list.clear();
        }
    }

    public static void releaseClick(View view) {
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public static void clearList(List list) {
        if (list != null) {
            list.clear();
        }
    }

    public static void clearMap(Map map) {
        if (map != null) {
            map.clear();
        }
    }

    public static void releaseOnTouch(View view) {
        if (view != null) {
            view.setOnTouchListener(null);
        }
    }

    public static void removeAllViews(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public static void removeAllViews(TextView textView, TextWatcher watcher) {
        if (textView != null) {
            textView.removeTextChangedListener(watcher);
        }
    }

    public static boolean isActivityFinish(Context context) {
        Context context2 = getContext(context);
        if (context2 instanceof Activity) {
            Activity activity = (Activity) context2;
            return activity.isFinishing();
        }
        return false;
    }

    public static LayoutInflater getInflater(Context context) {
        if (mInflater == null) {
            mInflater = new WeakHashMap<>();
        }
        LayoutInflater inflater = mInflater.get(context);
        if (inflater == null) {
            LayoutInflater inflater2 = LayoutInflater.from(context);
            mInflater.put(context, inflater2);
            return inflater2;
        }
        return inflater;
    }

    public static <T extends View> T inflate(Context context, int resId) {
        return (T) LayoutInflater.from(context).inflate(resId, (ViewGroup) null);
    }

    public static void stopAnimation(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
    }

    public static void shareFile(Context context, Uri uri, File file) {
        Intent share = new Intent("android.intent.action.SEND");
        if (Build.VERSION.SDK_INT >= 24) {
            List<ResolveInfo> resInfoList = context.getPackageManager().queryIntentActivities(share, 65536);
            for (ResolveInfo resolveInfo : resInfoList) {
                String pkg = resolveInfo.activityInfo.packageName;
                context.grantUriPermission(pkg, uri, 3);
            }
            share.addFlags(3);
            share.addFlags(64);
        } else {
            share.putExtra("android.intent.extra.STREAM", uri);
        }
        share.setType(getMimeType(file.getAbsolutePath()));
        share.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        share.addFlags(1);
        context.startActivity(Intent.createChooser(share, "分享文件"));
    }

    private static String getMimeType(String filePath) {
        MediaMetadataRetriever mmr = new MediaMetadataRetriever();
        if (filePath == null) {
            return "*/*";
        }
        try {
            mmr.setDataSource(filePath);
            String mime = mmr.extractMetadata(12);
            return mime;
        } catch (IllegalArgumentException e) {
            return "*/*";
        } catch (IllegalStateException e2) {
            return "*/*";
        } catch (RuntimeException e3) {
            return "*/*";
        }
    }

    public static boolean isLandscape(Context context) {
        int orientation = ((Activity) context).getRequestedOrientation();
        return orientation == 0 || orientation == 8;
    }

    public static void finishActivity(Context context) {
        if (context instanceof Activity) {
            ((Activity) context).finish();
        } else if (context instanceof ContextWrapper) {
            Context context2 = ((ContextWrapper) context).getBaseContext();
            if (context2 instanceof Activity) {
                ((Activity) context2).finish();
            }
        }
    }

    public static Context getContext(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context instanceof Activity) {
                return context;
            }
        }
        return context;
    }

    public static void setSpan(Spannable spannable, Object style, int start, int end) {
        spannable.setSpan(style, start, end, 33);
    }

    public static void setSpan(SpannableStringBuilder spannable, Object style, CharSequence charSequence) {
        int start = spannable.length();
        spannable.append(charSequence);
        int end = spannable.length();
        spannable.setSpan(style, start, end, 33);
    }
}
