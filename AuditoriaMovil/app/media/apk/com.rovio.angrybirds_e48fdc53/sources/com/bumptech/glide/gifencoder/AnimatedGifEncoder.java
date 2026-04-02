package com.bumptech.glide.gifencoder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import com.flurry.android.Constants;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes6.dex */
public class AnimatedGifEncoder {
    private static final double MIN_TRANSPARENT_PERCENTAGE = 4.0d;
    private static final String TAG = "AnimatedGifEncoder";
    private int colorDepth;
    private byte[] colorTab;
    private int fixedHeight;
    private int fixedWidth;
    private boolean hasTransparentPixels;
    private int height;
    private Bitmap image;
    private byte[] indexedPixels;
    private OutputStream out;
    private byte[] pixels;
    private int transIndex;
    private int width;
    private Integer transparent = null;
    private int repeat = -1;
    private int delay = 0;
    private boolean started = false;
    private boolean[] usedEntry = new boolean[256];
    private int palSize = 7;
    private int dispose = -1;
    private boolean closeStream = false;
    private boolean firstFrame = true;
    private boolean sizeSet = false;
    private int sample = 10;

    public void setDelay(int ms) {
        this.delay = Math.round(ms / 10.0f);
    }

    public void setDispose(int code) {
        if (code >= 0) {
            this.dispose = code;
        }
    }

    public void setRepeat(int iter) {
        if (iter >= 0) {
            this.repeat = iter;
        }
    }

    public void setTransparent(int color) {
        this.transparent = Integer.valueOf(color);
    }

    public boolean addFrame(Bitmap im) {
        return addFrame(im, 0, 0);
    }

