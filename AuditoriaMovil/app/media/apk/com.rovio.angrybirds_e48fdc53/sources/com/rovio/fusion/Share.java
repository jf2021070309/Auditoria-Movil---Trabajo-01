package com.rovio.fusion;

import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.File;
/* loaded from: classes2.dex */
public class Share {
    private static final String TAG = "fusion.Share";
    private static final boolean VERBOSE_LOGGING = false;

    protected static native void onShareClosed(int i);

    public static String getTemporaryDirectoryPathForSharing() {
        return Globals.getActivity().getCacheDir().getAbsolutePath() + "/";
    }

    private static Uri getUriFromPath(String str) {
        return Uri.parse("file://" + str);
    }

    public static void shareFromMediaStoreWithMimeType(String str, String str2, String str3, final int i) {
        File file = new File(str2);
        file.setReadable(true, false);
        Uri fromFile = Uri.fromFile(file);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", fromFile);
        intent.setType(str3);
        Globals.registerActivityListener(new IActivityListener() { // from class: com.rovio.fusion.Share.1
            @Override // com.rovio.fusion.IActivityListener
            public void onResume() {
            }

            @Override // com.rovio.fusion.IActivityListener
            public void onPause() {
            }

            @Override // com.rovio.fusion.IActivityListener
            public void onNewIntent(Intent intent2) {
            }

            @Override // com.rovio.fusion.IActivityListener
            public void onActivityResult(int i2, int i3, Intent intent2) {
                if (i == i2) {
                    Globals.unregisterActivityListener(this);
                    Share.onShareClosed(i);
                }
            }

            @Override // com.rovio.fusion.IActivityListener
            public void onDestroy() {
            }
        });
        Globals.getActivity().startActivityForResult(Intent.createChooser(intent, str), i);
    }

    public static void shareFile(String str, String str2, int i) {
        String str3 = null;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str2);
        if (fileExtensionFromUrl != null) {
            str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        shareFromMediaStoreWithMimeType(str, str2, str3, i);
    }

    public static void shareImageFile(String str, String str2, int i) {
        String str3 = MessengerShareContentUtility.MEDIA_IMAGE;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str2);
        if (fileExtensionFromUrl != null) {
            str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        shareFromMediaStoreWithMimeType(str, str2, str3, i);
    }
}
