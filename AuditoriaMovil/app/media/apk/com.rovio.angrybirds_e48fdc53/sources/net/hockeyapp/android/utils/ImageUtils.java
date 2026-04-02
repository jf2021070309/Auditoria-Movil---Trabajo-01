package net.hockeyapp.android.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public class ImageUtils {
    public static final int ORIENTATION_LANDSCAPE = 0;
    public static final int ORIENTATION_PORTRAIT = 1;

    public static int determineOrientation(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            int determineOrientation = determineOrientation(fileInputStream);
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return determineOrientation;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static int determineOrientation(Context context, Uri uri) {
        int i;
        InputStream inputStream = null;
        try {
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                i = determineOrientation(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        HockeyLog.error("Unable to close input stream.", e);
                    }
                }
            } catch (IOException e2) {
                HockeyLog.error("Unable to determine necessary screen orientation.", e2);
                i = 1;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        HockeyLog.error("Unable to close input stream.", e3);
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    HockeyLog.error("Unable to close input stream.", e4);
                }
            }
            throw th;
        }
    }

    public static int determineOrientation(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return (options.outWidth == -1 || options.outHeight == -1 || ((float) options.outWidth) / ((float) options.outHeight) <= 1.0f) ? 1 : 0;
    }

    public static Bitmap decodeSampledBitmap(File file, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static Bitmap decodeSampledBitmap(Context context, Uri uri, int i, int i2) {
        InputStream inputStream;
        BitmapFactory.Options options;
        InputStream inputStream2 = null;
        try {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            inputStream = context.getContentResolver().openInputStream(uri);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            BitmapFactory.decodeStream(inputStream, null, options);
            options.inSampleSize = a(options, i, i2);
            options.inJustDecodeBounds = false;
            inputStream2 = context.getContentResolver().openInputStream(uri);
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
            inputStream.close();
            inputStream2.close();
            return decodeStream;
        } catch (Throwable th2) {
            th = th2;
            inputStream.close();
            inputStream2.close();
            throw th;
        }
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
