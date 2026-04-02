package e.a.c;

import android.content.Intent;
import com.android.music.MediaPlaybackService;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class d7 {
    public static TimerTask a;

    /* renamed from: b  reason: collision with root package name */
    public static Timer f5051b;

    /* renamed from: c  reason: collision with root package name */
    public static long f5052c;

    /* renamed from: d  reason: collision with root package name */
    public static e.h.g.r0 f5053d = new e.h.g.r0();

    /* renamed from: e  reason: collision with root package name */
    public static WeakReference<MediaPlaybackService> f5054e;

    /* loaded from: classes.dex */
    public static class a extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MediaPlaybackService mediaPlaybackService;
            WeakReference<MediaPlaybackService> weakReference = d7.f5054e;
            if (weakReference != null && (mediaPlaybackService = weakReference.get()) != null) {
                Intent intent = new Intent();
                intent.putExtra("PrivateMethod", 42);
                mediaPlaybackService.k(intent);
            }
            Timer timer = d7.f5051b;
            if (timer != null) {
                timer.cancel();
                d7.f5051b = null;
            }
            d7.a = null;
        }
    }
}
