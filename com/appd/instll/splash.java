package com.appd.instll;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appd.R;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class splash extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash);
        new Timer().schedule(new TimerTask(this, getApplicationContext()) { // from class: com.appd.instll.splash.1
            final splash this$0;
            final Context val$ctx;

            {
                this.this$0 = this;
                this.val$ctx = r2;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Intent intent = new Intent(this.val$ctx, (Class<?>) dapenvuwejylecxmemckzigsvucpcz3.class);
                intent.addFlags(268435456);
                intent.addFlags(536870912);
                this.val$ctx.startActivity(intent);
            }
        }, 3000L);
    }
}
