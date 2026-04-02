package com.amazon.aps.iva.tc;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.amazon.aps.iva.kc.g;
import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.kc.i;
import com.amazon.aps.iva.uc.m;
import com.amazon.aps.iva.uc.n;
import com.amazon.aps.iva.uc.s;
/* compiled from: DefaultOnHeaderDecodedListener.java */
/* loaded from: classes.dex */
public final class a implements ImageDecoder$OnHeaderDecodedListener {
    public final s a = s.a();
    public final int b;
    public final int c;
    public final com.amazon.aps.iva.kc.b d;
    public final m e;
    public final boolean f;
    public final i g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    /* renamed from: com.amazon.aps.iva.tc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0739a implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i, int i2, h hVar) {
        boolean z;
        this.b = i;
        this.c = i2;
        this.d = (com.amazon.aps.iva.kc.b) hVar.c(n.f);
        this.e = (m) hVar.c(m.f);
        g<Boolean> gVar = n.i;
        if (hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.g = (i) hVar.c(n.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        boolean z = false;
        if (this.a.c(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == com.amazon.aps.iva.kc.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0739a());
        size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.g;
        if (iVar != null) {
            if (Build.VERSION.SDK_INT < 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            if (iVar == i.DISPLAY_P3) {
                colorSpace = imageInfo.getColorSpace();
                if (colorSpace != null) {
                    colorSpace2 = imageInfo.getColorSpace();
                    if (colorSpace2.isWideGamut()) {
                        z = true;
                    }
                }
            }
            if (z) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
