package net.opencoding.console;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.util.Log;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class Email {
    private static ArrayList<Uri> attachments;
    private static Intent emailIntent;

    public static void beginEmail(String str, String str2, String str3, boolean z) {
        attachments = new ArrayList<>();
        Log.i("OpencodingConsole", "preparing SEND_MULTIPLE Intent");
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        emailIntent = intent;
        if (z) {
            intent.setType("text/html");
            emailIntent.putExtra("android.intent.extra.TEXT", Html.fromHtml(str3));
        } else {
            intent.setType("plain/text");
            emailIntent.putExtra("android.intent.extra.TEXT", str3);
        }
        if (str != null) {
            emailIntent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        }
        emailIntent.putExtra("android.intent.extra.SUBJECT", str2);
    }

    public static void addAttachment(String str) {
        Log.i("OpencodingConsole", "added attachment to email");
        Log.i("OpencodingConsole", "Cache dir: " + NativeMethods.getActivity().getCacheDir());
        File file = new File(str);
        Activity activity = NativeMethods.getActivity();
        String packageName = activity.getPackageName();
        String str2 = NativeMethods.getActivity().getPackageName() + ".fileprovider";
        Log.i("OpencodingConsole", "attachmentFilePath: " + str);
        Log.i("OpencodingConsole", "File authority: " + str2);
        Uri uriForFile = FileProvider.getUriForFile(activity, str2, file);
        Log.i("OpencodingConsole", "contentUri: " + uriForFile.toString());
        activity.grantUriPermission(packageName, uriForFile, 3);
        attachments.add(uriForFile);
    }

    public static String getCacheDir() {
        return NativeMethods.getActivity().getCacheDir().toString();
    }

    public static void finishEmail() {
        Log.i("OpencodingConsole", "starting Activity with Intent chooser");
        NativeMethods.runSafelyOnUiThread(new Runnable() { // from class: net.opencoding.console.Email.1
            @Override // java.lang.Runnable
            public void run() {
                if (Email.attachments.size() != 0) {
                    Email.emailIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", Email.attachments);
                }
                NativeMethods.getActivity().startActivityForResult(Intent.createChooser(Email.emailIntent, "Send email"), 0);
            }
        });
    }
}
