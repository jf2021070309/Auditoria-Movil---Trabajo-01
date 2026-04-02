package com.amazon.aps.iva.v90;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.amazon.aps.iva.kb0.o;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PhilologyResources.kt */
/* loaded from: classes4.dex */
public final class g extends Resources {
    public final h a;
    public final Resources b;

    public g(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.b = resources;
        this.a = new h(resources);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        XmlResourceParser animation = this.b.getAnimation(i);
        com.amazon.aps.iva.yb0.j.b(animation, "baseResources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) throws Resources.NotFoundException {
        return this.b.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i) throws Resources.NotFoundException {
        return this.b.getColor(i);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.b.getColorStateList(i);
        com.amazon.aps.iva.yb0.j.b(colorStateList, "baseResources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        Configuration configuration = this.b.getConfiguration();
        com.amazon.aps.iva.yb0.j.b(configuration, "baseResources.configuration");
        return configuration;
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) throws Resources.NotFoundException {
        return this.b.getDimension(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return this.b.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return this.b.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.b.getDisplayMetrics();
        com.amazon.aps.iva.yb0.j.b(displayMetrics, "baseResources.displayMetrics");
        return displayMetrics;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = this.b.getDrawable(i);
        com.amazon.aps.iva.yb0.j.b(drawable, "baseResources.getDrawable(id)");
        return drawable;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.b.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    @SuppressLint({"NewApi"})
    public final Typeface getFont(int i) throws Resources.NotFoundException {
        Typeface font = this.b.getFont(i);
        com.amazon.aps.iva.yb0.j.b(font, "baseResources.getFont(id)");
        return font;
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i, int i2, int i3) throws Resources.NotFoundException {
        return this.b.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.b.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i) throws Resources.NotFoundException {
        int[] intArray = this.b.getIntArray(i);
        com.amazon.aps.iva.yb0.j.b(intArray, "baseResources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) throws Resources.NotFoundException {
        return this.b.getInteger(i);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        XmlResourceParser layout = this.b.getLayout(i);
        com.amazon.aps.iva.yb0.j.b(layout, "baseResources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i) throws Resources.NotFoundException {
        Movie movie = this.b.getMovie(i);
        com.amazon.aps.iva.yb0.j.b(movie, "baseResources.getMovie(id)");
        return movie;
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        return this.a.a(i, i2).toString();
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        return this.a.a(i, i2);
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i) throws Resources.NotFoundException {
        String resourceEntryName = this.b.getResourceEntryName(i);
        com.amazon.aps.iva.yb0.j.b(resourceEntryName, "baseResources.getResourceEntryName(resid)");
        return resourceEntryName;
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i) throws Resources.NotFoundException {
        String resourceName = this.b.getResourceName(i);
        com.amazon.aps.iva.yb0.j.b(resourceName, "baseResources.getResourceName(resid)");
        return resourceName;
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i) throws Resources.NotFoundException {
        String resourcePackageName = this.b.getResourcePackageName(i);
        com.amazon.aps.iva.yb0.j.b(resourcePackageName, "baseResources.getResourcePackageName(resid)");
        return resourcePackageName;
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i) throws Resources.NotFoundException {
        String resourceTypeName = this.b.getResourceTypeName(i);
        com.amazon.aps.iva.yb0.j.b(resourceTypeName, "baseResources.getResourceTypeName(resid)");
        return resourceTypeName;
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        return this.a.b(i).toString();
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        CharSequence[] c = this.a.c(i);
        ArrayList arrayList = new ArrayList(c.length);
        for (CharSequence charSequence : c) {
            arrayList.add(charSequence.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new o("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        return this.a.b(i);
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        return this.a.c(i);
    }

    @Override // android.content.res.Resources
    public final void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.b.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.b.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        XmlResourceParser xml = this.b.getXml(i);
        com.amazon.aps.iva.yb0.j.b(xml, "baseResources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = this.b.obtainAttributes(attributeSet, iArr);
        com.amazon.aps.iva.yb0.j.b(obtainAttributes, "baseResources.obtainAttributes(set, attrs)");
        return obtainAttributes;
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i) {
        InputStream openRawResource = this.b.openRawResource(i);
        com.amazon.aps.iva.yb0.j.b(openRawResource, "baseResources.openRawResource(id)");
        return openRawResource;
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        AssetFileDescriptor openRawResourceFd = this.b.openRawResourceFd(i);
        com.amazon.aps.iva.yb0.j.b(openRawResourceFd, "baseResources.openRawResourceFd(id)");
        return openRawResourceFd;
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.b.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.b.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    @TargetApi(ConnectionResult.API_DISABLED)
    public final int getColor(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return this.b.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    @TargetApi(ConnectionResult.API_DISABLED)
    public final ColorStateList getColorStateList(int i, Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.b.getColorStateList(i, theme);
        com.amazon.aps.iva.yb0.j.b(colorStateList, "baseResources.getColorStateList(id, theme)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @TargetApi(21)
    public final Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        Drawable drawable = this.b.getDrawable(i, theme);
        com.amazon.aps.iva.yb0.j.b(drawable, "baseResources.getDrawable(id, theme)");
        return drawable;
    }

    @Override // android.content.res.Resources
    @TargetApi(21)
    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.b.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.g(charSequence, "def");
        try {
            return getText(i);
        } catch (Resources.NotFoundException unused) {
            return charSequence;
        }
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.b.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        InputStream openRawResource = this.b.openRawResource(i, typedValue);
        com.amazon.aps.iva.yb0.j.b(openRawResource, "baseResources.openRawResource(id, value)");
        return openRawResource;
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... objArr) {
        com.amazon.aps.iva.yb0.j.g(objArr, "formatArgs");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        h hVar = this.a;
        hVar.getClass();
        com.amazon.aps.iva.yb0.j.g(copyOf, "formatArgs");
        String obj = hVar.a(i, i2).toString();
        Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        String format = String.format(obj, Arrays.copyOf(copyOf2, copyOf2.length));
        com.amazon.aps.iva.yb0.j.b(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
