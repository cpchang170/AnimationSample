package evan.chen.app.animationsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageView = (ImageView) this.findViewById(R.id.imageView);
    }

    public void alpha(View view) {
        this.imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha));
    }

    public void scale(View view) {
        this.imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale));
    }

    public void translate(View view) {
        this.imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate));
    }

    public void rotate(View view) {
        this.imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate));
    }

    @Override
    public void onAnimationStart(Animation animation) {
        // Animation Start
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        // Animation End
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // Animation Repeat
    }
}
