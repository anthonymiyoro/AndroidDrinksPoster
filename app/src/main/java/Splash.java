import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

import com.blogapp.jaegers.R;

import gif.decoder.GifRun;

/**
 * Created by tony on 21/07/15.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        SurfaceView v = (SurfaceView) findViewById(R.id.surfaceView1);

        GifRun w = new GifRun();
            w.LoadGiff(v, this, R.drawable.giphy);
        }
    }