    public boolean addFrame(Bitmap im, int x, int y) {
        if (im == null || !this.started) {
            return false;
        }
        try {
            if (this.sizeSet) {
                setFrameSize(this.fixedWidth, this.fixedHeight);
            } else {
                setFrameSize(im.getWidth(), im.getHeight());
            }
            this.image = im;
            getImagePixels();
            analyzePixels();
            if (this.firstFrame) {
                writeLSD();
                writePalette();
                if (this.repeat >= 0) {
                    writeNetscapeExt();
                }
            }
            writeGraphicCtrlExt();
            writeImageDesc(x, y);
            if (!this.firstFrame) {
                writePalette();
            }
            writePixels();
            this.firstFrame = false;
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean finish() {
        if (this.started) {
            boolean ok = true;
            this.started = false;
            try {
                this.out.write(59);
                this.out.flush();
                if (this.closeStream) {
                    this.out.close();
                }
            } catch (IOException e) {
                ok = false;
            }
            this.transIndex = 0;
            this.out = null;
            this.image = null;
            this.pixels = null;
            this.indexedPixels = null;
            this.colorTab = null;
            this.closeStream = false;
            this.firstFrame = true;
            return ok;
        }
        return false;
    }

    public void setFrameRate(float fps) {
        if (fps != 0.0f) {
            this.delay = Math.round(100.0f / fps);
        }
    }

    public void setQuality(int quality) {
        if (quality < 1) {
            quality = 1;
        }
        this.sample = quality;
    }

    public void setSize(int w, int h) {
        if (this.started) {
            return;
        }
        this.fixedWidth = w;
        this.fixedHeight = h;
        if (w < 1) {
            this.fixedWidth = 320;
        }
        if (h < 1) {
            this.fixedHeight = 240;
        }
        this.sizeSet = true;
    }

    private void setFrameSize(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean start(OutputStream os) {
        if (os == null) {
            return false;
        }
        boolean ok = true;
        this.closeStream = false;
        this.out = os;
        try {
            writeString("GIF89a");
        } catch (IOException e) {
            ok = false;
        }
        this.started = ok;
        return ok;
    }

    public boolean start(String file) {
        boolean ok;
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            this.out = bufferedOutputStream;
            ok = start(bufferedOutputStream);
            this.closeStream = true;
        } catch (IOException e) {
            ok = false;
        }
        this.started = ok;
        return ok;
    }

    private void analyzePixels() {
        byte[] bArr = this.pixels;
        int len = bArr.length;
        int nPix = len / 3;
        this.indexedPixels = new byte[nPix];
        NeuQuant nq = new NeuQuant(bArr, len, this.sample);
        this.colorTab = nq.process();
        int i = 0;
        while (true) {
            byte[] bArr2 = this.colorTab;
            if (i >= bArr2.length) {
                break;
            }
            byte temp = bArr2[i];
            bArr2[i] = bArr2[i + 2];
            bArr2[i + 2] = temp;
            this.usedEntry[i / 3] = false;
            i += 3;
        }
        int k = 0;
        int i2 = 0;
        while (i2 < nPix) {
            byte[] bArr3 = this.pixels;
            int k2 = k + 1;
            int k3 = k2 + 1;
            int index = nq.map(bArr3[k] & 255, bArr3[k2] & 255, bArr3[k3] & Constants.UNKNOWN);
            this.usedEntry[index] = true;
            this.indexedPixels[i2] = (byte) index;
            i2++;
            k = k3 + 1;
        }
        this.pixels = null;
        this.colorDepth = 8;
        this.palSize = 7;
        Integer num = this.transparent;
        if (num != null) {
            this.transIndex = findClosest(num.intValue());
        } else if (this.hasTransparentPixels) {
            this.transIndex = findClosest(0);
        }
    }

    private int findClosest(int color) {
        if (this.colorTab == null) {
            return -1;
        }
        int r = Color.red(color);
        int g = Color.green(color);
        int b = Color.blue(color);
        int minpos = 0;
        int dmin = 16777216;
        int len = this.colorTab.length;
        int dr = 0;
        while (dr < len) {
            byte[] bArr = this.colorTab;
            int i = dr + 1;
            int dr2 = r - (bArr[dr] & 255);
            int i2 = i + 1;
            int dg = g - (bArr[i] & 255);
            int db = b - (bArr[i2] & Constants.UNKNOWN);
            int d = (dr2 * dr2) + (dg * dg) + (db * db);
            int index = i2 / 3;
            if (this.usedEntry[index] && d < dmin) {
                dmin = d;
                minpos = index;
            }
            dr = i2 + 1;
        }
        return minpos;
    }

    private void getImagePixels() {
        int w = this.image.getWidth();
        int h = this.image.getHeight();
        int i = this.width;
        if (w != i || h != this.height) {
            Bitmap temp = Bitmap.createBitmap(i, this.height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(temp);
            canvas.drawBitmap(temp, 0.0f, 0.0f, (Paint) null);
            this.image = temp;
        }
        int[] pixelsInt = new int[w * h];
        this.image.getPixels(pixelsInt, 0, w, 0, 0, w, h);
        this.pixels = new byte[pixelsInt.length * 3];
        int pixelsIndex = 0;
        this.hasTransparentPixels = false;
        int totalTransparentPixels = 0;
        int length = pixelsInt.length;
        int i2 = 0;
        while (i2 < length) {
            int pixel = pixelsInt[i2];
            if (pixel == 0) {
                totalTransparentPixels++;
            }
            byte[] bArr = this.pixels;
            int pixelsIndex2 = pixelsIndex + 1;
            bArr[pixelsIndex] = (byte) (pixel & 255);
            int pixelsIndex3 = pixelsIndex2 + 1;
            bArr[pixelsIndex2] = (byte) ((pixel >> 8) & 255);
            bArr[pixelsIndex3] = (byte) ((pixel >> 16) & 255);
            i2++;
            pixelsIndex = pixelsIndex3 + 1;
        }
        double transparentPercentage = (totalTransparentPixels * 100) / pixelsInt.length;
        this.hasTransparentPixels = transparentPercentage > MIN_TRANSPARENT_PERCENTAGE;
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "got pixels for frame with " + transparentPercentage + "% transparent pixels");
        }
    }

    private void writeGraphicCtrlExt() throws IOException {
        int transp;
        int disp;
        this.out.write(33);
        this.out.write(249);
        this.out.write(4);
        if (this.transparent == null && !this.hasTransparentPixels) {
            transp = 0;
            disp = 0;
        } else {
            transp = 1;
            disp = 2;
        }
        int i = this.dispose;
        if (i >= 0) {
            disp = i & 7;
        }
        this.out.write((disp << 2) | 0 | 0 | transp);
        writeShort(this.delay);
        this.out.write(this.transIndex);
        this.out.write(0);
    }

    private void writeImageDesc(int x, int y) throws IOException {
        this.out.write(44);
        writeShort(x);
        writeShort(y);
        writeShort(this.width);
        writeShort(this.height);
        if (this.firstFrame) {
            this.out.write(0);
        } else {
            this.out.write(this.palSize | 128);
        }
    }

    private void writeLSD() throws IOException {
        writeShort(this.width);
        writeShort(this.height);
        this.out.write(this.palSize | 240);
        this.out.write(0);
        this.out.write(0);
    }

    private void writeNetscapeExt() throws IOException {
        this.out.write(33);
        this.out.write(255);
        this.out.write(11);
        writeString("NETSCAPE2.0");
        this.out.write(3);
        this.out.write(1);
        writeShort(this.repeat);
        this.out.write(0);
    }

    private void writePalette() throws IOException {
        OutputStream outputStream = this.out;
        byte[] bArr = this.colorTab;
        outputStream.write(bArr, 0, bArr.length);
        int n = 768 - this.colorTab.length;
        for (int i = 0; i < n; i++) {
            this.out.write(0);
        }
    }

    private void writePixels() throws IOException {
        LZWEncoder encoder = new LZWEncoder(this.width, this.height, this.indexedPixels, this.colorDepth);
        encoder.encode(this.out);
    }

    private void writeShort(int value) throws IOException {
        this.out.write(value & 255);
        this.out.write((value >> 8) & 255);
    }

    private void writeString(String s) throws IOException {
        for (int i = 0; i < s.length(); i++) {
            this.out.write((byte) s.charAt(i));
        }
    }
}
