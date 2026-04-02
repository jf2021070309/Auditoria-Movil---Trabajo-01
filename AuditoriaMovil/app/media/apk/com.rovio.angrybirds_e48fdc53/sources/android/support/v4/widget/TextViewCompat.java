package android.support.v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.support.v4.text.PrecomputedTextCompat;
import android.support.v4.util.Preconditions;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    private static final int LINES = 1;
    private static final String LOG_TAG = "TextViewCompat";
    private static Field sMaxModeField;
    private static boolean sMaxModeFieldFetched;
    private static Field sMaximumField;
    private static boolean sMaximumFieldFetched;
    private static Field sMinModeField;
    private static boolean sMinModeFieldFetched;
    private static Field sMinimumField;
    private static boolean sMinimumFieldFetched;

    /* JADX WARN: Classes with same name are omitted:
      classes2.dex
     */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AutoSizeTextType {
    }

    /* loaded from: classes2.dex */
    static class TextViewCompatBaseImpl {
        private static final int LINES = 1;
        private static final String LOG_TAG = "TextViewCompatBase";
        private static Field sMaxModeField;
        private static boolean sMaxModeFieldFetched;
        private static Field sMaximumField;
        private static boolean sMaximumFieldFetched;
        private static Field sMinModeField;
        private static boolean sMinModeFieldFetched;
        private static Field sMinimumField;
        private static boolean sMinimumFieldFetched;

        TextViewCompatBaseImpl() {
        }

        public void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        }

        private static Field retrieveField(String str) {
            Field field = null;
            try {
                field = TextView.class.getDeclaredField(str);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException e) {
                Log.e(LOG_TAG, "Could not retrieve " + str + " field.");
                return field;
            }
        }

        private static int retrieveIntFromField(Field field, TextView textView) {
            try {
                return field.getInt(textView);
            } catch (IllegalAccessException e) {
                Log.d(LOG_TAG, "Could not retrieve value of " + field.getName() + " field.");
                return -1;
            }
        }

        public int getMaxLines(TextView textView) {
            if (!sMaxModeFieldFetched) {
                sMaxModeField = retrieveField("mMaxMode");
                sMaxModeFieldFetched = true;
            }
            if (sMaxModeField != null && retrieveIntFromField(sMaxModeField, textView) == 1) {
                if (!sMaximumFieldFetched) {
                    sMaximumField = retrieveField("mMaximum");
                    sMaximumFieldFetched = true;
                }
                if (sMaximumField != null) {
                    return retrieveIntFromField(sMaximumField, textView);
                }
            }
            return -1;
        }

        public int getMinLines(TextView textView) {
            if (!sMinModeFieldFetched) {
                sMinModeField = retrieveField("mMinMode");
                sMinModeFieldFetched = true;
            }
            if (sMinModeField != null && retrieveIntFromField(sMinModeField, textView) == 1) {
                if (!sMinimumFieldFetched) {
                    sMinimumField = retrieveField("mMinimum");
                    sMinimumFieldFetched = true;
                }
                if (sMinimumField != null) {
                    return retrieveIntFromField(sMinimumField, textView);
                }
            }
            return -1;
        }

        public void setTextAppearance(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        public Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawables();
        }

        public void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
            if (textView instanceof AutoSizeableTextView) {
                ((AutoSizeableTextView) textView).setAutoSizeTextTypeWithDefaults(i);
            }
        }

        public void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            if (textView instanceof AutoSizeableTextView) {
                ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            }
        }

        public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            if (textView instanceof AutoSizeableTextView) {
                ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            }
        }

        public int getAutoSizeTextType(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeTextType();
            }
            return 0;
        }

        public int getAutoSizeStepGranularity(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeStepGranularity();
            }
            return -1;
        }

        public int getAutoSizeMinTextSize(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeMinTextSize();
            }
            return -1;
        }

        public int getAutoSizeMaxTextSize(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeMaxTextSize();
            }
            return -1;
        }

        public int[] getAutoSizeTextAvailableSizes(TextView textView) {
            return textView instanceof AutoSizeableTextView ? ((AutoSizeableTextView) textView).getAutoSizeTextAvailableSizes() : new int[0];
        }
    }

    private TextViewCompat() {
    }

    private static Field retrieveField(String fieldName) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            Log.e(LOG_TAG, "Could not retrieve " + fieldName + " field.");
            return field;
        }
    }

    private static int retrieveIntFromField(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e) {
            Log.d(LOG_TAG, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    public static void setCompoundDrawablesRelative(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(start, top, end, bottom);
        } else if (Build.VERSION.SDK_INT >= 17) {
            boolean rtl = textView.getLayoutDirection() == 1;
            textView.setCompoundDrawables(rtl ? end : start, top, rtl ? start : end, bottom);
        } else {
            textView.setCompoundDrawables(start, top, end, bottom);
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else if (Build.VERSION.SDK_INT >= 17) {
            boolean rtl = textView.getLayoutDirection() == 1;
            textView.setCompoundDrawablesWithIntrinsicBounds(rtl ? end : start, top, rtl ? start : end, bottom);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(start, top, end, bottom);
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int start, int top, int end, int bottom) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else if (Build.VERSION.SDK_INT >= 17) {
            boolean rtl = textView.getLayoutDirection() == 1;
            textView.setCompoundDrawablesWithIntrinsicBounds(rtl ? end : start, top, rtl ? start : end, bottom);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(start, top, end, bottom);
        }
    }

    /* loaded from: classes2.dex */
    static class TextViewCompatApi16Impl extends TextViewCompatBaseImpl {
        TextViewCompatApi16Impl() {
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getMaxLines(TextView textView) {
            return textView.getMaxLines();
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getMinLines(TextView textView) {
            return textView.getMinLines();
        }
    }

    public static int getMaxLines(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!sMaxModeFieldFetched) {
            sMaxModeField = retrieveField("mMaxMode");
            sMaxModeFieldFetched = true;
        }
        Field field = sMaxModeField;
        if (field != null && retrieveIntFromField(field, textView) == 1) {
            if (!sMaximumFieldFetched) {
                sMaximumField = retrieveField("mMaximum");
                sMaximumFieldFetched = true;
            }
            Field field2 = sMaximumField;
            if (field2 != null) {
                return retrieveIntFromField(field2, textView);
            }
            return -1;
        }
        return -1;
    }

    /* loaded from: classes2.dex */
    static class TextViewCompatApi17Impl extends TextViewCompatApi16Impl {
        TextViewCompatApi17Impl() {
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
            boolean z = textView.getLayoutDirection() == 1;
            int i5 = z ? i3 : i;
            if (!z) {
                i = i3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(i5, i2, i, i4);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public Drawable[] getCompoundDrawablesRelative(TextView textView) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
    }

    public static int getMinLines(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMinLines();
        }
        if (!sMinModeFieldFetched) {
            sMinModeField = retrieveField("mMinMode");
            sMinModeFieldFetched = true;
        }
        Field field = sMinModeField;
        if (field != null && retrieveIntFromField(field, textView) == 1) {
            if (!sMinimumFieldFetched) {
                sMinimumField = retrieveField("mMinimum");
                sMinimumFieldFetched = true;
            }
            Field field2 = sMinimumField;
            if (field2 != null) {
                return retrieveIntFromField(field2, textView);
            }
            return -1;
        }
        return -1;
    }

    /* loaded from: classes2.dex */
    static class TextViewCompatApi18Impl extends TextViewCompatApi17Impl {
        TextViewCompatApi18Impl() {
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatApi17Impl, android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatApi17Impl, android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatApi17Impl, android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatApi17Impl, android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    public static void setTextAppearance(TextView textView, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(resId);
        } else {
            textView.setTextAppearance(textView.getContext(), resId);
        }
    }

    public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
        if (Build.VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            boolean rtl = textView.getLayoutDirection() == 1;
            Drawable[] compounds = textView.getCompoundDrawables();
            if (rtl) {
                Drawable start = compounds[2];
                Drawable end = compounds[0];
                compounds[0] = start;
                compounds[2] = end;
            }
            return compounds;
        }
        return textView.getCompoundDrawables();
    }

    /* loaded from: classes2.dex */
    static class TextViewCompatApi23Impl extends TextViewCompatApi18Impl {
        TextViewCompatApi23Impl() {
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setTextAppearance(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    /* loaded from: classes2.dex */
    static class TextViewCompatApi27Impl extends TextViewCompatApi23Impl {
        TextViewCompatApi27Impl() {
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeTextType(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeMinTextSize(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeMaxTextSize(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @Override // android.support.v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int[] getAutoSizeTextAvailableSizes(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }
    }

    public static void setAutoSizeTextTypeWithDefaults(TextView textView, int autoSizeTextType) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeWithDefaults(autoSizeTextType);
        }
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] presetSizes, int unit) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        }
    }

    public static int getAutoSizeTextType(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeTextType();
        }
        return 0;
    }

    public static int getAutoSizeStepGranularity(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    public static int getAutoSizeMinTextSize(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int getAutoSizeMaxTextSize(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    public static int[] getAutoSizeTextAvailableSizes(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextAvailableSizes();
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    public static void setCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof OreoCallback)) {
            return callback;
        }
        return new OreoCallback(callback, textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class OreoCallback implements ActionMode.Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences = false;
        private Class mMenuBuilderClass;
        private Method mMenuBuilderRemoveItemAtMethod;
        private final TextView mTextView;

        OreoCallback(ActionMode.Callback callback, TextView textView) {
            this.mCallback = callback;
            this.mTextView = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.mCallback.onCreateActionMode(mode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            recomputeProcessTextMenuItems(menu);
            return this.mCallback.onPrepareActionMode(mode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.mCallback.onActionItemClicked(mode, item);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            this.mCallback.onDestroyActionMode(mode);
        }

        private void recomputeProcessTextMenuItems(Menu menu) {
            Context context = this.mTextView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.mInitializedMenuBuilderReferences) {
                this.mInitializedMenuBuilderReferences = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.mMenuBuilderClass = cls;
                    this.mMenuBuilderRemoveItemAtMethod = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.mCanUseMenuBuilderReferences = true;
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    this.mMenuBuilderClass = null;
                    this.mMenuBuilderRemoveItemAtMethod = null;
                    this.mCanUseMenuBuilderReferences = false;
                }
            }
            try {
                Method removeItemAtMethod = (this.mCanUseMenuBuilderReferences && this.mMenuBuilderClass.isInstance(menu)) ? this.mMenuBuilderRemoveItemAtMethod : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int i = menu.size() - 1; i >= 0; i--) {
                    MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        removeItemAtMethod.invoke(menu, Integer.valueOf(i));
                    }
                }
                List<ResolveInfo> supportedActivities = getSupportedActivities(context, packageManager);
                for (int i2 = 0; i2 < supportedActivities.size(); i2++) {
                    ResolveInfo info = supportedActivities.get(i2);
                    menu.add(0, 0, i2 + 100, info.loadLabel(packageManager)).setIntent(createProcessTextIntentForResolveInfo(info, this.mTextView)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            }
        }

        private List<ResolveInfo> getSupportedActivities(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList<>();
            boolean canStartActivityForResult = context instanceof Activity;
            if (!canStartActivityForResult) {
                return supportedActivities;
            }
            List<ResolveInfo> unfiltered = packageManager.queryIntentActivities(createProcessTextIntent(), 0);
            for (ResolveInfo info : unfiltered) {
                if (isSupportedActivity(info, context)) {
                    supportedActivities.add(info);
                }
            }
            return supportedActivities;
        }

        private boolean isSupportedActivity(ResolveInfo info, Context context) {
            if (context.getPackageName().equals(info.activityInfo.packageName)) {
                return true;
            }
            if (info.activityInfo.exported) {
                return info.activityInfo.permission == null || context.checkSelfPermission(info.activityInfo.permission) == 0;
            }
            return false;
        }

        private Intent createProcessTextIntentForResolveInfo(ResolveInfo info, TextView textView11) {
            return createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !isEditable(textView11)).setClassName(info.activityInfo.packageName, info.activityInfo.name);
        }

        private boolean isEditable(TextView textView11) {
            return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
        }

        private Intent createProcessTextIntent() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    public static void setFirstBaselineToTopHeight(TextView textView, int firstBaselineToTopHeight) {
        int fontMetricsTop;
        Preconditions.checkArgumentNonnegative(firstBaselineToTopHeight);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            fontMetricsTop = fontMetrics.top;
        } else {
            fontMetricsTop = fontMetrics.ascent;
        }
        if (firstBaselineToTopHeight > Math.abs(fontMetricsTop)) {
            int paddingTop = firstBaselineToTopHeight - (-fontMetricsTop);
            textView.setPadding(textView.getPaddingLeft(), paddingTop, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(TextView textView, int lastBaselineToBottomHeight) {
        int fontMetricsBottom;
        Preconditions.checkArgumentNonnegative(lastBaselineToBottomHeight);
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            fontMetricsBottom = fontMetrics.bottom;
        } else {
            fontMetricsBottom = fontMetrics.descent;
        }
        if (lastBaselineToBottomHeight > Math.abs(fontMetricsBottom)) {
            int paddingBottom = lastBaselineToBottomHeight - fontMetricsBottom;
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), paddingBottom);
        }
    }

    public static int getFirstBaselineToTopHeight(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void setLineHeight(TextView textView, int lineHeight) {
        Preconditions.checkArgumentNonnegative(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        if (lineHeight != fontHeight) {
            textView.setLineSpacing(lineHeight - fontHeight, 1.0f);
        }
    }

    public static PrecomputedTextCompat.Params getTextMetricsParams(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PrecomputedTextCompat.Params(textView.getTextMetricsParams());
        }
        PrecomputedTextCompat.Params.Builder builder = new PrecomputedTextCompat.Params.Builder(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            builder.setBreakStrategy(textView.getBreakStrategy());
            builder.setHyphenationFrequency(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            builder.setTextDirection(getTextDirectionHeuristic(textView));
        }
        return builder.build();
    }

    public static void setTextMetricsParams(TextView textView, PrecomputedTextCompat.Params params) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(getTextDirection(params.getTextDirection()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float paintTextScaleX = params.getTextPaint().getTextScaleX();
            textView.getPaint().set(params.getTextPaint());
            if (paintTextScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((paintTextScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(paintTextScaleX);
            return;
        }
        textView.getPaint().set(params.getTextPaint());
        textView.setBreakStrategy(params.getBreakStrategy());
        textView.setHyphenationFrequency(params.getHyphenationFrequency());
    }

    public static void setPrecomputedText(TextView textView, PrecomputedTextCompat precomputed) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setText(precomputed.getPrecomputedText());
            return;
        }
        PrecomputedTextCompat.Params param = getTextMetricsParams(textView);
        if (!param.equals(precomputed.getParams())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(precomputed);
    }

    private static TextDirectionHeuristic getTextDirectionHeuristic(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(textView.getTextLocale());
            String zero = symbols.getDigitStrings()[0];
            int firstCodepoint = zero.codePointAt(0);
            byte digitDirection = Character.getDirectionality(firstCodepoint);
            if (digitDirection == 1 || digitDirection == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
        boolean defaultIsRtl = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return defaultIsRtl ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    private static int getTextDirection(TextDirectionHeuristic heuristic) {
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (heuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (heuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (heuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (heuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }
}
