package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";
    String a;
    String c;
    private int i = 999999;
    private double j = 999999.99d;
    private final String k = "custom";
    private final int l = 5;
    int b = -1;
    int d = -1;
    AtomicBoolean e = null;
    double f = -1.0d;
    long g = 0;
    Vector<Pair<String, String>> h = new Vector<>();

    private static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private static boolean a(String str, int i, int i2) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    public int getAge() {
        return this.b;
    }

    public String getGender() {
        return this.c;
    }

    public double getIapt() {
        return this.f;
    }

    public AtomicBoolean getIsPaying() {
        return this.e;
    }

    public int getLevel() {
        return this.d;
    }

    public String getSegmentName() {
        return this.a;
    }

    public long getUcd() {
        return this.g;
    }

    public void setAge(int i) {
        if (i > 0 && i <= 199) {
            this.b = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
    }

    public void setCustom(String str, String str2) {
        try {
            if (a(str) && a(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.h.size() < 5) {
                    this.h.add(new Pair<>(str3, str2));
                    return;
                }
                this.h.remove(0);
                this.h.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (!TextUtils.isEmpty(str) && (str.toLowerCase(Locale.ENGLISH).equals("male") || str.toLowerCase(Locale.ENGLISH).equals("female"))) {
            this.c = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d) {
        if (d > 0.0d && d < this.j) {
            this.f = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.j, 2);
    }

    public void setIsPaying(boolean z) {
        if (this.e == null) {
            this.e = new AtomicBoolean();
        }
        this.e.set(z);
    }

    public void setLevel(int i) {
        if (i > 0 && i < this.i) {
            this.d = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.i, 2);
    }

    public void setSegmentName(String str) {
        if (a(str) && a(str, 1, 32)) {
            this.a = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.g = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }
}
