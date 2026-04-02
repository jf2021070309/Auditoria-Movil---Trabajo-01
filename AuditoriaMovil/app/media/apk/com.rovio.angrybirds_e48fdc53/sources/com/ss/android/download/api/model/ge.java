package com.ss.android.download.api.model;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes3.dex */
public class ge {
    public boolean bn;
    public Context dr;
    public String g;
    public String ge;
    public View ll;
    public String o;
    public String q;
    public Drawable rb;
    public int wb;
    public InterfaceC0290ge xu;

    /* renamed from: com.ss.android.download.api.model.ge$ge  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0290ge {
        void dr(DialogInterface dialogInterface);

        void ge(DialogInterface dialogInterface);

        void o(DialogInterface dialogInterface);
    }

    private ge(dr drVar) {
        this.bn = true;
        this.dr = drVar.o;
        this.ge = drVar.g;
        this.o = drVar.q;
        this.g = drVar.bn;
        this.q = drVar.rb;
        this.bn = drVar.xu;
        this.rb = drVar.ll;
        this.xu = drVar.wb;
        this.ll = drVar.dr;
        this.wb = drVar.ge;
    }

    /* loaded from: classes3.dex */
    public static final class dr {
        private String bn;
        public View dr;
        private String g;
        public int ge;
        private Drawable ll;
        private Context o;
        private String q;
        private String rb;
        private InterfaceC0290ge wb;
        private boolean xu;

        public dr(Context context) {
            this.o = context;
        }

        public dr dr(String str) {
            this.g = str;
            return this;
        }

        public dr ge(String str) {
            this.q = str;
            return this;
        }

        public dr o(String str) {
            this.bn = str;
            return this;
        }

        public dr g(String str) {
            this.rb = str;
            return this;
        }

        public dr dr(boolean z) {
            this.xu = z;
            return this;
        }

        public dr dr(Drawable drawable) {
            this.ll = drawable;
            return this;
        }

        public dr dr(InterfaceC0290ge interfaceC0290ge) {
            this.wb = interfaceC0290ge;
            return this;
        }

        public dr dr(int i) {
            this.ge = i;
            return this;
        }

        public ge dr() {
            return new ge(this);
        }
    }
}
