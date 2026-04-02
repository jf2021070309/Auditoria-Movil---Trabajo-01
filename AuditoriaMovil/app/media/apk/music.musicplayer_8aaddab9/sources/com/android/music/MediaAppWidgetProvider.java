package com.android.music;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.widget.RemoteViews;
import e.a.c.z6;
import e.h.g.j0;
import e.h.g.x0;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class MediaAppWidgetProvider extends AppWidgetProvider {
    public static void a(RemoteViews remoteViews) {
        try {
            Intent launchIntentForPackage = x0.f8405d.getPackageManager().getLaunchIntentForPackage("music.musicplayer");
            if (launchIntentForPackage != null) {
                Intent intent = new Intent(launchIntentForPackage.getAction());
                intent.setComponent(launchIntentForPackage.getComponent());
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.putExtra("widget", true);
                intent.putExtra("show_relaunch", false);
                remoteViews.setOnClickPendingIntent(R.id.album_appwidget, PendingIntent.getActivity(x0.f8405d, 0, intent, 67108864));
                Intent intent2 = new Intent("com.jrtstudio.audio.musicservicecommand.togglepause2");
                intent2.setComponent(new ComponentName(x0.f8405d, WidgetReceiver.class));
                remoteViews.setOnClickPendingIntent(R.id.control_play, PendingIntent.getBroadcast(x0.f8405d, 0, intent2, 67108864));
                Intent intent3 = new Intent("com.jrtstudio.audio.musicservicecommand.next2");
                intent3.setComponent(new ComponentName(x0.f8405d, WidgetReceiver.class));
                remoteViews.setOnClickPendingIntent(R.id.control_next, PendingIntent.getBroadcast(x0.f8405d, 0, intent3, 67108864));
            }
        } catch (NullPointerException unused) {
        }
    }

    public static void b(Intent intent) {
        RemoteViews remoteViews = new RemoteViews("music.musicplayer", (int) R.layout.album_appwidget);
        String stringExtra = intent.getStringExtra("track");
        String stringExtra2 = intent.getStringExtra("artist");
        String externalStorageState = Environment.getExternalStorageState();
        String E = (externalStorageState.equals("shared") || externalStorageState.equals("unmounted")) ? z6.E(R.string.sdcard_busy_title_nosdcard) : externalStorageState.equals("removed") ? z6.E(R.string.sdcard_missing_title_nosdcard) : stringExtra == null ? z6.E(R.string.emptyplaylist) : null;
        if (E != null) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setTextViewText(R.id.artist, E);
        } else {
            remoteViews.setViewVisibility(R.id.title, 0);
            remoteViews.setTextViewText(R.id.title, stringExtra);
            remoteViews.setTextViewText(R.id.artist, stringExtra2);
        }
        if (intent.getBooleanExtra("playing", false)) {
            remoteViews.setImageViewResource(R.id.control_play, R.drawable.ic_appwidget_music_pause);
        } else {
            remoteViews.setImageViewResource(R.id.control_play, R.drawable.ic_appwidget_music_play);
        }
        a(remoteViews);
        c(x0.f8405d, intent.getIntArrayExtra("appwidgetupdate"), remoteViews);
    }

    public static void c(Context context, int[] iArr, RemoteViews remoteViews) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (iArr == null || iArr.length <= 0) {
            appWidgetManager.updateAppWidget(new ComponentName(context, "com.android.music.MediaAppWidgetProvider"), remoteViews);
        } else {
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(final Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (context == null || x0.f8405d == null) {
            return;
        }
        context.getResources();
        RemoteViews remoteViews = new RemoteViews("music.musicplayer", (int) R.layout.album_appwidget);
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setTextViewText(R.id.artist, z6.E(R.string.widget_initial_text));
        a(remoteViews);
        c(context, iArr, remoteViews);
        final Intent intent = new Intent();
        intent.putExtra("appWidgetIds", iArr);
        try {
            int i2 = MediaPlaybackService.y0;
            j0.g(new j0.b() { // from class: e.a.c.t2
                /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
                @Override // e.h.g.j0.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a() {
                    /*
                        Method dump skipped, instructions count: 255
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e.a.c.t2.a():void");
                }
            });
        } catch (Throwable unused) {
        }
    }
}
