package e.j.d.b0.d;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class u extends CountDownTimer {
    public final /* synthetic */ RelaunchPremiumActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j2, RelaunchPremiumActivity relaunchPremiumActivity) {
        super(j2, 1000L);
        this.a = relaunchPremiumActivity;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.a.finish();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j2) {
        RelaunchPremiumActivity relaunchPremiumActivity = this.a;
        TextView textView = relaunchPremiumActivity.f4922i;
        if (textView == null) {
            return;
        }
        Objects.requireNonNull(relaunchPremiumActivity);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j3 = 60;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j2) % 24), Long.valueOf(timeUnit.toMinutes(j2) % j3), Long.valueOf(timeUnit.toSeconds(j2) % j3)}, 3));
        h.o.c.j.d(format, "format(format, *args)");
        textView.setText(format);
    }
}
