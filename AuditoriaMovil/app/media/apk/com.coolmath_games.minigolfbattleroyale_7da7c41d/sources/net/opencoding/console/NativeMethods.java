package net.opencoding.console;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Log;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class NativeMethods {
    private static Field _unityPlayerActivityField;
    private static Class<?> _unityPlayerClass;

    public static void copyToClipboard(final String str) {
        runSafelyOnUiThread(new Runnable() { // from class: net.opencoding.console.NativeMethods.1
            @Override // java.lang.Runnable
            public void run() {
                ((ClipboardManager) NativeMethods.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Console Text", str));
            }
        });
    }

    public static void runSafelyOnUiThread(Runnable runnable) {
        runSafelyOnUiThread(runnable, null);
    }

    private static void runSafelyOnUiThread(final Runnable runnable, String str) {
        getActivity().runOnUiThread(new Runnable() { // from class: net.opencoding.console.NativeMethods.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    Log.e("OpencodingConsole", "Exception running command on UI thread: " + e.getMessage());
                }
            }
        });
    }

    private static void setup() {
        try {
            if (_unityPlayerClass == null) {
                _unityPlayerClass = Class.forName("com.unity3d.player.UnityPlayer");
            }
            if (_unityPlayerActivityField == null) {
                _unityPlayerActivityField = _unityPlayerClass.getField("currentActivity");
            }
        } catch (ClassNotFoundException e) {
            Log.i("OpencodingConsole", "could not find UnityPlayer class: " + e.getMessage());
        } catch (NoSuchFieldException e2) {
            Log.i("OpencodingConsole", "could not find currentActivity field: " + e2.getMessage());
        } catch (Exception e3) {
            Log.i("OpencodingConsole", "An unkown exception occurred locating getActivity(): " + e3.getMessage());
        }
    }

    public static Activity getActivity() {
        if (_unityPlayerActivityField == null) {
            setup();
        }
        try {
            Activity activity = (Activity) _unityPlayerActivityField.get(_unityPlayerClass);
            if (activity == null) {
                Log.e("OpencodingConsole", "Something has gone terribly wrong. The Unity Activity does not exist. This could be due to a low memory situation");
            }
            return activity;
        } catch (Exception e) {
            Log.i("OpencodingConsole", "error getting currentActivity: " + e.getMessage());
            return null;
        }
    }
}
