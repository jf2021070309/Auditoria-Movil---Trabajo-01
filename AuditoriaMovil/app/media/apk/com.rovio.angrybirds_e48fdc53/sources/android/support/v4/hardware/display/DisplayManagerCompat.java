package android.support.v4.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.internal.ServerProtocol;
import java.util.WeakHashMap;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final WeakHashMap<Context, DisplayManagerCompat> sInstances = new WeakHashMap<>();
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    public static DisplayManagerCompat getInstance(Context context) {
        DisplayManagerCompat instance;
        WeakHashMap<Context, DisplayManagerCompat> weakHashMap = sInstances;
        synchronized (weakHashMap) {
            instance = weakHashMap.get(context);
            if (instance == null) {
                instance = new DisplayManagerCompat(context);
                weakHashMap.put(context, instance);
            }
        }
        return instance;
    }

    public Display getDisplay(int displayId) {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.mContext.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplay(displayId);
        }
        Display display = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        if (display.getDisplayId() == displayId) {
            return display;
        }
        return null;
    }

    public Display[] getDisplays() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.mContext.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplays();
        }
        Display display = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        return new Display[]{display};
    }

    /* loaded from: classes2.dex */
    private static class DisplayManagerCompatApi14Impl extends DisplayManagerCompat {
        private final WindowManager mWindowManager;

        DisplayManagerCompatApi14Impl(Context context) {
            this.mWindowManager = (WindowManager) context.getSystemService("window");
        }

        @Override // android.support.v4.hardware.display.DisplayManagerCompat
        public Display getDisplay(int i) {
            Display defaultDisplay = this.mWindowManager.getDefaultDisplay();
            if (defaultDisplay.getDisplayId() == i) {
                return defaultDisplay;
            }
            return null;
        }

        @Override // android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays() {
            return new Display[]{this.mWindowManager.getDefaultDisplay()};
        }

        @Override // android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays(String str) {
            return str == null ? getDisplays() : new Display[0];
        }
    }

    public Display[] getDisplays(String category) {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.mContext.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplays(category);
        }
        if (category == null) {
            return new Display[0];
        }
        Display display = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        return new Display[]{display};
    }

    /* loaded from: classes2.dex */
    private static class DisplayManagerCompatApi17Impl extends DisplayManagerCompat {
        private final DisplayManager mDisplayManager;

        DisplayManagerCompatApi17Impl(Context context) {
            this.mDisplayManager = (DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY);
        }

        @Override // android.support.v4.hardware.display.DisplayManagerCompat
        public Display getDisplay(int i) {
            return this.mDisplayManager.getDisplay(i);
        }

        @Override // android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays() {
            return this.mDisplayManager.getDisplays();
        }

        @Override // android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays(String str) {
            return this.mDisplayManager.getDisplays(str);
        }
    }
}
