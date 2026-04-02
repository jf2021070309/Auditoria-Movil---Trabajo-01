package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.ImageUtils;
import net.hockeyapp.android.views.PaintView;
/* loaded from: classes4.dex */
public class PaintActivity extends Activity {
    public static final String EXTRA_IMAGE_URI = "imageUri";
    private PaintView a;
    private String b;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getParcelable(EXTRA_IMAGE_URI) == null) {
            HockeyLog.error("Can't set up PaintActivity as image extra was not provided!");
            return;
        }
        Uri uri = (Uri) extras.getParcelable(EXTRA_IMAGE_URI);
        this.b = a(uri, uri.getLastPathSegment());
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        int i3 = i > i2 ? 0 : 1;
        int determineOrientation = ImageUtils.determineOrientation(this, uri);
        setRequestedOrientation(determineOrientation);
        if (i3 != determineOrientation) {
            HockeyLog.debug("Image loading skipped because activity will be destroyed for orientation change.");
            return;
        }
        this.a = new PaintView(this, uri, i, i2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.a);
        setContentView(linearLayout);
        Toast.makeText(this, getString(R.string.hockeyapp_paint_indicator_toast), 1).show();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, getString(R.string.hockeyapp_paint_menu_save));
        menu.add(0, 2, 0, getString(R.string.hockeyapp_paint_menu_undo));
        menu.add(0, 3, 0, getString(R.string.hockeyapp_paint_menu_clear));
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                a();
                return true;
            case 2:
                this.a.undo();
                return true;
            case 3:
                this.a.clearImage();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.a.isClear()) {
            return super.onKeyDown(i, keyEvent);
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.PaintActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                switch (i2) {
                    case -2:
                        PaintActivity.this.finish();
                        return;
                    case -1:
                        PaintActivity.this.a();
                        return;
                    default:
                        return;
                }
            }
        };
        new AlertDialog.Builder(this).setMessage(R.string.hockeyapp_paint_dialog_message).setPositiveButton(R.string.hockeyapp_paint_dialog_positive_button, onClickListener).setNegativeButton(R.string.hockeyapp_paint_dialog_negative_button, onClickListener).setNeutralButton(R.string.hockeyapp_paint_dialog_neutral_button, onClickListener).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [net.hockeyapp.android.PaintActivity$2] */
    public void a() {
        File file = new File(getCacheDir(), "HockeyApp");
        file.mkdir();
        File file2 = new File(file, this.b + ".jpg");
        int i = 1;
        while (file2.exists()) {
            file2 = new File(file, this.b + "_" + i + ".jpg");
            i++;
        }
        this.a.setDrawingCacheEnabled(true);
        final Bitmap drawingCache = this.a.getDrawingCache();
        new AsyncTask<File, Void, Void>() { // from class: net.hockeyapp.android.PaintActivity.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(File... fileArr) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileArr[0]);
                    drawingCache.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.close();
                    return null;
                } catch (IOException e) {
                    e.printStackTrace();
                    HockeyLog.error("Could not save image.", e);
                    return null;
                }
            }
        }.execute(file2);
        Intent intent = new Intent();
        intent.putExtra(EXTRA_IMAGE_URI, Uri.fromFile(file2));
        if (getParent() == null) {
            setResult(-1, intent);
        } else {
            getParent().setResult(-1, intent);
        }
        finish();
    }

    private String a(Uri uri, String str) {
        Cursor query = getApplicationContext().getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (query != null) {
            try {
                r3 = query.moveToFirst() ? query.getString(0) : null;
            } finally {
                query.close();
            }
        }
        return r3 == null ? str : new File(r3).getName();
    }
}
