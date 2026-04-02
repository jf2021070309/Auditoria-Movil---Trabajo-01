package com.ironsource.sdk.g;

import android.text.TextUtils;
import java.util.HashSet;
/* loaded from: classes2.dex */
public class d {
    private String c;
    private String d;
    private int f;
    private HashSet<String> b = new HashSet<>();
    private boolean a = false;
    private boolean e = false;
    private boolean g = true;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        None,
        Loaded,
        Ready,
        Failed
    }

    /* loaded from: classes2.dex */
    public enum c {
        Web,
        Native
    }

    /* renamed from: com.ironsource.sdk.g.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0093d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        
        public int d;

        EnumC0093d(int i) {
            this.d = i;
        }
    }

    /* loaded from: classes2.dex */
    public enum e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    public HashSet<String> a() {
        return this.b;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public void a(boolean z) {
        this.a = z;
    }

    public void b(String str) {
        this.c = str;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.d = str;
    }

    public void c(boolean z) {
        this.g = z;
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }
}
