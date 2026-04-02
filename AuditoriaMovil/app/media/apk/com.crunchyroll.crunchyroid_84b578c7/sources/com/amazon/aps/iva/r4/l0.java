package com.amazon.aps.iva.r4;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.r4.w1;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
/* compiled from: GlanceAppWidgetReceiver.kt */
/* loaded from: classes.dex */
public abstract class l0 extends AppWidgetProvider {

    /* compiled from: GlanceAppWidgetReceiver.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1", f = "GlanceAppWidgetReceiver.kt", l = {MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ Context k;
        public final /* synthetic */ AppWidgetManager l;
        public final /* synthetic */ int m;
        public final /* synthetic */ Bundle n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.k = context;
            this.l = appWidgetManager;
            this.m = i;
            this.n = bundle;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.k, this.l, this.m, this.n, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                l0 l0Var = l0.this;
                l0.a(l0Var, (com.amazon.aps.iva.se0.g0) this.i, this.k);
                com.crunchyroll.appwidgets.continuewatching.c b = l0Var.b();
                Context context = this.k;
                AppWidgetManager appWidgetManager = this.l;
                int i2 = this.m;
                Bundle bundle = this.n;
                this.h = 1;
                b.getClass();
                if (Build.VERSION.SDK_INT < 31 && (b.e instanceof w1.a)) {
                    obj2 = b.j(context, appWidgetManager, i2, new e0(bundle, appWidgetManager, i2, b, context, null), this);
                    if (obj2 != aVar) {
                        obj2 = com.amazon.aps.iva.kb0.q.a;
                    }
                    if (obj2 != aVar) {
                        obj2 = com.amazon.aps.iva.kb0.q.a;
                    }
                } else {
                    obj2 = com.amazon.aps.iva.kb0.q.a;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: GlanceAppWidgetReceiver.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1", f = "GlanceAppWidgetReceiver.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public l0 h;
        public Context i;
        public int j;
        public int k;
        public int l;
        public /* synthetic */ Object m;
        public final /* synthetic */ Context o;
        public final /* synthetic */ int[] p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int[] iArr, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.o = context;
            this.p = iArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.o, this.p, dVar);
            bVar.m = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0053 -> B:13:0x0056). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r10.l
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                int r1 = r10.k
                int r3 = r10.j
                android.content.Context r4 = r10.i
                com.amazon.aps.iva.r4.l0 r5 = r10.h
                java.lang.Object r6 = r10.m
                int[] r6 = (int[]) r6
                com.amazon.aps.iva.ab.x.i0(r11)
                r11 = r10
                goto L56
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                com.amazon.aps.iva.ab.x.i0(r11)
                java.lang.Object r11 = r10.m
                com.amazon.aps.iva.se0.g0 r11 = (com.amazon.aps.iva.se0.g0) r11
                com.amazon.aps.iva.r4.l0 r1 = com.amazon.aps.iva.r4.l0.this
                android.content.Context r3 = r10.o
                com.amazon.aps.iva.r4.l0.a(r1, r11, r3)
                int[] r11 = r10.p
                int r4 = r11.length
                r5 = 0
                r6 = r11
                r11 = r10
                r9 = r5
                r5 = r1
                r1 = r4
                r4 = r3
                r3 = r9
            L3b:
                if (r3 >= r1) goto L58
                r7 = r6[r3]
                com.crunchyroll.appwidgets.continuewatching.c r8 = r5.b()
                r11.m = r6
                r11.h = r5
                r11.i = r4
                r11.j = r3
                r11.k = r1
                r11.l = r2
                java.lang.Object r7 = r8.g(r4, r7, r11)
                if (r7 != r0) goto L56
                return r0
            L56:
                int r3 = r3 + r2
                goto L3b
            L58:
                com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.l0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GlanceAppWidgetReceiver.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1", f = "GlanceAppWidgetReceiver.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ Context k;
        public final /* synthetic */ int[] l;
        public final /* synthetic */ AppWidgetManager m;

        /* compiled from: GlanceAppWidgetReceiver.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1$1$1", f = "GlanceAppWidgetReceiver.kt", l = {90}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ l0 i;
            public final /* synthetic */ Context j;
            public final /* synthetic */ AppWidgetManager k;
            public final /* synthetic */ int l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, Context context, AppWidgetManager appWidgetManager, int i, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                super(2, dVar);
                this.i = l0Var;
                this.j = context;
                this.k = appWidgetManager;
                this.l = i;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new a(this.i, this.j, this.k, this.l, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.crunchyroll.appwidgets.continuewatching.c b = this.i.b();
                    Context context = this.j;
                    AppWidgetManager appWidgetManager = this.k;
                    int i2 = this.l;
                    this.h = 1;
                    b.getClass();
                    Object j = b.j(context, appWidgetManager, i2, new e0(null, appWidgetManager, i2, b, context, null), this);
                    if (j != aVar) {
                        j = com.amazon.aps.iva.kb0.q.a;
                    }
                    if (j == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int[] iArr, AppWidgetManager appWidgetManager, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.k = context;
            this.l = iArr;
            this.m = appWidgetManager;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            c cVar = new c(this.k, this.l, this.m, dVar);
            cVar.i = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                l0.a(l0.this, g0Var, this.k);
                l0 l0Var = l0.this;
                Context context = this.k;
                AppWidgetManager appWidgetManager = this.m;
                int[] iArr = this.l;
                ArrayList arrayList = new ArrayList(iArr.length);
                int length = iArr.length;
                int i3 = 0;
                while (i3 < length) {
                    arrayList.add(com.amazon.aps.iva.se0.i.b(g0Var, null, null, new a(l0Var, context, appWidgetManager, iArr[i3], null), 3));
                    i3++;
                    i2 = 1;
                }
                this.h = i2;
                if (com.amazon.aps.iva.se0.d.a(arrayList, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(l0 l0Var, com.amazon.aps.iva.se0.g0 g0Var, Context context) {
        l0Var.getClass();
        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new m0(context, l0Var, null), 3);
    }

    public abstract com.crunchyroll.appwidgets.continuewatching.c b();

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(appWidgetManager, "appWidgetManager");
        com.amazon.aps.iva.yb0.j.f(bundle, "newOptions");
        com.amazon.aps.iva.n1.c.k(this, new a(context, appWidgetManager, i, bundle, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(iArr, "appWidgetIds");
        com.amazon.aps.iva.n1.c.k(this, new b(context, iArr, null));
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        if (!com.amazon.aps.iva.yb0.j.a(intent.getAction(), "android.intent.action.LOCALE_CHANGED") && !com.amazon.aps.iva.yb0.j.a(intent.getAction(), "androidx.glance.appwidget.action.DEBUG_UPDATE")) {
            z = false;
        } else {
            z = true;
        }
        try {
            if (z) {
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                String packageName = context.getPackageName();
                String canonicalName = getClass().getCanonicalName();
                if (canonicalName != null) {
                    ComponentName componentName = new ComponentName(packageName, canonicalName);
                    com.amazon.aps.iva.yb0.j.e(appWidgetManager, "appWidgetManager");
                    int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    com.amazon.aps.iva.yb0.j.e(appWidgetIds, "appWidgetManager.getAppWidgetIds(componentName)");
                    onUpdate(context, appWidgetManager, appWidgetIds);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            super.onReceive(context, intent);
        } catch (Throwable unused) {
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(appWidgetManager, "appWidgetManager");
        com.amazon.aps.iva.yb0.j.f(iArr, "appWidgetIds");
        com.amazon.aps.iva.n1.c.k(this, new c(context, iArr, appWidgetManager, null));
    }
}
